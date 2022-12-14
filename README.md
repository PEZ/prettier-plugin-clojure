# @cospaia/prettier-plugin-clojure

An (almost) indentation-only, non-configurable, [Prettier](https://prettier.io/) Plugin for [Clojure](https://clojure.org) and [ClojureScript](https://clojurescript.org) (and any sufficiently similar implementations).

The plugin really is basic. It will format the code using [cljfmt](https://github.com/weavejester/cljfmt) defaults, without letting you configure anything. This means that mostly indentation will be applied, but there is also some folding of the bracket trail and trimming of whitespace inside the brackets, going on.

Is that really useful? I need it for a project, so, yes, at least to someone. 😄

## Using it

In the project you want to use it, you first:

0. `npm i prettier @cospaia/prettier-plugin-clojure`

Then you can do things like:

``` sh
$ npx prettier <clojure-file | markdown-file-w-fenced-clojure-block>
```

e.g:

```
$ npx prettier ./test-data/some_code.clj
$ npx prettier ./test-data/some-fenced-code.md
```

## Testing it

In this project:

0. `npm i`
0. `npm run builddist`
0. `npx prettier --plugin . ./test-data/some_code.clj`
0. `npx prettier --plugin . ./test-data/some-fenced-code.md`

See also [the test project](./prettier-clojure-test-project/).

## Author

Peter Strömberg, aka [PEZ](https://github.com/PEZ)

## Built with

* [ClojureScript](https://clojurescript.org)
* [shadow-cljs](https://github.com/thheller/shadow-cljs)
* [cljfmt](https://github.com/weavejester/cljfmt)

## LICENSE

MIT
