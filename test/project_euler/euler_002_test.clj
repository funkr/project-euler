(ns project-euler.euler-002-test
  (:require [clojure.test :refer :all]
            [project-euler.euler-002 :refer :all]))

(deftest test-fibionacci
  (testing "Get fib numbers"
           (is (= (take 10 fib-seq-seq) '(0 1 1 2 3 5 8 13 21 34)))))

(deftest test-fibionacci-take-while
  (testing "Get fib numbers < 100"
           (is
            (= (take-while (fn [x] (< x 100)) fib-seq-seq) '(0 1 1 2 3 5 8 13 21 34 55 89)))))

(deftest test-fibionacci-take-while-even
  (testing "Get fib numbers < 100 and even"
           (is
            (= (filter even? (take-while (fn [x] (< x 100)) fib-seq-seq)) '(0 2 8 34)))))

(deftest test-fibionacci-take-while-even-sum
  (testing "Get fib numbers < 100 and even"
           (is
            (= (apply + (filter even? (take-while (fn [x] (< x 100)) fib-seq-seq))) 44))))

(deftest test-fibionacci-take-while-even-sum-4mio
  (testing "Get fib numbers < 4000000 and even"
           (is
            (= (apply + (filter even? (take-while (fn [x] (< x 4000000)) fib-seq-seq))) 4613732))))

(deftest test-problem-002
  (testing "The actueal solving function"
           (is (= (euler-002 4000000) 4613732))))
