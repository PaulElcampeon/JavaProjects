package primeNoApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MenuBar implements ActionListener{

		public JMenuItem close;
		public JMenuItem mainMen;
		public JMenu help;
		public JMenu File;
		public JMenuBar menuBar;
		 
		public void menU(JFrame J) {
		 
		menuBar = new JMenuBar();
		 
		File = new JMenu("File");
		menuBar.add(File);

		help = new JMenu("Help");
		menuBar.add(help);
		 
		mainMen = new JMenuItem("Main Menu");
		File.add(mainMen);
		mainMen.addActionListener(this);
		 
		close = new JMenuItem("Close");
		File.add(close);
		close.addActionListener(this);
		 
		J.setJMenuBar(menuBar);
		menuBar.setBorder(new BevelBorder(BevelBorder.RAISED)); 
		
		}


		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 
		}

		 
		}