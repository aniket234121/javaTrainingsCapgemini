# Method Reference

Method Reference provides a shortcut for invoking a function or method. 

It allows you to call a function or method by using its name instead of writing a lambda expression. Method Reference is particularly useful when working with functional interfaces.

* **Can i use Method reference without functional interface??**

No, you cannot use a method reference without a functional interface.

**Types of Method Reference**
1. Static Method Reference
2. Non Static method Reference
3. Constructor Reference
4. Arbitary Object Method Reference.

## Static Method Reference
Refer to Static Method of a particular class.
* syntax :-
`ClassName :: MethodName`.



##  Constructor Reference
Constructor Introduced in Java 8, constructor references are specialized form of method references which refer to the constructors of a class. Constructor References can be created using the Class Name and the keyword new with the following 
syntax.
* Syntax of Constructor References:
 `<ClassName>::new`.

Constructor Reference Example: If you want reference to the constructor of wrapper class Integer.

then you can write something like this -
* `Supplier<Integer> integerSupplier = Integer::new`