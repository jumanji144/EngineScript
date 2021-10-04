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

        long start = System.currentTimeMillis();

        vm.run(program);

        System.out.println("Execution time: " + (System.currentTimeMillis() - start) + "ms");

        Scope scope = vm.runtime.currentScope;

        Variable variable = (Variable) scope.resolveInstance("hello"); // get hello variable

        System.out.println(variable);

    }

}
