package helloWorldGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener{
	
	JPanel panel = new JPanel();
	JLabel messageBoard = new JLabel();
	JButton msgBoardbtn = new JButton();
	
	public Gui() {
		
		super.setTitle("Hello World");
		super.setVisible(true);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
		

	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
