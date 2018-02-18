Rebol [
  Title: "Errors module for vNES"
  Date: `date "+%e-%b-%Y"`
  Author: "Luc Sieben"
  Purpose: "Errors module to define compiler and parser errors and show them to the user"
  Type: module
  Exports: [throw-compiler-error throw-parser-error throw-error]
]

errors: [
  100 [
    type "Compiler"
    name "Invalid project definition"
    description "The project definition is missing some elements or some values are invalid"
  ]
]

throw-error: func ["Thow an error with the given code"
  code [integer!]
  "The error code of the error to throw"
  cause
  "The cause of the error"
  error-source
  "The source of the error"
  /local error][
    error: select errors code
    if none? error [
      print "Unknown error occured."
      quit
    ]
    if none? cause [cause: "Unknown"]
    print join error/type [" error: " code " - " error/name "^/" error/description "^/Source:^/" error-source "^/Cause:^/" cause]
    quit
  ]
