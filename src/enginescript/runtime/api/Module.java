package enginescript.runtime.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public abstract class Module {

    /**
     * this will be the prefix that will be used to indicate the module
     */
    String exportPrefix;
    protected boolean __internal;

    public Module(String prefix) {
        this.exportPrefix = prefix;
    }

    public String getPrefix() {
        return exportPrefix;
    }

    public boolean isInternal() {

        return __internal;

    }

    /**
     * Export all exports
     * @param module module to export
     * @return the resulting exports
     */
    public static Map<String, Export> export(Module module) {

        Map<String, Export> exports = new HashMap<>();

        for (Method method : module.getClass().getDeclaredMethods()) {

            if((method.getModifiers() | Modifier.PUBLIC) == Modifier.PUBLIC)
            exports.put(method.getName(), new Export(module, method));

        }

        for (Field method : module.getClass().getFields()) {

            if(method.isAccessible())
            exports.put(method.getName(), new Export(module, method));

        }

        return exports;

    }

}
