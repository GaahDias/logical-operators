;; implementation of bools, and some basic logical operators:
; nothing too fancy, just some study to learn Clojure, and practice some
; functional programming concepts

(ns core)


;; booleans

(defn TRUE [x y] x)
(defn FALSE [x y] y)


;; equal operator
; TRUE -> TRUE
; FALSE -> FALSE

(defn EQUAL [x] x)


;; not operator
; TRUE -> FALSE
; FALSE -> TRUE

(defn NOT [x] (x FALSE TRUE))


;; and operator
; TRUE TRUE -> TRUE
; TRUE FALSE -> FALSE
; FALSE TRUE -> FALSE
; FALSE FALSE -> FALSE

(defn AND [x]
  (fn [y]
    (x y FALSE)))


;; or operator
; TRUE TRUE -> TRUE
; TRUE FALSE -> TRUE
; FALSE TRUE -> TRUE
; FALSE FALSE -> FALSE

(defn OR [x]
  (fn [y]
    (x TRUE y)))
