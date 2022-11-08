(ns pez.prettier-plugin-clojure
  (:require [cljfmt.core :as cljfmt]))

(defn- format-text [text]
  (cljfmt/reformat-string text))

(defn print-clojure [^js node ^js _options ^js _print]
  (clj->js [(format-text (-> node
                             .getValue
                             first))]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def ^js languages
  (clj->js [{:extensions [".clj", ".cljs", ".cljc", ".edn", ".bb"],
             :name "Clojure",
             :parsers [:clojure]}]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def ^js parsers
  (clj->js {:clojure {:parse (fn [text] [text])
                      :astFormat :clojure}}))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def ^js printers
  (clj->js {:clojure {:print print-clojure}}))