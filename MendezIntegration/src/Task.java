import java.util.Scanner;

// Roger Mendez

public class Task {

  public void simpleMessage(String name) {
    
    Scanner input = new Scanner(System.in);
    

    // print out greeting using escape methods
    System.out.println("Hey! How are you doing " + name + "? "
        + "\nWelcome to my integration project! I hope you're doing well and that you enjoy looking "
        + "through my program! ");
    
    System.out.println("Please enter a command here:");
    String text =input.nextLine();
    
    switch (text) {
      case "start":
      System.out.println("Program has booted up!");
      break;
      
      case "stop":
        System.out.println("Program is running slowly.");
        break;
        
        default:
          System.out.println("ERROR! Command not recognized. Please try again.");
    }
  }
}

