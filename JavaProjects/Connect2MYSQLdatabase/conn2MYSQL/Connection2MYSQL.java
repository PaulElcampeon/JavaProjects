package conn2MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;

/*How to connect to MYSQL Database

7 Steps to connect to a database

1. Import package (java.sql)
2. Load and register the driver (com.mysql.jdbc.Driver)
3. Establish the connection 
4. Create a statement
5. Execute the query
6. Process Results
7. Close connection
*/

//In order for this to work I had to add/load an external archive/jar file (mysql-connector-java-5.1.24-bin)
public class Connection2MYSQL {

	
	//This methods connects to the database
	public static void connectionToMySql() throws Exception {
			
		//Loads our driver (com.mysql.jdbc.Driver)
		Class.forName("com.mysql.jdbc.Driver");	
		
		//Preparing our information to log into our MYSQL database
		String host = "jdbc:mysql://localhost/redhornHomes";
		String user = "root";
		String password = "";
		
		//Connected to database redhornHomes
		Connection connect = DriverManager.getConnection(host, user, password);
		System.out.println("We are connected to the MYSQL database");
		/*
		 * 
		 * After you have connected to the database you can now
		 * insert or retrieve or manipulate data within a table
		 * Make sure to close your connection after your done.
		 * 
		 */
		}
	}
	
