(ns project-euler.euler-015-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-015 :refer [euler-015]]))

(deftest euler-015-test
  (is (= 137846528820N (euler-015 20 20))))
