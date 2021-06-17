package dev.mendoza.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnection {

	/*
	 * JDBC = Java Database Connectivity
	 * A Java library with classes to connect to a database
	 * With JDBC, we can set up a connection that will use our RDS credentials
	 * Once a connection is made, we can make queries and execute statements
	 * 
	 * Steps:
	 * 1. Add the JDBC dependency to our project (pom.xml)
	 * 2. Set up a connection file using our credentials
	 * 3. Refactor our DAOs (or create them) that will make calls to our DB when needed
	 * 		DAO = Data Access Object
	 * 
	 * Notable Interfaces of JDBC
	 * 
	 * Connection Interface
	 * Represents the established connections to our RDS -> main gateway
	 * 
	 * Statement Interface
	 * We won't use this because it is not protected against SQL injection
	 * 
	 * PreparedStatement Interface
	 * Sanitizes input and protects them against SQL injection
	 * Used to create SQL statements and queries
	 * 
	 * CallableStatement Interface
	 * Used to call Stored Procedures
	 * 
	 * ResultSet Interface
	 * Objects that represent the data returned from our SQL statements or queries
	 * 
	 */
	
	/*
	 * We are going to maintain and observe a single Connection Object
	 * within this class. If no Connection exists, we will create and return
	 * one. If a connection does exists, we will return that.
	 */
	
	private static Connection conn = null;
	
	// Define a method to get the connection
	public static Connection getConnection() {
		
		try {
			// If connection does not exist, make one
			if(conn == null) {
				
				/*
				 * Hotfix to ensure that the driver loads correctly when
				 * our application starts.
				 */
				Class.forName("org.postgresql.Driver");
				
				// In order to establish a connection to our DB
				// We need our credentials:
				// URL (endpoint), username, password
				
				//Without .properties file
				// conn = DriverManager.getConnection(url, username, password);
				
				// With .properties file
				Properties props = new Properties();
				InputStream input = JDBCConnection.class.getClassLoader()
									.getResourceAsStream("connection.properties");
				props.load(input);
				String url = props.getProperty("url");
				String username = props.getProperty("username");
				String password = props.getProperty("password");
				
				conn = DriverManager.getConnection(url, username, password);
				return conn;
			}
			else {
				return conn;
			}
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	// Test Main Method
	public static void main(String[] args) {
		Connection conn = JDBCConnection.getConnection();
		
		if(conn != null) {
			System.out.println("Connection Successful!");
			
		}
		else {
			System.out.println("Connection Unsuccessful");
		}
	}
}
