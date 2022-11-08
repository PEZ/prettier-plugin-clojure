const formatter = require('../cljs-out/prettier-plugin-clojure')

const languages = [
  {
    extensions: ['.clj', '.cljs', '.cljc', '.edn', '.bb'],
    name: 'Clojure',
    parsers: ['clj-parse']
  }
]

const parsers = {
  'clj-parse': {
    parse: text => [text],
    astFormat: 'clj-string'
  }
}

function printClojure(path, _options, _print) {
  return [formatter.formatText(path.getValue()[0])];
}

const printers = {
  'clj-string': {
    print: printClojure
  }
}

module.exports = {
  languages,
  parsers,
  printers
}
