public class Main {
    public static void main(String[] args) {
	System.out.println("Hello World");
	int myIntValue = 5;
	float myFloatValue = 5f;
	double myDoubleValue =5d;

	System.out.println(myIntValue);
	System.out.println(myFloatValue);
	System.out.println(myDoubleValue);	
	
	System.out.println(myIntValue + myFloatValue + myDoubleValue);

	double givenPounds = 200d;
	double calcKilo = givenPounds * 0.45359237d;

	System.out.println(givenPounds + " Pounds");
	System.out.println("That will be "+ calcKilo + "KG");
	
    }

}
