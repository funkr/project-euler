(ns project-euler.euler-016
  (:require [clojure.math.numeric-tower :as math]))

(defn euler-016 [exp]
  "2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?"
  (reduce + (map (fn [c] (Character/digit c 10))  (seq (str (math/expt 2 exp))))))
