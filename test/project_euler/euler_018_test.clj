(ns project-euler.euler-018-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-018 :refer :all]))

(deftest triangle-access-1
  "Learn how to access the data"
  (is (= 75 (get (get triangle 0) 0))))

(deftest get-left-test-0
  (is (= 95 (get-left-leaf triangle 0 0))))

(deftest get-right-test-0
  (is (= 64 (get-right-leaf triangle 0 0))))

(deftest get-max-test
  (is (= 95 (get-max triangle 0 0))))

(deftest length-triangle
  "How to handle the triangle"
  (is (= 15 (count triangle))))

(deftest get-max-leaf-1
  (is (= '(35 87 87) (get-max-leaf '(18 35 87 10)))))

(def ttri [[3]
           [7 4]
           [2 4 6]
           [8 5 9 3]])

(deftest contract-triangle-1
  (is (= [23] (contract-triangle ttri))))

(deftest contract-triangle-2
  (is (= [1074] (contract-triangle triangle))))
