(ns project-euler.euler-022-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-022 :refer :all]))

(deftest create-value-list-1
  "Get the data cleaning going"
  (is (= 5163 (count (create-value-list)))))

(deftest create-value-list-2
  "Get the data cleaning going"
  (is
    (= '([1 49 "AARON"] [2 35 "ABBEY"]) (take 2 (create-value-list)))))

(deftest create-value-list-3
  "Get the data cleaning going"
  (is
   (= 49714
      (* (first (nth (create-value-list) 937))
         (second (nth (create-value-list) 937))))))

(deftest clean-data-1
  "Make that mess spick and span"
  (is
   (= 0 (compare "COLIN" (nth (clean-data "p022_names.txt") 937)))))

(deftest clean-data-2
  "Make that mess spick and span"
  (is
   (= 0 (compare "AARON" (nth (clean-data "p022_names.txt") 0)))))

(deftest clean-data-3
  "Make that mess spick and span"
  (is (= 5163 (count (clean-data "p022_names.txt")))))

(deftest calc-word-value-1
  "Test COLIN"
  (is (= 53 (calc-word-value "COLIN"))))

(deftest calc-word-value-2
  "Test AARON"
  (is (= 49 (calc-word-value "AARON"))))

(deftest euler-022-1
  "Get the solution"
  (is (= 871198282 (euler-022))))