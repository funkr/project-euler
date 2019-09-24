(ns project-euler.euler-014-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-014 :refer [collatz-sequence euler-014]]))

(deftest collatz-sequence-test-0
  "1 is '(1) "
  (is (= (collatz-sequence 0) '())))

(deftest collatz-sequence-test-1
  "1 is '(1) "
  (is (= (collatz-sequence 1) '(1))))

(deftest collatz-sequence-test-2
  (is (= (collatz-sequence 2) '(2 1))))

(deftest collatz-sequence-test-3
  (is (= (collatz-sequence 3) '(3 10 5 16 8 4 2 1))))

(deftest collatz-sequence-test-5
  (is (= (collatz-sequence 5) '(5 16 8 4 2 1))))

(deftest collatz-sequence-test-13
  (is (= (collatz-sequence 13) '(13 40 20 10 5 16 8 4 2 1))))

(deftest collatz-sequence-test-count-10
(is (= (euler-014 13) [9 20])))

(deftest euler-014-test-100
  (is (= [97 119] (euler-014 100))))

(deftest euler-014-test-1000000
  (is (= [837799 525] (euler-014 1000000))))
