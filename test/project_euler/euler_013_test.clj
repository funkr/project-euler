(ns project-euler.euler-013-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-013 :refer :all]))

(deftest euler-013-test
  ""
  (is (= (euler-013) "5537376230")))

(deftest euler-013-number-1-test
  ""
  (is (=  (count euler-013-number-r) 100)))
