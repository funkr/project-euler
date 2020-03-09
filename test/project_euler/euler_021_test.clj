(ns project-euler.euler-021-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-021 :refer :all]))

(deftest sum-proper-divisors-1
  "Check the example"
  (is (= 284 (sum-proper-divisors 220))))

(deftest sum-proper-divisors-2
  "Check the example"
  (is (= 220 (sum-proper-divisors 284))))

(deftest amicable-number?-1
  "Check the example"
  (is (true? (amicable-number? 220))))

(deftest euler-021-1
  "Solve the actual problem"
  (is (= 31626 (euler-021 10000))))

