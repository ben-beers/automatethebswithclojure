(ns nim.core
  (:gen-class))

(use 'clojure.java.io)


(defn append-to-file
  [file text]
 
  (with-open [wrtr (writer file :append true)]
    (.write wrtr text)))
 
(defn write-to-file
  [file text]
  (with-open [wrtr (writer file)]
    (.write wrtr text)))

(defn make-a-move
  [items-left]
  (cond
   (= items-left 0) "GG"
   (= (mod items-left 4) 0) "GG"
   (= (mod items-left 4) 1) (- items-left 1)
   (= (mod items-left 4) 2) (- items-left 2)
   (= (mod items-left 4) 3) (- items-left 3)))

(defn read-line-from
  [source-file destination-file]
  (with-open [rdr (reader destination-file)]
    (doseq [line (line-seq rdr)]
      (append-to-file destination-file (make-a-move (int line))))))

(defn print-from-file
  [file]
 
  (with-open [rdr (reader file)]
    (doseq [line (line-seq rdr)]
      (println line))))

(defn -main
  []
  (read-line-from "testfile.txt" "foo.txt"))

