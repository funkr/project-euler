(ns project-euler.euler-005-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-005 :refer :all]))

(deftest is-even-divisible-test
  "Check if 2520 is divisible all number 1..10"
  (is (= (is-even-divisible 2520 10) true)))

(deftest euler-005-test-example
  "Check the example 2520"
  (is (= (euler-005 10) 2520) true))

(deftest euler-005-test-problem
  "Check the result 232792560"
  (is (= (euler-005 20) 232792560) true))
