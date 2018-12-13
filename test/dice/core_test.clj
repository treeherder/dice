(ns dice.core-test
  (:require [clojure.test :refer :all]
            [dice.core :refer :all]))

(deftest match_is_vec
  (testing "That the product of phrase \"2d20\" is a Persistent Vector."
  (is clojure.lang.PersistentVector
        ((fn numtyp  [x] (re-find (re-pattern "([1-9]\\d*)?d([1-9]\\d*)") x))"2d20"))))
