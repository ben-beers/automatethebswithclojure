(ns nim.core-test
  (:require [clojure.test :refer :all]
            [nim.core :refer :all]))

(deftest a-test
  (testing "FIX'dME, I pass!"
    (is (= 1 1))))

(deftest file-read-test
  (testing "Should read from file and return nil"
    (is (= (read-line-from "testfile.txt") nil))))

(deftest print-GG-test
  (testing "Should return GG when 0 or 4"
   (is (= (make-a-move 0) "GG"))
   (is (= (make-a-move 4) "GG"))))

(deftest return-0-test
  (testing "Should return 0 when 1, 2 or 3 are passed as an argument"
    (is (= (make-a-move 1) 0))
    (is (= (make-a-move 2) 0))
    (is (= (make-a-move 3) 0))))

(deftest return-4-test
  (testing "Should return 4 when 5, 6, or 7 is passed as an argument"
    (is (= (make-a-move 5) 4))
    (is (= (make-a-move 6) 4))
    (is (= (make-a-move 7) 4))))

(deftest extended-test
  (testing "Should return correct values for up to 25"
    (is (= (make-a-move 8) "GG"))
    (is (= (make-a-move 9) 8))
    (is (= (make-a-move 10) 8))
    (is (= (make-a-move 11) 8))
    (is (= (make-a-move 12) "GG"))
    (is (= (make-a-move 13) 12))
    (is (= (make-a-move 14) 12))
    (is (= (make-a-move 15) 12))
    (is (= (make-a-move 16) "GG"))
    (is (= (make-a-move 17) 16))
    (is (= (make-a-move 18) 16))
    (is (= (make-a-move 19) 16))
    (is (= (make-a-move 20) "GG"))
    (is (= (make-a-move 21) 20))
    (is (= (make-a-move 22) 20))
    (is (= (make-a-move 23) 20))
    (is (= (make-a-move 24) "GG"))
    (is (= (make-a-move 25) 24))))
