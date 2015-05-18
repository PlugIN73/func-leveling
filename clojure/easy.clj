; https://www.4clojure.com/problem/19

(fn  [arr]  (nth arr  (-  (count arr) 1)))

(fn [arr] (first (reverse arr)))


; https://www.4clojure.com/problem/20

(fn [arr] (second (reverse arr)))

; https://www.4clojure.com/problem/21
(fn [arr n] (last (take (inc n) arr)))
