package primeNoApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class List extends MenuBar implements ActionListener{

	private JFrame frame;
	private JPanel panel;
	private JLabel question;
	private JTextField field;
	private String ansX = "";
	private String input;
	private int inputNo;
	private JButton Initiate;
	private JTextArea answer;
	
	public List() {
		
		frame = new JFrame();
		
		panel = new JPanel();
		
		question = new JLabel("I want to find the prime numbers below (enter number below)");
		question.setFont(new Font("Tahoma", Font.PLAIN, 18));
		question.setBounds(12, 13, 530, 25);
		panel.add(question);
		
		field = new JTextField(20);
		field.setFont(new Font("Tahoma", Font.PLAIN, 18));
		field.setBounds(202, 51, 127, 34);
		panel.add(field);
		
		Initiate = new JButton("Initiate");
		Initiate.setBackground(SystemColor.textHighlight);
		Initiate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Initiate.setBounds(362, 51, 97, 34);
		Initiate.addActionListener(this);
		panel.add(Initiate);
		
		answer = new JTextArea();
		answer.setBackground(Color.PINK);
		answer.setLineWrap(true);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		answer.setText("Your answers are:");
		answer.setBounds(12, 103, 530, 158);
		panel.add(answer);
		
		frame.add(panel);
		
		frame.setTitle("Prime Number Solutions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(572, 337);
		frame.setVisible(true);
		
		menU(frame);
		}
		
	public String PrimeNoS(int k) {
		int count;
		for(int i = 1; i <= k; i++) {
			count = 0;
			for(int r = 1; r <= i; r++) {
				if(i % r == 0) {
					count++;
					}
				}
			if(count == 2) {
				ansX += i+"  ,  ";
				}
			} 
		return ansX;
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Initiate && !(field.getText().equals(""))) {
			if(answer.getText().equals("Your answers are: ")) {
				input = field.getText();
				inputNo = Integer.parseInt(input); 
				answer.setText("Your answers are: "+(PrimeNoS(inputNo)));
				ansX="";
				}
			else if(!(answer.getText().equals("Your answers are: "))) {
				answer.setText("Your answers are: ");
				input = field.getText();
				inputNo = Integer.parseInt(input); 
				answer.setText("Your answers are: "+(PrimeNoS(inputNo)));
				ansX="";
				}
			}
		if(e.getSource() == close) {
			frame.dispose(); 
			}
		if(e.getSource() == mainMen) {
			frame.dispose(); 
			MenuScreen ob = new MenuScreen();
			}
		}
	}