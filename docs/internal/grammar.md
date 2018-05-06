# vNES grammar definition
The grammar if the vNES programming language is defined as follows:

## Symbol objects
The following defines a symbol object:
 ````
 name: The name of the symbol
 code: The code to represent the symbol in vNES code.
 scope: The scope in which the symbol was read.
 ````
 ## Rule objects
 The following defines a symbol object:
````
name: The name of the rule
type: The type of rule.
error: The error message when the rule is broken.
arguments: arguments of the rule, can be any Rebol type.
````
### Rule types
The following table defines the syntax rules for vNES:

| Rule type | Description                                                | Error code  |
| ----------|------------------------------------------------------------| ------------|
| next      | The next symbol needs to be the one in argument 1          | 300         |
| previous  | The previous symbol needs to be the one in argument 1      | 301         |
| scope     | The scope of the symbol needs to be the one in argument 1  | 302         |
