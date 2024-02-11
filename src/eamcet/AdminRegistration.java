package eamcet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahul
 */
public class AdminRegistration {
    
    public static void main(String[] args) {
        
  
      Connection con;
		 Statement s;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Successfully connected");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rahul");
		String command = "insert into admindetails values(123,'123')";
                s = con.createStatement();
                s.executeUpdate(command);
                
}
                catch(SQLException e){
                    e.printStackTrace();
                    
                }
                catch(ClassNotFoundException cnfe){
                    cnfe.printStackTrace();
                }
    
    
    
    
}
}
