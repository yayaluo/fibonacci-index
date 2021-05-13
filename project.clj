(defproject fibonacci-index "0.1.0-SNAPSHOT"
  :description "a fibonacci index project"
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :repl-options {:init-ns fibonacci-index.core}
  :main fibonacci-index.core
  :aot [fibonacci-index.core])