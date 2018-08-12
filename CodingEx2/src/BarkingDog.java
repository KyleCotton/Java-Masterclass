public class BarkingDog {
    public static void main(String[] args) {
	System.out.println(bark(true,-1));
    }
    
    public static Boolean bark(boolean barking, int hourOfDay) {
	// Check inputs Valid
	if((hourOfDay < 0) || hourOfDay > 24) {
	    return false;
	}
	
	if((barking == true) && ((hourOfDay < 8) || (hourOfDay > 22))) {
	    return true;
	}
	else {
	    return false;
	}
	
    }
}
