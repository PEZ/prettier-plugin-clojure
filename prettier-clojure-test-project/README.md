# Test project for @cospaia/prettier-plugin-clojure

Usage:

Assuming:

1. This project is checked out as part of a clone/fork of https://github.com/PEZ/prettier-plugin-clojure
2. You have packaged the @cospaia/prettier-plugin-clojure module (see [../README.md](../README.md))

Then:

1. `cd` to this directory
1. npm i
1. npx prettier src/some_code.clj some-fenced-code.md

Both files should be concatenated (`cat` style) on stdout with indentation applied.