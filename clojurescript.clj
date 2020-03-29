(let [x 1]
       (cond
        (< x 2) "x is 1"
        (< x 3) "x is 2"
        (< x 8) "x is less than 8"
        (== x 8) "x is 8"
        (> x 8) "x is greater than 8"))

