(ns project-euler.euler-024-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-024 :refer :all]))

(deftest list<?-1
  "Compare two list lexicographically"
  (is
    (= 0 (compare "COLIN" (nth (list<? "p022_names.txt" "") 937)))))
