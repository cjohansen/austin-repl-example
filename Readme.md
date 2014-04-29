# Using the Austin REPL to connect to your app

This is a minimal-ish example of getting an
[Austin](https://github.com/cemerick/austin) ClojureScript REPL connected to
your live app. It's extracted from yesterday's talk at
[Oslo Socially Functional meetup](http://www.meetup.com/Oslo-Socially-Functional/events/176207202).

## Usage

* Compile ClojureScript: `lein cljsbuild auto`
* Run the REPL: `lein repl`
* From inside the REPL, run the server: `(run!)`
* From inside the REPL, enter the ClojureScript REPL: `(cljs!)`
* To quit the ClojureScript REPL, type `:cljs/quit`
* Reap the benefits of your hard word: `(js/alert "Hee haw!")`

## Emacs

In my talk I ran the REPL inside Emacs with
[Cider](https://github.com/clojure-emacs/cider). A command-line REPL is nice,
but running the REPL inside your editor gives you crazy awesome abilities to
evaluate single lines of code, loading code and switching namespace with simple
key-bindings and more.

To try it out, install Cider (assuming a fairly recent Emacs):

```
M-x package-install [RET] cider [RET]
```

Then start cider (assuming your `lein repl` process is still running):

```
M-x cider RET RET 54478 RET
```

Replace the port number with the one reported by the `lein repl` process.

Alternatively, to start a separate REPL process from within emacs:

```
M-x cider-jack-in ;; C-c M-j
M-x cider-switch-to-repl-buffer ;; C-c C-z
```

Now, to load the contents of a Clojure(Script) file into the REPL process:

```
M-x cider-load-current-buffer ;; C-c C-k
```

To evaluate the namespace form:

```
M-x cider-repl-set-ns C-c M-n
```
