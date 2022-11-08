(ns pez.prettier-plugin-clojure-test
  (:require [clojure.test :refer [deftest is]]
            [pez.prettier-plugin-clojure :as sut]))

(deftest format-text
  (is (= "(foo\n bar)"
         (sut/format-text "( foo \nbar)"))))