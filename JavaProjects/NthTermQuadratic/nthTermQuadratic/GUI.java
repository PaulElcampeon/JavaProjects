package nthTermQuadratic;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener{

	private JPanel panel;
	private JLabel imgLabel;
	private BufferedImage img;
	private JLabel instructions;
	private JTextField data;
	private JButton nthterm;
	private JButton clear;
	private JLabel answer;
		
	public GUI() {
		
		panel = new JPanel();
		
		panel.setLayout(null);
		
		imgLabel = new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("nthTermQuadratiC/title.jpg")));
		imgLabel.setBounds(0, 0, 500, 30);
		panel.add(imgLabel);
		
		instructions = new JLabel("Please enter each value seperated with a comma");
		instructions.setHorizontalAlignment(SwingConstants.CENTER);
		instructions.setFont(new Font("Tahoma",Font.PLAIN, 20));
		instructions.setBounds(10, 48, 464, 30);
		panel.add(instructions);
		
		data = new JTextField();
		data.setHorizontalAlignment(SwingConstants.CENTER);
		data.setFont(new Font("Tahoma",Font.PLAIN, 20));
		data.setBounds(10, 89, 464, 50);
		panel.add(data);
		
		nthterm = new JButton("nth Term");
		nthterm.setFont(new Font("Tahoma",Font.PLAIN, 25));
		nthterm.setBounds(100, 149, 139, 44);
		nthterm.addActionListener(this);
		panel.add(nthterm);
		
		clear = new JButton("Clear");
		clear.setFont(new Font("Tahoma",Font.PLAIN, 25));
		clear.setBounds(250, 149, 139, 44);
		clear.addActionListener(this);
		panel.add(clear);
		
		answer = new JLabel("Your answer will appear here");
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		answer.setBounds(10, 200, 464, 50);
		panel.add(answer);
		
		super.add(panel);
		
		super.setTitle("");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500, 300);
		super.setResizable(false);
		super.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent event) {
		Methods methods = new Methods();
		
		if(event.getSource() == nthterm) {
			String DataVals = data.getText().trim();
			if(DataVals.matches(".*[a-zA-Z].*") || DataVals.equals("")) {
				JOptionPane.showMessageDialog(this, "You have no values or have included letters in your values, please correct this");
				}
			else {
				String[] DATAVALS = DataVals.split("[,]");
				if(methods.checker1(DATAVALS) == false) {
					JOptionPane.showMessageDialog(this, "You have left blank spaces, please correct this");
					}
				else {
					double[] dataVALS = new double[DATAVALS.length];
					for(int i = 0; i < DATAVALS.length; i++) {
						dataVALS[i] = Double.parseDouble(DATAVALS[i]);
						}
					double[] ans = methods.calculations(dataVALS);
					answer.setFont(new Font("Tahoma", Font.PLAIN, 30));
					if(ans[1]>0 && ans[2]>0) {
						answer.setText(ans[0]+"n\u00B2 + "+ans[1]+"n + "+ans[2]);
						}
					else if(ans[1]<0 && ans[2]<0) {
						answer.setText(ans[0]+"n\u00B2 "+ans[1]+"n "+ans[2]); 
						}
					else if(ans[1]<0 && ans[2]>0) {
						answer.setText(ans[0]+"n\u00B2 "+ans[1]+"n + "+ans[2]); 
						}
					else if(ans[1]>0 && ans[2]<0) {
						answer.setText(ans[0]+"n\u00B2 + "+ans[1]+"n "+ans[2]); 
						}
					else if(ans[1]>0 && ans[2]==0) {
						answer.setText(ans[0]+"n\u00B2 + "+ans[1]+"n"); 
						}
					else if(ans[1]==0 && ans[2]>0) {
						answer.setText(ans[0]+"n\u00B2 + "+ans[2]); 
						}
					else if(ans[1]==0 && ans[2]<0) {
						answer.setText(ans[0]+"n\u00B2 "+ans[2]); 
						}
					else if(ans[1]<0 && ans[2]==0) {
						answer.setText(ans[0]+"n\u00B2 "+ans[1]+"n"); 
						}
					else if(ans[1] == 0 && ans[2]==0) {
						answer.setText(ans[0]+"n\u00B2"); 
						}
					} 
				}
			}
		if(event.getSource() == clear) {
			answer.setFont(new Font("Tahoma", Font.PLAIN, 18));
			answer.setText("Your answer will appear here");
			data.setText("");
			}
		}
	}
