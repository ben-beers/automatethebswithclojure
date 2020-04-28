(def current-number (atom "0"))

(while (not= @current-number 17)
        (do 
          ((println "I'm thinking of a number. Can you guess what it is?")
          (let [user-number (read-line)]
             (reset! current-number user-number))
             (print "Guess again!"))))


