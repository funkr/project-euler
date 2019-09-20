(ns project-euler.euler-012-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-012 :refer [triangle-number euler-012]]))

(deftest triangle-number-test
  "Check if 7 gives 28"
  (is (= (triangle-number 7) 28)))


(deftest triangle-number-test
  "Check if 12 gives 78"
  (is (= (triangle-number 12) 78)))

(deftest euler-012-test
  "28 has 5 divisor"
  (is (= (:proper-divisors (euler-012 5)) '#{1 2 4 7 14 28})))

(deftest euler-012-test-1
  "28 has 5 divisor"
  (is (= (:proper-divisors (euler-012 7)) '#{1 2 3 4 6 9 12 18 36})))

(deftest euler-012-test-2
  "28 has 5 divisor"
  (is (= (:n (euler-012 10)) 120)))

(deftest euler-012-test-result
  "get result for 500"
  (is (= (:proper-divisors (euler-012 500)) 76576500)))
