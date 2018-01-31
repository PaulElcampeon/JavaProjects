package statistics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;

public class Gui extends JFrame implements ActionListener{

	JPanel panel = new JPanel();
	JLabel instructions;
	JTextField data;
	JButton mean;
	JButton median;
	JButton mode;
	JButton range;
	JButton lq;
	JButton uq;
	JButton var;
	JButton std;
	JLabel answer;
	
	public Gui() {
		
		panel.setLayout(null);
		
		instructions = new JLabel("Enter your values seperated by a comma");
		instructions.setHorizontalAlignment(JLabel.CENTER);
		instructions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		instructions.setBounds(43, 11, 478, 30);
		panel.add(instructions);
		
		data = new JTextField();
		data.setFont(new Font("Tahoma", Font.PLAIN, 20));
		data.setBounds(22, 59, 536, 41);
		panel.add(data);
		
		mean = new JButton("MEAN");
		mean.setFont(new Font("Tahoma", Font.BOLD, 20));
		mean.setBounds(41,128,121,41);
		mean.addActionListener(this);
		panel.add(mean);
		
		median = new JButton("MEDIAN");
		median.setFont(new Font("Tahoma", Font.BOLD, 20));
		median.setBounds(172,128,121,41);
		median.addActionListener(this);
		panel.add(median);
		
		mode = new JButton("MODE");
		mode.setFont(new Font("Tahoma", Font.BOLD, 20));
		mode.setBounds(303,128,121,41);
		mode.addActionListener(this);
		panel.add(mode);
		
		range = new JButton("RANGE");
		range.setFont(new Font("Tahoma", Font.BOLD, 20));
		range.setBounds(434,128,121,41);
		range.addActionListener(this);
		panel.add(range);
		
		lq = new JButton("LOWER QUARTILE");
		lq.setFont(new Font("Tahoma", Font.BOLD, 20));
		lq.setBounds(43,188,234,41);
		lq.addActionListener(this);
		panel.add(lq);
		
		uq = new JButton("UPPER QUARTILE");
		uq.setFont(new Font("Tahoma", Font.BOLD, 20));
		uq.setBounds(283,188,275,41);
		uq.addActionListener(this);
		panel.add(uq);
		
		var = new JButton("VARIANCE");
		var.setFont(new Font("Tahoma", Font.BOLD, 20));
		var.setBounds(46,252,193,41);
		var.addActionListener(this);
		panel.add(var);
		
		std = new JButton("STANDARD DEVIATION");
		std.setFont(new Font("Tahoma", Font.BOLD, 20));
		std.setBounds(249,252,309,41);
		std.addActionListener(this);
		panel.add(std);
		
		answer = new JLabel("Your answer will appear here");
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		answer.setBounds(22, 329, 536, 41);
		panel.add(answer);
		
		super.add(panel);
		
		super.setTitle("Statistics - Averages");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(600,450);
		super.setResizable(false);
		super.setVisible(true);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Methods method = new Methods();
		String DATA = data.getText().trim();
		
		if(DATA.matches(".*[a-z].*") || DATA.matches("")) {
			JOptionPane.showMessageDialog(this, "You cannot have letters in your fields please correct this.");
		}
		
		else {

		String[] DATAnum = DATA.split("[,]");
		
		if(checker1(DATAnum) == true ) {
			JOptionPane.showMessageDialog(this, "You have left some blank spaces, please correct this.");
		}
		
		else {
		
		double[] dataNum = new double[DATAnum.length];
		
		for(int i = 0; i<DATAnum.length; i++) {
			dataNum[i] = Double.parseDouble(DATAnum[i]);
		}
		
		if(event.getSource() == mean) {
			answer.setText("The mean is "+method.meaN(dataNum));
		}
		
		if(event.getSource() == median) {
			answer.setText("The median is "+method.mediaN(dataNum));
		}
		
		if(event.getSource() == mode) {
			answer.setText("The mode is "+method.modE(dataNum));
		}
		
		if(event.getSource() == range) {
			answer.setText("The range is "+method.rangE(dataNum));
		}
		
		if(event.getSource() == lq) {
			answer.setText("The Lower Quartile is "+method.LowerQuarT(dataNum));
		}
	
		if(event.getSource() == uq) {
			answer.setText("The Upper Quartile is "+method.UpperQuarT(dataNum));
		}
		
		if(event.getSource() == var) {
			answer.setText("The variance is "+method.variancE(dataNum));
		}
		
		if(event.getSource() == std) {
			answer.setText("The standard deviation is "+method.StandardDeV(dataNum));
			}
		}
	}
	}

		public static boolean checker1(String[] a) {

			for (String s: a) {
		        if (s.equals("")) {
		            return true;
		        }
		}
		return false;
	}
}