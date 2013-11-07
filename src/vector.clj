(ns clojure.rays)

(defn add[v1 v2]
  {:x (+ (v1 :x) (v2 :x))
   :y (+ (v1 :y) (v2 :y))
   :z (+ (v1 :z) (v2 :z))})

(defn scale[v r]
  {:x (* (v :x) r)
   :y (* (v :y) r)
   :z (* (v :z) r)})

(defn dot-product[v1 v2]
  {:x (* (v1 :x) (v2 :x))
   :y (* (v1 :y) (v2 :y))
   :z (* (v1 :z) (v2 :z))})

(defn cross-product[v1 v2]
  {:x (- (* (v1 :y) (v2 :z)) (* (v1 :z) (v2 :y)))
   :y (- (* (v1 :z) (v2 :x)) (* (v1 :x) (v2 :z)))
   :z (- (* (v1 :x) (v2 :y)) (* (v1 :y) (v2 :x)))})

(defn normalize[v]
  (let [factor (/ (Math/sqrt(+ (* (v :x) (v :x))
                               (* (v :y) (v :y))
                               (* (v :z) (v :z))))
                 1.0)]
    {:x (* factor (v :x))
     :y (* factor (v :y))
     :z (* factor (v :z))}))
