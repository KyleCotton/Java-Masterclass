public class LeapYear {
    public static void main(String[] args) {
	System.out.println(isLeapYear(2016));
    }
    
    public static boolean isLeapYear(int year) {
	// Check Input Valid

	if((year < 1) || (year > 9999)) {
		return false;
	    }

	// Code Criteria

	if((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0) ) {
	    return true;

	}
	else {
	    return false;
	}
    }
}
