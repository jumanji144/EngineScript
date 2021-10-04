# EngineScript

*** VERY WORK IN PROGRESS ***

This is a simple scripting language which was made using ANTLR4   
And using a Java backend

## Goals
Milestones of the project
- [ ] Basic features:
- Variables [x], Functions [ ], Members And Structures [ ]
- While [ ], If [ ], For [ ], Switch [ ] conditions 
- [ ] External Scripts
- [ ] Java Modules (aka code that interfaces with Java directly)
- [ ] Direct Java API
- [ ] Compiled and thus a compiler runtime
- [ ] Native compiling
- [ ] Bootstrapping (making the language compile itself)
- [ ] More backends (this is possible due to ANLTR4 exporting to vast amounts of languages)

## Examples
For now this is these are the only features that it can do
```javascript
script program
int sum;
entry {
    
    var num1 := 100;
    int num2 := 200;
    
    sum := num1 + num2; 
    
}
```
This is an example for Fibonacci Numbers:
```js
script fibonacci
function fib(a) {
    when a < 1
        return a;

    return fib(a - 1) + fib(a - 2);
}

entry {

    print("Running entry function");
    fib(a);

}
```
## API
The Java API is currently the only way to access any members
#### Example for getting the variable `sum` from the script above:
```java
import enginescript.runtime.vm.VM;
import enginescript.runtime.vm.Program;
import enginescript.runtime.vm.Scope;
import enginescript.runtime.object.Variable;

public class VMTest {

    public static void main(String[] args) throws IOException {
    
        VM vm = new VM(); // create a new VM
        
        vm.init(); // initialize VM

        Parser parser = new Parser(); // create a new program parser
        
        Program program = parser.parse(new File("script.es")); // parse the script
        
        vm.run(program); // run the script
        
        Scope scope = vm.runtime.currentScope; // retrieve scope [int sum]
        
        Variable variable = scope.resolveInstance("sum"); // resolve variable "sum"
        
        System.out.println(variable); // this should print "Variable{type=INTEGER,value=200}"
        
    }

}

```

# Contributing
Feel free to make suggestions, leave issues or make a pull request
