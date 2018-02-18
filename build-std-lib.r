Rebol [
  Title: "Build script to build (compress) the vNES standard library"
  Date: `date "+%e-%b-%Y"`
  Author: "Luc Sieben"
  Purpose: "Builds the vNES standard library"
]

if not exists? %stdlib/ [
  print "stdlib folder not present!"
  quit
]
stdlib: ""
files: read %stdlib/
foreach file files [
  contents: read/string join %stdlib/ file
  append stdlib contents
]
write %std.lib compress stdlib
print "Standard library build."
