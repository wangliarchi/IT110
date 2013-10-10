

public class primes {
	
    public static void main(int nValues, boolean printPrimes){
      search:
   
		for (int i = 1; i <= 50; i+=2) {
                          double rt= Math.sqrt(i);
		
			    for (int j = 2; j <= rt; j++) {
					
			    	if (i % j == 0) {
					   
			    		continue search;
					
			    	}
                           if(printPrimes){
				
				
					System.out.println(i);
                   }
                   }
		}
    }
}
    
		
	    
	    	
			
			// Find and print all primes between 0 and 50.
