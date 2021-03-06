(defproject stocks "1.0.0-SNAPSHOT"
  :description "Stocks web app"
  :author "Laura Viglioni"
  :year "2020"
  :url "https://github.com/Viglioni/stocks"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [ring/ring-devel "1.8.1"]
                 [ring/ring-defaults "0.3.2"]
                 [metosin/ring-http-response "0.9.1"]
                 [clj-time "0.15.2"]
                 [environ "1.1.0"]
                 [org.clojure/data.json "1.0.0"]
                 [ring/ring-mock "0.4.0"]
                 [ring/ring-json "0.5.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]
            [lein-ring "0.12.5"]
            [lein-shell "0.5.0"]
            [lein-exec "0.3.7"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "stocks-standalone.jar"
  :ring {:handler stocks.web/run-dev}
  :main ^:skip-aot stocks.web
  :aliases {"test:watch" ["shell" "sh" "scripts/test_dev.sh"]}
  :profiles {:uberjar {:aot :all}
             :production {:env {:production true}}})
