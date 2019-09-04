(ns project-euler.euler-008-test
  (:require [clojure.test :refer :all])
  (:require [euler-project.lib :as eulib])
  (:require [project-euler.euler-008 :refer [generate-slice-idx get-slice get-all-slices to-sequence euler-008
                                             euler-008-number]]))

(deftest isadjacent-test-1
  "Check if two number are neighbors"
  (is (= (eulib/isadjacent 1 2) true)))

(deftest isadjacent-test-2
  "Check if two number are neighbors"
  (is (= (eulib/isadjacent 1 0) true)))

(deftest isadjacent-test-3
  "Check if two number are neighbors"
  (is (= (eulib/isadjacent 9 8) true)))

(deftest isadjacent-test-4
  "Check if two number are neighbors"
  (is (= (eulib/isadjacent 9 0) false)))

(deftest generate-slice-idx-test
  "Check if the sequence is sliced correctly"
  (is (= (last (generate-slice-idx 1000 13)) '(987 1000))))

(deftest get-slice-test
  (is (= (get-slice "012345678901234567890123456789" '(5 6 7 8)))))

(deftest get-all-slices-test
  (is (= (first (get-all-slices "012345678901234567890123456789" 3)) '(\0 \1 \2))))

(deftest get-all-slices-test-last
  (is (= (last (get-all-slices "012345678901234567890123456789" 3)) '(\7 \8 \9))))

(deftest euler-008-test
  (is (= (euler-008 euler-008-number 13) 23514624000)))
