# Dojo DevMT S01E02 

## Data e Local
Data: 04/07/2015  
Local: Nuvem Tecnologia  

## Problema
Um dos serviços mais utilizados pelos usuários de aparelhos celulares são os SMS (Short Message Service), que permite o envio de mensagens curtas (até 255 caracteres em redes GSM e 160 caracteres em redes CDMA).

Para digitar uma mensagem em um aparelho que não possui um teclado QWERTY embutido é necessário fazer algumas combinações das 10 teclas numéricas do aparelho para conseguir digitar. Cada número é associado a um conjunto de letras como a seguir:

	Letras  ->  Número
	ABC    ->  2 
	DEF    ->  3 
	GHI    ->  4 
	JKL    ->  5 
	MNO    ->  6 
	PQRS    ->  7 
	TUV    ->  8 
	WXYZ   ->  9 
	Espaço -> 0 

Desenvolva um programa que, dada uma mensagem de texto limitada a 255 caracteres, retorne a seqüência de números que precisa ser digitada. Uma pausa, para ser possível obter duas letras referenciadas pelo mesmo número, deve ser indicada como _.

Por exemplo, para digitar "SEMPRE ACESSO O DOJOPUZZLES", você precisa digitar:

	77773367_7773302_222337777_777766606660366656667889999_9999555337777

[Link do problema](http://dojopuzzles.com/problemas/exibe/escrevendo-no-celular/)

### Retrospectiva
--------
#### O que teve de bom ?

* Ambiente Configurado
* Cookie é bom, cookie é bom demais
* Clojure é daora, exceto pelos parênteses
* Clojure é uma linguagem funcional
* Terminamos o problema.
* TDD funcionou bem
* Usamos o [DojoHelper](https://github.com/castrolol/DojoHelper) e foi MUITO bom

#### O que teve de ruim ?

* Fez frio e alguns ficaram com preguiça de vir
* Clojure é do mal
* Muitas conversas paralelas
* Sobrou muito refrigerante

#### O que podemos fazer no próximo ?
--------

* Chegar mais cedo ou pelo menos no horário
* Cookie é bom, cookie é bom demais [2]

#### Quem participou ?
--------
* [Gabriel Pedro](https://github.com/gpedro)
* [Alvaro Viebrantz](https://github.com/alvarowolfx)
* [Dhyego Fernando](https://github.com/dhyegofernando) :alo: 
* [Luan Castro](https://github.com/castrolol)
* [Mahmoud Ali](https://github.com/akamud) :hi5: 
* [Édipo Juan](https://github.com/edipojs)
* Glayson
* Eduardo Borges
* [Victor Hugo](https://github.com/victorhsn)
* Erick Leandro
* [Wesley Teixeira](https://github.com/wesleyteixeira) 

### Alguns pré-requisitos

Para este projeto foi Clojure 1.6.0, Leiningen e desenvolvido utilizando o Intellij com plugin Clojure.

### Como rodar

```shell
lein test
```
ou

```shell
lein test-refresh
``` 

### Style Guide

O projeto vai seguir o style guide de clojure [disponível aqui](https://github.com/bbatsov/clojure-style-guide).


## Dojo in Fork

* Lua: [castrolol/dojo-s01e02-escrevendo-no-celular-em-lua](https://github.com/castrolol/dojo-s01e02-escrevendo-no-celular-em-lua)
* Python: [leogregianin/dojo-s01e02-escrevendo-no-celular-em-python](https://github.com/leogregianin/dojo-s01e02-escrevendo-no-celular-em-python)
* Scala: [alvarowolfx/dojo-s01e02-escrevendo-no-celular.scala](https://github.com/alvarowolfx/dojo-s01e02-escrevendo-no-celular.scala)
* PHP: [gpedro/dojo-s01e02-escrevendo-no-celular.php](https://github.com/gpedro/dojo-s01e02-escrevendo-no-celular.php)
