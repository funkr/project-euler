(ns project-euler.euler-009)

(defn pythagorean? [a b c]
  (let [s-sum (* c c)]
    (and (< a b c) (= 0 (- (+ (* a a) (* b b)) s-sum))
         )))


(defn euler-009 [x]
  "A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

  a^2 + b^2 = c^2
  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc."
  (let [limit (inc x)
        triplet
        (for [a (range 1 limit) b (range 1 limit) c (range 1 limit) :when (and (= x (+ a b c)) (pythagorean? a b c))] [a b c])
        sum (apply * (nth triplet 0))]
     [(nth triplet 0) sum])
  )
