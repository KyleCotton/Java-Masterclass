// Method Overloading
// Noticing that the different methods have the same name, different method signitures.
// - Method Name
// - Number of parameters
// - Data Type of parameters

public class Main {
    public static void main(String[] args) {
	int newScore = calculateScore("Tim", 500);
	System.out.println("New Score is: " + newScore);
	System.out.println("Score is: " + calculateScore(10));
	System.out.println("Score is: " + calculateScore());		



    }
    public static int calculateScore() {
	System.out.println("No Player, No Score");
	return 0;

    }
    public static int calculateScore(String playerName, int score) {
	System.out.println("Player " + playerName + " scored " + score + " points");
	return score * 1_000;

    }
    
    public static int calculateScore(int score) {
	System.out.println("Unamed Player scored " + score + " points");
	return score * 1_000;

    }
}
