package enginescript.runtime.api;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Export {

    Module module;
    Method method;
    Field field;

    public Export(Module module, Method method) {

        this.method = method;
        this.module = module;

    }

    public Export(Module module, Field method) {

        this.field = method;
        this.module = module;

    }

    public boolean isField() {
        return field != null;
    }

    public boolean isMethod() {
        return method != null;
    }

    public int parameterSize() {

        return method.getParameterCount();

    }

    public Object call(Object ... parameters) throws InvocationTargetException, IllegalAccessException {

       return method.invoke(module, parameters);

    }


}
