package enginescript.runtime.proto;

import enginescript.EngineParser.EngineScript;

import java.util.List;

public class FunctionPrototype extends TypePrototype{

    public String id;
    public List<VariablePrototype> parameters;
    public EngineScript.BlockContext block;

}
