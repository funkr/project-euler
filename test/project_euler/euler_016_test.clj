(ns project-euler.euler-016-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-016 :refer [euler-016]]))

(deftest euler-016-test-example
  (is (= 26 (euler-016 15))))

(deftest euler-016-test
  (is (= 1366 (euler-016 1000))))
