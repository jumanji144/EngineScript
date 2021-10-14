package enginescript.runtime.object;

import enginescript.runtime.proto.StructurePrototype;
import enginescript.runtime.proto.VariablePrototype;
import enginescript.runtime.vm.Scope;

public class Structure extends PrototypedObject<StructurePrototype> {

    Scope structureScope;

    public Structure(StructurePrototype prototype) {
        super(prototype);
    }

    @Override
    public void createInstance() {

        // create scope for structure

        structureScope = new Scope(prototype.scope.getVm());

        for(VariablePrototype prototype : prototype.members) {

            structureScope.createVariable(prototype); // create variable mem

        }

    }

    @Override
    public Variable accessMember(String name) {

        return (Variable) structureScope.resolveInstance(name);

    }
}
