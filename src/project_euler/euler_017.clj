(ns project-euler.euler-017)

(defn get-single-number-word [x]
  (let [x (mod x 10)]
    (condp = x
      0 '"zero"
      1 '("one")
      2 '("two")
      3 '("three")
      4 '("four")
      5 '("five")
      6 '("six")
      7 '("seven")
      8 '("eight")
      9 '("nine"))))

(defn get-teen-number-word [x]
  "All numbers from 10 to 19"
  (let [x (mod x 20)
        y (mod x 10)]
    (condp = y
      0 '("ten")
      1 '("eleven")
      2 '("twelve")
      3 '("thirteen")
      4 '("fourteen")
      5 '("fifteen")
      6 '("sixteen")
      7 '("seventeen")
      8 '("eighteen")
      9 '("nineteen"))))

(defn get-deca-number-word [x]
  (let [x (mod x 100)
        x (int (/ x 10))]
    (condp = x
      0 '("")
      1 '("")
      2 '("twenty")
      3 '("thirty")
      4 '("forty")
      5 '("fifty")
      6 '("sixty")
      7 '("seventy")
      8 '("eighty")
      9 '("ninety"))))

(defn get-composite-number-word [x]
  "Create numbers from 20 to 99"
  (let [single (get-single-number-word (mod x 10))
        deca-word (get-deca-number-word x)]
    (if (= single "zero") deca-word (concat deca-word single))))

(defn get-arian-number-word [x]
  "All numbers from 1 to 99"
  (let [x (mod x 100)]
    (cond
      (= x 0) nil
      (< x 10) (get-single-number-word x)
      (< x 20) (get-teen-number-word x)
      :else (get-composite-number-word x))))

(defn get-decarian-number-word [x]
  "Create numbers 100 - 999"
  (let [y (int (/ x 100))
        x1 (int (mod x 100))]
    (if (= y 0)
      (get-arian-number-word x)
      (concat (get-single-number-word y) '("hundred")
              (if (> x1 0) (concat '("and") (get-arian-number-word x1)) )))))

(defn generate-word-list [limit]
  (pmap get-decarian-number-word (range 1 limit)))

(defn count-word-list [words]
  (reduce + (pmap count (flatten words))))

(defn euler-017 [] #"If the numbers 1 to 5 are written out in words: one, two, three, four, five,
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
and 115 (one hundred and fifteen) contains 20 letters. The use of \"and\" when writing out numbers is in compliance
with British usage.")
