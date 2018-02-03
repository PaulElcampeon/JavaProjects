package pong;

import javax.swing.JFrame;

public class Main implements Runnable {
	
	@Override
	public void run() {

		JFrame obj = new JFrame();
		Game gamePlay = new Game();
		obj.add(gamePlay);

		obj.setSize(700,500);
		obj.setTitle("Pauls Pong");
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setLocationRelativeTo(null);
		obj.setResizable(false);
		obj.setVisible(true);
		obj.add(gamePlay);
	}
	

	public static void main(String args[]) {
		
		Thread thread = new Thread(new Main());
		thread.start();
		
	}

}