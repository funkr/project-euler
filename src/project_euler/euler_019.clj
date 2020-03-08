(ns project-euler.euler-019
  (:require [clj-time.format :as tf])
  (:require [clj-time.core :as t]))

(def government-forms-date (tf/formatter "E MM/dd/YYYY"))

(defn time-formatter [clj-date]
  (tf/unparse government-forms-date clj-date))

(defn add-month [start-date]
  "Lazy sequence with consecutive month"
  (lazy-seq (cons start-date (add-month (.plusMonths start-date 1)))))

(defn month-start-days [start-date end-date]
  (take-while #(t/after? end-date %) (add-month start-date)))

(defn sunday? [clj-date]
  (= 7 (t/day-of-week clj-date)))

(defn euler-019 [start-date end-date]
  "
  You are given the following information, but you may prefer to do some research for yourself.

  1 Jan 1900 was a Monday.
  Thirty days has September,
  April, June and November.
  All the rest have thirty-one,
  Saving February alone,
  Which has twenty-eight, rain or shine.
  And on leap years, twenty-nine.
  A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
  How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
  "
  (let [all-month-start-days (month-start-days start-date end-date)]
    (filter #(sunday? %) all-month-start-days)))
