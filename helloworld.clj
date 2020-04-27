;This program will say hello and then ask for your name
(println "Hello, world!")
(println "What's your name?")
(let [username (read-line)]
(println (str "Pleased to meet you, " username "!"))
(println (str "Your name is " (count username) " letters long.")))
(println "How many years old are you? Type a number.")
(let [userage (read-line)]
(println (str "You are " userage " years old, and you will be " (+ (Integer/parseInt userage) 1) " in a year.")))

