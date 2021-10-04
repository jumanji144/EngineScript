package enginescript.runtime.vm;

import enginescript.runtime.proto.VariableType;

public class VMMath {

    final VM vm;

    public VMMath(VM vm) {
        this.vm = vm;
    }

    public boolean isNumber(Object value) {

        return value instanceof Number;

    }

    public Object op(Object left, Object right, String operator) {

        VariableType leftType = VariableType.fromObject(left);
        VariableType rightType = VariableType.fromObject(right);

        if (isNumber(left)) {

            if (!isNumber(right))
                vm.error("Operator + cannot be applied to %s,%s",
                        Codes.ERROR_MATH_INVALID_OPERATOR,
                        leftType, rightType);
            else {

                float a = ((Number) left).floatValue();
                float b = ((Number) right).floatValue();

                float value = 0.0f;
                switch (operator) {

                    case "+":
                        value = a + b;
                        break;
                    case "-":
                        value = a - b;
                        break;
                    case "*":
                        value = a * b;
                        break;
                    case "/":
                        value = a / b;
                        break;

                }

                if (left instanceof Integer)
                    return Math.round(value);
                return value;


            }

        }

        return null;

    }

}
