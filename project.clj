(defproject project-euler "0.2.2-SNAPSHOT"
  :description "My try on the euler project"
  :url "https://projecteuler.net/"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/math.combinatorics "0.1.6"]
                 [clj-time "0.15.2"]]
  :repl-options {:init-ns project-euler.core})

