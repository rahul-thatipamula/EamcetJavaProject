/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eamcet;

/**
 *
 * @author Rahul
 */
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;


public class GetDBConnection {
	public static Connection createConnection() {
		Connection connection= null;
		try {
		Properties properties = new Properties();
		properties.load(new FileInputStream("oracle.properties"));
		Class.forName(properties.getProperty("driver"));
		connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		}
	catch(Exception e) {
		System.out.println(e.getMessage()+" exception here");
	}
		return connection;
	}

    
}
