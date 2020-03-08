(ns project-euler.euler-020)


(defn factorial [n]
  (apply * (range (bigint 1) (inc n))))

(defn euler-020 [limit]
  "
  n! means n × (n − 1) × ... × 3 × 2 × 1

  For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
  and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

  Find the sum of the digits in the number 100!"
  (reduce + (map #(Character/digit % 10) (str (factorial limit)))))