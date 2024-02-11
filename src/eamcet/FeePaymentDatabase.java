/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eamcet;
import java.sql.*;
/**
 *
 * @author Rahul
 */
public class FeePaymentDatabase {

    public FeePaymentDatabase(String [] data) {
     connectionAndInsert(data);   
    }
    
    public void connectionAndInsert(String[] data){
        Connection con;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Successfully connected");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rahul");
		String command = "insert into studentfeedetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                String command2 = "insert into studentdetails values(?,?)";
                PreparedStatement preparedStatement1 = con.prepareStatement(command);
                PreparedStatement preparedStatement2 = con.prepareStatement(command2);
               for(int i =0;i<data.length;i++){
                   preparedStatement1.setString(i+1, data[i]);
               }
               preparedStatement2.setString(1, data[5]);
               preparedStatement2.setString(2, data[13]);
              int x = preparedStatement1.executeUpdate();
              int y = preparedStatement2.executeUpdate();
              
              
              
                if(x!=0 && y!=0){
                    System.out.println("Completed");
                    
                }
                else
                    System.out.println("Failed");
                }
                catch(SQLException e){
                    e.printStackTrace();
                    
                }
                catch(ClassNotFoundException cnfe){
                    cnfe.printStackTrace();
                }
    }
    
}
