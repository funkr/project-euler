(ns euler-project.lib-test
  (:require [clojure.test :refer :all])
  (:require [euler-project.lib :refer [number-summary factorial permutations prime-numbers]]))

(deftest number-summary-test
  (is (= (:proper-divisors (number-summary 28)) '#{1 2 4 7 14 28})))

(deftest factorial-test-1
  (is (= (factorial 5)  120)))

(deftest factorial-test-2
  (is (= (factorial 6)  720)))

(deftest factorial-test-3
  (is (= (factorial 4)  24)))

(deftest factorial-test-4
  (is (= (factorial 40)  815915283247897734345611269596115894272000000000)))

(deftest permutations-test-1
  (is (= (permutations 4 2) 6)))

(deftest permutations-test-2
  (is (= (permutations 40 20) 137846528820N)))

(deftest prime-numbers-1
  (is   (= 97 (last (take 25 ((prime-numbers)))))))