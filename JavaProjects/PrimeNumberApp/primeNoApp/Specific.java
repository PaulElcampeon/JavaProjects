package primeNoApp;

import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Specific extends MenuBar implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel question;
	private JLabel answer;
	private JTextField field;
	private JButton initiate;
	private String ans;
	private int ansX;
	
	public Specific(){
		
		frame = new JFrame();
		
		panel = new JPanel();
		
		panel.setLayout(null);
		
		initiate = new JButton("Initiate");
		initiate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		initiate.setBounds(306,55,102,38);
		initiate.addActionListener(this);
		panel.add(initiate);
		
		question = new JLabel("Please enter the number you want to check is a prime number below");
		question.setFont(new Font("Tahoma", Font.PLAIN, 18));
		question.setBounds(12, 13, 566, 25);
		panel.add(question);

		answer = new JLabel("                ");
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		answer.setBounds(89, 106, 400, 32);
		panel.add(answer);

		field = new JTextField(20);
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setFont(new Font("Tahoma", Font.PLAIN, 18));
		field.setBounds(167, 55, 127, 38);
		panel.add(field);
		
		frame.add(panel);
		
		frame.setTitle("Prime Number Solutions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(608, 226);
		frame.setVisible(true);
		
		menU(frame);
		
	}
	
	public String PrimeNo(int R) {
		int count = 0;
		String S;
		for(int i = 1; i <= R; i++) {
			if(R % i == 0) {
				count++;
				}
			}
		if(count == 2) {
			S = R+ " is a prime number";  
			}
		else
		{
			S = R+" is not a prime number";
			}
		return S;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == initiate) {
			ans = field.getText();
			ansX = Integer.parseInt(ans);
			PrimeNo(ansX);
			answer.setText(PrimeNo(ansX));
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
