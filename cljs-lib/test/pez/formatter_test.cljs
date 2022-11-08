(ns pez.formatter-test
  (:require [clojure.test :refer [deftest is]]
            [pez.formatter :as sut]))

(deftest format-text
  (is (= "(foo\n bar)"
         (sut/format-text "( foo \nbar)"))))