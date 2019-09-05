(ns project-euler.euler-006
  (:require [clojure.math.numeric-tower :as math]))

(defn euler-006 [limit]
  "The sum of the squares of the first ten natural numbers is,

  1^2 + 2^2 + ... + 10^2 = 385
  The square of the sum of the first ten natural numbers is,

  (1 + 2 + ... + 10)2 = 552 = 3025
  Hence the difference between the sum of the squares of the first ten natural numbers
  and the square of the sum is 3025 − 385 = 2640.

  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum."
  (let [collection (range 1 (inc limit))
        square-sum (apply + (map #(* %1 %1) collection))
        sum-square (math/expt (apply + collection) 2)]
    (- sum-square square-sum)))
