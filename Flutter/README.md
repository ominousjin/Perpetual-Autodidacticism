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
      
- SWITCH STATEMENT
  
  Instead of using repetitive if statements, for e.g. a grading system, a switch statement can be used as better alternative. 
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

- LOOPS
    - FOR loops:
      
      Imagine you have a box of 10 different colored crayons and you want to draw a circle with each one. Instead of saying, "Draw a circle with the 1st          crayon, then draw a circle with the 2nd crayon, etc...". It's much easier to say, "For each crayon in the box, draw a circle".
      ```
        // structure
        for (initialization; condition; iteration) {
          statement to be executed;
        }

        // example 1
        for (int i = 0; i <= 5; i++) {
          print(i);
        }

        // example 2
        for (int i = 0; i <= 8; i++) {
          if (i == 6) { // checking condition that breaks the loop when i = 6
            break;
          }
          print(i);
        }

        // example 3
        for (int i = 0; i <= 8; i++) {
          if (i == 6) { // 'continue' skips the current iteration i.e. printing 6
            continue;
          }
          print(i);
        }

        break -> break out of loop
        continue -> skip the current iteration
      ```
      
    - WHILE loops:

      In a for loop, you have to specify the number of times to loop. If you don't know how many times to loop, you can use a while loop to keep looping until a certain condition is met.
      ```
      // structure
      while ( condition ) {
        statement to be executed;
        something here should modify the condition above;
      }

      // example
      int countDown = 5;

      while (countDown > 0) {
        print(countDown);
        countDown--;
      }
      ```
      
- FUNCTIONS / METHODS
  
  We can write codeblocks to get certain things done. Apparently, we can organize these blocks of code into functions so that we can reuse them easily.

  'void' means that the function returns nothing. They just execute the code in the function.

  ```
  // basic greet function
  void greet() {
    print("Hello!");
  }

  // function with parameters
  void greetUser(String name) {
    print("Hello " + name);
  }

  // function with return type
  int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  @override
  Widget build(BuildContext context) {

    greet();
    greetUser("Alex");
    int mySum = add(3, 5);
    print(mySum);

    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(),
    );
  }
  ```

- DATA STRUCTURES
    - LIST: Ordered collection of elements, can have duplicates.
      ```
        List numbers = [1, 2, 3];

        // numbers[0] -> 1
        // numbers[1] -> 2
        // numbers[2] -> 3

        void printNumbers() {
          for (int i = 0; i < numbers.length; i++) {
            print(numbers[i]);
          }
        }

        // We can also define particular datatypes for LIST. For e.g.
        List<int> numbers = [1, 2, 3];
        List<String> names = ["Alex", "Johan", "Tenma"];

        // names[0] -> Alex
        // names[1] -> Johan
        // names[3] -> Tenma
              
        void printNames() {
          for (int i = 0; i < names.length; i++) {
            print(names[i]);
          }
        }
      ```
    - SET - Unordered collection of unique elements
      ```
        Set<String> uniqueNames = {"Dazai", "Ango", "Odasaku"};
      
        // for printing the set
        print(uniqueNames);
      ```
    - MAP: stored as key-value pairs
      ```
        Map user = {
          'name': "Alex",
          'age': 27,
          'height': 175,
        };
      
        // user['name'] -> Alex
        // user['age'] -> 27
        // user['height'] -> 175
      ```

### Everything is a Widget in Flutter

- DEBUG BANNER
  
  This banner is intended to deter people from complaining that your app is slow when it's in debug mode. In debug mode, Flutter enables a large number of expensive diagnostics to aid in development, and so performance in debug mode is not representative of what will happen in release mode.

  ```
    debugShowCheckedModeBanner: false
  ```
  
- SCAFFOLD

  Implements the basic Material Design visual layout structure.

  ```
    home: Scaffold(
        backgroundColor: Colors.deepPurple[200],
        // contains other properties as well 
    )
  ```
  
- CONTAINER

  While, scaffolding will alter the appearance and feel of Material on screen. A basic/common widget in Flutter called a container will hold other widgets.

  ```
    body: Center(
        child: Container(
        height: 300,
        width: 300,

        // color cannot be used outside of 'decoration'
        // color: Colors.deepPurple,

        // for decorations
        decoration: BoxDecoration(
            color: Colors.deepPurple,
            // for further decorations, we can curver the corners a bit
            borderRadius: BorderRadius.circular(20),
        ),

        padding: EdgeInsets.all(25),
        // padding: EdgeInsets.symmetric(horizontal: 25, vertical: 50),
        // padding: EdgeInsets.only(left: 105, top: 70),

        child: Text("Osamu Dazai"), // child widget inside container
    )
  ```
  
- TEXT

  The Text widget displays a string of text with single style. The string might break across multiple lines or might all be displayed on the same line depending on the layout constraints.

  ```
    child: Text(
        "Osamu Dazai",
        style: TextStyle(
            color: Colors.white,
            fontSize: 28,
            fontWeight: FontWeight.bold,
    )), // child widget inside container
  ```
  
- What it looks like up until now?

  ```
  // ignore_for_file: prefer_const_constructors

  import 'package:flutter/material.dart';
  
  void main() {
    runApp(MyApp());
  }
  
  class MyApp extends StatelessWidget {
    const MyApp({super.key});
  
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        debugShowCheckedModeBanner: false,
        home: Scaffold(
          backgroundColor: Colors.deepPurple[200],
          body: Center(
            child: Container(
              height: 300,
              width: 300,
  
              // color cannot be used outside of 'decoration'
              // color: Colors.deepPurple,
  
              // for decorations
              decoration: BoxDecoration(
                color: Colors.deepPurple,
                // for further decorations, we can curver the corners a bit
                borderRadius: BorderRadius.circular(20),
              ),
  
              padding: EdgeInsets.all(25),
              // padding: EdgeInsets.symmetric(horizontal: 25, vertical: 50),
              // padding: EdgeInsets.only(left: 105, top: 70),
  
              child: Text("Osamu Dazai",
                  style: TextStyle(
                    color: Colors.white,
                    fontSize: 28,
                    fontWeight: FontWeight.w100,
                  )), // child widget inside container
            ), // Container
          ), // Center
        ), // Scaffold
      ); // MaterialApp
    }
  }
  ```
  ![image](https://github.com/akarsh0913/Perpetual-Autodidacticism/assets/134067749/a90b177e-5c11-432f-9c5e-23735dc0e046)


### Navigation (how to navigate to different screens)
### Stateless vs Stateful Widgets
### User Input
### To Do App (Saving data in phone's local storage)
### E-commerce App (Neccessary functionalities like adding items to the cart)
