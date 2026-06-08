# Tasca S101

## Nivell 01

### Exercici 01 - Gestió d'instruments musicals:
Programa que gestiona instruments musicals. Es treballen **herència** i **polimorfisme**. 
A més, inclou un test de **blocs estàtics** i **blocs d'inicialització**.

### Exercici 02 - Gestió de vehicles:
Programa on es crea una classe Cotxe amb unes particularitats concretes.
Aquest exercici treballa els modificadors **static** i **final** aplicats a atributs i mètodes.

- <ins>Reflexions sobre els modificadors *final* i *static*:</ins>

L'atribut *power* s'inicialitza des del constructor perquè, el fet que no hi hagi el modificador **static**, vol dir que el valor de l'atribut, tot i ser constant, pertany a la instància.

Els atributs *brand* i *power* no es poden modificar mai perquè el modificador **final** indica que el valor de l'atribut és constant. 

Els atributs *brand* i *model* afecten a totes les instàncies de la classe perquè el modificador **static** indica que el valor és únic i cada una de les instàncies de la classe apunta a aquell mateix valor.

Podem observar que si es creen dues instàncies de Car i s'actualitza el valor de *model*, aquest canvia a totes les instàncies de la classe.


## Nivell 02

### Exercici 01 - Smartphone amb múltiples funcionalitats
Programa que combina l'herència de classes - amb una superclasse Phone i una subclasse Smartphone - i la implementació d'interfícies amb Camera y Clock.



## Nivell 03

### Exercici 01 - Redacció de notícies esportives
**Descripció**: Sistema per a gestionar una redacció de notícies esportives. Implementa una classe manager *Redacció* que conté una col·lecció de *Redactors* on cadascun conté un conjunt de notícies.
Hi ha diferents tipus de *Notícia*, cadascun amb uns atributs particulars, a banda dels comuns de la propia classe mare. El programa implementa un seguit de funcionalitats CRUD i de visualització d'informació.

**Funcionalitats**: 
- **I/O:** Menú d'opcions interactiu per l'usuari
- **Gestió de redactors:** Mètodes d'introducció i el·liminació de redactors.
- **Gestió de notícies:** Mètodes d'introducció i el·liminació de notícies
- **Tractament de dades:** Càlcul de preu i puntuació de notícies segons el tipus i característiques.
- **Visualització de dades:** Mètode per mostrar totes notícies d'un redactor concret.

**Tecnologíes**:
**Backend** Java

**Instal·lació i Execució**

1. Clonar el repositori: https://github.com/bmestres/sprint01.git
2. Rutes d'executables:

**Nivell 1**
- <ins>exercici01</ins>: src/main/java/nivell01/exercici01/Main.java
- <ins>exercici02</ins>: src/main/java/nivell01/exercici02/Main.java

**Nivell 2**
- <ins>exercici01</ins>: src/main/java/nivell02/exercici01/Main.java

**Nivell 3**
- <ins>exercici01</ins>: src/main/java/nivell03/exercici01/Main.java








