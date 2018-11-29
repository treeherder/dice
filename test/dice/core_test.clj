(ns dice.core-test
  (:require [clojure.test :refer :all]
            [dice.core :refer :all]))

(deftest a-test
  (testing "Get the number and type of dice."
    (is clojure.lang.PersistentVector
        ((fn numtyp  [x] (re-find (re-pattern "([1-9]\\d*)?d([1-9]\\d*)") x))"2d20"))))
