
public class prime {

	    private static void findPrimes(int nValues, boolean printPrimes) {
		boolean flag= true;

		for (int i = 2; i <= nValues; i+=2) {
		    flag = true;
	      
		    for (int j = 2; j<Math.sqrt(i); j++) {
			if (i % j == 0) {
			    flag = false;   
			}
			continue;
		    }

		    if (printPrimes && flag) {
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
}
