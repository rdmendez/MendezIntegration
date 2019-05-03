import java.util.Scanner;
import java.util.Random;

// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */


/**
 * @author rogermendez
 *
 */
public class Main {

  // this is a header
  // public is an access modifier
  // void is the return type, meaning this method doesn't return anything
  // method names should be in lowerCamelCase and be named with a verb
  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Task taskObject = new Task();

    System.out.println("Enter your name here: ");
    String name = input.nextLine();
    // the method
    taskObject.simpleMessage(name);

    
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
        System.out.println("I love basketball.");
      } else {
        // code that only happens when condition is false
        System.out.println("I dont like basketball.");
      }
    }

    System.out.println("I am a basketball fanatic and spend a majority of "
        + "my time either playing or watching basketball." + "\n");
    System.out.println("Check out what I have learned so far through Hackerrank exercises and "
        + "video tutorials." + "\n");
    System.out.println(
        "There are 8 primitive data types that we went over in Introduction to Programming that "
            + "include: " + "byte, short, int, long, float, double, boolean, and char");
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
     * A variable is a location in memory. It's like a box that you can put values in to. Scope is a
     * variable only accessible in the method where they are created.
     */

    // Casting - going from one data type to another
    int intValue = 700;
    double doubleValue = 33.3;

    doubleValue = intValue;
    System.out.println(
        "Here, I have an example of casting. The double value having the same value as int which is "
            + doubleValue);

    double randInt = 5;
    double power = Math.pow(randInt, 2);// used math class power
    System.out.println("The math class I used gives us " + power + "\n");

    Random dice = new Random(); // used random class
    int number;

    //
    for (int counter = 1; counter <= 10; counter++) {
      number = 1 + dice.nextInt(6);
      System.out.println(number + " ");
    }
  
  // polymorphism; also look at animal, cat, and dog classes
  Animal[] thelist = new Animal [2];
  Dog d = new Dog();
  Cat c = new Cat();
  
  thelist[0] = d;
  thelist[1] = c;
  
    for (Animal x : thelist) {
      x.noise();
  }
}


  // comment in Github
  // comment in Eclipse
}
