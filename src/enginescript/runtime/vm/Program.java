package enginescript.runtime.vm;

import enginescript.EngineParser.EngineScript;

public class Program {

    final String name;
    final String filePath;
    final EngineScript.ProgramContext programContext;

    public Program(String name, String filePath, EngineScript.ProgramContext programContext) {
        this.name = name;
        this.filePath = filePath;
        this.programContext = programContext;
    }
}
