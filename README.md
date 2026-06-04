# Sprint 01

## Nivell 01 - Instruments musicals

### Exercici 01:
Programa que gestiona instruments musicals. Es treballen **herència** i **polimorfisme**. 
A més, inclou un test de **blocs estàtics** i **blocs d'inicialització**.

### Exercici 02:
Programa on es crea una classe Cotxe amb unes particularitats concretes.
Aquest exercici treballa els modificadors **static** i **final** aplicats a atributs i mètodes.

- <ins>Reflexions sobre els modificadors *final* i *static*:</ins>

L'atribut *power* s'inicialitza des del constructor perquè, el fet que no hi hagi el modificador **static**, vol dir que el valor de l'atribut, tot i ser constant, pertany a la instància.

Els atributs *brand* i *power* no es poden modificar mai perquè el modificador **final** indica que el valor de l'atribut és constant. 

Els atributs *brand* i *model* afecten a totes les instàncies de la classe perquè el modificador **static** indica que el valor és únic i cada una de les instàncies de la classe apunta a aquell mateix valor.

Podem observar que si es creen dues instàncies de Car i s'actualitza el valor de *model*, aquest canvia a totes les instàncies de la classe.



