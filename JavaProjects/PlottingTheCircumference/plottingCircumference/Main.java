package plottingCircumference;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[]) {
		
		Animation obj = new Animation();
		
		JFrame frame = new JFrame();
		
		frame.add(obj);
		
		frame.setTitle("Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
	}

