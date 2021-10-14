package enginescript.runtime.object;

import enginescript.runtime.proto.Prototype;
import enginescript.runtime.proto.TypePrototype;
import enginescript.runtime.vm.Scope;
import enginescript.runtime.vm.VM;

public abstract class PrototypedObject<T extends Prototype> {

    final T prototype;
    final VM vm;
    final Scope scope;

    public PrototypedObject(T prototype) {
        this.vm = prototype.scope.getVm();
        this.scope = prototype.scope;
        this.prototype = prototype;
    }

    public abstract void createInstance();

    public PrototypedObject accessMember(String name) {
        return null;
    }

    public boolean memberCanHaveMembers() {

        return prototype instanceof TypePrototype;

    }

    public boolean memberHasMember(String name) {

        return accessMember(name) != null;

    }

}
