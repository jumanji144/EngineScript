package enginescript.runtime.vm;

import enginescript.runtime.proto.TypePrototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * The only scope which can contain prototypes with a block
 *
 */
public class ProgramScope extends Scope{

    Map<String, TypePrototype> cachedProperties = new HashMap<>();

    public ProgramScope(VM vm) {
        super(vm);
    }


    public TypePrototype resolveProto(String name) {

        return cachedProperties.get(name);

    }

    public void registerPrototype(TypePrototype proto) {

        this.cachedProperties.put(proto.id, proto);

        proto.scope = this;

    }


}
