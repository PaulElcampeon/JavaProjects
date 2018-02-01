package primeNoApp;

import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*This programme will either list the prime numbers below a given number 
 * or specify whether a number is a prime number or not*/
public class MenuScreen extends MenuBar implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel intro;
	private JButton List;
	private JButton Specific;
	
	public MenuScreen() {
		
		frame = new JFrame();
		
		panel = new JPanel();
		
		panel.setLayout(null);
		
		intro = new JLabel("Welcome to Prime Number Solutions");
		intro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		intro.setBounds(23, 29, 336, 25);
		panel.add(intro);
		
		List = new JButton("List");
		List.setFont(new Font("Tahoma", Font.BOLD, 16));
		List.setBounds(57, 67, 100, 38);
		List.addActionListener(this);
		panel.add(List);

		Specific = new JButton("Specific");
		Specific.setFont(new Font("Tahoma", Font.BOLD, 16));
		Specific.setBounds(201, 67, 100, 38);
		Specific.addActionListener(this);
		panel.add(Specific);
		
		frame.add(panel);
		
		frame.setTitle("Prime Number Solutions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 209);
		frame.setVisible(true);
		
		menU(frame);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == List) {
		frame.dispose();
		List obj = new List();
		}
		if(e.getSource() == Specific) {
		frame.dispose();
		Specific obj = new Specific();
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
