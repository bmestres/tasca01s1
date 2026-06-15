# Assignment S102

## Level 1

### Exercise 1 - Personalized exceptions and error handling
This program implements a *Sale* object that handles shopping lists and computes the total price. Its method *calculateTotal()*
is designed to throw an *EmptySaleException* if the current products list is empty.
This represents a business logic error, therefore it is implemented as a **checked exception** and inherits from *Exception* 
superclass instead of *RuntimeException*. The *TestEmptySell* class handles the exceptional event by printing a message to the user.

It also implements an out-of-bounds test that forces an *IndexOutOfBoundsException* provoked by deliberately wrong access. 
In this case, it's an **unchecked exception** (an error inside the program logic) and therefore the default IndexOutOfBoundsException 
is thrown automatically and safely caught within the test method.

Finally, the EmptySaleException is modified to inherit from RuntimeException. This turns it in an **unchecked exception** which means 
that it's not being checked by the compiler in runtime.

## Level 2

### Exercise 1 - Secure keyboard read

This program implements a *ConsoleReader* class that prompts user to input a variety of data types and returns them after making sure the format is correct.
It does that through predefined exception *InputMismatchException* and three custom exceptions *MultipleCharacterException*, *ShortStringException* and *YesNoException*.

## Level 3

### Exercise 1 - Movie theater reservations service

This program manages reservations for a movie theater. It offers the user a set of options that include making or canceling a reservation,
removing all reservations from a person as well as showing all reservation's info. It uses defensive code to prevent wrong format inputs
and to prevent any input that conflicts with the business logic.

**Functionalities**:
- **I/O:** Interactive option menu. Prevent out of range and wrong format inputs by the user.
- **ReservationService:** Methods for the creation and removal of one or many reservations from a user.
- **Visualizing data:** Display reservations information per user or generally.

**Technologies**:
**Backend** Java

**Installation and Execution**

1. Clone repository: https://github.com/bmestres/sprint01.git

2. Executable paths:
- <ins>Level 1</ins>: src/main/java/tascaS102/nivell01/Main.java
- <ins>Level 2</ins>: src/main/java/tascaS102/nivell02/Main.java
- <ins>Level 3</ins>: src/main/java/tascaS102/nivell03/Main.java
