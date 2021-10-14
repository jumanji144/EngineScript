package enginescript.runtime.vm.profiler;

import enginescript.runtime.util.MapUtil;

import java.util.*;

/**
 * Heavily inspired by the minecraft profile due to its tree design
 *
 * @Author Minecraft
 * @Credit Minecraft
 */
public class Profiler {

    /**
     * List of parent sections
     */
    private final List<String> sectionList = new ArrayList<>();
    /**
     * List of timestamps (System.nanoTime)
     */
    private final List<Long> timestampList = new ArrayList<>();
    /**
     * Profiling map
     */
    private final Map<String, Long> profilingMap = new HashMap<>();
    /**
     * Flag profiling enabled
     */
    public boolean profilingEnabled = true;
    /**
     * Current profiling section
     */
    private String profilingSection = "";

    /**
     * Clear profiling.
     */
    public void clearProfiling() {
        this.profilingMap.clear();
        this.profilingSection = "";
        this.sectionList.clear();
    }

    /**
     * Start section
     */
    public void start(String name) {
        if (this.profilingEnabled) {
            if (!this.profilingSection.isEmpty()) {
                this.profilingSection = this.profilingSection + ".";
            }

            this.profilingSection = this.profilingSection + name;
            this.sectionList.add(this.profilingSection);
            this.timestampList.add(System.nanoTime());
        }
    }

    /**
     * End section
     */
    public void end() {
        if (this.profilingEnabled) {
            long i = System.nanoTime();
            long j = this.timestampList.remove(this.timestampList.size() - 1);
            this.sectionList.remove(this.sectionList.size() - 1);
            long k = i - j;

            if (this.profilingMap.containsKey(this.profilingSection)) {
                this.profilingMap.put(this.profilingSection, this.profilingMap.get(this.profilingSection) + k);
            } else {
                this.profilingMap.put(this.profilingSection, k);
            }

            if (k > 100000000L) {
                System.err.printf("Something's taking too long! '%s' took approx %f ms", this.profilingSection, (double) k / 1000000.0D);
            }

            this.profilingSection = this.sectionList.isEmpty() ? "" : this.sectionList.get(this.sectionList.size() - 1);
        }
    }

    public void printProfiling(String rootKey) {

        Map<String, Long> sortedMap = MapUtil.sortByValue(profilingMap);

        sortedMap = MapUtil.reverse(sortedMap);

        float maxValue = profilingMap.getOrDefault(rootKey, 0L);

        for (Map.Entry<String, Long> stringLongEntry : sortedMap.entrySet()) {

            System.out.printf("%s: %%%.2f\n",
                    stringLongEntry.getKey(),
                    ((float)stringLongEntry.getValue() / maxValue) * 100);

        }

        System.out.printf("Total Execution Time: %.4fms [%.1fns]", maxValue / 1000000, maxValue);

    }

}
