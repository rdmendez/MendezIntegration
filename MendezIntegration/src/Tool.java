// Roger Mendez
/*
 * This is a program integrating skills and knowledge that I have learned in an Introduction to
 * Programming class.
 */

public class Tool {

  // Private fields
  private int numOfTools = 10;
  private double priceOfTools = 150;
  private String sizeOfTools = null;

  // constructor with parameters
  public Tool(int number, double price, String size) {
    super();
    numOfTools = number;
    priceOfTools = price;
    setSizeOfTools(size);

  }

  // constructor w/o parameters
  public Tool() {
    numOfTools = 10;
    priceOfTools = 150;
  }

  public int getNumOfTools() {
    // public getter
    return numOfTools;
  }

  public void setPriceOfTools(double priceOfTools) {
    // public setters for class
    this.priceOfTools = 85.75;
  }

  public String getSizeOfTools() {
    return sizeOfTools;
  }

  public void setSizeOfTools(String sizeOfTools) {
    this.sizeOfTools = sizeOfTools;
  }



}
