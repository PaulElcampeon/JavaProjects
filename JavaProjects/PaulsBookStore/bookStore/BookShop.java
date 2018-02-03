package bookStore;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class BookShop extends JFrame implements ActionListener{

	private JLabel title = new JLabel("Pauls Book Store");
	//This variable is going to be used to add the total of the items in the shopping cart
	private double total = 0;
	
	//Label to display cart total
	private JLabel totalLabel = new JLabel("Total:");

	private JPanel panel = new JPanel();
	
	//Label for each book
	private JLabel MBD = new JLabel("<html>Moby Dick<br>(1851)<br>£15.20</html>");
	private JLabel TTPMS = new JLabel("<html>The Terrible Privacy of Maxwell Sim<br>(2010)<br>£13.14<br></html");
	private JLabel SLWW = new JLabel("<html>Still Life With Woodpecker<br>(1980)<br>£11.05</html");
	private JLabel SM = new JLabel("<html>Sleeping Murder<br>(1976)<br>£10.24</html");
	private JLabel TMB = new JLabel("<html>Three Men in a Boat<br>(1889)<br>£12.87</html");
	private JLabel TTM = new JLabel("<html>The Time Machine<br>(1895)<br>£10.43</html");
	private JLabel TCoS = new JLabel("<html>The Caves of Steel<br>(1954)<br>£8.12</html");
	private JLabel IToIF = new JLabel("<html>Idle Thoughts of an Idle Fellow<br>(1886)<br>£7.32</html");
	private JLabel CC = new JLabel("<html>A Christmas Carol<br>(1843)<br>£4.23</html");
	private JLabel T2C = new JLabel("<html>A Tale of Two Cities<br>(1859)<br>£6.32</html");
	private JLabel GE = new JLabel("<html>Great Expectations<br>(1861)<br>£13.21</html");
	
	//Add Buttons for each book
	private JButton addMBD = new JButton("Add");
	private JButton addTTPMS = new JButton("Add");
	private JButton addSLWW = new JButton("Add");
	private JButton addSM = new JButton("Add");
	private JButton addTMB = new JButton("Add");
	private JButton addTTM = new JButton("Add");
	private JButton addTCoS = new JButton("Add");
	private JButton addIToIF = new JButton("Add");
	private JButton addCC = new JButton("Add");
	private JButton addT2C = new JButton("Add");
	private JButton addGE = new JButton("Add");
	
	//Label Dimensions
	private int labelwidth = 150;
	private int labelheight = 100;
	
	//Label coordinates
	private int row1y = 90;
	private int row2y = 250;
	private int row3y = 400;
	private int column1x = 50;
	private int column2x = 300;
	private int column3x = 550;
	private int column4x = 800;
	
	//Button Dimensions
	private int btnWidth = 90;
	private int btnHeight = 20;
	
	//Button coordinates for adding items
	private int addbtnRow1y = 190;
	private int addbtnRow2y = 330;
	private int addbtnRow3y = 470;
	private int addbtnColumn1x = column1x;
	private int addbtnColumn2x = column2x;
	private int addbtnColumn3x = column3x;
	private int addbtnColumn4x = column4x;
	
	//Creating book objects for each book
	
	private ArrayList<BookMaker> shoppingcart = new ArrayList<BookMaker>();
	
	private BookMaker MBDbook = new BookMaker("Moby Dick", 1851, 15.20,"");
	private BookMaker TTPMSbook = new BookMaker("The Terrible Privacy of Maxwell Sim", 2010, 13.14,"(10% off)");
	private BookMaker SLWWbook = new BookMaker("Still Life With Woodpecker", 1980, 11.05,"");
	private BookMaker SMbook = new BookMaker("Sleeping Murder", 1976, 10.24,"");
	private BookMaker TMBbook = new BookMaker("Three Men in a Boat", 1889, 12.87,"");
	private BookMaker TTMbook = new BookMaker("The Time Machine", 1895, 10.43,"");
	private BookMaker TCoSbook = new BookMaker("The Caves of Steel", 1954, 8.12,"");
	private BookMaker IToIFbook = new BookMaker("Idle Thoughts of an Idle Fellow", 1886, 7.32,"");
	private BookMaker CCbook = new BookMaker("A Christmas Carol", 1843, 4.23,"");
	private BookMaker T2Cbook = new BookMaker("A Tale of Two Cities", 1859, 6.32,"");
	private BookMaker GEbook = new BookMaker("Great Expectations", 1861, 13.21,"");
	
	//Cart Display
    private JTextArea cartdisplay = new JTextArea("Cart Items", 20, 0);  
    private JScrollPane scrollPane = new JScrollPane(cartdisplay); 
    private String cartitems="";

    //Discount parameters
	private double discount1 = 0.9;
	private double discount2 = 0.95;
	
	//Clear Button
	private JButton clear = new JButton("CLEAR");
	
	public BookShop() {
		
		/*Going to use absolute positioning although I understand 
		 * this can cause problems when resizing window thus 
		 * i have disabled window resizing function*/
		panel.setLayout(null);
		
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		title.setBounds(0, 0, 1100, 70);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel.add(title);
		
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
		
		SM.setVerticalAlignment(SwingConstants.TOP);
		SM.setHorizontalAlignment(SwingConstants.LEFT);
		SM.setBounds(column1x, row3y, labelwidth, labelheight);
		SM.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		T2C.setVerticalAlignment(SwingConstants.TOP);
		T2C.setHorizontalAlignment(SwingConstants.LEFT);
		T2C.setBounds(column2x, row3y, labelwidth, labelheight);
		T2C.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		GE.setVerticalAlignment(SwingConstants.TOP);
		GE.setHorizontalAlignment(SwingConstants.LEFT);
		GE.setBounds(column3x, row3y, labelwidth, labelheight);
		GE.setFont(new Font("Tahoma", Font.BOLD, 15));
		
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
		
		clear.setBounds(40, 14, 100, 42);
		clear.setFont(new Font("Tahoma", Font.BOLD, 20));
	
		panel.add(clear);
		
		cartdisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(750, 400, 350, 250);
	
		panel.add(scrollPane);
		
		totalLabel.setBounds(0, 580, 833, 85);
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
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
		clear.addActionListener(this);
				
		//adding my panel to frame
		super.add(panel);
		
		super.setTitle("Book Store");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(1150, 700);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
				
	}
	
		
	
	@Override
	public void actionPerformed(ActionEvent event) {

		if(event.getSource() == addMBD) {
			addBTN(MBDbook, shoppingcart);
		}
		
		if(event.getSource() == addTTPMS) {
			addBTN(TTPMSbook, shoppingcart);
		}

		if(event.getSource() == addSLWW) {
			addBTN(SLWWbook, shoppingcart);
		}
		
		if(event.getSource() == addTMB) {
			addBTN(TMBbook, shoppingcart);
		}
		
		if(event.getSource() == addTTM) {
			addBTN(TTMbook, shoppingcart);
		}

		if(event.getSource() == addTCoS) {
			addBTN(TCoSbook, shoppingcart);
		}
		
		if(event.getSource() == addIToIF) {
			addBTN(IToIFbook, shoppingcart);
		}
	
		if(event.getSource() == addCC) {
			addBTN(CCbook, shoppingcart);
		}
		
		if(event.getSource() == addSM) {
			addBTN(SMbook, shoppingcart);
		}
		
		if(event.getSource() == addT2C) {
			addBTN(T2Cbook, shoppingcart);
		}
		
		if(event.getSource() == addGE) {
			addBTN(GEbook, shoppingcart);
		}
		
		if(event.getSource() == clear) {
			shoppingcart.clear();
			totalLabel.setText("Total :");
			cartitems="";
			cartdisplay.setText("Cart Items");
		}
		
	}
	
	
	
	/*This method adds a book to the shopping cart resets the total 
	 * and proceeds to adds up the prices of the books in the shopping cart
	 * if total is greater than 30 then discount 2 will be applied which is 
	 * a 5% discount */
	public void addBTN(BookMaker book, ArrayList<BookMaker> shoppingcart) {
				shoppingcart.add(book);
				total = 0;
				for(BookMaker x : shoppingcart) {
					if(x.getYear() > 2000) {
						total += (x.getPrice() * discount1);
						}
					else{
						total += x.getPrice();
						}
					}
				if(total > 30) {
					total *= 0.95;
					totalLabel.setText("Total: £"+Math.round(total * 100.0) / 100.0);
					cartitems="";
					for(BookMaker y: shoppingcart) {
						cartitems += y.getName()+":  £"+y.getPrice()+" "+y.getDiscount()+"\n";
					}
					cartdisplay.setText(cartitems);
				}
				else{
					totalLabel.setText("Total: £"+Math.round(total * 100.0) / 100.0);
					cartitems="";
					for(BookMaker y: shoppingcart) {
						cartitems += y.getName()+":  £"+y.getPrice()+" "+y.getDiscount()+"\n";
						}
					cartdisplay.setText(cartitems);
					}
				if(total>30) {
					totalLabel.setText(("Total: £"+Math.round(total * 100.0) / 100.0)+"    You have been awared a 5% discount off your total");
					}
				else {
					totalLabel.setText("Total: £"+Math.round(total * 100.0) / 100.0);
				}

				}
				}
	
