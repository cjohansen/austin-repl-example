# Using the Austin REPL to connect to your app

This is a minimal-ish example of getting a ClojureScript REPL connected to your
live app. It's extracted from yesterday's talk at
[Oslo Socially Functional meetup](http://www.meetup.com/Oslo-Socially-Functional/events/176207202).

## Usage

* Compile ClojureScript: `lein cljsbuild auto`
* Run the REPL: `lein repl`
* From inside the REPL, run the server: `(run!)`
* From inside the REPL, enter the ClojureScript REPL: `(cljs!)`
* To quit the ClojureScript REPL, type `:cljs/quit`
* Reap the benefits of your hard word: `(js/alert "Hee haw!")`
