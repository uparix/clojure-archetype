(ns ${package}.app-test
    (:require
      [clojure.test :refer :all]
      [midje.sweet :refer :all]
      [${package}.app :refer :all]))

(facts "Test Suite"
       (fact "hello world" (hello) => "world")
       )