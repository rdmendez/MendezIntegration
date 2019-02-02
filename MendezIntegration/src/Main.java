import java.util.Scanner;

// Roger Mendez
// Theme of Integration Project -
// A program integrating skills learned in COP 2006

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to my Integration Project!");
		System.out.println("I am Roger Mendez and I am a junior at Florida Gulf Coast University, "
				+ "majoring in Computer Information Systems.");
		System.out.println("I am a basketball fanatic and spend a majority of "
				+ "my time playing NBA 2K19 or playing basketball.");
		System.out.println("Check out what I have learned so far through Hackerrank exercises and " 
				+ "video tutorials.");

		// 1. Byte = 8-bit and has min. value of -128 and max. value of 127
		// 2. Short = 16-bit with min. value of -32,768 and max value of 32,767
		// 3. Int = 32-bit with min. value of -231 and max. value of 231^-1 and use
		// integer class to use int data type as unsigned integer
		// 4. Long = 64-bit with min value of -263 and max. value of 263^-1, use this
		// when you need range of values wider than those provided by int
		// 5. Float = Single precision 32-bit IEEE 754 floating point; General choice
		// for decimal values and never use for precise values, ex. Currency
		// 6. Double = Double precision 64-bit IEEE 754 floating point
		// 7. Boolean = True or false are only possible values
		// 8. Char = Single 16-bit Unicode character with min value of 0 and max of
		// 65,535

		// Welcome to Java - First Hackerrank exercise.
		System.out.println("Hello, World");
		System.out.println("Hello, Java.");

		/* Java Output Variable - Second Hackerrank exercise. */
		Scanner scan = new Scanner(System.in);

		// Outside of HackerRank, this program would need a prompt so the user
		// would know what to do, like this...
		// System.out.println("Enter a greeting: ");

		// Read a full line of input and save it to our variable, greeting.
		String greeting = scan.nextLine();

		// Close the scanner object, because we've finished reading
		// all of the input needed for this challenge.
		scan.close();

		// Complete this line of code to output the value in the variable greeting
		System.out.println(greeting);

		int int1 = 2;
		double double1 = 2.0;
		String string1 = "2";

		/* Declare and initialize second integer, double, and String variables. */
		int int2 = 2;
		double double2 = 2.0;
		String string2 = "2";

		/* Print the sum of both integer variables on a new line. */
		System.out.println("The result of + with ints is " + (int1 + int2));
		/* Print the sum of the double variables on a new line. */
		System.out.println("The result of + with doubles is " + (double1 + double2));
		/* Concatenate and print the String variables on a new line. */
		System.out.println("The result of + with Strings is " + (string1 + string2));
		// when going from numbers to strings, clear buffer
		// ctrl + shift + f for formatter on windows
		// Use command + shift + f for formatter on mac
	}
}
