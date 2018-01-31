package filledCirclePlotting;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Animation extends JPanel{
	
	//Plotting a circle with initial radius or 1 and then incrementing it by 10 the increments can be changed
	//I rearranged the formula of a circle to make y the subject in order to plot the y coordinates 

	int ballX = 300;
	int ballY = 200;

	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
	
	//background 
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, 800, 600);
	
	//Circle
	g.setColor(Color.red);
	g.fillOval(ballX, ballY, 2, 2);
	
	//Positive answer to square root
	for(int qw = 1; qw <= 150; qw+=10) {
		for(int i = 150; i <= 451; i++) {
			g.setColor(Color.blue);
			int ui = (int) Math.round(Math.sqrt(Math.pow(qw, 2) - (Math.pow((i-300), 2)))+200);
			if(ui>0) {
				g.fillOval(i, ui, 2, 2);
				}
			}
		}
	
	//Negative answer to square root
	for(int fw = 1; fw <= 150; fw+=10) {
		for(int i = 150; i <= 451; i++) {
			g.setColor(Color.blue);
			int ui = (int) Math.round(-(Math.sqrt(Math.pow(fw, 2) - (Math.pow((i-300), 2))))+200);
			if(ui>0) {
				g.fillOval(i, ui, 2, 2);
				}
			}
		}
	}
}
