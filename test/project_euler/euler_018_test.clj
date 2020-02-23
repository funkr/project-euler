(ns project-euler.euler-018-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-018 :refer :all]))

(deftest triangle-access-1
  "Learn how to access the data"
  (is (= 75 (get (get triangle 0) 0))))

(deftest get-left-test-0
  (is (= 95 (get-left triangle 0 0))))

(deftest get-right-test-0
  (is (= 64 (get-right triangle 0 0))))

(deftest get-max-test
  (is (= 95 (get-max triangle 0 0))))

(deftest length-triangle
  "How to handle the triangle"
  (is (= 15 (count triangle))))
