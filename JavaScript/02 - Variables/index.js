// A variable is a container for storing data.
// It is a representation of a value.

/* 
	For e.g. 
				if 10 = x * 2, 
				then x = 5,
				where x is a variable and it represents the value '5'
*/

// A variable behaves as if it was the value that it contains.
// In the above example, we use 'x' in that expression as it was the value '5'.

/*
	Two steps (for creating a variable):

		1. Declaration (var, let, const)
		   |--> var, let, const are keywords 
		2. Assignment ('=' is known as assignment operator)
*/

// Creating a variable with keyword 'let' with a unique descriptive name (age)
let age; 	// Declaration

/*
	console.log(age);
	
	Output:
	'undefined' in console because age variable hasn't been assigned a value yet.
*/

age = 21; 	// Assignment

/*
	A variable can be created by using the below syntax as well.
	let age = 21;

	However, when dealing with user input, it's better to follow the two steps approach.
	(for creating variables) 
*/

// Different variables have different data types
// As of now, age is a number data type

age = age + 1;
console.log(age);



