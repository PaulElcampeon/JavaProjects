package adding2Numbers;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*This programme allows user to input two numbers and on the click of a 
 * button the sum of the two numbers I will be displayed on a JLabel.*/
public class MainWithGUI{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField num1field = new JTextField();
	JTextField num2field = new JTextField();
	JButton addbtn = new JButton("ADD");
	JButton clear = new JButton("CLEAR");
	JLabel calculations = new JLabel("Your calculations will show here");
	JLabel ansLabel = new JLabel("Your answer will appear here");
	double num1;
	double num2;
	double answer;
	
	public MainWithGUI() {
		
		panel.setLayout(new GridLayout(3,2));
		
		panel.add(num1field);
		panel.add(num2field);
		panel.add(addbtn);
		panel.add(clear);
		panel.add(calculations);
		panel.add(ansLabel);

		frame.add(panel);
		
		frame.setTitle("Adding 2 numbers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(500, 300);
		frame.setResizable(true);
		frame.setVisible(true);
		
		ActionTaken actionTaken = new ActionTaken();
		
		addbtn.addActionListener(actionTaken);
		clear.addActionListener(actionTaken);
		
	}
	
	public class ActionTaken implements ActionListener{
		public void actionPerformed(ActionEvent event) {
		
			if(event.getSource() == addbtn) {
				num1 = Double.parseDouble(num1field.getText());
				num2 = Double.parseDouble(num2field.getText());
				answer = num1 + num2;
				calculations.setText(num1+" + "+num2+" = ");
				ansLabel.setText(": "+answer);
			}
			
			if(event.getSource() == clear) {
				num1field.setText("");
				num2field.setText("");
			}
		}
	}
	
	public static void main(String[] args) {
		
		MainWithGUI obj = new MainWithGUI();
		
	}
	
}
