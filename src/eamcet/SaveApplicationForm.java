/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eamcet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahul
 */
public class SaveApplicationForm {
    static FillFormInitial ffi = null;
String tableName;
    public SaveApplicationForm(FillFormInitial ffi,String tableName) {
        this.ffi = ffi;
        this.tableName=tableName;

    }
    public void setNewTableName(String tableName){
        this.tableName = tableName;
    }
    
  public int startSave(){
                int x=0;
                Connection con;
		PreparedStatement preparedStatement;
		try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rahul");
               
		ResultSet set  = null;
               String query = "INSERT INTO "+tableName+" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                preparedStatement = con.prepareStatement(query);


              preparedStatement.setString(1, ffi.getCandidateName());
              preparedStatement.setString(2, ffi.getFatherName());
              preparedStatement.setString(3, ffi.getMotherName());
            preparedStatement.setString(4, ffi.getDateOfBirth());
            preparedStatement.setString(5, ffi.getAadhaarCardNumber());
            preparedStatement.setString(6, ffi.getRationCardNumber());
            preparedStatement.setString(7, ffi.getBirthState());
            preparedStatement.setString(8, ffi.getGender());
            preparedStatement.setString(9, ffi.getCategory());
            preparedStatement.setString(10, ffi.getWeakerSection());
            preparedStatement.setString(11, ffi.getCasteCertificateNumber());
preparedStatement.setString(12, ffi.getEwsNumber());
preparedStatement.setString(13, ffi.getSpecialReservation());
preparedStatement.setString(14, ffi.getPh());
preparedStatement.setString(15, ffi.getScribe());
preparedStatement.setString(16, ffi.getSadaramNumber());
preparedStatement.setString(17, ffi.getMinority());
preparedStatement.setString(18, ffi.getAnnualIncome());
preparedStatement.setString(19, ffi.getIncomeCertificateNumber());
preparedStatement.setString(20, ffi.getNameAsInBankAccount());
preparedStatement.setString(21, ffi.getAccountNumber());
preparedStatement.setString(22, ffi.getIfscCode());
preparedStatement.setString(23, ffi.getHouseNumber());
preparedStatement.setString(24, ffi.getVillageOrStreet());
preparedStatement.setString(25, ffi.getMandalOrTown());
preparedStatement.setString(26, ffi.getDistrict());
preparedStatement.setString(27, ffi.getState());
preparedStatement.setString(28, ffi.getPincode());
preparedStatement.setString(29, ffi.getMobileNumber());
preparedStatement.setString(30, ffi.getAlternateMobileNumber());
preparedStatement.setString(31, ffi.getLandlineNumber());
preparedStatement.setString(32, ffi.getEmailId());
preparedStatement.setString(33, ffi.getIntermediate());
preparedStatement.setString(34, ffi.getTypeOfExam());
preparedStatement.setString(35, ffi.getGroupSubject());
preparedStatement.setString(36, ffi.getInterHallticketNumber());
preparedStatement.setString(37, ffi.getInterYearOfPassing());
preparedStatement.setString(38, ffi.getDiplomaStudied());
preparedStatement.setString(39, ffi.getBridgeCourseHallTicketNumber());
preparedStatement.setString(40, ffi.getMediumOfInst());
preparedStatement.setString(41, ffi.getMediumOfTest());
preparedStatement.setString(42, ffi.getSscArea());
preparedStatement.setString(43, ffi.getSscHallticketNumber());
preparedStatement.setString(44, ffi.getSscMonth());
preparedStatement.setString(45, ffi.getSscYearOfPassing());
preparedStatement.setString(46, ffi.getClass1());
preparedStatement.setString(47, ffi.getClass2());
preparedStatement.setString(48, ffi.getClass3());
preparedStatement.setString(49, ffi.getClass4());
preparedStatement.setString(50, ffi.getClass5());
preparedStatement.setString(51, ffi.getClass6());
preparedStatement.setString(52, ffi.getClass7());
preparedStatement.setString(53, ffi.getClass8());
preparedStatement.setString(54, ffi.getClass9());
preparedStatement.setString(55, ffi.getClass10());
preparedStatement.setString(56, ffi.getInterClass1());
preparedStatement.setString(57, ffi.getInterClass2());
preparedStatement.setString(58, ffi.getLocalArea());
preparedStatement.setString(59, ffi.getSelectLocalArea());
preparedStatement.setString(60, ffi.getStreamApplied());
preparedStatement.setString(61, ffi.getTestZone1());
preparedStatement.setString(62, ffi.getTestZone2());
preparedStatement.setString(63, ffi.getTestZone3());
preparedStatement.setString(64, ffi.getPaymentReferenceNumber());


           x  = preparedStatement.executeUpdate();

              System.out.print(x);
                }
		
		catch(SQLException sql) {
			sql.printStackTrace();
		}
                catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                return x;
         }
    }

