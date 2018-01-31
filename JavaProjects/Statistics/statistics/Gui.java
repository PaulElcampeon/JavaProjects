package statistics;

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
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
