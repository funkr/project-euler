(ns project-euler.euler_004_test
  (:require [clojure.test :refer :all]
            [project-euler.euler-004 :refer :all]))

(deftest test-palindrom-number
  (testing "palindroms?"
    (is (= (is-palindrom-number 121) true))))

(deftest test-palindrom-number
  (testing "palindroms?"
    (is (= (is-palindrom-number 122) false))))

(deftest test-check-digits
  (testing "number in range"
    (is (= (check-digits 122 3) true))))

(deftest test-check-digits
  (testing "number in range"
    (is (= (check-digits 122 2) false))))

(deftest test-check-digits
  (testing "number in range"
    (is (= (generate 122 2) false))))

(deftest test-check-digits
  (testing "number in range"
    (is (= (generate 1222 2) '([1222 94 13] [1222 47 26] [1222 26 47] [1222 13 94])))))

(deftest test-euler-0004-2
  (testing "Get example value"
    (is (= (euler-004  2) 9009))))

(deftest test-euler-0004-3
  (testing "Get example value"
    (is (= (euler-004  3) 906609))))
