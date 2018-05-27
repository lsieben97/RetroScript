# Code to ROM: vNES compiler internal workings
This document describes the internal workings of the vNES compiler.

## Step 1: Lexing & parsing
the vNES compiler uses [ANTLR](http://www.antlr.org/) to generate a lexer/parser from [vnes.g4](src/com/lsieben/vnes/parser/vNES.g4)
to create an syntax tree of each source file in the project being compiled.

## Step 2: Creation
The compiler will create a `CodeBase` object with a list of `Sourcefile` objects as well as lists for entities, id's and more.
The `SourceFile` objects will be generated by the [`SourceFileVisitor`](http://jakubdziworski.github.io/java/2016/04/01/antlr_visitor_vs_listener.html)

## Step 3: Validation
Every language construct has a `Validator` to determine if the state of the language construct is valid. if it's not, a `vNESCompilerException` will be thrown.

If the compiler needs to write a library file it will compress and encrypt the string representation of the codebase and write it to a `.lib` file. After that execution stops.

## Step 4: Implementation
Every language construct also has an `Implementor` which provides an implementation of the language construct.

## Step 5: ROM file creation
Based on the project settings a NES header is created and the memory assembled by the `Assembler` is written to the file which can then be executed by an emulator.