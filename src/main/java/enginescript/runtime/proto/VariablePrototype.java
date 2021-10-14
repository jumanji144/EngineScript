package enginescript.runtime.proto;

/**
 * Prototypes do not retain non mutable values
 */
public class VariablePrototype extends Prototype{

    public String typeName;
    public String resolvedName;
    public VariableType resolvedType;

    public VariableType protoType() {

        if(resolvedType != null)
            return resolvedType;

        this.resolvedType = protoType(typeName);

        return resolvedType;

    }

    VariableType protoType(String name) {

        switch(name) {

            case "int":
            case "integer":
                return VariableType.INTEGER;
            case "flt":
            case "float":
                return VariableType.FLOAT;
            case "bt":
            case "byte":
                return VariableType.BYTE;
            case "string":
            case "str":
                return VariableType.STRING;
            case "bool":
            case "boolean":
                return VariableType.BOOLEAN;
            case "var": {

                return VariableType.UNDEFINED;

            }

            default : {

                TypePrototype prototype = scope.resolveProto(name);
                if(prototype instanceof StructurePrototype) {

                    return VariableType.STRUCTURE;

                }

            }

        }

        return VariableType.INVALID;

    }

}
