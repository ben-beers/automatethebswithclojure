(use 'clojure.java.io)

(defn write-to-file
  [file text]
  (with-open [wrtr (writer file)]
    (.write wrtr text)))         

(defn append-to-file
  [file text]
  (with-open [wrtr (writer file :append true)]
    (.write wrtr text)))         

(write-to-file "foo.txt" "0\n")
(append-to-file "foo.txt" "1\n")
(append-to-file "foo.txt" "2\n")
(append-to-file "foo.txt" "3\n")
(append-to-file "foo.txt" "4\n")
(append-to-file "foo.txt" "5\n")
(append-to-file "foo.txt" "6\n")
(append-to-file "foo.txt" "7\n")
(append-to-file "foo.txt" "8\n")
(append-to-file "foo.txt" "9\n")

