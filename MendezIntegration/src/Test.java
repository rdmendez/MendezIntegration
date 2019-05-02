
public class Test {

  public static void main(String[] args) {
    int [] numbers = {10, 20, 30, 40, 50};

    for(int x : numbers ) {
       if( x == 30 ) {
          continue;
          //continue causes the loop to immediately jump to next iteration of the loop
       }
       System.out.print( x + "\n");
    }

  }

}
