/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {
/* get the middle coordinate of rect1 */
		double x =(getWidth() - RECT1_WIDTH) / 2;
		double y =(getWidth() - RECT1_HEIGHT) / 2;
		GRect RECT1 = new GRect(x,y,RECT1_WIDTH, RECT1_HEIGHT);
/* insert "PROGRAM" in rect1  */
		 GLabel label1 = new GLabel("warnIcon");
		    label1.setText("Center-Center");
		    label1.setHorizontalTextPosition(GLabel.CENTER);
		    label1.setVerticalTextPosition(GLabel.CENTER);
		    label1.setBorder(border);
		    add(label1);
		add(GRect);
		
		
		
		
		
		
	}
	
	
/* private constants */
	private static final double RECT1_WIDTH = 100;
	private static final double RECT1_HEIGHT = 50;
}

