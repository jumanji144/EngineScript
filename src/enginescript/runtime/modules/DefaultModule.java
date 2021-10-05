package enginescript.runtime.modules;

import enginescript.runtime.api.Module;

public class DefaultModule extends Module {

    public DefaultModule() {
        super(""); // no prefix, due to it not being needed
        super.__internal = true;
    }

    public void print(Object x) {

        System.out.print(x);

    }

    public void println(Object x) {

        System.out.println(x);

    }

}
