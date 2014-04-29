(defproject app "0.1.0-SNAPSHOT"
  :source-paths ["src" "dev"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]
                 ;; Web server stuff
                 [ring "1.2.2"]
                 [compojure "1.1.6"]
                 [enlive "1.1.5"]]
  :profiles {:dev {:plugins [[com.cemerick/austin "0.1.4"]
                             [lein-cljsbuild "1.0.3"]]
                   :cljsbuild {:builds [{:id "app"
                                         :source-paths ["src" "dev"]
                                         :compiler {:output-to "target/classes/public/app.js"
                                                    :optimizations :whitespace}}]}}})
