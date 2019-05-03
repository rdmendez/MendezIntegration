// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */

public class Application {
  {
    int myNumber = 50;

    double myDouble = 85000;

    boolean myBoolean = false;

    String myString = "This is a string.";

    System.out.println(myNumber);
    System.out.println(myDouble);
    System.out.println(myBoolean);
    System.out.println(myString);

    // %d decimal number
    // %n line break
    // %s a string
    System.out.format("%s jumped %n over the %s, %d time %n", "Blake Griffin", "KIA", 1);


    double radius = 5.0;
    double area;
    area = calculateArea(radius);
    System.out.println("The area is " + area);
  }
  
  // top line of method is a header
  // the header is the line starting in public static ending in double radius
  // variable you pass is called an argument
  public static double calculateArea(double radius) {
    return Math.PI * radius * radius;
    // public static - modifier
    // double - return type
    // calculateArea - name of method
    // radius - formal parameter
    // double radius - list of parameters
    

    
    
  }
}
