package areaANDcircumference;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel instructions;
	private JLabel imgLabel;
	private JTextField radius;
	private JLabel answer;
	private JButton area;
	private JButton circumference;
	BufferedImage image;
	
	public GUI() {
	
		panel = new JPanel();
		
		panel.setLayout(null);
		
		instructions = new JLabel("Please enter the value of the radius");
		instructions.setHorizontalAlignment(SwingConstants.CENTER);
		instructions.setFont(new Font("Tahoma", Font.BOLD, 18));
		instructions.setBounds(44, 11, 356, 36);
		panel.add(instructions);
		
		radius = new JTextField();
		radius.setHorizontalAlignment(SwingConstants.CENTER);
		radius.setBackground(Color.LIGHT_GRAY);
		radius.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radius.setBounds(160,157,70,25);
		panel.add(radius);
		
		imgLabel = new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("areaANDcircumference/circleimg.jpg")));
		imgLabel.setBounds(54, 58, 203, 183);
		panel.add(imgLabel);
		
		area = new JButton("AREA");
		area.setFont(new Font("Tahoma", Font.BOLD, 12));
		area.setBounds(300, 78, 157, 50);
		area.addActionListener(this);
		panel.add(area);
		
		circumference = new JButton("CIRCUMFERENCE");
		circumference.setFont(new Font("Tahoma", Font.BOLD, 12));
		circumference.setBounds(300, 150, 157, 50);
		circumference.addActionListener(this);
		panel.add(circumference);
		
		answer = new JLabel("Your answer will appear here");
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		answer.setBounds(10, 265, 447, 50);
		panel.add(answer);
		
		super.add(panel);
		
		super.setTitle("Area and Circumference");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500,400);
		super.setResizable(false);
		super.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		Methods methods = new Methods();
		
		String rad = radius.getText();

		if(!(rad.equals("")) || !(rad.matches(".*[a-zA-Z].*"))) {
			if(event.getSource() == area) {
				double Rad = Double.parseDouble(rad);
				answer.setText("Area of your circle is "+ methods.Area(Rad));
			}
	
			if(event.getSource() == circumference) {
				double Rad = Double.parseDouble(rad);
				answer.setText("Circumference of your circle is "+ methods.Circumference(Rad));
			}
		}
		else {
			JOptionPane.showMessageDialog(this, "You need to enter a numberical value, please correct this");
			}
		}
	}
