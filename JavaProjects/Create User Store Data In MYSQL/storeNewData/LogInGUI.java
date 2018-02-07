package storeNewData;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LogInGUI extends JFrame implements ActionListener, ItemListener{

	private String username = null;
	private String passwordString = null;
	private char[] password;
	
	private JPanel panel = new JPanel();
	private JLabel usernameLabel = new JLabel("Username: ");
	private JLabel passwordLabel = new JLabel("Password: ");
	private JTextField usernameField = new JTextField();
	private JPasswordField passwordField = new JPasswordField();
	private JRadioButton rdbtnShowPassword = new JRadioButton("Show Password");
	private JButton logInButton = new JButton("Log In");
	private JButton newUserButton = new JButton("New User");

	
	public LogInGUI() {
		
		panel.setLayout(null);
		
		//Adding actionListener to button
		logInButton.addActionListener(this);
		newUserButton.addActionListener(this);
		
		//Adding itemListener
		rdbtnShowPassword.addItemListener(this);
		
		//Setting location and size of items
		usernameLabel.setBounds(37, 30, 123, 30);
		passwordLabel.setBounds(37, 65, 123, 30);
		usernameField.setBounds(150, 30, 190, 30);
		passwordField.setBounds(150, 65, 190, 30);
		rdbtnShowPassword.setBounds(150, 95, 127, 25);
		logInButton.setBounds(150, 125, 85, 27);
		newUserButton.setBounds(240, 125, 100, 27);
		
		//Setting position text appears in text and password fields
		usernameField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);

		//Setting Font
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		logInButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		newUserButton.setFont(new Font("Tahoma", Font.BOLD, 14));

		//Adding items to panel
		panel.add(usernameLabel);
		panel.add(passwordLabel);
		panel.add(usernameField);
		panel.add(passwordField);
		panel.add(rdbtnShowPassword);
		panel.add(logInButton);
		panel.add(newUserButton);		

		//Adding panel to Frame
		super.add(panel);
				
		//Setting JFrame
		super.setTitle("Log In Screen Connected to MYSQL");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400,250);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent actionE) {
		if(actionE.getSource() == logInButton) {
			//Checking that username and password field are not empty
			if(!usernameField.getText().equals("") && !(passwordField.getPassword().length == 0)) {
				username = usernameField.getText();
				password = passwordField.getPassword();
				passwordString = new String(password);
				//checking if username and password match what is in database system
				if(MYSQLmethods.logInCheck(username, passwordString) == true) {
					JOptionPane.showMessageDialog(this, "You have logged in successfully");
				}
				else {
					JOptionPane.showMessageDialog(this, "Your password or username was incorrect please try again");
				}
			}
			//If username or password field are empty then do this
			else {
				JOptionPane.showMessageDialog(this, "Please make sure you entered a password and username");
			}
		}
		
		if(actionE.getSource() == newUserButton) {
			FormGUI obj = new FormGUI();
		}

	}
	

	@Override
	public void itemStateChanged(ItemEvent itemE) {
		if(itemE.getStateChange() == 1) {
			passwordField.setEchoChar((char)0);
			}
		else{
			passwordField.setEchoChar('\u25CF');

		}
		
	}
}
