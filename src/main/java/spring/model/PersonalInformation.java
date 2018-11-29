package spring.model;


import java.util.*;

/**
 * Personal information class to make use of object composition
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
public class PersonalInformation {
    
    /**
     * 
     */
    private String phone;
    /**
     * 
     */
    private String email;
    /**
     * 
     */
    private Address homeAddress;
    /**
     * 
     */
    private String emergencyContactName;
    /**
     * 
     */
    private String emergencyContactPhone;
    /**
     * Default constructor
     */
    public PersonalInformation() {
        this.phone = "";
        this.email = "";
        this.homeAddress = null;
        this.emergencyContactName = "";
        this.emergencyContactPhone = "";
    }
   /**
    * @param _phone
    * @param _email
    * @param _homeAddress
    * @param _emergencyContactName
    * @param _emergencyContactNumber
    */
    public PersonalInformation(String _phone, String _email, Address _homeAddress, String _emergencyContactName, String _emergencyContactPhone) {
        this.phone = _phone;
        this.email = _email;
        this.homeAddress = _homeAddress;
        this.emergencyContactName = _emergencyContactName;
        this.emergencyContactPhone = _emergencyContactPhone;
    }
    /**
     * getter
    * @return this.phone
    */
    public String getPhone() {
        return this.phone;
    }
    /**
     * setter
    * @param _phone user phone number
    *
    */
    public void setPhone(String _phone) {
        this.phone = _phone;
    }
   /**
    * getter
    * @return this.email
    */
    public String getEmail() {
        return this.email;
    }
   /**
    * setter
    * @param _email user email
    */
    public void setEmail(String _email) {
        this.email = _email;
    }
   /**
    * getter
    * @return this.homeAddress
    */
    public Address getHomeAddress() {
        return this.homeAddress;
    }
   /**
    * setter
    * @param _homeAddress home address object
    */
    public void setHomeAddress(Address _homeAddress) {
        this.homeAddress = _homeAddress;
    }
   /**
    * @return this.emergencyContactName
    */
    public String getEmergencyContactName() {
        return this.emergencyContactName;
    }
   /**
    * setter
    * @param _emergencyContactName 
    */
    public void setEmergencyContactName(String _emergencyContactName) {
        this.emergencyContactName = _emergencyContactName;
    }
   /**
    * getter
    * @return this.emergencyContactPhone
    */
    public String getEmergencyContactPhone() {
        return this.emergencyContactPhone;
    }
   /**
    * getter
    * @param _emergencyContactPhone
    */
    public void setEmergencyContactPhone(String _emergencyContactPhone) {
        this.emergencyContactPhone = _emergencyContactPhone;
    }
   /**
    * show patient personal information for the given patient id
    * @param patientNum
    * @return
    */
   public String showPersonalInformation(int patientNum) {
       // TODO implement here
       return "";
   }

}