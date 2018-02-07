package logInWithMYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;

public interface MYSQLmethods {
	
	
	public default boolean logInCheck(String username, String Userpassword) {
		boolean check = false;
				
		//Loading driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Could not load com.mysql.jdbc.Driver");
		}
		
		String host = "jdbc:mysql://localhost:3306/Tesco";//My custom database Tesco
		String user = "root";
		String password = "";//if you have a password to log into your MYSQL you can enter it in here
		
		try {
			Connection connect = DriverManager.getConnection(host, user, password);
			//Selecting data from staff Table in Tesco database
		    String query = "SELECT userPassword FROM staff WHERE userName = '"+username+"'";
			PreparedStatement statement = (PreparedStatement) connect.prepareStatement(query);
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				if(Userpassword.equals(rs.getString(1))) {
					check = true;
					break;
				}
			}
			statement.close();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}

}