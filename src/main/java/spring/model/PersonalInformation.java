package spring.model;


import java.util.*;

/**
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
    private Address homeAddress;// = new Address();
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
    * @param email
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
    * @return
    */
    public String getPhone() {
        return this.phone;
    }
    /**
    * @param _phone
    * @return
    */
    public void setPhone(String _phone) {
        this.phone = _phone;
    }
   /**
    * @return
    */
    public String getEmail() {
        return this.email;
    }
   /**
    * @param _email
    * @return
    */
    public void setEmail(String _email) {
        this.email = _email;
    }
   /**
    * @return
    */
    public Address getHomeAddress() {
        return this.homeAddress;
    }
   /**
    * @param _homeAddress
    * @return
    */
    public void setHomeAddress(Address _homeAddress) {
        this.homeAddress = _homeAddress;
    }
   /**
    * @return
    */
    public String getEmergencyContactName() {
        return this.emergencyContactName;
    }
   /**
    * @param _emergencyContactName
    * @return
    */
    public void setEmergencyContactName(String _emergencyContactName) {
        this.emergencyContactName = _emergencyContactName;
    }
   /**
    * @return
    */
    public String getEmergencyContactPhone() {
        return this.emergencyContactPhone;
    }
   /**
    * @param _emergencyContactPhone
    * @return
    */
    public void setEmergencyContactPhone(String _emergencyContactPhone) {
        this.emergencyContactPhone = _emergencyContactPhone;
    }
   /**
    * @param street
    * @param zipcode
    * @param county
    * @param state
    */
   public void setHomeAddress(String street, int zipcode, String county, String state) {
       // TODO implement here
   }

   /**
    * @param patientNum
    * @return
    */
   public String showPersonalInformation(int patientNum) {
       // TODO implement here
       return "";
   }

}