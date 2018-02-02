package bookStore;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
import java.awt.SystemColor;

public class BookShop extends JFrame implements ActionListener{

	//This variable is going to be used to add the total of the items in the shopping cart
	private double total = 0;
	
	//Label to display cart total
	private JLabel totalLabel = new JLabel("Total:");

	private JPanel panel = new JPanel();
	
	//Label for each book
	private JLabel MBD = new JLabel("<html>Moby Dick<br>(1851)<br>�15.20</html>");
	private JLabel TTPMS = new JLabel("<html>The Terrible Privacy of Maxwell Sim<br>(2010)<br>�13.14</html");
	private JLabel SLWW = new JLabel("<html>Still Life With Woodpecker<br>(1980)<br>�11.05</html");
	private JLabel SM = new JLabel("<html>Sleeping Murder<br>(1976)<br>�10.24</html");
	private JLabel TMB = new JLabel("<html>Three Men in a Boat<br>(1889)<br>�12.87</html");
	private JLabel TTM = new JLabel("<html>The Time Machine<br>(1895)<br>�10.43</html");
	private JLabel TCoS = new JLabel("<html>The Caves of Steel<br>(1954)<br>�8.12</html");
	private JLabel IToIF = new JLabel("<html>Idle Thoughts of an Idle Fellow<br>(1886)<br>�7.32</html");
	private JLabel CC = new JLabel("<html>A Christmas Carol<br>(1843)<br>�4.23</html");
	private JLabel T2C = new JLabel("<html>A Tale of Two Cities<br>(1859)<br>�6.32</html");
	private JLabel GE = new JLabel("<html>Great Expectations<br>(1861)<br>�13.21</html");
	
	//Add and Remove Buttons for each book
	private JButton addMBD = new JButton("Add");
	private JButton removeMBD = new JButton("Remove");
	private JButton addTTPMS = new JButton("Add");
	private JButton removeTTPMS = new JButton("Remove");
	private JButton addSLWW = new JButton("Add");
	private JButton removeSLWW = new JButton("Remove");
	private JButton addSM = new JButton("Add");
	private JButton removeSM = new JButton("Remove");
	private JButton addTMB = new JButton("Add");
	private JButton removeTMB = new JButton("Remove");
	private JButton addTTM = new JButton("Add");
	private JButton removeTTM = new JButton("Remove");
	private JButton addTCoS = new JButton("Add");
	private JButton removeTCoS = new JButton("Remove");
	private JButton addIToIF = new JButton("Add");
	private JButton removeIToIF = new JButton("Remove");
	private JButton addCC = new JButton("Add");
	private JButton removeCC = new JButton("Remove");
	private JButton addT2C = new JButton("Add");
	private JButton removeT2C = new JButton("Remove");
	private JButton addGE = new JButton("Add");
	private JButton removeGE = new JButton("Remove");
	
	//Button to see shopping cart 
	private JButton ShopCart = new JButton("Shopping Cart");
	
	//Label Dimensions
	private int labelwidth = 150;
	private int labelheight = 100;
	
	//Label coordinates
	private int row1y = 50;
	private int row2y = 250;
	private int row3y = 400;
	private int column1x = 50;
	private int column2x = 350;
	private int column3x = 650;
	private int column4x = 950;
	
	//Button Dimensions
	private int btnWidth = 90;
	private int btnHeight = 20;
	
	//Button coordinates for add and remove
	private int addbtnRow1y = 150;
	private int addbtnRow2y = 330;
	private int addbtnRow3y = 470;
	private int addbtnColumn1x = 50;
	private int addbtnColumn2x = 350;
	private int addbtnColumn3x = 650;
	private int addbtnColumn4x = 950;
	
	//Button coordinates for remove
	private int removebtnRow1y = 175;
	private int removebtnRow2y = 355;
	private int removebtnRow3y = 495;
	private int removebtnColumn1x = 50;
	private int removebtnColumn2x = 350;
	private int removebtnColumn3x = 650;
	private int removebtnColumn4x = 950;
	
