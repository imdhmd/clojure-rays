(ns clojure.rays)

(defn load-art-from-file [art-file-path]
  (with-open [reader (clojure.java.io/reader art-file-path)]
    (doall (line-seq reader))))

(defn line-check[line]
  (let [chars (split line]))

(defn prepare-art [art-file-path]
  (let [art-lines (load-art-from-file art-file-path)]
    (reduce (fn[line] ) [] art-lines)))