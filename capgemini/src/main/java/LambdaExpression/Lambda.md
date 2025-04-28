# Lambda Expression
Lambda Expression -> a short, anonymous way to represent a function (usually where a functional interface is expected).

Introduced in Java 8 (2014).

works with only functional interface.

It allows passing behavior (functions) as data.

Major reason for functional programming support in Java.

**Syntax** `(parameters) -> { body }`

* **Simple Lambda — No parameters:**
 `() -> System.out.println("Hello World")`


* **Lambda with One Parameter:**
`name -> System.out.println("Hello, " + name)`.

     (no parentheses needed for a single parameter)



* **Lambda with Multiple Parameters:**

      (a, b) -> a + b
* **Lambda with Type Declaration (Optional):**

        (int a, int b) -> a + b

* **Multi-line Body (Needs {} and return):**

        (int a, int b) -> {
        int sum = a + b;
        return sum;

since it is an expression it is mandatory to use semicolon at the end of the expression.

examples:- LambdaExpression/LambdaExample.java