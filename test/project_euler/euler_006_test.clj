(ns project-euler.euler-006-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-006 :refer [euler-006]]
            [euler-project.lib :as eulib]))

(deftest euler-006-test
  "Get 10001 prime number n.b 2 has index 0 but is the first prime"
  (is (= (euler-006 10000) 104743)))
