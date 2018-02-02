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
	
	private JPanel panel = new JPanel();
	
	//Label for each book
	private JLabel MBD = new JLabel("<html>Moby Dick<br>(1851)<br>£15.20</html>");
	private JLabel TTPMS = new JLabel("<html>The Terrible Privacy of Maxwell Sim<br>(2010)<br>£13.14</html");
	private JLabel SLWW = new JLabel("<html>Still Life With Woodpecker<br>(1980)<br>£11.05</html");
	private JLabel SM = new JLabel("<html>Sleeping Murder<br>(1976)<br>£10.24</html");
	private JLabel TMB = new JLabel("<html>Three Men in a Boat<br>(1889)<br>£12.87</html");
	private JLabel TTM = new JLabel("<html>The Time Machine<br>(1895)<br>£10.43</html");
	private JLabel TCoS = new JLabel("<html>The Caves of Steel<br>(1954)<br>£8.12</html");
	private JLabel IToIF = new JLabel("<html>Idle Thoughts of an Idle Fellow<br>(1886)<br>£7.32</html");
	private JLabel CC = new JLabel("<html>A Christmas Carol<br>(1843)<br>£4.23</html");
	private JLabel T2C = new JLabel("<html>A Tale of Two Cities<br>(1859)<br>£6.32</html");
	private JLabel GE = new JLabel("<html>Great Expectations<br>(1861)<br>£13.21</html");
	
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
	
	//Label to display cart total
	private JLabel totalLabel = new JLabel("Total:");
	
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
		
		super.add(panel);
		
		super.setTitle("Book Store");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(1300, 700);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
