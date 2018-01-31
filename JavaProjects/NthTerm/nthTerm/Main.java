package nthTerm;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		Gui obj = new Gui();
		frame.getContentPane().add(obj);
		frame.setTitle("Find the nth term");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
