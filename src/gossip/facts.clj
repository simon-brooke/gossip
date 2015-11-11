(ns gossip.facts
  (:require
   gossip.actors
   gossip.locations))

(def f1 {:what :married :actor derek :acted-on clare :where drungans :when 2005})
(def f2 {:what :birthed :actor clare :acted-on ann :where farhills :when 2004})
(def f3 {:what :sold :actor brian :acted-on derek :item :sheep :quantity 5 :where eastkirk :when 2013})
(def f4 {:what :live-at :actor brian :where eastkirk })
(def f5 {:what :fucked :actor brian :acted-on clare :where balcary :when 2013})
(def f10 {:what :killed :actor derek :acted-on brian :where auchencairn :why f5 :when 2014})
