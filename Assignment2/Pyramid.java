* File: Pyramid.java
 * Name: wang li
 * helpes by: Jianbin Ray. refer to Dianna.
 * Section Leader: Jianbin Ray
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
/* draw bricks row by row, in each row, the bricks of one row 
 * reduced by one per row, until there is only one brick in the prominent point 
 * of the pyramid.  
 */
	public void run(){
/* calculate the original coordinate of the first bricks in the base row.  */
	double coorx = (getWidth() - BRICK_WIDTH * BRICKS_IN_BASE) / 2;
	double coory = getHeight() - BRICK_HEIGHT;
	int bricksInRow =14;
/* define a loop, include inner for loop and a outer while loop.
 * the inner loop aims for draw bricks one by one in a row.
 * the outer loop aims for reduce the numbers of bricks by one per row
 * until there is only one brick left in a row , the loop ends.
 */
	while (bricksInRow > 0){
		for (int i=0; i<bricksInRow;i++){
			double x = coorx + BRICK_WIDTH * i;
			double y = coory;
			GRect rec = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
			add(rec);	
		}
		bricksInRow--;
/* the coordinate of the first bricks of each row varies, so we should change it after 
 * complete every inner loop.
 */
		coorx += BRICK_WIDTH/2;
		coory -=BRICK_HEIGHT;	
	}
	 }
	  }
	

	

