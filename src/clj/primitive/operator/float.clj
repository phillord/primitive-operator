(ns primitive.operator.float
  (:refer-clojure :exclude [* / % + -])
  (:import [primitive.operator PFloat]))

(defn *
  "Multiply two numbers.

Arguments and return types will be float."
  [x y]
  (PFloat/mul x y))

(def mul #'*)

(defn /
  "Divide two numbers.

Arguments and return types will be float."
  [x y]
  (PFloat/div x y))

(def div #'/)

(defn rem
  "Remainder of two numbers.

Arguments and return types will be float."
  [x y]
  (PFloat/rem x y))



(defn +
  "Add two numbers.

  Arguments and return types will be float."
  [x y]
  (PFloat/add x y))

(defn -
  "Subtract two numbers.

Arguments and return types will be float."
  [x y]
  (PFloat/minus x y))
