* File: FindRange.java
 * Name: wangli 
 * Section Leader: jianbin ray
 * helper: jianbin,  http://gabaix.us/blog/find-range
 * --------------------
 * This file is the starter file for the FindRange problem.
 * input some numbers until the sentinel, the program will display the smallest and largest.
 * while when the user put an sentinel number at first, the program will send a alert message.
 */


import acm.program.*;
public class FindRange extends ConsoleProgram {
/* Define a SENTINEL number for two use,
 * 1.if the user input sentinel number at first, the program will send an alert message
 * 2.the input number could be stopped when the user put in sentinel number, so the screen will
 * display the smallest and largest number.
 */
	private static final int SENTINEL = 0;

	public void run() {
		alertMessage();
		findSmallestLargest();
	}
	private void alertMessage(){
		println("This program finds the largest and smallest numbers");
		/* send the alert message brick */
				int num1 = readInt("?");
				if( num1 == SENTINEL) {
				println("you have put in an end number");
				}	
	}
		
/* Find the largest and the smallest brick*/
	private void findSmallestLargest(){
		int number = readInt("?");
		int smallest = number;
		int largest = number;
		while(true){
			int num = readInt("?");
			if(num == SENTINEL) break;
			if(num !=SENTINEL&&num<=smallest){
				smallest = num;
		}
			if(num>=largest){
				largest = num;
				}
			}
/* display the largest and smallest brick */
		println("the smallest number is"+":" + smallest);
		println("the largest numer is"+":" + largest );
			
		}
	}






