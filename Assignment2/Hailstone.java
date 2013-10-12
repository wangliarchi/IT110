* File: Hailstone.java
 * Name: wangli
 * Section Leader:jianbin Ray 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;
/* Enter a number, and this program aim at make a Hailstone sequence.*/
public class Hailstone extends ConsoleProgram {
/* Define SENTINAL to be 1, when the block happen to 1,it will break */
	private static final int SENTINAL = 1;
/* Use a while loop, according to whether the number is an odd or an even,give tit different task  */
	public void run() {
/*counter,count the loop times*/
		int counter = 0;
		int n = readInt("Pleasr Enter a number except for 1"+":");
		
		while(true){
	      if(n == SENTINAL)
				break;
/* if n is even, take half of it, and assign it's value to original n*/
		if (n % 2 == 0){
			println(n + ""+"is even" +"," + "so I can take half"+":"+ n/2);
			n = n/2;	
		}
/*if n is odd, make n multi 3 and plus 1, assign it's value to n again.*/		
		else
		{
			println(n +"" +"is odd"+"," + "so I make 3n+1"+":"+(3*n+1));
			n = 3 * n + 1;
		}
		
		counter++;
		}	
		println("The process took"+""+counter+""+"steps"+"to reach 1"+".");
	}
	}



