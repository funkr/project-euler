(ns project-euler.euler-019-test
  (:require [clojure.test :refer :all])
  (:require [project-euler.euler-019 :refer :all])
  (:require [clj-time.core :as clj-time]))

(deftest time-formatter-1
  "Check if the formatter works"
  (is
   (= "Di 01/01/2019" (time-formatter (clj-time/date-time 2019 1 1)))))

(deftest add-month-1
  "Check if the next month day is calculated"
  (is
   (= "Fr 02/01/2019"
      (time-formatter (second (add-month (clj-time/date-time 2019 1 1)))))))

(deftest month-start-days-1
  "Check if you get 12 month per year"
  (is
   (= 12
      (count
       (month-start-days (clj-time/date-time 2019 1 1) (clj-time/date-time 2019 12 31))))))

(deftest is-sunday?-1
  "Check if it recognises a sunday"
  (is (false? (sunday? (clj-time/date-time 2019 1 5)))))

(deftest is-sunday?-2
  "Check if it recognises a sunday"
  (is (true? (sunday? (clj-time/date-time 2019 1 6)))))

(deftest is-sunday?-3
  "This was monday"
  (is (false? (sunday? (clj-time/date-time 1901 1 1)))))

(deftest euler-019-1
  "Check that 2019 where two sundays month start"
  (is
   (= 2
      (count
       (euler-019 (clj-time/date-time 2019 1 1) (clj-time/date-time 2019 12 31))))))


(deftest euler-019-2
  (is
   (= 171
      (count
       (euler-019 (clj-time/date-time 1901 1 1) (clj-time/date-time 2000 12 31))))))