# RetroScript Programming language
A high level programming language to sourceFile NES games.
# vNES Programming language
A high level programming language to program NES games.


## Goals
1. Trying to make a compiler/parser/lexer.
2. designing a programming language from scratch.

## Todo
- [ ] Frontend
    - [ ] Language constructs (``WHILE``, `FOR`, `IF`, etc...)
    - [ ] Array's (only for build in datatypes and static array size)
- [ ] Backend
    - [ ] Parsing
        - [x] Visitors
        - [ ] Validators
        
    - [ ] Code Generation
        - [ ] Implementors
        - [x] Assembly opcodes
        - [ ] Memory manager
            - [x] Program memory
            - [ ] Ram memory
            - [ ] PPU memory
            - [ ] APU memory
            - [ ] Garbage collection
        - [ ] Rom file generation
    - [ ] NES features
        - [ ] PPU support
        - [ ] APU support
        - [ ] Mappers
            - [ ] Default mappers
            - [ ] Custom mappers through `mapper.json` file in project root.
    - [ ] File loaders
        - [ ] Images
            - [ ] `.png`
            - [ ] `.jpeg`
            - [ ] `.bmp`
            - [ ] `.svg` (optional)
        - [ ] Sound
            - [ ] `.mid`/`.midi`
            - [ ] custom format (optional)
        - [ ] Runtime
            - [ ] `.vasm` parser / visitors.
            - [ ] `.vasm`
     - [ ] vNES runtime
        - [ ] Design runtime
        - [ ] Implement runtime
        - [ ] Custom runtime configuration through `runtime.json` file in project root.
        - [ ] Features
            - [ ] basic runtime (needs to be designed first)
            - [ ] drawing runtime (like the winforms `Graphics` class in .Net)
- [ ] Standard library
    - [ ] NES features
        - [ ] PPU support
        - [ ] APU support
    - [ ] File loaders
        - [ ] Images
            - [ ] `.png`
            - [ ] `.jpeg`
            - [ ] `.bmp`
            - [ ] `.svg` (optional)
        - [ ] Sound
            - [ ] `.mid`/`.midi`
            - [ ] custom format (optional)

### Prerequisites

* [Java](https://java.com/download)



## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
