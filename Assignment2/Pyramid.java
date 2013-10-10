/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
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
	
	public void run() {
		putBricksInRow();
		int x = (getWidth() - BRICK_WIDTH * 14) / 2;
		int y = getHeight() - BRICK_HEIGHT;
	}  

 
	private void putBricksInRow(){
		int row = 14;
		
		for(int j=0; j<row; j++){
			for(int i = 0; i<BRICKS_IN_BASE; i++){ 
			   int x = x+BRICK_WIDTH * i / 2;
			   int y = y-BRICK_HEIGHT * j;
	           GRect rec= new GRect(x, y, BRIC
			K_WIDTH, BRICK_HEIGHT ) ;
		       add(rec);
		
	}
	
	

	

