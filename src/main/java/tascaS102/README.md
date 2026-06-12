# Assignment S102

## Level 1

### Exercice 1 - Personalized exceptions and error handling
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

### Exercice 1 - Secure keyboard read

This program implements a *ConsoleReader* class that prompts user to input a variaty of data types and returns them after making sure the format is correct.
It does that through predefined exception *InputMismatchException* and three custom exceptions *MultipleCharacterException*, *ShortStringException* and *YesNoException*.



