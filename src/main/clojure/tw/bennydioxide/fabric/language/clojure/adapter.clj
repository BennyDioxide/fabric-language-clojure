(ns tw.bennydioxide.fabric.language.clojure.adapter
  (:import (net.fabricmc.loader.api LanguageAdapter))
  (:gen-class
    :name tw.bennydioxide.fabric.language.clojure.ClojureAdapter
    :implements [net.fabricmc.loader.api.LanguageAdapter]
    :prefix "-"))

(defn -create [mod value type]
  (.create (LanguageAdapter/getDefault) mod value type))
