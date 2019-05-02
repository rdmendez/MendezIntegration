// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */

public class Main {

  // this is a header
  // public is an access modifier
  // void is the return type, meaning this method doesn't return anything
  // method names should be in lowerCamelCase and be named with a verb
  public static void main(String[] args) {

    System.out.println("Welcome to my Integration Project!");

    // final is a non access modifier applicable only to a variable, a method or a
    // class
    final int i;
    i = 2019;
    System.out.println("It is the year " + i + ".");

    System.out.printf("My name is: %s%n", "Roger Mendez");

    System.out.println("I am a junior at Florida Gulf Coast University, "
        + "majoring in Computer Information Systems.");

    boolean basketball = true;
    {
      if (basketball) {
        // code that only happens when condition is true
        System.out.println("I also love basketball.");
      } else {
        // code that only happens when condition is false
        System.out.println("I dont like basketball.");
      }
    }

    System.out.println("I am a basketball fanatic and spend a majority of "
        + "my time playing or watching basketball.");
    System.out.println("Check out what I have learned so far through Hackerrank exercises and "
        + "video tutorials.");
    System.out.println(
        "There are 8 primitive data types that we went over in an Introduction to Programming.");
    // 1. Byte = 8-bit, has min. value of -128 and max. value of 127
    // 2. Short = 16-bit, has min. value of -32,768 and max value of 32,767
    // 3. int = 32-bit has min. value of -2^31 and max. value of 2^31-1
    // 4. Long = 64-bit has min value of -2^63 and max. value of 2^63-1, use this
    // when you need range of values wider than those provided by int
    // 5. Float = Single precision 32-bit IEEE 754 floating point; General choice
    // for decimal values and never use for precise values, ex. Currency
    // 6. Double = Double precision 64-bit IEEE 754 floating point
    // 7. Boolean = True or false
    // 8. Char = Single 16-bit Unicode character with min value of 0 and max of 65,535

    /*
     * A variable is a location in memory. It's like a box that you can put values in to. Scope is
     * the visibility of variables & the parts of program that can be seen and used.
     */

    // Casting - going from one data type to another
    int intValue = 700;
    double doubleValue = 33.3;

    doubleValue = intValue;
    System.out
        .println("An example of casting is the double value having the same value as int which is "
            + doubleValue);

    // comment in Github
    // comment in Eclipse



  }
}
