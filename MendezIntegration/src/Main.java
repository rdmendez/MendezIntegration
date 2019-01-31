import java.util.Scanner;

// Roger Mendez
// Theme of Integration Project -
// A program integrating skills learned in COP 2006

public class Main {

  public static void main(String[] args) {

    System.out.println("Welcome to my Integration Project!");
    System.out.println("I am Roger Mendez and I am a junior at Florida Gulf Coast University.");   
    System.out.println("I am a basketball fanatic and spend a majority of "
        + "my time playing NBA 2K19 or playing basketball.");
    System.out.println("Check out what I have learned so far.");

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
    //ctrl + shift + f for formatter on windows
    //Use command + shift + f for formatter on mac
  }
}
