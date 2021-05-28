(ns my.app-spec
  (:require [cljs.test :refer [deftest is]]
            [my.app :as app]
            [my.core]))

(deftest app-should-return-value-from-lazy-module
  (is (true? (app/init))))
