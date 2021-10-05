package enginescript.runtime.vm;

import enginescript.EngineParser.EngineScript;
import enginescript.EngineParser.EngineScriptLexer;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Parser {

    EngineScriptLexer lexer;
    EngineScript parser;

    public void init(String string) {

        lexer = new EngineScriptLexer(CharStreams.fromString(string));
        parser = new EngineScript(new CommonTokenStream(lexer));

    }

    public Program parse(String string) {

        init(string);

        EngineScript.ProgramContext context = parser.program();

        if(parser.getNumberOfSyntaxErrors() > 0)
            System.exit(1);

        return new Program(context.IDENTIFIER().getText(), "<STDIO>", context);

    }

    public Program parse(File file) throws IOException {

        byte[] data = Files.readAllBytes(file.toPath());

        String string = new String(data);

        init(string);

        EngineScript.ProgramContext context = parser.program();

        if(parser.getNumberOfSyntaxErrors() > 0)
            System.exit(1);

        return new Program(context.IDENTIFIER().getText(), file.getAbsolutePath(), context);

    }
}
