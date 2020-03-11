(ns project-euler.euler-010-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-010 :refer [euler-010]]))

  (deftest euler-010-test
    (is (= (euler-010 2000000) 142913828922)))