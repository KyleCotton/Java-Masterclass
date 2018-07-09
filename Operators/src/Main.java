public class Main {
    public static void main(String[] args) {
	System.out.println("Using Operators");

	//The '=' operator has been used to assign a value.
	int equalResult = 10;
	System.out.println(equalResult);

	//The '+' operator has been used to add a value.
	int plusResult = 10 + 1;
	System.out.println(plusResult);

	//The '-' operator has been used to subtract a value.
	int minusResult = 10 - 1;
	System.out.println(minusResult);

	//The '*' operator has been used to multiply a value.
	int multiplyResult = 10 * 2;
	System.out.println(multiplyResult);

	//The '+' operator has been used to divide a value.
	int divideResult = 10 / 2;
	System.out.println(divideResult);

	//The '%' (modulus) operator has been used to return the remainder.
	int modResult = 10 % 3;
	System.out.println(modResult);
	
	///boolean isAlien = false;
	boolean isAlien = true;

	if (isAlien == false) {
	    System.out.println("It is not an alien");
	}
	else {
		System.out.println("It is an alien!!");
	    }


	// '==' Equal
	// '!=' Not Equal
	// '<','>','<=','>=' Inequalities
	// '&&' AND operator
	// '||' OR operator
	int topScore = 100;

	if (topScore == 100) {
	    System.out.println("Score is 100\nThe High Score!");
	}


	// This is a ternary statement.
	// If the statement is true the first option occurs else the second.

	// Since 26 is greater than 21, this string is set to the first option.

        int age = 26;
        String canDrinkAlcohol = (age > 21) ? "True, over 21" : "False, under 21";
	System.out.println(canDrinkAlcohol);


    }
}
