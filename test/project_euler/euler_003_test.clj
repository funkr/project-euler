(ns project-euler.euler-003-test
  (:require [clojure.test :refer :all]
            [project-euler.euler-003 :refer :all]))

(deftest euler-project.prime?
  (testing "Check a few prime numbers"
    (is (= (prime? 71) true))
    (is (= (prime? 70) false))))

(deftest euler-project.euler-003-13195
  (testing "The example with 13195"
    (is (= (prime-factorial 13195) '(29 13 7 5)))))

(deftest euler-project.euler-003-600851475143
  (testing "to get the solution for the actual problem 600851475143"
    (is (= (prime-factorial 600851475143) '(6857 1471 839 71)))))

