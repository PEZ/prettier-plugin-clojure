(ns pez.formatter
  (:require [cljfmt.core :as cljfmt]))

(defn format-text [text]
  (cljfmt/reformat-string text))

(defn format-text-bridge
  [^js text]
  (format-text text))