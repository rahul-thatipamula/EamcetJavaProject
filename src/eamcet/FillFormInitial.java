/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eamcet;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rahul
 */
public class FillFormInitial {
    
    private String paymentReferenceNumber;
    private String mobileNumber;
    private String dateOfBirth;
    private String  hallTicketNumber;

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDateOfBirthStudent() {
        return dateOfBirthStudent;
    }

    public void setDateOfBirthStudent(String dateOfBirthStudent) {
        this.dateOfBirthStudent = dateOfBirthStudent;
    }

    public String getAadhaarCardNumber() {
        return aadhaarCardNumber;
    }

    public void setAadhaarCardNumber(String aadhaarCardNumber) {
        this.aadhaarCardNumber = aadhaarCardNumber;
    }

    public String getRationCardNumber() {
        return rationCardNumber;
    }

    public void setRationCardNumber(String rationCardNumber) {
        this.rationCardNumber = rationCardNumber;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeakerSection() {
        return weakerSection;
    }

    public void setWeakerSection(String weakerSection) {
        this.weakerSection = weakerSection;
    }

    public String getCasteCertificateNumber() {
        return casteCertificateNumber;
    }

    public void setCasteCertificateNumber(String casteCertificateNumber) {
        this.casteCertificateNumber = casteCertificateNumber;
    }

    public String getEwsNumber() {
        return ewsNumber;
    }

    public void setEwsNumber(String ewsNumber) {
        this.ewsNumber = ewsNumber;
    }

    public String getSpecialReservation() {
        return specialReservation;
    }

    public void setSpecialReservation(String specialReservation) {
        this.specialReservation = specialReservation;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getScribe() {
        return scribe;
    }

    public void setScribe(String scribe) {
        this.scribe = scribe;
    }

    public String getSadaramNumber() {
        return sadaramNumber;
    }

    public void setSadaramNumber(String sadaramNumber) {
        this.sadaramNumber = sadaramNumber;
    }

    public String getMinority() {
        return minority;
    }

    public void setMinority(String minority) {
        this.minority = minority;
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getIncomeCertificateNumber() {
        return incomeCertificateNumber;
    }

    public void setIncomeCertificateNumber(String incomeCertificateNumber) {
        this.incomeCertificateNumber = incomeCertificateNumber;
    }

    public String getNameAsInBankAccount() {
        return nameAsInBankAccount;
    }

    public void setNameAsInBankAccount(String nameAsInBankAccount) {
        this.nameAsInBankAccount = nameAsInBankAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getVillageOrStreet() {
        return villageOrStreet;
    }

    public void setVillageOrStreet(String villageOrStreet) {
        this.villageOrStreet = villageOrStreet;
    }

    public String getMandalOrTown() {
        return mandalOrTown;
    }

    public void setMandalOrTown(String mandalOrTown) {
        this.mandalOrTown = mandalOrTown;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getMobileNumberStudent() {
        return mobileNumberStudent;
    }

    public void setMobileNumberStudent(String mobileNumberStudent) {
        this.mobileNumberStudent = mobileNumberStudent;
    }

    public String getAlternateMobileNumber() {
        return alternateMobileNumber;
    }

    public void setAlternateMobileNumber(String alternateMobileNumber) {
        this.alternateMobileNumber = alternateMobileNumber;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getIntermediate() {
        return intermediate;
    }

    public void setIntermediate(String intermediate) {
        this.intermediate = intermediate;
    }

    public String getTypeOfExam() {
        return typeOfExam;
    }

    public void setTypeOfExam(String typeOfExam) {
        this.typeOfExam = typeOfExam;
    }

    public String getGroupSubject() {
        return groupSubject;
    }

    public void setGroupSubject(String groupSubject) {
        this.groupSubject = groupSubject;
    }

    public String getInterHallticketNumber() {
        return interHallticketNumber;
    }

    public void setInterHallticketNumber(String interHallticketNumber) {
        this.interHallticketNumber = interHallticketNumber;
    }

    public String getInterYearOfPassing() {
        return interYearOfPassing;
    }

    public void setInterYearOfPassing(String interYearOfPassing) {
        this.interYearOfPassing = interYearOfPassing;
    }

    public String getDiplomaStudied() {
        return diplomaStudied;
    }

    public void setDiplomaStudied(String diplomaStudied) {
        this.diplomaStudied = diplomaStudied;
    }

    public String getBridgeCourseHallTicketNumber() {
        return bridgeCourseHallTicketNumber;
    }

    public void setBridgeCourseHallTicketNumber(String bridgeCourseHallTicketNumber) {
        this.bridgeCourseHallTicketNumber = bridgeCourseHallTicketNumber;
    }

    public String getMediumOfInst() {
        return mediumOfInst;
    }

    public void setMediumOfInst(String mediumOfInst) {
        this.mediumOfInst = mediumOfInst;
    }

    public String getMediumOfTest() {
        return mediumOfTest;
    }

    public void setMediumOfTest(String mediumOfTest) {
        this.mediumOfTest = mediumOfTest;
    }

    public String getSscArea() {
        return sscArea;
    }

    public void setSscArea(String sscArea) {
        this.sscArea = sscArea;
    }

    public String getSscHallticketNumber() {
        return sscHallticketNumber;
    }

    public void setSscHallticketNumber(String sscHallticketNumber) {
        this.sscHallticketNumber = sscHallticketNumber;
    }

    public String getSscMonth() {
        return sscMonth;
    }

    public void setSscMonth(String sscMonth) {
        this.sscMonth = sscMonth;
    }

    public String getSscYearOfPassing() {
        return sscYearOfPassing;
    }

    public void setSscYearOfPassing(String sscYearOfPassing) {
        this.sscYearOfPassing = sscYearOfPassing;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }

    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3;
    }

    public String getClass4() {
        return class4;
    }

    public void setClass4(String class4) {
        this.class4 = class4;
    }

    public String getClass5() {
        return class5;
    }

    public void setClass5(String class5) {
        this.class5 = class5;
    }

    public String getClass6() {
        return class6;
    }

    public void setClass6(String class6) {
        this.class6 = class6;
    }

    public String getClass7() {
        return class7;
    }

    public void setClass7(String class7) {
        this.class7 = class7;
    }

    public String getClass8() {
        return class8;
    }

    public void setClass8(String class8) {
        this.class8 = class8;
    }

    public String getClass9() {
        return class9;
    }

    public void setClass9(String class9) {
        this.class9 = class9;
    }

    public String getClass10() {
        return class10;
    }

    public void setClass10(String class10) {
        this.class10 = class10;
    }

    public String getInterClass1() {
        return interClass1;
    }

    public void setInterClass1(String interClass1) {
        this.interClass1 = interClass1;
    }

    public String getInterClass2() {
        return interClass2;
    }

    public void setInterClass2(String interClass2) {
        this.interClass2 = interClass2;
    }

    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public String getSelectLocalArea() {
        return selectLocalArea;
    }

    public void setSelectLocalArea(String selectLocalArea) {
        this.selectLocalArea = selectLocalArea;
    }

    public String getStreamApplied() {
        return streamApplied;
    }

    public void setStreamApplied(String streamApplied) {
        this.streamApplied = streamApplied;
    }

    public String getTestZone1() {
        return testZone1;
    }

    public void setTestZone1(String testZone1) {
        this.testZone1 = testZone1;
    }

    public String getTestZone2() {
        return testZone2;
    }

    public void setTestZone2(String testZone2) {
        this.testZone2 = testZone2;
    }

    public String getTestZone3() {
        return testZone3;
    }

    public void setTestZone3(String testZone3) {
        this.testZone3 = testZone3;
    }

   private String candidateName;
 private String fatherName;
 private String motherName;
 private String dateOfBirthStudent;
 private String aadhaarCardNumber;
 private String rationCardNumber;
 private String birthState;
 private String gender;
 private String category;
 private String weakerSection;
 private String casteCertificateNumber;
 private String ewsNumber;
 private String specialReservation;
 private String ph;
 private String scribe;
 private String sadaramNumber;
 private String minority;
 private String annualIncome;
 private String incomeCertificateNumber;
 private String nameAsInBankAccount;
 private String accountNumber;
 private String ifscCode;
 private String houseNumber;
 private String villageOrStreet;
 private String mandalOrTown;
 private String district;
 private String state;
 private String pincode;
 private String mobileNumberStudent;
 private String alternateMobileNumber;
 private String landlineNumber;
 private String emailId;
 private String intermediate;
 private String typeOfExam;
 private String groupSubject;
 private String interHallticketNumber;
 private String interYearOfPassing;
 private String diplomaStudied;
 private String bridgeCourseHallTicketNumber;
 private String mediumOfInst;
 private String mediumOfTest;
 private String sscArea;
 private String sscHallticketNumber;
 private String sscMonth;
 private String sscYearOfPassing;
 private String class1;
 private String class2;
 private String class3;
 private String class4;
 private String class5;
 private String class6;
 private String class7;
 private String class8;
 private String class9;
 private String class10;
 private String interClass1;
 private String interClass2;
 private String localArea;
 private String selectLocalArea;
 private String streamApplied;
 private String testZone1;
 private String testZone2;
 private String testZone3;


    public String getPaymentReferenceNumber() {
        return paymentReferenceNumber;
    }

    public void setPaymentReferenceNumber(String paymentReferenceNumber) {
        this.paymentReferenceNumber = paymentReferenceNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHallTicketNumber() {
        return hallTicketNumber;
    }

    public void setHallTicketNumber(String hallTicketNumber) {
        this.hallTicketNumber = hallTicketNumber;
    }
    
    void setData(String paymentReferenceNumber,String dateOfBirth,String hallTicketNumber,String mobileNumber){
        setDateOfBirth(dateOfBirth);
        setHallTicketNumber(hallTicketNumber);
        setMobileNumber(mobileNumber);
        setPaymentReferenceNumber(paymentReferenceNumber);
        
    }
    boolean validateData(){
      java.sql.Connection con;
		 PreparedStatement sqlQuery;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Successfully connected");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rahul");
		String command = "Select REFERENCE,SECONDYEARHALLTICKET,MOBILENUMBER,DOB from studentfeedetails where REFERENCE =? and SECONDYEARHALLTICKET =? and MOBILENUMBER =? and DOB=?";
                sqlQuery = con.prepareStatement(command);
                sqlQuery.setString(1,getPaymentReferenceNumber());
                sqlQuery.setString(2,getHallTicketNumber());
                sqlQuery.setString(3,getMobileNumber());
                sqlQuery.setString(4,getDateOfBirth());
                System.out.println(getPaymentReferenceNumber() +" "+getHallTicketNumber()+ " "+getMobileNumber()+" "+getDateOfBirth());
                 ResultSet set  = sqlQuery.executeQuery();
                if(set.next()){
                    return true;
                }
                else
                    return false;
                
}
                catch(SQLException e){
                    e.printStackTrace();
                    
                }
                catch(ClassNotFoundException cnfe){
                    cnfe.printStackTrace();
                }
        return false;
}
        
    }