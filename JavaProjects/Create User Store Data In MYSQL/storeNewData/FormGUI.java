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


public class FormGUI extends JFrame implements ActionListener,ItemListener{
	
	private int userAge;
	private String userfname;
	private String usersname;
	private String userName;
	private String userPasswordString;
	private char [] userPassword;
	
	public JPanel panel = new JPanel();
	
	private JLabel userFnameLabel = new JLabel("First name :");
	private JTextField userFnameField = new JTextField();
	private JLabel userSnameLabel = new JLabel("Surname :");
	private JTextField userSnameField = new JTextField();
	private JLabel userAgeLabel = new JLabel("Age :");
	private JTextField userAgeField = new JTextField();
	private JLabel userNameLabel = new JLabel("Username :");
	private JTextField userNameField = new JTextField();
	private JLabel userPasswordLabel = new JLabel("Password :");
	private JPasswordField userPasswordField = new JPasswordField();
	private JRadioButton rdbtnShowPassword = new JRadioButton("Show Password");
	public JButton FinishBTN = new JButton("Finish");
			
	
	public FormGUI() {
		
		panel.setLayout(null);
		
		userFnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userFnameLabel.setBounds(27, 13, 110, 27);
		userFnameField.setBounds(149, 16, 200, 25);
		
		userSnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userSnameLabel.setBounds(27, 53, 100, 27);
		userSnameField.setBounds(149, 53, 200, 25);
		
		userAgeLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userAgeLabel.setBounds(27, 91, 56, 25);
		userAgeField.setBounds(80, 94, 47, 25);
		
		userNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userNameLabel.setBounds(27,131, 120, 25);
		userNameField.setBounds(149, 134, 200, 25);
		
		userPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userPasswordLabel.setBounds(27, 162, 100, 25);
		userPasswordField.setBounds(149,165, 202, 25);
		
		rdbtnShowPassword.setBounds(145, 193, 127, 25);

		FinishBTN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		FinishBTN.setBounds(149, 227, 110, 38);
		FinishBTN.setToolTipText("Click if you have completed the form and left no blank spaces");
		
		//Adding actionListeners and itemListeners
		rdbtnShowPassword.addItemListener(this);
		FinishBTN.addActionListener(this);

		//Adding items to panel
		panel.add(userFnameLabel);
		panel.add(userFnameField);
		panel.add(userSnameLabel);
		panel.add(userSnameField);
		panel.add(userAgeLabel);
		panel.add(userAgeField);
		panel.add(userNameLabel);
		panel.add(userNameField);
		panel.add(userPasswordLabel);
		panel.add(userPasswordField);
		panel.add(rdbtnShowPassword);
		panel.add(FinishBTN);

		super.add(panel);
		
		super.setTitle("New Staff Registration");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 350);
		super.setResizable(false);
		super.setLocationRelativeTo(this);
		super.setVisible(true);		
	}
	


	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == FinishBTN){				
			if(userFnameField.equals("") || userSnameField.equals("") || userAgeField.getText().matches(".*[a-zA-Z].*") || userNameField.equals("") || userPasswordField.equals("")){
				JOptionPane.showMessageDialog(this, "You have left some areas blank or the values you have inputted are incorrect for the field please correct this");
				}else {
					userfname = userFnameField.getText();
					usersname = userSnameField.getText();
					userAge = Integer.parseInt(userAgeField.getText());
					userName = userNameField.getText();
					userPassword = userPasswordField.getPassword();
					userPasswordString = new String(userPassword);
					MYSQLmethods.NewStaffReg(userfname, usersname, userAge, userName, userPasswordString);
					JOptionPane.showMessageDialog(this, "You can now log in");
					this.dispose();		
					}
			}
	}
	
	@Override
	public void itemStateChanged(ItemEvent itemE) {
		if(itemE.getStateChange() == 1) {
			userPasswordField.setEchoChar((char)0);
			}
		else{
			userPasswordField.setEchoChar('\u25CF');

		}
		
	}
}