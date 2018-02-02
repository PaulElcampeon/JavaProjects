package insertDATA2MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class InsertingData2MYSQL {

	/* Lets pretend we have a database called SainsburyLondon
	 * and within this database we have a table called workers, 
	 * I want to show you an example of how we could insert a 
	 * new workers details (idNo, First Name, Surname, age, gender) 
	 * into our workers table 
	 * */
		
		public static void connection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public static void InsertingData2MYSQL(int idno, String FirstName, String Surname, int age, String gender) {
			connection();
			String host = "jdbc:mysql://localhost:3306/SainsburyLondon";
			String user = "root";
			String password = "";
			try {
				Connection connect = DriverManager.getConnection(host, user, password);
				System.out.println("We are connected");
				String query = "INSERT INTO workers(idNo, firstname, surname, age, gender)VALUES(?,?,?,?,?)";
				PreparedStatement statement = (PreparedStatement) connect.prepareStatement(query);
				statement.setInt(1, idno);
				statement.setString(2, FirstName);
				statement.setString(3, Surname);
				statement.setInt(4, age);
				statement.setString(5, gender);
				statement.executeUpdate();
				System.out.println("Query Executed");
				statement.close();
				connect.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	public static void main(String[] args) {
		
		/*
		Example of adding a new worker called with idno 1001 first name: David 
		surname: Fitzgerald age:20 and gender: male
		*/
		
		InsertingData2MYSQL(1001, "David", "Fitzgerald", 20, "Male");
		}
	}

