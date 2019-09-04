(ns project-euler.euler-003-test
  (:require [euler-project.lib :as eulib])
  (:require [clojure.test :refer :all]
            [project-euler.euler-003 :refer :all]))

(deftest euler-project.prime?
  (testing "Check a few prime numbers"
    (is (= (eulib/prime? 71) true))
    (is (= (eulib/prime? 70) false))))

(deftest euler-project-prime-numbers
  (testing "Check the lazy list"
    (is (= (nth  ((eulib/prime-numbers)) 6) 17))))

(deftest euler-project.euler-003-13195
  (testing "The example with 13195"
    (is (= (eulib/prime-factorial 13195) '(29 13 7 5)))))

(deftest euler-project.euler-003-600851475143
  (testing "to get the solution for the actual problem 600851475143"
    (is (= (eulib/prime-factorial 600851475143) '(6857 1471 839 71)))))

