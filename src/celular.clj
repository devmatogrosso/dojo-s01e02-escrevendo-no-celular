(ns celular)

(comment
  ABC -> 2
  DEF -> 3
  GHI -> 4
  JKL -> 5
  MNO -> 6
  PQRS -> 7
  TUV -> 8
  WXYZ -> 9
  Espaço -> 0
  )



(def mappings
  {\2 [\A \B \C]
   \3 [\D \E \F]
   \4 [\G \H \I]
   \5 [\J \K \L]
   \6 [\M \N \O]
   \7 [\P \Q \R \S]
   \8 [\T \U \V]
   \9 [\W \X \Y \Z]
   \0 [\space]
   })



(defn converte-caractere-number [caracter]
  (->> mappings
    (filter (fn [[_ vals]]
            (pos? (inc (.indexOf vals caracter)))))
    (map (fn [[k vals]]
            (repeat (+ (.indexOf vals caracter) 1) (str k))))
    (first)
    (apply str)))

(defn mesmo-grupo? [candidato atual]
  (let [vals (mappings candidato)]
    (pos? (inc (.indexOf vals atual)))))

(defn converte-celular [texto]
  (apply str
    (reduce (fn [acc atual]
              (cond
                (empty? acc)  (converte-caractere-number atual)
                (mesmo-grupo? (last acc) atual) (apply str acc "_" (converte-caractere-number atual))
                :else         (apply str acc (converte-caractere-number atual))))
            ""
            texto)))