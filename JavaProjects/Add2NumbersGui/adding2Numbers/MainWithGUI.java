package adding2Numbers;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*This programme allows user to input two numbers and on the click of a 
 * button the sum of the two numbers I will be displayed on a JLabel.*/

//I would not usually set up my coding like this but i just wanted to show another way of 
//writing the code in one main class

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
		
		//Creating a GridLayout on the panel
		panel.setLayout(new GridLayout(3,2));
		
		num1field.setFont(new Font("Tahoma", Font.PLAIN, 30));
		num1field.setHorizontalAlignment(JTextField.CENTER);
		panel.add(num1field);

		num2field.setFont(new Font("Tahoma", Font.PLAIN, 30));
		num2field.setHorizontalAlignment(JTextField.CENTER);
		panel.add(num2field);
		
		addbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(addbtn);
		
		clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(clear);
		
		calculations.setFont(new Font("Tahoma", Font.PLAIN, 20));
		calculations.setHorizontalAlignment(JTextField.CENTER);
		panel.add(calculations);
		
		ansLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ansLabel.setHorizontalAlignment(JTextField.CENTER);
		panel.add(ansLabel);

		frame.add(panel);
		
		frame.setTitle("Adding 2 numbers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 300);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null); //frame appears in middle of window
		frame.setVisible(true);
		
		ActionTaken actionTaken = new ActionTaken();
		
		addbtn.addActionListener(actionTaken);
		clear.addActionListener(actionTaken);
		
	}
	
	public class ActionTaken implements ActionListener{
		public void actionPerformed(ActionEvent event) {
		
			if(event.getSource() == addbtn) {
				try {
				num1 = Double.parseDouble(num1field.getText());
				num2 = Double.parseDouble(num2field.getText());
				answer = num1 + num2;
				calculations.setText(num1+" + "+num2+" = ");
				ansLabel.setText(""+answer);
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(frame, "Theres seem to be a problem with the numbers you have entered please correct this");
				}
			}
			
			if(event.getSource() == clear) {
				num1field.setText("");
				num2field.setText("");
				calculations.setText("Your calculations will show here");
				ansLabel.setText("Your answer will appear here");
			}
		}
	}
	
	public static void main(String[] args) {
		
		MainWithGUI obj = new MainWithGUI();
		
	}
	
}
