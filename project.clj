(defproject cine-flix "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :resource-paths ["resources"]
  :aliases {"diagnostics"   ["clojure-lsp" "diagnostics"]
            "format"        ["clojure-lsp" "format" "--dry"]
            "format-fix"    ["clojure-lsp" "format"]
            "clean-ns"      ["clojure-lsp" "clean-ns" "--dry"]
            "clean-ns-fix"  ["clojure-lsp" "clean-ns"]
            "lint"          ["do" ["diagnostics"] ["format"] ["clean-ns"]]
            "lint-fix"      ["do" ["format-fix"] ["clean-ns-fix"]]}
  :test-paths ["test/unit/"])
