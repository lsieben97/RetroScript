Rebol [
  Title: "Errors module for vNES"
  Date: `date "+%e-%b-%Y"`
  Author: "Luc Sieben"
  Description: "Errors module to define compiler and parser errors and show them to the user"
  Type: module
  Exports: [throw-compiler-error throw-parser-error throw-error]
]

errors: [
  [
    "Compiler"
    "Invalid project definition"
    "The project definition is missing some elements or some values are invalid"
  ]
]

throw-compiler-error: function ["throw a compiler error and exits the program."
                                 code
                                 "The error code of the error thrown."

                                 message
                                 "The error message."

                                 description
                                 "The description of the error."

                                 error-source
                                 "The source of the error. (in the users code)"
                               ][
  print join "Compiler error: " [code " - " message "^/" description "^/Source:^/" error-source]
  halt
]

throw-parser-error: function ["throw a parser error and exits the program."
                                 code
                                 "The error code of the error thrown."

                                 message
                                 "The error message."

                                 description
                                 "The description of the error."

                                 error-source
                                 "The source of the error. (in the users code)"
                               ][
  print join "Parser error: " [code " - " message "^/" description "^/Source:^/" error-source]
  halt
]

throw-error: func ["Thow an error with the given code"
  code [scalar!]
  "The error code of the error to throw"
  cause
  "The cause of the error"
  error-source
  "The source of the error"
  /local error][
    error: pick errors code - 99
    if none? cause [cause: "Unknown"]
    print join error/1 [" error: " code " - " error/2 "^/" error/3 "^/Source:^/" error-source "^/Cause:^/" cause]
    quit
  ]
