// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */

public class Test {

  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int x : numbers) {
      if (x == 30) {
        continue;
        // continue causes the loop to immediately jump to next iteration of the loop
      }
      System.out.print(x + "\n");

      // Inheritance can be defined as the process where one class acquires the properties (methods
      // and fields) of another. It provides powerful and natural mechanism for organizing and
      // structuring software. One of the key benefits of inheritance is to minimize the amount of
      // duplicate code in an application by sharing common code.

      // declaration and instantiation
      int a[] = new int[3];

      // initialization
      a[0] = 10;
      a[1] = 20;
      a[2] = 30;


      // traversing array
      for (int i = 0; i < a.length; i++)// length is the property of array
        System.out.println(a[i]);

      // one-dimensional array
      int[] values = {1, 100, 1000};
      System.out.println(values[2]);
    }
  }
      // manually find smallest value in an array
      public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
          if(numbers[i] < minValue){
            minValue = numbers[i];
          }
        }
        return minValue;

  }
}


