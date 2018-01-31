package nthTerm;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*This program finds the nth term of a linear sequence
 * The program requests the user to input 3 consecutive 
 * numbers from a linear sequence in order to find the nth term*/

public class Gui extends JPanel implements ActionListener {
	
	private JLabel title;
	private JLabel instructions;
	private JTextField n1;
	private JTextField n2;
	private JTextField n3;
	private Button initiate;
	private JLabel answer;
	private int number1;
	private int number2;
	private int number3;
	
	public Gui() {
		
		setLayout(null);
		
		title = new JLabel("nth term");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.PLAIN, 30));
		title.setBounds(161, 11, 122, 26);
		add(title);
		
		instructions = new JLabel("Enter the first 3 terms in your sequence");
		instructions.setHorizontalAlignment(SwingConstants.CENTER);
		instructions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		instructions.setBounds(44, 48, 357, 30);
		add(instructions);
		
		n1 = new JTextField();
		n1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		n1.setBounds(97, 89, 50, 50);
		add(n1);
		
		n2 = new JTextField();
		n2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		n2.setBounds(187, 89, 50, 50);
		add(n2);
		
		n3 = new JTextField();
		n3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		n3.setBounds(277, 89, 50, 50);
		add(n3);
		
		initiate = new Button("Initiate");
		initiate.setBackground(Color.LIGHT_GRAY);
		initiate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		initiate.setBounds(136,159,147,50);
		initiate.addActionListener(this);
		add(initiate);
		
		answer = new JLabel("Your answer will appear here");
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		answer.setBounds(20, 217, 406, 50);
		add(answer);
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		number1 = Integer.parseInt(n1.getText());
		number2 = Integer.parseInt(n2.getText());
		number3 = Integer.parseInt(n3.getText());
		
		if(event.getSource() == initiate) {
			answer.setText(nthTerm(number1,number2,number3));
			}
		}
	
	public String nthTerm(int a, int b, int c) {
		int diff1 = b-a;
		int diff2 = c-b;
		
		if(diff1 == diff2) {
			int single = a - diff1;
			String  ans;
			
			if(single < 0) {
				ans = diff1+"n "+single; 
				}
			else {
				ans = diff1+"n + "+single;
				}
			return ans;
			}
		else if(diff1 != diff2) {
			JOptionPane.showMessageDialog(this, "The three numbers you have entered show that this sequence is not arthimetic");
			}
		return null;
		}
	}