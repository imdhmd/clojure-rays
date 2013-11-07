(ns clojure.rays)

(def G (normalize {:x -3.1 :y -16.0 :z 1.9}))
(def UP (scale (cross-product G {:x 0.0 :y 0.0 :z 1.0}) 0.002))
(def RIGHT (scale (normalize (cross-product G UP)) 0.002))
(def EYE_OFFSET (add G (scale (add UP RIGHT) -256.0)))

(def ORIGIN {:x -5.0 :y 16.0 :z 8.0})

(def MEGA_PIXEL 1.0)

(def ASPECT_RATIO (/ 512.0 (Math/sqrt (* MEGA_PIXEL 1000000))))

(def DEFAULT_COLOR {:x 13 :y 13 :z 13})
(def SKY_VEC {:x 1.0 :y 1.0 :z 1.0})
(def FLOOR_PATTERN_1 {:x 3.0 :y 1.0 :z 1.0})
(def FLOOR_PATTERN_2 {:x 3.0 :y 3.0 :z 3.0})
(def STD_VEC {:x 0.0 :y 0.0 :z 0.0})
(def EMPTY_VEC {})