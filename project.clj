(defproject dice "0.1.0-SNAPSHOT"
  :description "Roll some dice!"
  :url "treeherder.github.io"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot dice.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
