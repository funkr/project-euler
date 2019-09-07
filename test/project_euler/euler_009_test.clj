(ns project-euler.euler-009-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-009 :refer [euler-009]]))

(deftest euler-009-test
  (is (= (euler-009 1000) [[200 375 425] 31875000])))
