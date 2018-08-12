public class Main {
    public static void main(String[] args) {
	sumOdd(0,5);

    }

    public static boolean isOdd(int number) {
	// Check valid
	if(number<0) {
	    return false;
	}

	if(number%2 != 0) {
	    return true;
	}
	else {
	    return false;
	}
    }

    public static int sumOdd(int start, int end) {
	// Check inputs
	if((end<start) || (end<0) || (start<0)) {
	    return -1;
	}

	int sumOfOdd = 0;
	int result = 0;

	for(int i=start; i<=end; i++) {
	    result = isOdd(i) ? i:0;
	    sumOfOdd+=result;
	}

	System.out.println(sumOfOdd);
	return sumOfOdd;
    }
}
