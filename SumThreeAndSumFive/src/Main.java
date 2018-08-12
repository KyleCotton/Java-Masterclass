public class Main {
    public static void main(String[] args) {
	int runningSum = 0;
	int numberMeeting =0;
	for(int i=1; i<=1_000; i++) {
	    if(((i%3 == 0) && (i%5 == 0)) == true) {
		if(numberMeeting >= 5) {
		    break;
		}
		runningSum += i;
		numberMeeting++;

		System.out.println("The number " + i + " meets the condition");
		
	    }

	}

	System.out.println("The running total was " + runningSum);
	System.out.println("There was " + numberMeeting + " numbers that met the conditions");
	
    }

}
