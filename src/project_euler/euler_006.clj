(ns project-euler.euler-006
  (:require [euler-project.lib :as eulib]))

(defn euler-006 [x]
  "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

  What is the 10 001st prime number?"
  (nth ((eulib/prime-numbers)) x))
