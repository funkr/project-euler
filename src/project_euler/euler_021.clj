(ns project-euler.euler-021
  (:require [euler-project.lib :as eulib]))

(defn sum-proper-divisors [number]
  (apply + (butlast (:proper-divisors (eulib/number-summary number)))))

(defn amicable-number? [a]
  "amicable numbers are numbers which produce each other by dividing and summing AND are not equal"
  (let [b (sum-proper-divisors a)]
    (and (= a (sum-proper-divisors b)) (not= a b))))

(defn euler-021 [limit]
  "
  Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
  If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

  For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
  The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

  Evaluate the sum of all the amicable numbers under 10000.
  "
  (apply +(seq (filter #(amicable-number? %) (range 1 limit)))))