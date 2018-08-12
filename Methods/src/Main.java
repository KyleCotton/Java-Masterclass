public class Main { 
    public static void main(String[] args) {
	System.out.println("Java Methods");
	calculateScore(true, 800, 5, 100);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
	if (gameOver) {
	    int finalScore = score + (levelCompleted * bonus);
	    System.out.println("Your final score was: "+ finalScore);
	    return finalScore;
	}

	return -1;
    }
}
