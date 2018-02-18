Rebol [
  Title: "Project manager module for vNES"
  Date: `date "+%e-%b-%Y"`
  Author: "Luc Sieben"
  Description: "This module manages project files (.vnesproj) and gathers dependencies for a project"
  Type: module
  Exports: [get-project validate-project collect-project-sources]
]

errors: import %errors.r


get-project: func ["Get a project object from a project definition"

                   project-file [file!]
                   "The project definition file"

                    /local project lines key value
                   ][
  print "Reading project definition..."
  project: make object! [
    name: none
    path: none
    source-dirs: none
    start-screen: none
    source-files: none
    project-dir: none
    symbols: []
  ]

  project-file: replace/all clean-path project-file "^"" ""
  lines: split read/string project-file "^/"
  foreach line lines[
    key: first split line ":"
    value: second split line ":"
    switch key [
      "name" [project/name: trim value]
      "source-dirs" [project/source-dirs: split trim value ","]
      "start-screen" [project/start-screen: trim value]
      "project-dir" [project/project-dir: to-path trim value]
    ]
  ]
  project/path: clean-path project-file
  project
]

validate-project: func ["Validate a project."

                        project
                        "The project object to validate"][
  print "Validating project definition..."
  if none? project/name [
    errors/throw-error 100 "No project name specified." clean-path project/path
  ]
  if none? project/source-dirs[
    errors/throw-error 100 "No source directories specified." clean-path project/path
  ]
  if none? project/start-screen [
    errors/throw-error 100 "No start screen specified." clean-path project/path
  ]
  if none? project/project-dir [
    errors/throw-error 100 "No project directory specified." clean-path project/path
  ]
  print "Project definition valid."
]

collect-project-sources: func ["Collect all source files for a project"
                               project
                               "project to get the sources for"
                               /local files contents][
  files: []
  print "Gathering project sources..."
  foreach dir project/source-dirs [
    contents: read to-file join project/project-dir to-word dir
      foreach file contents [
      if found? find file ".vns" [
        append files to-file  join join project/project-dir to-word dir to-word to-string file
        print join "Found " file
      ]
    ]
  ]
  project/source-files: files
  if (length? files) = 0 [
    errors/throw-error 100 "No project sources found." clean-path project/path
  ]
  print join "Found " [length? files " sources."]
  project
]
