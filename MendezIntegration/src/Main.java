// Roger Mendez
// This is a program integrating skills that I have learned in an Introduction to Programming class.

public class Main {

	// this is a header
	// public is an access modifier
	// void is the return type, meaning this method doesn't return anything
	// method names should be in lowerCamelCase and be named with a verb
	public static void main(String[] args) {

		System.out.println("Welcome to my Integration Project!");
		System.out.println("I am Roger Mendez and I am a junior at Florida Gulf Coast University, "
				+ "majoring in Computer Information Systems.");
		System.out.println("I am a basketball fanatic and spend a majority of " + "my time playing NBA 2K19.");
		System.out
				.println("Check out what I have learned so far through Hackerrank exercises and " + "video tutorials.");

		// 1. Byte = 8-bit and has min. value of -128 and max. value of 127
		// 2. Short = 16-bit with min. value of -32,768 and max value of 32,767
		// 3. int = 32-bit with min. value of -231 and max. value of 231-1 and use
		// integer class to
		// use int data type as unsigned integer
		// 4. Long = 64-bit with min value of -263 and max. value of 263^-1, use this
		// when you need range of values wider than those provided by int
		// 5. Float = Single precision 32-bit IEEE 754 floating point; General choice
		// for decimal values and never use for precise values, ex. Currency
		// 6. Double = Double precision 64-bit IEEE 754 floating point
		// 7. Boolean = True or false are only possible values
		// 8. Char = Single 16-bit Unicode character with min value of 0 and max of
		// 65,535

		int computer = 250;
		{
			System.out.println("The value of a computer is: " + computer);
		}
		boolean basketball = true;
		{
			if (basketball) {
				// code that only happens when condition is true
				System.out.println("I love basketball.");
			} else {
				// code that only happens when condition is false
				System.out.println("I dont like basketball.");
			}

			double pizza = 10;
			double candy = new Double(pizza);

			System.out.println(pizza);
			double candyTwo = new Double("20");
			System.out.println(candyTwo);

			// final is a non access modifier applicable only to a variable, a method or a
			// class
			final int i;
			i = 2019;
			System.out.println("It is the year " + i + ".");

			byte byteValue = 20;
			short shortValue = 55;
			int intValue = 888;
			long lonValue = 23355;

			float floatValue = 8834.8f;
			double doubleValue = 32.4;

			System.out.println(Byte.MAX_VALUE);

			System.out.println(intValue);

			doubleValue = intValue;
			System.out.println(doubleValue);

			intValue = (int) floatValue;
			System.out.println(intValue);

			// following wont work as we expect it to
			// 128 is too big for a byte.
			byteValue = (byte) 128;
			System.out.println(byteValue);
			
			int blueTickets, redTickets, Tickets;
			blueTickets = 30;
			redTickets = 20;
			Tickets = blueTickets + redTickets;
			System.out.println(Tickets);

			int dogs, cats, animals;
			dogs = 5;
			cats = 3;
			animals = dogs + cats;
			System.out.println(animals);
			
			int chicken = 10;
			
		}

		Card myCard = new Card();
		myCard.setSuite("Clubs");
		System.out.println(myCard.getSuite());
		myCard.draw();
		System.out.println(myCard.getSuite());

		// A variable is a location in memory. It's like a box that you can put values
		// in to.
		// Scope is the visibility of variables & the parts of program that can be seen
		// and used.

		// Welcome to Java - First Hackerrank exercise.
		System.out.println("Hello, World");
		System.out.println("Hello, Java.");

		int int1 = 2;
		double double1 = 2.0;
		String string1 = "2";

		// Declare and initialize second integer, double, and String variables.
		int int2 = 2;
		double double2 = 2.0;
		String string2 = "2";

		// Print the sum of both integer variables on a new line.
		System.out.println("The result of + with ints is " + (int1 + int2));
		// Print the sum of the double variables on a new line.
		System.out.println("The result of + with doubles is " + (double1 + double2));
		// Concatenate and print the String variables on a new line.
		System.out.println("The result of + with Strings is " + (string1 + string2));
		// when going from numbers to strings, clear buffer
		// ctrl + shift + f for formatter on windows
		// Use command + shift + f for formatter on mac

		int grade = 90;
		// ? is the ternary operator
		// variable x = (expression) ? value if true: value if false

		char finalLetter = (grade >= 90) ? 'A' : 'B';

		if (grade >= 90) {
			finalLetter = 'A';
		} else if (grade >= 80) {
			finalLetter = 'B';
		} else if (grade >= 70) {
			finalLetter = 'C';
		} else if (grade >= 60) {
			finalLetter = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);

		int num3 = 1;
		int num4 = 2;
		if ((num3 == 1) && (num4 == 2))
			System.out.println("num3 is 1 AND num4 is 2");
		if ((num3 == 1) || (num4 == 1))
			System.out.println("num3 is 1 OR num4 is 1");

		// %d decimal number
		// %n line break
		// %s a string
		System.out.format("%s jumped %n over the %s, %d time %n", "Blake Griffin", "KIA", 1);

		// absolute value
		System.out.println(Math.abs(-26.7));

		// ceiling - rounds up
		System.out.println(Math.ceil(7.4));

		// floor - rounds down
		System.out.println(Math.floor(7.8));

		// takes two #'s and gives maximum of the two
		System.out.println(Math.max(8.6, 5.2));

		// takes two #'s and gives minimum of the two
		System.out.println(Math.min(8.6, 5.2));

		// gives you first # to power of the second #
		System.out.println(Math.pow(5, 3));

		// takes one parameter and finds square root of #
		System.out.println(Math.sqrt(9));

		int myInt = 30;
		if (myInt < 10) {
			System.out.println("Yes, its true.");
		} else if (myInt > 20) {
			System.out.println("No, its false.");
		}

		int width = 4; // also height
		int lineNum = 1; // also num#s
		int spot = 1;
		



		double num1 = 5;
		double num2 = 10;
		// this is a call, in the parenthesis is an argument
		double squared = squareIt(num1, num2, "Hello");
	}

	public static double squareIt(double n2, double n1, String greeting) {
		return n1 * n1;
	}
}