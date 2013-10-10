public class StringScrambler {

    public String reverseWordOrder(String input) {
	if (input == null) {
	    return null;
	}

	// PLACE YOUR IMPLEMENTATION HERE
	/* split the string input,.
	 * create an array normalOrder to carry the word. 
	 * get it's length.
	 * 
	 * create a reverseOrder array to carry the reversedWordOrder
	 */
	
	
	
	
	
	
	
	
	// this line added so skeleton class compiles:
	return null;
    }


    public static void main(String args[]) {
	StringScrambler scrambler = new StringScrambler();
	String input;
	String output;

	input = "To be or not to be, that is the question.";
	output = scrambler.reverseWordOrder(input);
	System.out.println(output);

	input = "Stressed spelled backwards is Desserts";
	output = scrambler.reverseWordOrder(input);
	System.out.println("\n\n" + output);
    }

}
