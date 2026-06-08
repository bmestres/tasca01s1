# Assignment S101

## Level 01

### Exercice 01 - Music instruments manager:

Program that manages music instruments. Practiced **inheritence** and **polymorphism**.
It also includes a **static blocs** and **initialization blocs** test.

### Exercice 02 - Cars manager:

Program that creates a Car class with certain particularities.
This exercice practices **static** and **final** modifiers applied to attributes and methods.

- <ins>Thoughts on *final* i *static* modifiers:</ins>

The attribute *power* is initialized from the constructor because not having a **static** modifier means that, although being constant, the attribute value belongs to the class instances.

The attributes *brand* and *power* cannot be modified throughout runtime because **final** modifier indicates that the attribute's value is constant.

The attributes *brand* and *model* extend to all the class instances because **static** modifier indicates that its value belongs to all, so every class instance points to that same value.

We can see that if two Car instances are created and the *model* value gets updated in one of them, it automatically updates the attribut to the rest.

## Level 02

### Exercice 01 - Smarphone with multiple functionalities

Program that combines **inheritance** - with a superclass Phone and a subclass Smartphone - and the **interface** implementation with Camera and Clock.


## Level 03

### Exercice 01 - News editorial manager

**Description** Program that manages an editorial of sport news. Implements a manager class *Redaccio* that has an array of *Redactors*. Each Redactor has his own news array.

There a different types of *Noticia*, each of which have its own particular attributes, along with the common ones. The program implements a series of CRUD and data visualization functionalities.

**Functionalities**: 
- **I/O:** Interactive options menu
- **Editors manager:** Methods for creation and removal of editors.
- **Mews manager:** Methods for creation of news.
- **Data treatment:** Compute of price and score of news according the type and attributes.
- ** Visualizing data:** Method to display all news of a given editor.

**Technologies**:
**Backend** Java

**Instal·lació i Execució**
**Instalation and Execution**

1. Clone repository: https://github.com/bmestres/tasca01s1.git
2. Executable paths:

**Level 1**
- <ins>exercici01</ins>: src/main/java/nivell01/exercici01/Main.java
- <ins>exercici02</ins>: src/main/java/nivell01/exercici02/Main.java

**Level 2**
- <ins>exercici01</ins>: src/main/java/nivell02/exercici01/Main.java

**Level 3**
- <ins>exercici01</ins>: src/main/java/nivell03/exercici01/Main.java








