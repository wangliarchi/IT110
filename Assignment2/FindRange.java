/*
 * File: FindRange.java
 * Name: wangli 
 * Section Leader: jianbin ray
 * helper: jianbin, http://cs106a.tumblr.com
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
		println("This program finds the largest and smallest numbers");
/* send the alert message brick */
		int num1 = readInt("?");
		if( num1 == SENTINEL) {
		println("you have put in an end number");
		}
/* Find the largest and the smallest brick*/
		else{
		int smallest = num1;
		int largest = num1;
		while(true){
			int number = readInt("?");
			if(number == SENTINEL) break;
			if(number !=SENTINEL&&number<=smallest){
				smallest = number;
		}
			if(number>=largest){
				largest = number;
				}
			}
/* display the largest and smallest brick */
		println("the smallest number is"+":" + smallest);
		println("the largest numer is"+":" + largest );
			
		}
	}
}





