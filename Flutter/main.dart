import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  MyApp({super.key});

  // 1. PROGRAMMING FUNDAMENTALS

  // VARIABLES: You can store different types of info into variables
  String name = "Sebastian";
  int age = 21;
  double pi = 3.14159;
  bool isBeginner = true;

  /*
    BASIC MATH OPERATORS
    4 + 4 = 8, add
    5 - 3 = 2, subtract
    2 * 3 = 6, multiply
    9 / 3 = 3, divide
    9 % 4 = 1, remainder
  */

  /*
    COMPARISON OPERATORS
    5 == 5 -> true,   EQUAL TO
    2 != 3 -> true,   NOT EQUAL TO
    3 > 2  -> true,   GREATER THAN
    3 < 2  -> false,  LESS THAN
    5 >= 5 -> true,   GREATER OR EQUAL TO
    3 <= 7 -> true,   LESS OR EQUAL TO 
  */

  /*
    LOGICAL OPERATORS

    AND operator, returns true if both sides are true
    isBeginner && ( age < 18 ) -> returns false

    OR operator, returns true if at least one side is true
    isBeginner || ( age < 18 ) -> returns true

    NOT operator, returns the opposite value
    !isBeginner -> returns false
  */

  /*
    CONTROL FLOW

    if (condition) {
      do something
    }

    if (condition) {
      do something
    } else if (another condition) {
      do something else
    } else {
      do something else
    }

    if (condition) {
      do something
    } else {
      do something else
    }
  */

  /*
    SWITCH STATEMENT

    Instead of using repetitve if statements, for e.g. a grading system, we can use switch statement.

    switch (expression) {
      case value:
        
        break;
      default:
    }
  */

  /*
    LOOPS

    for loops: image you have a box of 10 different colored crayons and you want to draw a circle with each one. 

               Instead of saying, 
               "Draw a circle with the 1st crayon, then draw a circle with the 2nd crayon, etc...".

               It's much easier to say,
               "For each crayon in the box, draw a circle".

               for (initialization; condition; iteration) {

               }

  */

  @override
  Widget build(BuildContext context) {
    /*
      EXAMPLES OF CONTROL FLOW
      ------------------------------------------------------------------------

      if (age >= 18) {
        print("You are an adult.");
      } else {
        print("You are not an adult.");
      }

      if (age < 13) {
        print("You can only watch G rated movies.");
      } else if (age < 18) {
        print("You can only watch G and PG13 rated movies.");
      } else {
        print("You can watch G, PG13 and R rated movies.");
      }
    */

    /*
      EXAMPLE OF SWITCH STATEMENT
      ------------------------------------------------------------------------

      String grade = "B";

      Typical if statement
      ----------------------------------
      if (grade == "A") {
        print("Excellent!");
      } else if (grade == "B") {
        print("Good!");
      } else if (grade == "C") {
        print("Fair!");
      } else if (grade == "D") {
        print("Needs Improvement!");
      } else {
        print("Invalid Grade");
      }

      Switch statement
      ----------------------------------
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
    */

    for (int i = 0; i <= 5; i++) {
      print(i);
    }

    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(),
    );
  }
}