	//Creating book objects for each book
	BookMaker MBDbook = new BookMaker("Moby Dick", 1851, 15.20);
	BookMaker TTPMSbook = new BookMaker("The Terrible Privacy of Maxwell Sim", 2010, 13.14);
	BookMaker SLWWbook = new BookMaker("Still Life With Woodpecker", 1980, 11.05);
	BookMaker SMbook = new BookMaker("Sleeping Murder", 1976, 10.24);
	BookMaker TMBbook = new BookMaker("Three Men in a Boat", 1889, 12.87);
	BookMaker TTMbook = new BookMaker("The Time Machine", 1895, 10.43);
	BookMaker TCoSbook = new BookMaker("The Caves of Steel", 1954, 8.12);
	BookMaker IToIFbook = new BookMaker("Idle Thoughts of an Idle Fellow", 1886, 7.32);
	BookMaker CCbook = new BookMaker("A Christmas Carol", 1843, 4.23);
	BookMaker T2Cbook = new BookMaker("A Tale of Two Cities", 1859, 6.32);
	BookMaker GEbook = new BookMaker("Great Expectations", 1861, 13.21);

			
	public BookShop() {
		
		/*Going to use absolute positioning although I understand 
		 * this can cause problems when resizing window thus 
		 * i have disabled window resizing function*/
		panel.setLayout(null);
		
		MBD.setVerticalAlignment(SwingConstants.TOP);
		MBD.setHorizontalAlignment(SwingConstants.LEFT);
		MBD.setBounds(column1x, row1y, labelwidth, labelheight);
		MBD.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		TTPMS.setVerticalAlignment(SwingConstants.TOP);
		TTPMS.setHorizontalAlignment(SwingConstants.LEFT);
		TTPMS.setBounds(column2x, row1y, labelwidth, labelheight);
		TTPMS.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		SLWW.setVerticalAlignment(SwingConstants.TOP);
		SLWW.setHorizontalAlignment(SwingConstants.LEFT);
		SLWW.setBounds(column3x, row1y, labelwidth, labelheight);
		SLWW.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		TMB.setVerticalAlignment(SwingConstants.TOP);
		TMB.setHorizontalAlignment(SwingConstants.LEFT);
		TMB.setBounds(column4x, row1y, labelwidth, labelheight);
		TMB.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		TTM.setVerticalAlignment(SwingConstants.TOP);
		TTM.setHorizontalAlignment(SwingConstants.LEFT);
		TTM.setBounds(column1x, row2y, labelwidth, labelheight);
		TTM.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		TCoS.setVerticalAlignment(SwingConstants.TOP);
		TCoS.setHorizontalAlignment(SwingConstants.LEFT);
		TCoS.setBounds(column2x, row2y, labelwidth, labelheight);
		TCoS.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		IToIF.setVerticalAlignment(SwingConstants.TOP);
		IToIF.setHorizontalAlignment(SwingConstants.LEFT);
		IToIF.setBounds(column3x, row2y, labelwidth, labelheight);
		IToIF.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		CC.setVerticalAlignment(SwingConstants.TOP);
		CC.setHorizontalAlignment(SwingConstants.LEFT);
		CC.setBounds(column4x, row2y, labelwidth, labelheight);
		CC.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		T2C.setVerticalAlignment(SwingConstants.TOP);
		T2C.setHorizontalAlignment(SwingConstants.LEFT);
		T2C.setBounds(column1x, row3y, labelwidth, labelheight);
		T2C.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		GE.setVerticalAlignment(SwingConstants.TOP);
		GE.setHorizontalAlignment(SwingConstants.LEFT);
		GE.setBounds(column2x, row3y, labelwidth, labelheight);
		GE.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		SM.setVerticalAlignment(SwingConstants.TOP);
		SM.setHorizontalAlignment(SwingConstants.LEFT);
		SM.setBounds(column3x, row3y, labelwidth, labelheight);
		SM.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		panel.add(MBD);
		panel.add(TTPMS);
		panel.add(SLWW);
		panel.add(TMB);
		panel.add(TTM);
		panel.add(TCoS);
		panel.add(IToIF);
		panel.add(CC);
		panel.add(SM);
		panel.add(T2C);
		panel.add(GE);
		
		addMBD.setBounds(addbtnColumn1x, addbtnRow1y, btnWidth, btnHeight);
		addTTPMS.setBounds(addbtnColumn2x, addbtnRow1y, btnWidth, btnHeight);
		addSLWW.setBounds(addbtnColumn3x, addbtnRow1y, btnWidth, btnHeight);
		addTMB.setBounds(addbtnColumn4x, addbtnRow1y, btnWidth, btnHeight);
		addTTM.setBounds(addbtnColumn1x, addbtnRow2y, btnWidth, btnHeight);
		addTCoS.setBounds(addbtnColumn2x, addbtnRow2y, btnWidth, btnHeight);
		addIToIF.setBounds(addbtnColumn3x, addbtnRow2y, btnWidth, btnHeight);
		addCC.setBounds(addbtnColumn4x, addbtnRow2y, btnWidth, btnHeight);
		addSM.setBounds(addbtnColumn1x, addbtnRow3y, btnWidth, btnHeight);
		addT2C.setBounds(addbtnColumn2x, addbtnRow3y, btnWidth, btnHeight);
		addGE.setBounds(addbtnColumn3x, addbtnRow3y, btnWidth, btnHeight);
		
		panel.add(addMBD);
		panel.add(addTTPMS);
		panel.add(addSLWW);
		panel.add(addTMB);
		panel.add(addTTM);
		panel.add(addTCoS);
		panel.add(addIToIF);
		panel.add(addCC);
		panel.add(addSM);
		panel.add(addT2C);
		panel.add(addGE);
		
		removeMBD.setBounds(removebtnColumn1x, removebtnRow1y, btnWidth, btnHeight);
		removeTTPMS.setBounds(removebtnColumn2x, removebtnRow1y, btnWidth, btnHeight);
		removeSLWW.setBounds(removebtnColumn3x, removebtnRow1y, btnWidth, btnHeight);
		removeTMB.setBounds(removebtnColumn4x, removebtnRow1y, btnWidth, btnHeight);
		removeTTM.setBounds(removebtnColumn1x, removebtnRow2y, btnWidth, btnHeight);
		removeTCoS.setBounds(removebtnColumn2x, removebtnRow2y, btnWidth, btnHeight);
		removeIToIF.setBounds(removebtnColumn3x, removebtnRow2y, btnWidth, btnHeight);
		removeCC.setBounds(removebtnColumn4x, removebtnRow2y, btnWidth, btnHeight);
		removeSM.setBounds(removebtnColumn1x, removebtnRow3y, btnWidth, btnHeight);
		removeT2C.setBounds(removebtnColumn2x, removebtnRow3y, btnWidth, btnHeight);
		removeGE.setBounds(removebtnColumn3x, removebtnRow3y, btnWidth, btnHeight);
		
		panel.add(removeMBD);
		panel.add(removeTTPMS);
		panel.add(removeSLWW);
		panel.add(removeTMB);
		panel.add(removeTTM);
		panel.add(removeTCoS);
		panel.add(removeIToIF);
		panel.add(removeCC);
		panel.add(removeSM);
		panel.add(removeT2C);
		panel.add(removeGE);
		
		ShopCart.setBounds(910, 420, 200, 100);
		ShopCart.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		panel.add(ShopCart);
	
		totalLabel.setBounds(0, 580, 500, 100);
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		panel.add(totalLabel);
		
		//Action listeners
		addMBD.addActionListener(this);
		addTTPMS.addActionListener(this);
		addSLWW.addActionListener(this);
		addTMB.addActionListener(this);
		addTTM.addActionListener(this);
		addTCoS.addActionListener(this);
		addIToIF.addActionListener(this);
		addCC.addActionListener(this);
		addSM.addActionListener(this);
		addT2C.addActionListener(this);
		addGE.addActionListener(this);
		
		removeMBD.addActionListener(this);
		removeTTPMS.addActionListener(this);
		removeSLWW.addActionListener(this);
		removeTMB.addActionListener(this);
		removeTTM.addActionListener(this);
		removeTCoS.addActionListener(this);
		removeIToIF.addActionListener(this);
		removeCC.addActionListener(this);
		removeSM.addActionListener(this);
		removeT2C.addActionListener(this);
		removeGE.addActionListener(this);
		
		ShopCart.addActionListener(this);
		
		//adding my panel to frame
		super.add(panel);
		
		super.setTitle("Book Store");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(1200, 700);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
