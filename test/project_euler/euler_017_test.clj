(ns project-euler.euler-017-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-017 :refer [get-single-number-word get-teen-number-word get-arian-number-word
                                             get-composite-number-word get-decarian-number-word generate-word-list
                                             count-word-list]]))

(deftest get-single-number-word-test-0
  (is (= "zero" (get-single-number-word 0))))

(deftest get-single-number-word-test-10
  (is (= "zero" (get-single-number-word 10))))

(deftest get-single-number-word-test-5
  (is (= '("five") (get-single-number-word 5))))

(deftest get-teen-number-word-test-10
  (is (= '("ten") (get-teen-number-word 10))))

(deftest get-teen-number-word-test-11
  (is (= '("eleven") (get-teen-number-word 11))))

(deftest get-teen-number-word-test-13
  (is (= '("thirteen") (get-teen-number-word 13))))

(deftest get-teen-number-word-test-14
  (is (= '("fourteen") (get-teen-number-word 14))))

(deftest get-teen-number-word-test-19
  (is (= '("nineteen") (get-teen-number-word 19))))

(deftest get-composite-number-word-test-20
  (is (= '("twenty") (get-composite-number-word 20))))

(deftest get-composite-number-word-test-21
  (is (= '("twenty" "one") (get-composite-number-word 21))))

(deftest get-composite-number-word-test-22
  (is (= '("twenty" "two") (get-composite-number-word 22))))

(deftest get-composite-number-word-test-29
  (is (= '("twenty" "nine") (get-composite-number-word 29))))

(deftest get-composite-number-word-test-30
  (is (= '("thirty") (get-composite-number-word 30))))

(deftest get-composite-number-word-test-33
  (is (= '("thirty" "three") (get-composite-number-word 33))))

(deftest get-composite-number-word-test-34
  (is (= '("thirty" "four") (get-composite-number-word 34))))

(deftest get-composite-number-word-test-39
  (is (= '("thirty" "nine") (get-composite-number-word 39))))

(deftest get-composite-number-word-test-90
  (is (= '("ninety") (get-composite-number-word 90))))

(deftest get-composite-number-word-test-99
  (is (= '("ninety" "nine") (get-composite-number-word 99))))

(deftest get-arian-number-word-test-1
  (is (= '("one") (get-arian-number-word 1))))

(deftest get-arian-number-word-test-2
  (is (= '("two") (get-arian-number-word 2))))

(deftest get-arian-number-word-test-12
  (is (= '("twelve") (get-arian-number-word 12))))

(deftest get-arian-number-word-test-13
  (is (= '("thirteen") (get-arian-number-word 13))))

(deftest get-arian-number-word-test-19
  (is (= '("nineteen") (get-arian-number-word 19))))

(deftest get-arian-number-word-test-20
  (is (= '("twenty") (get-arian-number-word 20))))

(deftest get-arian-number-word-test-21
  (is (= '("twenty" "one") (get-arian-number-word 21))))

(deftest get-arian-number-word-test-90
  (is (= '("ninety") (get-arian-number-word 90))))

(deftest get-arian-number-word-test-99
  (is (= '("ninety" "nine") (get-arian-number-word 99))))

(deftest get-decarian-number-word-test-1
  (is (= '("one") (get-decarian-number-word 1))))

(deftest get-decarian-number-word-test-5
  (is (= '("five") (get-decarian-number-word 5))))

(deftest get-decarian-number-word-test-15
  (is (= '("fifteen") (get-decarian-number-word 15))))

(deftest get-decarian-number-word-test-100
  (is (= '("one" "hundred") (get-decarian-number-word 100))))

(deftest get-decarian-number-word-test-101
  (is (= '("one" "hundred" "and" "one") (get-decarian-number-word 101))))

(deftest get-decarian-number-word-test-201
  (is (= '("two" "hundred" "and" "one") (get-decarian-number-word 201))))

(deftest get-decarian-number-word-test-215
  (is (= '("two" "hundred" "and" "fifteen") (get-decarian-number-word 215))))

(deftest get-decarian-number-word-test-900
  (is (= '("nine" "hundred") (get-decarian-number-word 900))))

(deftest get-decarian-number-word-test-999
  (is (= '("nine" "hundred" "and" "ninety" "nine") (get-decarian-number-word 999))))

(deftest generate-word-list-test
  (is (= '(("one") ("two") ("three") ("four")) (generate-word-list 5))))

(deftest count-word-list-test
  (is (= 15 (count-word-list (generate-word-list 5)))))

(deftest count-word-list-test-1000
  "plus 11 for one thousand = 21113 + 11"
  (is (= 21113 (count-word-list (generate-word-list 1000)))))
