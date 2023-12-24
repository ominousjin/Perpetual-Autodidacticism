# Flutter

### Programming Fundamentals

- Variables allow to store different types of information.
  ```
    String name = "Sebastian";
    int age = 21;
    double pi = 3.14159;
    bool isBeginner = true;
  ```

- BASIC MATH OPERATORS
  ```
    4 + 4 = 8, add
    5 - 3 = 2, subtract
    2 * 3 = 6, multiply
    9 / 3 = 3, divide
    9 % 4 = 1, remainder
    ++, increment by one
    --, decrement by one
  ```

- COMPARISON OPERATORS
  ```
    5 == 5 -> true,   EQUAL TO
    2 != 3 -> true,   NOT EQUAL TO
    3 > 2  -> true,   GREATER THAN
    3 < 2  -> false,  LESS THAN
    5 >= 5 -> true,   GREATER OR EQUAL TO
    3 <= 7 -> true,   LESS OR EQUAL TO 
  ```

- LOGICAL OPERATORS
    - AND operator, returns true if both sides are true
      ```
        isBeginner && ( age < 18 ) -> returns false
      ```
    - OR operator, returns true if at least one side is true
      ```
        isBeginner || ( age < 18 ) -> returns true
      ```
    - NOT operator, returns the opposite value
      ```
        !isBeginner -> returns false
      ```
- CONTROL FLOW
    - IF statement
      ```
        // structure
        if (condition) {
          do something
        }

        // example
        if (age < 18) {
          print("Grow Up!!!");
        }
      ```
    - IF ELSE-IF statement
      ```
        // structure
        if (condition) {
          do something
        } else if (another condition) {
          do something else
        } else {
          do something else
        }

        // example
        if (age < 13) {
          print("You can only watch G rated movies.");
        } else if (age < 18) {
          print("You can only watch G and PG13 rated movies.");
        } else {
          print("You can watch G, PG13 and R rated movies.");
        }
      ```
    - IF ELSE statement
      ```
        // structure
        if (condition) {
          do something
        } else {
          do something else
        }

        // example
        if (age >= 18) {
          print("You are an adult.");
        } else {
          print("You are not an adult.");
        }
      ```
      
- SWITCH STATEMENT: 
  ```
    // structure
    switch (expression) {
      case value:
        break;
      default:
    }

    // example
    switch (grade) {
      case "A":
        print("Excellent!");
        break;
      case "B":
        print("Good!");
        break;
      case "C":
        print("Fair!");
        break;
      case "D":
        print("Needs Improvement!");
        break;
      default:
        print("Invalid Grade");
    }
  ```


  /*
    LOOPS

    for loops: Imagine you have a box of 10 different colored crayons 
    and you want to draw a circle with each one. Instead of saying, 
    "Draw a circle with the 1st crayon, then draw a circle with the 
    2nd crayon, etc...". It's much easier to say, "For each crayon in 
    the box, draw a circle".

    for (initialization; condition; iteration) {
      statement to be executed;
    }

    while loops: in a for loop, you have to specify the number of times 
    to loop. If you don't know how many times to loop, you can use a while 
    loop to keep looping until a certain condition is met

    while ( condition ) {
      statement to be executed;
      something here should modify the condition above;
    }

    break -> break out of loop
    continue -> skip the current iteration

  */

Everything is a Widget (everything in flutter is a widget)
Navigation (how to navigate to different screens)
Stateless vs Stateful Widgets
User Input
To Do App (Saving data in phone's local storage)
E-commerce App (Neccessary functionalities like adding items to the cart)
