package enginescript.runtime.vm;

import enginescript.runtime.object.PrototypedObject;
import enginescript.runtime.object.Variable;
import enginescript.runtime.proto.TypePrototype;
import enginescript.runtime.proto.VariablePrototype;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    public VM getVm() {
        return vm;
    }

    public Scope getParent() {
        return parent;
    }

    final VM vm;
    Scope parent;

    // TODO Make TypeProto not scope based due to one time declaration in program context

    Map<String, TypePrototype> cachedProperties = new HashMap<>();
    Map<String, PrototypedObject> propertyInstances = new HashMap<>();

    public Scope(VM vm) {
        this.vm = vm;
    }

    public TypePrototype resolveProto(String name) {

        TypePrototype proto = cachedProperties.get(name);

        if(proto == null) {

            if(parent != null)
            proto = parent.resolveProto(name);

        }

        return proto;

    }

    public PrototypedObject resolveInstance(String name) {

        PrototypedObject proto = propertyInstances.get(name);

        if(proto == null) {

            if(parent != null)
                proto = parent.resolveInstance(name);

        }

        return proto;

    }

    public void registerPrototype(TypePrototype proto) {

        this.cachedProperties.put(proto.id, proto);

        proto.scope = this;

    }

    public Variable createVariable(VariablePrototype proto) {

        proto.scope = this;

        Variable var = new Variable(proto);

        var.createInstance();

        propertyInstances.put(proto.id, var);

        return var;

    }

}
