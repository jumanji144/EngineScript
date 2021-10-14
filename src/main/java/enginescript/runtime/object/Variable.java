package enginescript.runtime.object;

import enginescript.runtime.proto.VariablePrototype;
import enginescript.runtime.proto.VariableType;
import enginescript.runtime.vm.Codes;

public class Variable extends PrototypedObject<VariablePrototype> {

    public Object getValue() {
        return value;
    }

    Object value;

    public Variable(VariablePrototype prototype) {
        super(prototype);
    }

    @Override
    public void createInstance() {
        VariableType type = prototype.protoType();

        if(type == VariableType.INVALID) {

            vm.error("typeOf(" + prototype.id + ")=[" + prototype.typeName + "] cannot be resolved" +
                    " to any valid member in the current scope");

        }

    }

    public void setValue(Object value) {

        VariableType type = prototype.protoType();

        VariableType objectType = VariableType.fromObject(value);

        if(objectType == VariableType.INVALID) {

            vm.error("Value %s is invalid", Codes.ERROR_VARIABLE_INCOMPATIBLE_TYPE, value);
            return;

        }

        if(type == VariableType.UNDEFINED)
            type = objectType;

        if(type != objectType) {

            vm.error("Variable %s with type %s has cannot be assigned to %s",
                    Codes.ERROR_VARIABLE_INCOMPATIBLE_TYPE,
                    prototype.id,
                    prototype.resolvedType,
                    objectType
                    );
            return;

        }

        this.value = value;
        this.prototype.resolvedType = type;

    }

    @Override
    public String toString() {
        return "Variable{" +
                "type=" + prototype.resolvedType +
                ",value=" + value +
                '}';
    }
}
