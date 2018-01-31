package plottingCircumference;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Animation extends JPanel {
	//Plotting a circle with radius 100
	// I rearranged the formula of a circle to make y the subject in order to plot the y coordinates 
	int ballX = 300;
	int ballY = 200;

	/*public Animation() {
	}*/
	
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	
	//background 
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, 800, 600);
	
	//Circle
	g.setColor(Color.red);
	g.fillOval(ballX, ballY, 2, 2);

	//Positive answer to square root
	for(int i = 200; i <= 401; i++) {
		g.setColor(Color.blue);
	
	int ui = (int) Math.round(Math.sqrt(Math.pow(100, 2) - (Math.pow((i-300), 2)))+200);
	g.fillOval(i, ui, 2, 2);
	}
	
	
	//Negative answer to square root
	for(int i = 200; i <= 401; i++) {
		g.setColor(Color.blue);
		int ui = (int) Math.round(-(Math.sqrt(Math.pow(100, 2) - (Math.pow((i-300), 2))))+200);
		g.fillOval(i, ui, 2, 2);
		}
	}
}