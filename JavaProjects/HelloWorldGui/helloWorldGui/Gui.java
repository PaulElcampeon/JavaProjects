package helloWorldGui;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*This program will create a GUI with a a Label and a button. 
 * When the user clicks the button a message ("Hello World") will appear 
 * on the label */
public class Gui extends JFrame implements ActionListener{
	
	JPanel panel = new JPanel();
	JLabel messageBoard = new JLabel();
	JButton msgBoardbtn = new JButton();
	
	public Gui() {
		
		panel.setLayout(null);
		
		messageBoard.setBounds(0, 0, 394, 153);
		messageBoard.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(messageBoard);
		
		msgBoardbtn.setBounds(93, 185, 188, 50);
		msgBoardbtn.setText("Click Me");
		msgBoardbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		msgBoardbtn.addActionListener(this);
		panel.add(msgBoardbtn);
		
		super.add(panel);
		
		super.setTitle("Hello World");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 300);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setVisible(true);

		
	}
		

	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
