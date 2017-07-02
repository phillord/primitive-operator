(ns primitive.operator.integer
  (:import [primitive.operator PInteger]))


(defn * [x y]
  (PInteger/mul x y))

(def mul #'*)

(defn / [x y]
  (PInteger/div x y))

(def div #'/)

(defn rem [x y]
  (PInteger/rem x y))

(defn + [x y]
  (PInteger/add x y))

(def add #'+)

(defn - [x y]
  (PInteger/minus x y))

(def sub #'-)

(defn << [x y]
  (PInteger/leftShift x y))

(def left-shift #'<<)

(defn >> [x y]
  (PInteger/rightShift x y))

(def right-shift #'>>)

(defn >>> [x y]
  (PInteger/unsignedRightShift x y))

(def unsigned-right-shift #'>>>)

(defn not [x]
  (PInteger/complement x))

(defn & [x y]
  (PInteger/and x y))

(def and #'&)

(defn xor [x y]
  (PInteger/xor x y))

(defn | [x y]
  (PInteger/or x y))

(def or #'&)
