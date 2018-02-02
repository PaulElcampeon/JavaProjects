package bookStore;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
			
	public BookShop() {
		
		/*Going to use absolute positioning although I understand 
		 * this can cause problems when resizing window thus 
		 * i have disabled window resizing function*/
		panel.setLayout(null);
		
		MBD.setBounds(10, 10, 100, 50);
		MBD.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		
		panel.add(MBD);
		
		super.add(panel);
		
		super.setTitle("Book Store");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(1000, 700);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
