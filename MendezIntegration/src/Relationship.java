// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */

public class Relationship {

  public static void main(String[] args) {


    int value1 = 1;
    int value2 = 2;
    int result;
    boolean myCondition = true;
    result = myCondition ? value1 : value2;

    System.out.println(result);

    int a = 1;
    double b = 2;
    int c = 3;
    int d = 4;

    System.out.println(a++);
    System.out.println(--b);
    System.out.println(a * c);
    System.out.println(d / b);
    System.out.println(a + c);
    System.out.println(d % c);
    System.out.println(d += 4);


    String stringOne = "I am string #1.";
    String stringTwo = "I am string #2.";
    String stringThree = "I am string #3.";

    int firstComparison = stringOne.compareTo(stringTwo);
    System.out.println("stringOne and StringTwo compareTo: " + firstComparison);

    int secondComparison = stringOne.compareToIgnoreCase(stringThree);
    System.out.println("stringOne & stringThree compareToIgnoreCase: " + secondComparison);

    int thirdComparison = stringTwo.compareTo("I am string #2.");
    System.out.println("stringTwo is: " + thirdComparison);

    boolean compare = (stringOne == stringTwo); // uses == to compare Strings
    System.out.println(compare + "\n");

    // == is used to test for equality. The == operators compare object references and checks to see
    // if two operands point to the same object.


    int myValue1 = 11;
    int myValue2 = 3;
    // == equal to
    if (myValue1 == myValue2)
      System.out.println("myValue1 == myValue2");
    // != not equal to
    if (myValue1 != myValue2)
      System.out.println("myValue1 != myValue2");
    // > greater than
    if (myValue1 > myValue2)
      System.out.println("myValue1 > myValue2");
    // < less than
    if (myValue1 < myValue2)
      System.out.println("myValue1 < myValue2");
    // <= less than or equal to
    if (myValue1 <= myValue2)
      System.out.println("myValue1 <= myValue2");
    // >= greater than or equal to
    if (myValue1 >= myValue2)
      System.out.println("myValue1 >= myValue2");

    if ((myValue1 == 11) && (myValue2 == 3))
      System.out.println("myValue1 is 11 AND myValue2 is 3");
    if ((value1 == 11) || (value2 == 11))
      System.out.println("myValue1 is 11 OR my Value2 is 11");

    // Operators with higher precedence are evaluated before operators with lower precedence.
    // Certain operators tends to appear more frequently than others. Operator precedence focuses
    // first on the operators you're most likely to use on a regular basis, and ends focusing on
    // those that are less common.

    int value = 0;

    while (value < 6) {
      System.out.println("Hello championship ring!");
      // Michael Jordan won 6 rings so it's only right we say it 6 times
      value = value + 1;
    }

    int counter = 0;

    do {
      System.out.println(counter);
      counter++;
    } while (counter <= 23);
    // Count to 23 for the G.O.A.T! MICHAEL JORDAN!


  }

}
