# Quelle est la différence entre une nested class et une inner class ? 

## Explications

En Kotlin comme en Java on peut déclarer un classe a l'intérieur d'une autre.
Cela peut permettre d'encapsuler un helper ou de placer du code plus proche de la ou il est utilisé.

- Une `nested class` est une classe déclarée dans une autre classe.
- Une `inner class` en gros c'est une `nested class` qui porte une référence à sa classe englobante (outer class)

En *Java* une `nested class` est par défaut une `inner class`. La `nested class` porte implicitement une référence à la classe externe.
Cela peut parfois poser des problèmes c'est pourquoi on utilise le mot clef `static` pour creer des `nested class` "static" (donc non inner), cela a pour effet de supprimer la référence a la classe englobante.

En *Kotlin* les `nested class` n'ont pas accès au dehors de leur instance de classe sauf si on le force.
En gros en Kotlin une `nested class` est comme une "static" `nested class` java.
Pour donner accès à une référence de la classe englobante et transformer la `nested class` en `inner class` on ajoute donc le mot clef `inner` en *Kotlin*.

La syntaxe *Kotlin* pour référencer l'outerclass depuis l'innerclass est différente de *Java*, on utilise this@Outer ( en *Java* on utilise le nom de l'outerclass et on ajoute .this)

## Liens utiles 

- [Nested Classes en Java](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)
- [Nested Classes en Kotlin](https://kotlinlang.org/docs/nested-classes.html)

## Code 

Le code de ce projet montre rapidement le lien entre une inner class et son outer classe "parente".

Le parallèle est fait pour montrer la différence de syntaxe/comportement entre Java et Kotlin