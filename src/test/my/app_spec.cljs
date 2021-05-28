(ns my.app-spec
  (:require [cljs.test :refer [async deftest is]]
            [my.app :as app]
            [my.core]))

(deftest app-should-return-value-from-lazy-module
  (async done
    (-> (app/init)
      (.then (fn [value]
               (is (true? value))
               (done))))))
