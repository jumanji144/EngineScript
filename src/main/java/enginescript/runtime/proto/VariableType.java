package enginescript.runtime.proto;

import enginescript.runtime.object.Structure;

public enum VariableType {

    INTEGER,
    STRING,
    BYTE,
    BOOLEAN,
    FLOAT,
    MEMBER,
    STRUCTURE,
    UNDEFINED,
    INVALID;

    public static VariableType fromObject(Object object) {

        if(object instanceof Integer)
            return INTEGER;
        else if(object instanceof String)
            return STRING;
        else if(object instanceof Byte)
            return BYTE;
        else if(object instanceof Float)
            return FLOAT;
        else if(object instanceof Structure)
            return STRUCTURE;
        else if (object instanceof Boolean)
            return BOOLEAN;
        else if(object == null)
            return UNDEFINED;

        return INVALID;
    }

}
