public class Switch {
    public static void main(String[] args) {

	// If Statement
	int value = 3;
	if(value == 3) {
	    System.out.println("value was 1");
	} else if(value == 2) {
	    System.out.println("value was 2");
	} else {
	    System.out.println("Value wasn't 1 or 2");

	}

	// Switch Case
	int switchValue = 3;
	switch(switchValue) {
	    case 3:
		System.out.println("value was 3");
		break;
	    case 2:
		System.out.println("value was 2");
		break;

	    case 1:case 4: case 5:
		System.out.println("value was 1 or 4 or 5");

	    
	    default:
		// All swich statements need a defult case, run if no other case matches.
		System.out.println("value wasn't a 1,2,3,4,5");
		break;
	    
	    }   
	
    }

}
