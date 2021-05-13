(ns fibonacci-index.core
    (:gen-class))

(defn fib [^long n]
  (loop [curr (BigInteger/valueOf 0)
         next (BigInteger/valueOf 1)
         index 0
         n n]
    (if(< (count (str curr)) n)
      (recur next (.add curr next) (inc index) n)
      index)))

(defn -main [& args]
  ;Q: Find out the index of the first term in the Fibonacci sequence to contain 1000 digits
  (println "Answer of Q: ")
  (println (fib 1000)))