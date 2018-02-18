Rebol [
  Title: "vNES compiler main script"
  Date: `date "+%e-%b-%Y"`
  Author: "Luc Sieben"
  needs: [%project-manager.r]
]
secure [
        net quit
        file allow
    ]
errors: import %errors.r
lexer: import %lexer.r
print "vNES Compiler v1.0.0 by Luc Sieben.^/"

either none? system/options/args [  print {
No project file specified for compilation.
Usage: vNES <project file> <output rom>}
][
  path: to-path system/options/args
  project: get-project to-file path
  print project
  validate-project project
  project: collect-project-sources project

  foreach file project/source-files [
    append project/symbols lexer/generate-symbols-list file
  ]
]
halt
