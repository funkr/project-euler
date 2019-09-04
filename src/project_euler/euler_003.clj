(ns project-euler.euler-003
  (:require [euler-project.lib :as eulib])
  (:gen-class))

(defn ttt [x]
  "A bloody imperative style function to get some how the prime factors.
  Left as artifact of my victory over my weak brain. :)"
  (let [to-test (atom x)
        pkf (eulib/get-prime-list-keeper)
        idx (atom 0)]
    (do
      (while (not= @to-test 1)
        (if (= (mod @to-test (get (pkf) @idx)) 0)
          (do (swap! to-test / (get (pkf) @idx))
              (print @to-test "|" (get (pkf) @idx) ""))
          (do (swap! idx inc))))
      (print "kk" @to-test "|" @idx "llll"))))

(defn euler-003
  "The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?"
  [x] (eulib/prime-factorial x))
