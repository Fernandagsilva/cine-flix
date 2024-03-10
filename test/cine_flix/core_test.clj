(ns cine-flix.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [cine-flix.core :as cine-flix]))

(deftest add-two-numbers-test
  (testing "should add two numbers"
    (is (= 5 (cine-flix/add-two-numbers 2 3)))
    (is (= 5 (cine-flix/add-two-numbers 3 2))))
  (testing "shouldn't add two number"
    (is (thrown? Exception (cine-flix/add-two-numbers 3 nil)))))
