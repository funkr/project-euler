(ns project-euler.euler-022)

(defn clean-data [file-name]
  "p022_names.txt"
  (let [names (slurp (str "resources/" file-name))]
    (-> (clojure.string/replace names #"\"" "")
        (clojure.string/split #",")
        (sort))))

(defn calc-word-value [word]
  "Assuming that the word is capitialised"
  (let [word-value (map #(- (int %) 64) (seq word))]
    (reduce + word-value)))

(defn euler-022 []
  "
  Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over
  five-thousand first names, begin by sorting it into alphabetical order.
  Then working out the alphabetical value for each name, multiply this value by its alphabetical
  position in the list to obtain a name score.

  For example, when the list is sorted into alphabetical order, COLIN,
  which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
  So, COLIN would obtain a score of 938 × 53 = 49714.

  What is the total of all the name scores in the file?
  "
  (let [names (clean-data "p022_names.txt")]
    (reduce +
            (map-indexed (fn [idx name] (* (inc idx) (calc-word-value name))) names))))
