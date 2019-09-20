(ns euler-project.lib-test
  (:require [clojure.test :refer :all])
  (:require [euler-project.lib :refer [number-summary]]))

(deftest number-summary-test
  (is (= (:proper-divisors (number-summary 28)) '#{1 2 4 7 14 28})))
