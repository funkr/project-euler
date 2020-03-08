(ns project-euler.euler-020-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-020 :refer :all]))

(deftest factorial-1
  "The good old factorial function"
  (is (= 3628800 (factorial 10))))

(deftest euler-020-1
  "Get the example value 27"
  (is (= 27 (euler-020 10))))

(deftest euler-020-2
  "Get the searched value"
  (is (= 648 (euler-020 100))))