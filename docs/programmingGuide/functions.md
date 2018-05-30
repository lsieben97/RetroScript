# Functions
A function quite self explenatory
## Defining a function

### Defining a function with a return type
````
# inside a data entity or module
DEF FUNCTION: Add(arg1: NUMBER, arg2: NUMBER): NUMBER
    RETURN arg1 + arg2
END
````
### Defining a function without a return type
````
# inside a data entity or module
DEF FUNCTION: DoSomething(arg1: NUMBER, arg2: NUMBER): NONE
    # do something...
END
````

> This is the only time NONE can be used as vNES doesn't have a null like datatype.
## Calling a function

### Calling a function in the current entity
You can call a function directly by using the function name:
```
FunctionName(argument1, argument2)
```

### Calling a function in another entity or module
You can call a function directly by using the function name:
```
<entity/module name>.FunctionName(argument1, argument2)
```
