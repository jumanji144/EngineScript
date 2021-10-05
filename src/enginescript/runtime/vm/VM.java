package enginescript.runtime.vm;

import enginescript.EngineParser.EngineScript;
import enginescript.runtime.vm.profiler.Profiler;
import org.antlr.v4.runtime.Token;

import java.lang.management.ManagementFactory;

/**
 * Interface for the {@link VMExecutor} class
 */
public class VM {

    public boolean EXIT_ON_ERROR = true;
    public boolean HALT_ON_END = false; // halt when execution ends
    public boolean STACKTRACE_ON_ERROR = true; // used for vm debugging purposes
    public Program program;

    public VMExecutor runtime;
    public VMMath math;
    public Profiler profiler;

    boolean isDebug() {
        for(String arg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
            if(arg.contains("jdwp=")) {
                return true;
            }
        }
        return false;
    }

    public void init() {

        runtime = new VMExecutor(this);
        math = new VMMath(this);
        profiler = new Profiler();

        this.profiler.profilingEnabled = !isDebug();

    }

    public void run(Program program) {

        this.program = program;
        program.programContext.accept(runtime);

    }

    public void error(String message) {

        System.err.println("VM Error: " + message);

    }

    public void errorf(String message, Object ... args) {

        System.err.printf("VM Error: " + message + "\n", args);

    }

    public void error(String message, Codes code, Object ... args) {

        errorf(message, args);
        traceback(code);
        escape(code);

    }

    public void traceback(Token context) {

        System.err.printf("%s:%d:%d\n%s\n^",
                program.filePath,
                context.getLine(),
                context.getCharPositionInLine() + 1,
                context.getText());

    }

    public void traceback(Codes code) {

        if(runtime == null) {

            error("VM not initialized");
            halt(Codes.ERROR_VM_NOT_INITIALIZED);

        }

        System.err.println(code.toString());

        if(runtime.tracebackElement != null) {
            traceback(runtime.tracebackElement);
        }

    }

    public Object eval(EngineScript.ExpressionContext toEval) {

        if(toEval == null) {

            error("Cannot eval 'null'", Codes.ERROR_VM_EVAL_INVALID);
            return null; // return for case EXIT_ON_ERROR = false

        }

        return runtime.eval(toEval);

    }

    public void escape(Codes code) {

        if(STACKTRACE_ON_ERROR)
            throw new RuntimeException();

        if(EXIT_ON_ERROR)
            halt(code);


    }

    public void halt(Codes code) {

        System.exit(code.code);

    }

}
