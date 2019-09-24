(ns project-euler.euler-014)

(defn collatz-sequence [x]
  "Get Collatz Sequence for x"
  (if (< x 1) '()
              (if (= 1 x) (cons x nil)
                          (if (even? x) (lazy-seq (cons x (collatz-sequence (/ x 2))))
                                        (lazy-seq (cons x (collatz-sequence (inc (* 3 x)))))))))

(defn euler-014 [limit]
  "The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million."
  (apply max-key #(get %1 1) (pmap #(vector (first %1) (count %1)) (pmap collatz-sequence (range 1 limit)))))
