package enginescript.runtime.vm;

public enum Codes {

    /*
       ERROR_VARIABLE: 1...
       ERROR_VM: 2...
     */
    STATUS_SUCCESS(0000),
    ERROR_NO_TRACEBACK(0001),
    ERROR_VARIABLE_INCOMPATIBLE_TYPE(1001),
    ERROR_VARIABLE_NOT_FOUND(1002),
    ERROR_VARIABLE_INVALID_TYPE(1003),
    ERROR_VM_NOT_INITIALIZED(2001),
    ERROR_VM_STACK_EXCEPTION(2002),
    ERROR_VM_EVAL_INVALID(2003),
    ERROR_MATH_INVALID_OPERATOR(3001);

    public final int code;

    Codes(int code) {
        this.code = code;
    }
}
