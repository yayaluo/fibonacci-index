(ns fibonacci-index.core-test
    (:require [clojure.test :refer :all]
              [fibonacci-index.core :refer :all]))

(deftest fib-test
  (testing "Test fibonacci index with input : 1000 digits"
           (is (= (fib 1000) 4782))))