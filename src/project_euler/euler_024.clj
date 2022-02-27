(ns project-euler.euler-024)

(defn unless [test expr] (if-not (eval test) (eval expr)))

(defn list<? [left-list right-list]
  (let loop ([l left-list] [r right-list])
            (unless (not (= (first l) (first r)))
                    (loop (rest l) (rest r)))
            (< (first l) (first r))))

(defn process [li]
  (clojure.string/join (map number->string (reverse li)) ""))

(defn euler-024 [lex-count elem-idx]
  "
  A permutation is an ordered arrangement of objects.
  For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
  If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
  The lexicographic permutations of 0, 1 and 2 are:

  012   021   102   120   201   210

  What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
  "
  (nth (sort (map process (permutations (range lex-count))) string<?) (dec elem-idx)))