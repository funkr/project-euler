(ns project-euler.euler-003
  (:gen-class))

(defn next-prime? [primes nc]
  "It check if the prime candidate is prime.
  The candidate must be the next following prime number to the last elements of primes.

  [2 3 5] 7 -> true
  [2 3 5 7] 9 -> false
  [2 3 5 7] 11 -> true
  [2 3 5 7] 12 not allowed!"
  (empty? (filter #(= (mod nc %1) 0) primes)))

(defn next-prime [primes]
  "Produces the next prime number.

  [2 3 5 7] -> 11"
  (let [last-prime (+ 2 (last primes))
        end (* last-prime last-prime)]
    (first (take 1 (filter #(next-prime? primes %1) (range last-prime end 2))))))

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
  (not (nil? (some #{to-test} (take-while #(<= %1 to-test) ((prime-numbers)))))))

(defn ttt [x]
  "A bloody imperative style function to get some how the prime factors.
  Left as artifact of my victory over my weak brain. :)"
  (let [to-test (atom x)                                    ;to-test (atom 13195)
        pkf (get-prime-list-keeper)
        idx (atom 0)]
    (do
      (while (not= @to-test 1)
        (if (= (mod @to-test (get (pkf) @idx)) 0)
          (do (swap! to-test / (get (pkf) @idx))
              (print @to-test "|" (get (pkf) @idx) "\n"))
          (do (swap! idx inc))))
      (print "kk" @to-test "|" @idx "llll"))))

(defn euler-003
  "The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?"
  [x] (prime-factorial x))
