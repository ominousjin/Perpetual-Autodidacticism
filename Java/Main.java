import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		
		// Single-line Comment
		
		/* This
		 * is a
		 * Multi-Line Comment
		 * */
		
		// .println() adds a new line at the end of the output
		System.out.println("Hello World! Again....");
		
		// printing numbers using .println()
		System.out.println(3 + 3);
		
		// .print() doesn't add a new line at the end of the output
		System.out.print("nanimo");
		System.out.print(" nandesuka\n-------------\n\n");
		
		// VARIABLES - Containers for storing data values
		
		// 1. String - stores text
		// 2. int - stores integers (without decimals)
		// 3. float - stores floating point numbers (with decimals)
		// 4. char - stores single characters
		// 5. boolean - stores true/false values
		
		// syntax
		// type variableName = value;
		
		// String ->
		String name = "John Doe";
		System.out.println(name);
		
		// int ->
		int age = 21;
		System.out.println(age);
		
		// float ->
		float result = 5 / 3;
		System.out.println(result);
		
		// char -> Use single quotes for single character
		char myLetter = 'D';
		System.out.println(myLetter);
		
		// boolean ->
		boolean isHuman = true;
		System.out.println(isHuman);
		
		// FINAL VARIABLES
		// If you don't want anyone to overwrite the existing value of a variable,
		// you can use the final keyword
		
		final int bonus = 50;
		
		// bonus = 55;
		// will generate an error: cannot assign a value to a final variable
		
		// DECLARING MULTIPLE VARIABLES
		
		int x = 5, y = 6, z = 7;
		System.out.println(x + y + z);
		
		// ONE VALUE TO MULTIPLE VARIABLES
		
		int a, b, c; 		// Declare the variables first
		a = b = c = 10; 	// Assign the values
		System.out.println(a + b + c);
		System.out.print("-------------\n\n");
		
		// IDENTIFIERS
		// An identifier is a unique name for a variable
		
		int minutesPerHour = 60;
		
		// Example using student data
		
		String studentName = "Osamu Dazai";
		int studentID = 35356;
		int studentAge = 21;
		float studentFee = 75.25f;
		char studentGrade = 'B';
		
		System.out.println("Student Name: " + studentName);
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Age: " + studentAge);
		System.out.println("Student Fee: " + studentFee);
		System.out.println("Student Grade: " + studentGrade);
		System.out.print("-------------\n\n");
		
		// JAVA DATA TYPES
		
		// Primitive data types - byte, short, int, long, float, double, boolean and char
		// Primitive data types are the most basic types of data 
		// that are supported natively by a programming language. 
		// They typically represent single values and do not have properties or methods.
		
		// Non-primitive data types - String, Arrays and Classes
		// Non-primitive data types, also known as reference types, are more complex. 
		// They can store multiple values or objects and often have properties and methods.
		
		// +----------+---------+---------------------------------------------------------------------------------------+
		// | Type	  | Size    |	Description																			|
		// +----------+---------+---------------------------------------------------------------------------------------+
		// | byte	  | 1 byte  |	Stores whole numbers from -128 to 127											    |
		// | short	  | 2 bytes |	Stores whole numbers from -32,768 to 32,767											|
		// | int	  | 4 bytes |	Stores whole numbers from -2,147,483,648 to 2,147,483,647 							|
		// | long	  | 8 bytes | 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807	|
		// | float	  | 4 bytes |	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits				|
		// | double	  | 8 bytes |	Stores fractional numbers. Sufficient for storing 15 decimal digits					|
		// | boolean  | 1 bit   |	Stores true or false values															|
		// | char	  | 2 bytes |	Stores a single character/letter or ASCII values									|
		// +----------+---------+---------------------------------------------------------------------------------------+
		
		// The precision of float is only six or seven decimal digits, 
		// while double variables have a precision of about 15 digits. 
		// Therefore it is safer to use double for most calculations.
		
		byte num1 = 123;
		short num2 = 30000;
		int num3 = 1000000;
		long num4 = 1500000000L; // always end the long value with a 'L'
		float num5 = 5.75f;		 // always end the float value with a 'f'
		double num6 = 19.99d; 	 // always end the double value with a 'd'
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		// SCIENTIFIC NUMBERS
		// "e" indicates power of 10
		float f1 = 35e3f;
		double d1 = 12E4d;
		
		System.out.println(f1);
		System.out.println(d1);
		System.out.print("-------------\n\n");
		
		// TYPE CASTING
		// 1. Widening Casting --> Smaller data type to larger data type
		// 2. Narrowing Casting --> Larger data type to smaller data type
		
		// Widening Casting
		int myInt1 = 6;
		double myDouble1 = myInt1;
		System.out.println(myDouble1);
		
		// Narrowing Casting
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2;
		System.out.println(myInt2);
		System.out.print("-------------\n\n");
		
		// Calculate the percentage of a user's score in relation to the maximum score in a game
		int maxScore = 500;
		int userScore = 432;
		
		float percentageScore = (float) userScore/maxScore * 100.0f;
		System.out.println(percentageScore);
		System.out.print("-------------\n\n");
		
		// ARITHMETIC OPERATORS
		
		// +----------+---------------+----------------------------------------+---------+
		// | Operator | Name          | Description                            | Example |
		// +----------+---------------+----------------------------------------+---------+
		// | +        | Addition      | Adds together two values               | x + y   |
		// | -        | Subtraction   | Subtracts one value from another       | x - y   |
		// | *        | Multiplication| Multiplies two values                  | x * y   |
		// | /        | Division      | Divides one value by another           | x / y   |
		// | %        | Modulus       | Returns the division remainder         | x % y   |
		// | ++       | Increment     | Increases the value of a variable by 1 | ++x     |
		// | --       | Decrement     | Decreases the value of a variable by 1 | --x     |
		// +----------+---------------+----------------------------------------+---------+
		
		// ASSIGNMENT OPERATORS
		
		// +----------+----------+---------------+
		// | Operator | Example  | Same As       |
		// +----------+----------+---------------+
		// | =        | x = 5    | x = 5         |
		// | +=       | x += 3   | x = x + 3     |
		// | -=       | x -= 3   | x = x - 3     |
		// | *=       | x *= 3   | x = x * 3     |
		// | /=       | x /= 3   | x = x / 3     |
		// | %=       | x %= 3   | x = x % 3     |
		// | &=       | x &= 3   | x = x & 3     |
		// | |=       | x |= 3   | x = x | 3     |
		// | ^=       | x ^= 3   | x = x ^ 3     |
		// | >>=      | x >>= 3  | x = x >> 3    |
		// | <<=      | x <<= 3  | x = x << 3    |
		// +----------+----------+---------------+
		
		int testX = 5;
		testX &= 3;
		System.out.println(testX); // BITWISE AND
		System.out.print("-------------\n\n");
		
		// COMPARISON OPERATORS
		
		// +----------+----------------------------------+---------+
		// | Operator | Description                      | Example |
		// +----------+----------------------------------+---------+
		// | ==       | Equal to                         | x == y  |
		// | !=       | Not equal                        | x != y  |
		// | >        | Greater than                     | x > y   |
		// | <        | Less than                        | x < y   |
		// | >=       | Greater than or equal to         | x >= y  |
		// | <=       | Less than or equal to            | x <= y  |
		// +----------+----------------------------------+---------+
		
		// LOGICAL OPERATORS
		
		// +----------+--------------+---------------------------------------------------------+----------------------------------+
		// | Operator | Name         | Description                                             | Example                          |
		// +----------+--------------+---------------------------------------------------------+----------------------------------+
		// | &&       | Logical and  | Returns true if both statements are true                | x < 5 && x < 10                  |
		// | ||       | Logical or   | Returns true if one of the statements is true           | x < 5 || x < 4                   |
		// | !        | Logical not  | Reverse the result; returns false if the result is true | !(x < 5 && x < 10)               |
		// +----------+--------------+---------------------------------------------------------+----------------------------------+
		
		// STRING OPERATIONS
		
		String testString = "Today is Monday.";
		System.out.println(testString.length());
		System.out.println(testString.toUpperCase());
		System.out.println(testString.toLowerCase());
		System.out.println(testString.indexOf("Monday")); // finding a character using .indexOf()
		
		// String testString2 = "How about tomorrow?";
		// System.out.println(testString + " " + testString2);
		
		String testString2 = " How about tomorrow?";
		System.out.println(testString.concat(testString2)); // string concatenation
		
		System.out.print("-------------\n\n");
		
		// Special Characters in Strings
		
		String text1 = "We are so called \"Vikings\".";
		String text2 = "It\'s alright.";
		String text3 = "This character \\ is called backslash.";
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.print("-------------\n\n");
		
		// MATH CLASS
		// Java Math class has many methods that allows you to perform mathematical tasks on numbers.
		
		System.out.println(Math.max(5, 10)); // returns max value
		System.out.println(Math.min(3, 7));	 // returns min value
		System.out.println(Math.sqrt(64));	 // returns square root of a number
		System.out.println(Math.abs(-4.7));	 // returns absolute (positive) value	
		System.out.println(Math.random());   // returns a random number between 0.0 & 1.0
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
		System.out.print("-------------\n\n");
		
		// JAVA IF, ELSE, ELSE-IF
		
		int var_1 = 20;
		int var_2 = 18;
		int var_3 = 35;
		
		if (var_1 > var_2) {
			System.out.println(var_1 + " is greater than " + var_2);
		}
		
		if (var_1 > var_3) {
			System.out.println(var_1 + " is greater than " + var_3);
		} else {
			System.out.println(var_3 + " is greater than " + var_1);
		}
		
		int time = 22;
		
		if (time < 10) {
			System.out.println("Good Morning.");
		} else if (time < 18) {
			System.out.println("Good Evening.");
		} else {
			System.out.println("Good Night.");
		}
		
		// Short-hand way for writing if-else statement
		
		// int time = 20;
		// if (time < 18) {
		//   System.out.println("Good day.");
		// } else {
		//   System.out.println("Good evening.");
		// }
		
		time = 20;
		// (condition) ? "value 1" : "value 2";
		String result_VAR = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result_VAR);
		System.out.print("-------------\n\n");
		
		// SWITCH CASE
		
		int day = 4;
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid option");
		}
		
		System.out.print("-------------\n\n");
		
		// WHILE LOOP
		
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.print("-------------\n\n");
		
		// DO-WHILE LOOP
		
		int jello = 5;
		do {
			System.out.println(jello);
			jello++;
		}
		while (jello < 10);
		
		System.out.print("-------------\n\n");
		
		// FOR LOOP
		// When you know exactly how many times you want to loop through a block of code, 
		// use the for loop instead of a while loop
		
		for (int var_i = 0; var_i < 10; var_i++) {
			System.out.println(var_i);
		}
		
		System.out.print("-------------\n\n");
		
		for (int var_j = 0; var_j < 10; var_j+=2) {
			System.out.println(var_j);
		}
		
		System.out.print("-------------\n\n");
		
		// NESTED FOR LOOP
		
		for (int var_k = 1; var_k <= 2; var_k++) {
			System.out.println("Outer: " + var_k); // Executes 2 times
			// Inner loop
			for (int var_l = 1; var_l <= 3; var_l++) {
				System.out.println(" Inner: " + var_l); // Executes 6 times (2 * 3)
			}
		}
		
		System.out.print("-------------\n\n");
		
		// FOR-EACH LOOP
		// It is used exclusively to loop through elements in an array
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String each_car : cars) {
			System.out.println(each_car);
		}
		
		System.out.print("-------------\n\n");
		
		String[] new_cars = {"Mercedes", "Toyota", "Lexus", "Audi"};
		for (int var_m = 0; var_m < new_cars.length; var_m++) {
			System.out.println(new_cars[var_m]);
		}
		
		System.out.print("-------------\n\n");
		
		// BREAK & CONTINUE
		
		// The break statement can also be used to jump out of a loop.
		
		for (int var_n = 0; var_n < 10; var_n++) {
			if (var_n == 4) {
			    break;
			}
			System.out.println(var_n);
		}
		
		System.out.print("-------------\n\n");
		
		// The continue statement breaks one iteration (in the loop), 
		// if a specified condition occurs, and continues with the next iteration in the loop.
		
		for (int var_o = 0; var_o < 10; var_o++) {
			if (var_o == 4) {
			    continue;
			}
			System.out.println(var_o);
		}
		
		System.out.print("-------------\n\n");
		
		// ARRAYS
		
		int[] numArray = {1,2,3,4,5,6,7,8,9};
		
		for (int var_index = 0; var_index < numArray.length; var_index++) {
			System.out.println("numArray[" + var_index + "]: " + numArray[var_index]);
		}
		
		System.out.print("-------------\n\n");
		
		// Multi-dimensional Array
		
		// 2 square brackets for 2D array		
		int[][] multiDimArr = { {1,2,3,4}, {5,6,7,8} };
		
		for (int var_x = 0; var_x < multiDimArr.length; ++var_x) {
			for (int var_y = 0; var_y < multiDimArr[var_x].length; ++var_y) {
				System.out.print(multiDimArr[var_x][var_y] + " ");
			}
			System.out.println();
		}
		
		System.out.print("-------------\n\n");
		
		myMethod("JIN", 3765);
		
		System.out.print("-------------\n\n");
		
		checkAge(17);
		checkAge(21);
		
		System.out.print("-------------\n\n");
		
		System.out.println(addTwoNums(5, 6));
		int totalSUM = addTwoNums(103434, 2203023);
		System.out.println(totalSUM);
		
		System.out.print("-------------\n\n");
		
		System.out.println(addNums(7,8));
		System.out.println(addNums(7,8,9));
		System.out.println(addNums(7,8,9,10));
		
		System.out.print("-------------\n\n");
		
		// RECURSION EXAMPLE
		// refer to re_SUM() method below
		
		int recursive_test_value_result = re_SUM(10);
		System.out.println(recursive_test_value_result);
		
 	}
	
	// METHODS
	// myMethod() --> method name
	// static 	  --> method belongs to Main class and is not an object of Main class
	// void		  --> means method has no return value
	
	// static void myMethod() {
	// 	System.out.println("A method was invoked!");
	// }
	
	// Adding parameters and arguments
	static void myMethod(String fname, int sysCODE) {
		LocalDate date = LocalDate.now(); // current date
		LocalTime time = LocalTime.now(); // current time
		System.out.println("A method was invoked!");
		System.out.println(fname + "#" + sysCODE + " used this function on " + date + " at " + time);
	}
	
	static void checkAge(int ageVALUE) {
		if (ageVALUE < 18) {
			System.out.println("Grow up!!!");
		} else { 
			System.out.println("Yo! You're living the high life...");
		}
	}
	
	static int addTwoNums(int a, int b) {
		return a + b;
	}
	
	// METHOD OVERLOADING
	// Method overloading occurs when multiple methods in the same class 
	// have the same name but different parameters
	
	static int addNums(int a, int b) {
		return a + b;
	}
	
	static int addNums(int a, int b, int c) {
		return a + b + c;
	}
	
	static int addNums(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	// RECURSION
	// Recursion is the technique of making a function call itself. 
	// This technique provides a way to break complicated problems down 
	// into simple problems which are easier to solve.
	
	static int re_SUM(int k) {
		if (k > 0) {
			return k + re_SUM(k-1);
		} else {
			return 0;
		}
	}
}
