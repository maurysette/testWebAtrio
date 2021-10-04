# testWebAtrio
## Partie théorique : XPATH
### Retourner tous les éléments book
//* 

### Retourner tous les éléments title ayant comme parent un élément book avec un attribut type égal à roman
//book/title[@roman]

### Retourner le nombre d'éléments book ayant un attribut type égal à bd
count(//book[@bd])

### Que renvoie la requête XPath suivante :  /library/library/ancestor-or-self::library
<book>
		<title>toto1</title>
		<author>titi</author>
	</book>
	<book type="doc">
		<title>toto2</title>
		<author>titi</author>
	</book>
	<book type="roman">
		<title>toto3</title>
		<author>titi</author>
	</book>
	<book type="bd">
		<title>toto4</title>
		<author>titi2</author>
	</book>
