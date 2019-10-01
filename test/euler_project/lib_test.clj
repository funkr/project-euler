(ns euler-project.lib-test
  (:require [clojure.test :refer :all])
  (:require [euler-project.lib :refer [number-summary factorial permutations]]))

(deftest number-summary-test
  (is (= (:proper-divisors (number-summary 28)) '#{1 2 4 7 14 28})))

(deftest factorial-test
  (is (= (factorial 5)  120)))

(deftest factorial-test
  (is (= (factorial 6)  720)))

(deftest factorial-test
  (is (= (factorial 4)  24)))

(deftest factorial-test
  (is (= (factorial 40)  815915283247897734345611269596115894272000000000)))

(deftest permutations-test
  (is (= (permutations 4 2) 6)))

(deftest permutations-test
  (is (= (permutations 40 20) 137846528820N)))
