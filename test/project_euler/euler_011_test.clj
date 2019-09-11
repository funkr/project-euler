(ns project-euler.euler-011-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-011 :refer [get-north get-south get-east get-west get-north-east get-south-east
                                             get-south-west get-north-west get-max-pos euler-011 grid]]))

(deftest get-north-test
  "Check if grabbing the values in north direction works"
  (is (= (get-north grid 4 0 4 20 20) '(49 81 52 22))))

(deftest get-north-test-0
  "Check if grabbing the values in north direction works"
  (is (= (get-north grid 4 0 0 20 20) nil)))

(deftest get-south-test
  "Check if grabbing the values in north direction works"
  (is (= (get-south grid 4 0 0 20 20) '(52 81 49 8))))

(deftest get-south-test-0
  "Check if grabbing the values in north direction works"
  (is (= (get-south grid 4 0 16 20 20) '(1 20 20 04))))

(deftest get-south-test-1
  "Check if grabbing the values in north direction works"
  (is (= (get-south grid 4 0 17 20 20) nil)))

(deftest get-east-test
  "Check if grabbing the values in east direction works"
  (is (= (get-east grid 4 16 0 20 20) '(8 91 77 50))))

(deftest get-east-test-0
  "Check if grabbing the values in east direction works"
  (is (= (get-east grid 4 17 0 20 20) nil)))

(deftest get-west-test
  "Check if grabbing the values in west direction works"
  (is (= (get-west grid 4 3 0 20 20) '(8 2 22 97))))

(deftest get-north-east-test
  "Check if grabbing the values in north east direction works"
  (is (= (get-north-east grid 4 16 3 20 20) '(8 62 13 37))))

(deftest get-south-east-test
  "Check if grabbing the values in south east direction works"
  (is (= (get-south-east grid 4 0 0 20 20) '(23 31 49 8))))

(deftest get-south-east-test-0
  "Check if grabbing the values in south east direction works"
  (is (= (get-south-east grid 4 16 16 20 20) '(48 5 4 40))))

(deftest get-south-east-test-1
  "Check if grabbing the values in south east direction works"
  (is (= (get-south-east grid 4 17 16 20 20) nil)))

(deftest get-south-east-test-2
  "Check if grabbing the values in south east direction works"
  (is (= (get-south-east grid 4 16 17 20 20) nil)))

(deftest get-south-west-test
  "Check if grabbing the values in south west direction works"
  (is (= (get-south-west grid 4 3 0 20 20) '(52 49 99 97))))

(deftest get-north-west-test
  "Check if grabbing the values in south west direction works"
  (is (= (get-north-west grid 4 3 3 20 20) '(8 49 31 23))))

(deftest whole-round
  "Check if I get all values in a circle"
  (is (= (get-north grid 4 5 5 20 20) '(79 60 67 3)))
  (is (= (get-north-east grid 4 5 5 20 20) '(93 42 63 3)))
  (is (= (get-east grid 4 5 5 20 20) '(44 2 45 3)))
  (is (= (get-south-east grid 4 5 5 20 20) '(97 20 67 3)))
  (is (= (get-south grid 4 5 5 20 20) '(73 62 23 3)))
  (is (= (get-south-west grid 4 5 5 20 20) '(58 68 64 3)))
  (is (= (get-west grid 4 5 5 20 20) '(32 60 99 3)))
  (is (= (get-north-west grid 4 5 5 20 20) '(31 23 51 3)))
  )

(deftest get-max-pos-test
  "Get the maximum for 5 5"
  (is (= (get-max-pos grid 4 5 5 20 20) 952740)))

(deftest euler-011-test
  "Get the result"
  (is (= (euler-011) 70600674)))
