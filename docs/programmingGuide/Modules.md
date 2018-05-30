# Modules

A module allows you to separate your code into various modules.
vNES uses this feature in it's standard library to separate the internal entities used from the rest of the library.

## Defining a module
Defining a module is straight forward:
```
DEF MODULE: MODULE_NAME
    # Multiple entities and functions can go here
END        
```
You can redefine the same module in separate files.

## Defining a native module
You can define a native module to allow the `[NativeFunction(target:<target_name>)]` [attribute]() on functions defined in the module.  
This is used to call functions from a [native library]().
```
DEF NATIVE MODULE: MODULE_NAME
    # Multiple entities and functions can go here as well as NATIVE functions.    
END
```

## Using a module from another file.
```
USE <module name>
```