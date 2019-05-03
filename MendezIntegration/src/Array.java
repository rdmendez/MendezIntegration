import java.util.Arrays;

// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */

public class Array {

  public static int identifyArray() {
    int[] myArray = new int[] {2, 4, 6, 8, 10};
    for (int i = 1; i < myArray.length;) {
      if (myArray[i] == 5) {
        return i;
      } else if (myArray[i] == 8) {
        return i;
      } else if (myArray[i] == 10) {
        return i;
      } else {
        return 0;
      }
    }
    return 0;
  }
  
  public static void findArrayValue() {
    
    Integer[] array = {1,2,3,4,5,6};

    Arrays.asList(array).indexOf(4);
  }
}
