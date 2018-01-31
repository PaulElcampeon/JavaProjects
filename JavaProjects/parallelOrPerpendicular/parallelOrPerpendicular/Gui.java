package parallelOrPerpendicular;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener{
	
	private JPanel panel = new JPanel();
	private JLabel instructions = new JLabel("Please enter the equations of your lines below with y as the subject");
	private JLabel equation1Label = new JLabel("Equation 1:");
	private JLabel equation2Label = new JLabel("Equation 2:");
	private JTextField equation1 = new JTextField(10);
	private JTextField equation2 = new JTextField(10);
	private JButton initiate = new JButton("INITIATE");
	private JLabel answer = new JLabel("Your answer will appear here");
	private GridBagConstraints gbc = new GridBagConstraints();
	
	public Gui() {
	
		panel.setLayout(new GridBagLayout());
	
		gbc.insets = new Insets(10,10,10,10);
		gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		instructions.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(instructions, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		equation1Label.setFont(new Font("Tahoma", Font.BOLD, 25));
		equation1Label.setToolTipText("e.g y=5x+4 or y=(2/3)x + 4 for fractions");
		panel.add(equation1Label, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
		equation1.setFont(new Font("Tahoma", Font.BOLD, 20));
		equation1.setToolTipText("e.g y=5x+4 or y=(2/3)x + 4 for fractions");
		panel.add(equation1, gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.CENTER;
		equation2Label.setFont(new Font("Tahoma", Font.BOLD, 25));
		equation2Label.setToolTipText("e.g y=5x+4 or y=(2/3)x + 4 for fractions");
		panel.add(equation2Label, gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
		equation2.setFont(new Font("Tahoma", Font.BOLD, 20));
		equation2.setToolTipText("e.g y=5x+4 or y=(2/3)x + 4 for fractions");
		panel.add(equation2, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.CENTER;
		initiate.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(initiate, gbc);
		initiate.addActionListener(this);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 4;
		gbc.fill = GridBagConstraints.CENTER;
        answer.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(answer, gbc);

		super.add(panel);
		
		super.setTitle("Parallel and Perpendicular Lines Test");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(900,300);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
		}


	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == initiate) {
			if(equation1.getText().equals("") || equation2.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "You have left some fields blank");
				}
			else {
				if(!equation1.getText().contains("y=") || !equation2.getText().contains("y=")) {
					JOptionPane.showMessageDialog(this, "You have not set up your equation properly, you are missing some vital components");
					}
				else {
					if(!equation1.getText().contains("x") || !equation2.getText().contains("x")) {
						JOptionPane.showMessageDialog(this, "You have not set up your equation properly, you are missing some vital components");
						}
					else {
						
						//Retrieving input from user
						//also getting ride of parenthesis and trimming the string
						String Equation1 = equation1.getText().replaceAll("[()]", "").trim();
						String Equation2 = equation2.getText().replaceAll("[()]", "").trim();
						System.out.println(Equation1+" "+Equation2);
						
						//Help us to get the index of the gradient and and whether it is positive or negative 
						int positionOfGradient1 = Equation1.indexOf("x") - 1;
						int positionOfequal1 = Equation1.indexOf("=");
						int positionOfGradient2 = Equation2.indexOf("x") - 1;
						int positionOfequal2 = Equation1.indexOf("=");
						System.out.println(positionOfGradient1+" "+positionOfGradient2);
						
						//create a new string that includes the gradient and the value beside it just in case it is a negative value
						String grad1 = Equation1.substring((positionOfequal1+1), positionOfGradient1+1);
						String grad2 = Equation2.substring((positionOfequal2+1), positionOfGradient2+1);
						System.out.println(grad1+" "+grad2);
						
						//setting up variables for use in the code below
						float numericalValueOfGrad1;
						float numericalValueOfGrad2; 
						
						//If user has inputed "/" to signify a fraction this is the code to deal with it
						if(grad1.contains("/")) {
							
							//code to locate the index position of the "/" and divide the number to the left by the number to the right of the /
							//converting those values from strings to floats
							int positionOfDivide = grad1.indexOf("/");
							float a = Float.parseFloat(Character.toString(grad1.charAt(positionOfDivide-1)));
							float b = Float.parseFloat(Character.toString(grad1.charAt(positionOfDivide+1)));
							numericalValueOfGrad1 = a/b;
							if(grad1.contains("-")) {
								numericalValueOfGrad1 *= -1;
								System.out.println("Equation 1 contained -");
								}
							}
						else {
							numericalValueOfGrad1 = Float.parseFloat(grad1); 
							}
						
						//If user has inputed "/" to signify a fraction this is the code to deal with it
						if(grad2.contains("/")) {
						
							//code to locate the index position of the "/" and divide the number to the left by the number to the right of the /
							//converting those values from strings to floats
							int positionOfDivide = grad2.indexOf("/");
							float a = Float.parseFloat(Character.toString(grad2.charAt(positionOfDivide-1)));
							float b = Float.parseFloat(Character.toString(grad2.charAt(positionOfDivide+1)));
							numericalValueOfGrad2 = a/b;
							if(grad2.contains("-")) {
								numericalValueOfGrad2 *=-1;
								System.out.println("Equation 2 contained -");
								}
							}
						else {
							numericalValueOfGrad2 = Float.parseFloat(grad2); 
							}
	
						//method to test if two lines are perpendicular or parallel
						//returns a string thus which we set the label answer to display
						answer.setText(test(numericalValueOfGrad1,numericalValueOfGrad2));
						}
					}
				}
			}
		}
	
	//method to test if both lines are perpendicular or parallel
	public String test(float gradient1, float gradient2) {
		String ans;
		if((gradient1 * gradient2) == -1) {
			ans = "Your lines are perpendicular";
			return ans;
			}
		else if(gradient1 == gradient2) {
			ans = "Your lines are parallel";
			return ans;
			}
		ans = "Your lines are neither perpendicular or parallel";
		return ans;
		}
	}