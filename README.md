# Przykład 07 - Dziedziczenie

W przykładzie przedstawiono prostą hierarchię klas. Klasą bazową jest 
klasa Animal, po której dziedziczą klasy Dog i Hippo. Klasa Dog ma 
dodatkowe pole pamiętające imię psa. Konstruktory w klasach pochodnych 
wykorzystują konstruktor klasy bazowej, żeby ustawić pole określające
spożywany pokarm.

Metoda makeNoise() w klasie Animal jest abstrakcyjna, czyli nie ma
żadnego kodu. Klasy pochodne Dog i Hippo definiują ją od początku.

Klasa Animal ma metodę eat() która może być używana przez wszystkie
klasy pochodne.

Klasa Hippo definiuje nową metodę swim() której nie ma w pozostałych
klasach.

## Zadanie

1. Dopisz klasę `Cat` dla kotków, dziedziczącą po klasie `Animal`
1. Dopisz konstruktor.
1. Przedefiniuj metodę `toString()`
1. Zaimplementuj metodę `eat()`
1. Utwórz w klasie `Main` nowego kotka i pokaż działanie zdefiniowanych 
   funkcji.
