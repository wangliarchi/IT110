	


public class fasterFindPrime {
	
    public static void main(String[] args) {
   
		for (int i = 1; i <= 50; i+=2) {
		
			    for (int j = 2; j < Math.sqrt(i); j++) {
					
			    	if (i % j == 0) {
					   
			    		continue;
					
			    	}
				}
				
					System.out.println(i);
		    }
		
	    
	    	
			
			// Find and print all primes between 0 and 50.

			
	 
 }
}


	    
	    
	 
