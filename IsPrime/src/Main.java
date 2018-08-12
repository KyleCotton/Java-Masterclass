public class Main {
    public static void main(String[] args) {
	int upperLimit = 50_000;
	int lowerLimit = 0;
	int numberOfPrimes = 0;
	
	for(int i=lowerLimit; i<=upperLimit; i++) {
	    if(isPrime(i) == true) {
		numberOfPrimes++;
	    }
	    printPrime(i);
	}
	System.out.println("There are " + numberOfPrimes + " primes between " + lowerLimit + " and " + upperLimit);
	// printPrime(10);
	// printPrime(5);
	// printPrime(7);
	
    }

    public static void printPrime(int n) {
	System.out.println("Is " + n + " a prime number: " + isPrime(n));
    }

    public static boolean isPrime(int n) {
	if(n == 1) {
	    return false;
	}

	for(int i=2; i<= n/2; i++) {
	    if(n % i == 0) {
		return false;
	    }
	}

	return true;
    }
}
