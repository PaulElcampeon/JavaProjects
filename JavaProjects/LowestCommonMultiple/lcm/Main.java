package lcm;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		Gui obj = new Gui();
		
		frame.add(obj);
		
		frame.setTitle("Lowest Common Multiple");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(480, 350);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
