(use 'clojure.java.io)

(defn write-to-file
  [file text]
  (with-open [wrtr (writer file)]
    (.write wrtr text)))         

(defn append-to-file
  [file text]
  (with-open [wrtr (writer file :append true)]
    (.write wrtr text)))         

(defn read-line-from-file 
  [file]
  (with-open [rdr (reader file)]
    (doseq [line (line-seq rdr)]
      (println line))))

(defn add-two-to-line
  [file-to-read-from file-to-write-to]
  (with-open [rdr (reader file-to-read-from)]
    (doseq [line (line-seq rdr)]
      (append-to-file
        file-to-write-to
      (str (+ (Long/parseLong line) 2) "\n")))))

(defn make-number-file
    [number-of-lines name-of-file]
    (write-to-file name-of-file "0\n")
    (doseq [x (range 1 (inc number-of-lines))]
      (append-to-file name-of-file (str x "\n"))))

(make-number-file 9 "foo.txt")
(add-two-to-line "foo.txt" "bar.txt")

