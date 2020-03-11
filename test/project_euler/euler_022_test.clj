(ns project-euler.euler-022-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-022 :refer :all]))

(deftest clean-data-1
  "Make that mess spick and span"
  (is
   (= 0 (compare "COLIN" (nth (clean-data "p022_names.txt") 937)))))

(deftest clean-data-2
  "Make that mess spick and span"
  (is
   (= 0 (compare "AARON" (nth (clean-data "p022_names.txt") 0)))))

(deftest clean-data-3
  "Make that mess spick and span"
  (is (= 5163 (count (clean-data "p022_names.txt")))))

(deftest calc-word-value-1
  "Test COLIN"
  (is (= 53 (calc-word-value "COLIN"))))

(deftest calc-word-value-2
  "Test AARON"
  (is (= 49 (calc-word-value "AARON"))))

(deftest euler-022-1
  "Get the solution"
  (is (= 871198282 (euler-022))))