public class Teen {
    public static void main(String[] args) {
	System.out.println(hasTeen(15,20,30));
    }
    
    public static boolean inRange(int age) {
	if((age >= 13) && (age <= 19)) {
	    return true;
	}
	else {
	    return false;
	}
    }
    
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
	if(inRange(ageOne)==true ||
	   inRange(ageTwo)==true ||
	   inRange(ageThree)==true) {
	    return true;
	}
	else{
	    return false;
	}
    }

}
