package bookStore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BookShop extends JFrame implements ActionListener{

	//This variable is going to be used to add the total of the items in the shopping cart
	private double total = 0;
	
	private JPanel panel = new JPanel();
	
	//Label for each book
	private JLabel MBD = new JLabel("<html>Moby Dick</html>");
	private JLabel TTPMS = new JLabel("<html>The Terrible Privacy of Maxwell Sim</html");
	private JLabel SLWW = new JLabel("<html>Still Life With Woodpecker</html");
	private JLabel SM = new JLabel("<html>Sleeping Murder</html");
	private JLabel TMB = new JLabel("<html>Three Men in a Boat</html");
	private JLabel TTM = new JLabel("<html>The Time Machine</html");
	private JLabel TCoS = new JLabel("<html>The Caves of Steel</html");
	private JLabel IToIF = new JLabel("<html>Idle Thoughts of an Idle Fellow</html");
	private JLabel CC = new JLabel("<html>A Christmas Carol</html");
	private JLabel T2C = new JLabel("<html>A Tale of Two Cities</html");
	private JLabel GE = new JLabel("<html>Great Expectations</html");
	
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
	

	public BookShop() {
		
		
		
		
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
