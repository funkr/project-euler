(ns project-euler.euler-006-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-006 :refer [euler-006]]))

(deftest euler-006-test
  "Check the example"
  (is (= (euler-006 10) 2640)))

(deftest euler-006-test-1000
  "Check the example"
  (is (= (euler-006 1000) 250166416500)))
