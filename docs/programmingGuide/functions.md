# Functions
A function entity is a special type of entity because it's the only entity type that allows nVES code to be directly entered in the entity body:
````
# inside a data or functional entity
DEF FUNCTION: Add(NUMBER: arg1, NUMBER: arg2): NUMBER
    RETURN arg1 + arg2
END FUNCTION
````
## NATIVE FUCNTION: a special type of function entity
With a native function it's possible to include inline 6502 assembly code:
````
# inside a functional entity
DEF NATIVE FUNCTION: NativeExample
    # regular vNES code...
    [-
        # 6502 assembly code goes here.
    -]
````
### Native functions and memory managment
When using native code it's usefull to use the `-memstats` option when compiling  as it shows what memory regions vNES uses for it's code generation. using an allready used memory slot may lead to unexpected behaviour of your game.
