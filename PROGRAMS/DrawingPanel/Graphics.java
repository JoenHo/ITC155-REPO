import java.awt.*;
//==================================================================
//Class: Graphics
//Description: draw ovals, rectangles, lines to the DrawingPanel 
//By: J.Ho
//Date: 04/16/2020
//==================================================================
public class Graphics {

	public static void main(String[] args) {
		// create DrawingPanel & Graphic instance
		DrawingPanel panel = new DrawingPanel(220, 150);
		Graphics2D g = panel.getGraphics();
		
		// set the background color to yellow
		panel.setBackground(Color.YELLOW);
		
		// draw two blue ovals
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		// draw a red square
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);

		// draw a black line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		
	}

}
