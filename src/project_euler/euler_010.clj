(ns project-euler.euler-010
  (:require [euler-project.lib :as eulib]))

(defn euler-010 [limit]
  "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million."
  (apply + (take-while #(< %1 limit) ((eulib/prime-numbers)))))
