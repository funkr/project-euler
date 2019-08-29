(ns project-euler.euler-004
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn is-palindrom-number [nr]
  "Check if the number is a palindrom"
  (let [nr-str (str nr)
        rev-nr-str (apply str (reverse nr-str))]
    (= nr-str rev-nr-str)))

(defn check-digits [nr digits]
  (< nr (math/expt 10 digits)))

(defn generate [nr digits]
  (let [factor-space (math/expt 10 digits)]
    (seq (map (fn [x] [nr (/ nr x) x])
              (filter #(and (= (mod nr %1) 0) (check-digits (/ nr %1) digits) (check-digits %1 digits))
                      (range 1 factor-space))))))

(defn euler-004 [digits]
  "A palindromic number reads the same both ways.
  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers."
  (let [solution-space (math/expt (dec (math/expt 10 digits)) 2)]
    (apply max (map #(get (first %1) 0)
                    (seq (filter #(not (nil? %1))
                                 (map #(generate %1 digits)
                                      (filter #(is-palindrom-number %1) (range 1 solution-space)))))))))
