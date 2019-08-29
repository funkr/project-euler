(ns project-euler.euler-005
  (:require [euler-project.lib :as eulib])
  (:gen-class))

(defn is-even-divisible [nr divisors]
  "Check if the given number divisible by the divisors"
  (= (count (filter (fn [x] (= (mod nr x) 0)) (range 1 (inc divisors)))) divisors))


(defn euler-005 [limit]
  "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
  (let [prime (eulib/prime-numbers)
        step (reduce * (take-while #(<= %1 limit) (prime)))]
    (first (drop-while #(not (is-even-divisible %1 limit)) (range step (* step 2000) step)))))
