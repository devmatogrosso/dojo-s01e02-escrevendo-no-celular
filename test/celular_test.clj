(ns celular-test
  (:use clojure.test celular))

(deftest single-letter
  (testing "A single number is converted to a letter"
    (is (= (converte-celular "A") "2")))

  (testing "A single number is converted to a letter"
    (is (= (converte-caractere-number \A) "2"))
    (is (= (converte-caractere-number \B) "22"))
    (is (= (converte-caractere-number \D) "3"))
    (is (= (converte-caractere-number \space) "0"))
    (is (= (converte-caractere-number \Z) "9999"))
    (is (= (converte-caractere-number \C) "222"))))

(deftest single-word
  (testing "A single word is converted to numbers"
    (is (= (converte-celular "ADG") "234")))

  (testing "A single spaced word is converted to numbers (OMG)"
    (is (= (converte-celular "ADG A") "23402")))

  (testing "A single paused word is converted to numbers"
    (is (= (converte-celular "AAA") "2_2_2"))))

(deftest primeiro-teste
  (testing "should return '77773367_7773302_222337777_777766606660366656667889999_9999555337777' when pass 'SEMPRE ACESSO O DOJOPUZZLES'"
    (is (= (converte-celular "SEMPRE ACESSO O DOJOPUZZLES") "77773367_7773302_222337777_777766606660366656667889999_9999555337777"))))
