(ns testing
  (:require 
   [clojure.test :refer :all]
   [core]))

(deftest equal-test
  (is (= core/TRUE (core/EQUAL core/TRUE)))
  (is (= core/FALSE (core/EQUAL core/FALSE))))

(deftest not-test
  (is (= core/TRUE (core/NOT core/FALSE)))
  (is (= core/FALSE (core/NOT core/TRUE))))

(deftest and-test
  (is (= core/TRUE ((core/AND core/TRUE) core/TRUE)))
  (is (= core/FALSE ((core/AND core/TRUE) core/FALSE)))
  (is (= core/FALSE ((core/AND core/FALSE) core/TRUE)))
  (is (= core/FALSE ((core/AND core/FALSE) core/FALSE))))

(deftest or-test
  (is (= core/TRUE ((core/OR core/TRUE) core/TRUE)))
  (is (= core/TRUE ((core/OR core/TRUE) core/FALSE)))
  (is (= core/TRUE ((core/OR core/FALSE) core/TRUE)))
  (is (= core/FALSE ((core/OR core/FALSE) core/FALSE))))

(run-tests 'testing)