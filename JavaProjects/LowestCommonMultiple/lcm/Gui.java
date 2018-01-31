package lcm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JPanel implements ActionListener {
	
	private JLabel Title;
	private JLabel number1label;
	private JLabel number2label;
	private JTextField number1;
	private JTextField number2;
	private JButton Initiate;
	private JLabel answer;
	private int n1;
	private int n2;
	private String ans; 
	
	public Gui() {
		
		setBackground(Color.LIGHT_GRAY);
		
		setLayout(null);
			
		Title = new JLabel();
		Title.setHorizontalAlignment(JLabel.CENTER);
		Title.setText("Lowest Common Multiple");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 35));
		Title.setBounds(10, 10, 430, 33);
		add(Title);
			
		number1label = new JLabel("Number 1");
		number1label.setHorizontalAlignment(JLabel.CENTER);
		number1label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		number1label.setBounds(80, 57, 93, 25); 
		add(number1label); 
			
		number2label = new JLabel("Number 2");
		number2label.setHorizontalAlignment(JLabel.CENTER);
		number2label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		number2label.setBounds(232, 57, 105, 25); 
		add(number2label); 
			
		number1 = new JTextField(20);
		number1.setHorizontalAlignment(JLabel.CENTER);
		number1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		number1.setBounds(80, 84, 105, 40); 
		add(number1);
			
		number2 = new JTextField(20);
		number2.setHorizontalAlignment(JLabel.CENTER);
		number2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		number2.setBounds(232, 84, 105, 40); 
		add(number2);
			
		Initiate = new JButton("Initiate");
		Initiate.setFont(new Font("Tahoma", Font.BOLD, 25));
		Initiate.setBounds(144, 135, 135, 50); 
		Initiate.addActionListener(this);
		add(Initiate);
			
		answer = new JLabel("Your answer will appear here");
		answer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		answer.setBounds(27, 186, 388, 49); 
		add(answer); 
		}
		
		
		@Override
		public void actionPerformed(ActionEvent event) {
		
			if(event.getSource() == Initiate) {
				n1 = Integer.parseInt((number1.getText()));
				n2 = Integer.parseInt((number2.getText()));
				lCm(n1,n2);
				answer.setText("The LCM of "+n1+" and "+n2+" is "+lCm(n1,n2));
			}
		}
		
		//The method to find the lowest common multiple of two numbers
		public int lCm(int x, int y) {
			int z = 0;
		
		//OUTER_LOOP allows us to break the loop from the outer loop position
		OUTER_LOOP: for(int i = 1; i<=50; i++) {
			
			for(int v = 1; v<=50; v++) {
			
				if (x*i == y*v) {
					z = y*v;
					break OUTER_LOOP;
				}
			}
		}
		
			return z;
			
		}
		}
