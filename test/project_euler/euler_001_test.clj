(ns project-euler.euler-001-test
  (:require [clojure.test :refer :all]
            [project-euler.euler-001 :refer :all]))

(deftest test-10
  (testing "Scale to example"
           (is (= (euler-001 10) 23))))

(deftest test-100
  (testing "Prove example"
           (is (= (euler-001 100) 2318))))

(deftest test-1000
  (testing "Get answer for 1000"
           (is (= (euler-001 1000) 233168))))

(deftest test-10000
  (testing "Get answer for 10000"
           (is (= (euler-001 10000) 23331668))))

(deftest test-100000
  (testing "Get answer for 100000"
           (is (= (euler-001 100000) 2333316668))))
