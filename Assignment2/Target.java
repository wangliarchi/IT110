/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	/* first, count out the coordinate and width and height,
	 * draw a big circle, and filled red color.
	 * then, draw another circle inside the big circle, filled white.
	 * finally,draw the smallest circle inside both the above two circle.filled red.
	 */
	public void run() {
	/* Find the mid point of the screen.*/
	double midy = (double) getHeight() / 2;
	double midx = (double) getWidth() / 2;
	/* define the radius of the three circles*/
	double r1 = 72;
	double r2 = 46.8;
	double r3 = 21.6;
	/* define the coordinate of each circle and filled with different color to obtain the vision
	 * like a target.
	 */
	GOval circle1 = new GOval(midx - r1, midy - r1, 2*r1, 2*r1 );
	circle1.setFilled(true);
	circle1.setColor(Color.RED);
	add(circle1);
	GOval circle2 = new GOval(midx - r2, midy - r2, 2*r2, 2*r2 );
    circle2.setFilled(true);
    circle2.setColor(Color.WHITE);
    add(circle2);
    GOval circle3 = new GOval(midx - r3, midy - r3, 2*r3, 2*r3 );
    circle3.setFilled(true);
    circle3.setColor(Color.RED);
    add(circle3);
	}
}