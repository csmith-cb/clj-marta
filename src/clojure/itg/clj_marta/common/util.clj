(ns itg.clj-marta.common.util
  (:require [clojure.string :as string]
            [camel-snake-kebab.core :refer :all]))

(defn capitalize-words
  "Capitalize every word in a string"
  [s]
  (->> (string/split (str s) #"\b")
       (map string/capitalize)
       string/join))

(defn to-keyword [key]
  (keyword (->kebab-case (.toLowerCase key))))
