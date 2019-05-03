import java.util.*;  
import java.util.Arrays;
import java.util.ArrayList;


// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */

public class Array {

  public static void main(String args[]) {
    // declaring and initializing multi-dimensional array
    int arr[][] = {{1, 2, 3}, {3, 2, 1}, {1, 2, 3}};
    // printing multi-dimensional array
    for (int a = 0; a < 3; a++) {
      for (int b = 0; b < 3; b++) {
        System.out.print(arr[a][b] + " ");
      }
      System.out.println();
    }
  }

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

  public static int findArrayValue() {

    Integer[] array = {1, 2, 3, 4, 5, 6};

    Arrays.asList(array).indexOf(4);

    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    // foreach loop
    for (char item : vowels) {
      System.out.println(item);

      int[] numbers = {3, 10, 25, -15, 0, 32};
      int sum = 0;

      for (int number : numbers) {
        sum += number;
      }

      System.out.println("Sum = " + sum);
      
      for (int i = 0; i < 300; ++i) {
        for (int j = 0; j < 300; ++j) {
            int[][] arr = null;
            if (arr[i][j] == 255) {
                // Found the correct i,j - print them or return them or whatever
            } 
        }
    }

      int[][] arr = new int[3][3];// 3 row and 3 column
      // instantiate multidimensional array

      arr[0][0] = 1;
      arr[0][1] = 2;
      arr[0][2] = 3;
      arr[1][0] = 4;
      arr[1][1] = 5;
      arr[1][2] = 6;
      arr[2][0] = 7;
      arr[2][1] = 8;
      arr[2][2] = 9;
      // initialize multidimensional array

      ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Roger");//Adding object in arraylist    
      list.add("Haley");    
      list.add("Dominic");    
      list.add("Zach");    
      //Invoking arraylist object   
      System.out.println(list);  
    }
    return 0;
    
    
  }
}
