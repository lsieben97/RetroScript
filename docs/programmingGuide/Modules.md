# Modules

A module allows you to separate your code into various modules.
vNES uses this feature in it's standard library to separate the internal entities used from the rest of the library.

## Defining a module
Defining a module is straight forward:
```
DEF MODULE: MODULE_NAME
    # Multiple entities can go here
END        
```
You can redefine the same module in separate files. (the compiler bundles them anyway)