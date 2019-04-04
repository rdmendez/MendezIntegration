// Roger Mendez
// This is a program integrating skills that I have learned in an Introduction to Programming class.
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
		number = 4; // could be random
	}

}
