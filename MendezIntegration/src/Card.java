// Roger Mendez


public class Card {

  private String suite;
  private int number;

  public String getSuite() {
    return suite;
  }

  public void setSuite(String suiteToBeSet) {
    suite = suiteToBeSet;
  }

  public void draw() {
    suite = "Diamonds"; // could be random
    setNumber(4); // could be random
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
