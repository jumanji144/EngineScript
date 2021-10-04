package enginescript.runtime.proto;

import org.antlr.v4.runtime.ParserRuleContext;
import enginescript.runtime.vm.Scope;

public abstract class Prototype {

    public Scope scope;
    public String id;
    public ParserRuleContext context;

}
