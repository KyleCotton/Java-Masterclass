public class DurationString {
    public static void main(String[] args) {
	System.out.println(getDurationString(600,59));	
	System.out.println(getDurationString(665,40));
	System.out.println(getDurationString(45635));
    }
    
    public static String getDurationString(int minutes, int seconds) {

	// Validate Inputs
	if((minutes < 0) || (seconds < 0 ) || (seconds > 59)) {
	    return "Invalid Value";
	}

	
	
	int secondsTotal = (minutes * 60) + seconds;
	System.out.println("Total Seconds: " + secondsTotal);

	
	int hoursNew = (int) (secondsTotal / 3600);
	System.out.println("New Hours: " + hoursNew);
	secondsTotal -= (hoursNew * 3600);

	
	int minutesNew = (int) (secondsTotal / 60);
	System.out.println("New Minutes: " + minutesNew);
	secondsTotal -= (minutesNew * 60);

	int secondsNew = secondsTotal;
	System.out.println("New Seconds: " + secondsNew);


	
	// int secondsNew = (int) (secondsTotal - ((hoursNew * 3600) + (minutesNew * 60)));
	String message = hoursNew + "H " + minutesNew + "M " + secondsNew + "S";
	//System.out.println(message);
	return message;
	
    } 

    public static String getDurationString(int seconds) {
	int minutes = seconds / 60;
	int newSeconds = seconds - (minutes * 60);
	return getDurationString(minutes, newSeconds);
    }
    
}
