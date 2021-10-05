import enginescript.runtime.object.Variable;
import enginescript.runtime.vm.*;

import java.io.File;
import java.io.IOException;

public class VMTest {

    public static void main(String[] args) throws IOException {

        VM vm = new VM();

        vm.init();

        Parser parser = new Parser();

        Program program = parser.parse(new File("D:\\Projects\\IntelJProjects\\Antlr\\test\\variableTest.es"));

        vm.run(program);

        Scope scope = vm.runtime.currentScope;

        System.out.println("Profiling: ");
        vm.profiler.printProfiling("root");

    }

}
