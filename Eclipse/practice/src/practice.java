
public class practice {
	
	
	public class Primes {

	    private static void findPrimes(int nValues, boolean printPrimes) {
		boolean isPrime = true;

		for (int i = 2; i <= nValues; i++) {
		    isPrime = true;
	      
		    for (int j = 2; j < i; j++) {
			if (i % j == 0) {
			    isPrime = false;
			    break;
			}
		    }

		    if (printPrimes && isPrime) {
			System.out.println(i);
		    }
		}
	    }
			

	    private static void findPrimesFaster(int nValues, boolean printPrimes) {
		// PLACE YOUR IMPLEMENTATION HERE
		System.out.println("The method findPrimesFaster has not been implemented");
	    }


	    private static void findPrimesEvenFaster(int nValues, boolean printPrimes) {
		// PLACE YOUR IMPLEMENTATION HERE
		System.out.println("The method findPrimesEvenFaster has not been implemented");
	    }



	    public static void main(String[] args) {		
			
		// Find and print all primes between 0 and 50.

		System.out.println("Running method findPrimes:");
		findPrimes(50, true);

		System.out.println("\nRunning method findPrimesFaster:");
		findPrimesFaster(50, true);

		System.out.println("\nRunning method findPrimesEvenFaster:");
		findPrimesEvenFaster(50, true);

	
	
	

}
