(ns my.app
  (:require [shadow.lazy :as lazy]))

(defn init []
  (-> (lazy/load (lazy/loadable my.core/core-method))
    (.then (fn [call-me]
             (call-me)))))
