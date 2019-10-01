(ns project-euler.euler-015
  (:require [euler-project.lib :as math]))

(defn euler-015 [gridx gridy]
  "Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
  there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?"
  (math/permutations (+ gridx gridy) gridy))
