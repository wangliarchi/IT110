* File: ProgramHierarchy.java
 * Name: wangli
 * Section Leader: jianbin Ray
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
/** Width of each rectangle in pixels.*/
	public static final int rectWidth = 100;
	
/** Height of each rectangle in pixels */
	public static final int rectHeight = 50;
	
/** Space between the rectangles in second line.*/
	public static final int rectSpace = 25;
	
	public void run() {
		drawRect1();
		drawRect2();
		drawRect3();
		drawRect4();
		drawLines();
		//drawLabel();
	}	
		private void drawRect1(){
/* get the middle coordinate of rect1 */
		double x1 =(getWidth() - rectWidth ) / 2;
		double y1 =(getHeight()/2 - rectHeight * 2 );
		GRect rect1 = new GRect(x1, y1, rectWidth, rectHeight);
        add(rect1);
		
}
	    private void drawRect2(){
	    	double x2 = getWidth()/2 - 2.5*rectWidth - rectSpace;
	    	 
	    	double y2 = getHeight()/2 + rectHeight;
	    	GRect rect2 = new GRect(x2,y2,rectWidth, rectHeight);	
	    	add(rect2);
 }	
/* draw the console program rectangle.*/
		private void drawRect3(){
			double x3 = getWidth()/2 - rectWidth/2;
			double y3 = getHeight()/2 + rectHeight;
			GRect rect3 = new GRect(x3,y3,rectWidth, rectHeight);	
			add(rect3);
		}
/* draw the dialog program rectangle.*/
		private void drawRect4(){
			double x4 = getWidth()/2 + rectWidth/2 + rectSpace + rectWidth;
			double y4 = getHeight()/2 + rectHeight;
			GRect rect4 = new GRect(x4, y4, rectWidth, rectHeight);
			add(rect4);
		}
/* draw the two lines which connect rect2 and rect4 with rect1 */			
		private void drawLines() {
			double x = getWidth()/2 ;
			double y = getHeight()/2 -rectHeight;
			double x2 = getWidth()/2 - 2*rectWidth -rectSpace;
			double y2 = getHeight()/2 + rectHeight;
			double y3 = y2;
			double x4 = getWidth()/2 + rectSpace + 2*rectWidth;
			GLine line1 = new GLine(x,y,x2,y2);;
			add(line1);
			GLine line2= new GLine (x,y,x,y3);
			add(line2);
			GLine line3 = new GLine(x,y,x4,y3);
			add(line3);
		}
}	
// how to use the label.getWidth(); ??
		//private void drawLabel(){
			
			//double x = (getWidth()/2 - rectWidth/2 + label.getWidth()/2);
			//double y = getHeight()/2 - rectHeight * 1.5 + label.getAscent()/2;
			//GLabel label = new GLabel("Program",x,y);
			//add(label);
		//}	
			
		
		
