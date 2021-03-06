(ns euler-project.lib)

(defn next-prime? [primes nc]
  "It check if the prime candidate is prime.
  The candidate must be the next following prime number to the last elements of primes.

  [2 3 5] 7 -> true
  [2 3 5 7] 9 -> false
  [2 3 5 7] 11 -> true
  [2 3 5 7] 12 not allowed!"
  (empty? (filter #(do (println % nc primes (mod nc %1)) (= (mod nc %1) 0)) primes)))

(defn next-prime-a? [primes nc]
  (reduce (fn [res val] (if (= (mod nc val) 0) (reduced false) true)) primes))

(defn next-prime [primes]
  "Produces the next prime number.

  [2 3 5 7] -> 11"
  (let [last-prime (+ 2 (last primes))
        end (* 2 last-prime)]
    (first (filter #(next-prime-a? primes %1) (range last-prime end 2)))))

(defn get-prime-list-keeper []
  "It creates a function which creates an array with prime numbers.
  Every time it is called it enhances the array by one.
  The array is accessible via (get primes index).
  The index must not exceed the array size. To get arbitrary prime lists use prime-number"
  (let [primes (atom [2 3])]
    (fn ([] (do (swap! primes conj (next-prime @primes))
                @primes)))))

(defn prime-numbers []
  "Lazy sequence with consecutive prime numbers"
  (let [prime-keeper-fn (get-prime-list-keeper)]
    (fn prime-number
      ([] (prime-number 0))
      ([idx] (lazy-seq (cons (get (prime-keeper-fn) idx) (prime-number (inc idx))))))))

(defn prime-factorial
  "It generates a list of prime factors from a given number greater than 1"
  ([nr] (prime-factorial nil nr (get-prime-list-keeper) 0))
  ([result-seq nr plk idx] (let [prime (get (plk) idx) rest (not= (mod nr prime) 0)]
                             (if (> nr 1)
                               (if rest
                                 (recur result-seq nr plk (inc idx))
                                 (recur (conj result-seq prime) (/ nr prime) plk idx))
                               (seq result-seq)))))

(defn prime? [to-test]
  "Check if a given number is prime."
  (boolean
    (some #{to-test} (take-while #(<= %1 to-test) ((prime-numbers))))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn isadjacent [a b]
  (or (= (inc a) b) (= (dec a) b)))


(defn number-summary
  "Computes a summary of the arithmetic properties of a number, as a data structure."
  [n ]
  (let [proper-divisors (into (sorted-set)
                              (filter
                                (fn [d]
                                  (zero? (rem n d)))
                                (range 1 (inc n))))
        divisors-sum (apply + proper-divisors)]
    {:n               n
     :proper-divisors proper-divisors
     :even?           (even? n)
     :prime?          (= proper-divisors #{1})
     :divisors-sum     divisors-sum
     :perfect-number? (= divisors-sum n)}))


(defn factorial
  [n]
  (reduce * (bigint 1) (range 1 (inc n))))

(defn permutations [x y]
  "Return the permutation x over y"
  (let [x1 (- x y)]
    (/ (factorial x) (* (factorial x1) (factorial x1)))))
