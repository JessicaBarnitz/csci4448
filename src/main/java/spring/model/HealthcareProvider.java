package spring.model;

import java.util.*;

/**
 * 
 */
public class HealthcareProvider extends User {
	/**
     * 
     */
	private String user;
    /**
     * 
     */
    private List<Patient> patientList;
    /**
     * 
     */
    private String specialty;
    /**
     * Default constructor
     */
    public HealthcareProvider() {
    	this.user = "healthcare provider";
    	this.patientList = new ArrayList<Patient>();
    	this.specialty = "";
    }
    /**
     * Overloaded constructor
     * @param _username
     * @param _password
     * @param _firstName
     * @param _lastName
     * @param _dateOfBirth
     * @param _specialty
     */
    public HealthcareProvider(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth, String _specialty){
    	this.user = "healthcare provider";
    	this.patientList = new ArrayList<Patient>();
    	this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
        this.specialty = _specialty;
    }
    /**
     * getter
     * @param none
     * @return this.user
     */
     public String getUser() {
         return this.user;
     }
     /**
      * setter
      * @param _specialty
      */
      public void setSpecialty(String _specialty) {
    	  this.specialty = _specialty;
      }
      /**
       * getter
       * @param none
       * @return this.specialty
       */
       public String getSpecialty() {
           return this.specialty;
       }
     
    /**
     * 	getter
     *  @param none
     *  @return this.patientList
     */
    public List<Patient> getPatientList() {
        return this.patientList;
    }
    
    /**
     * 	setter
     *  @param List<Patient> patientList
     *  @return none
     */
    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    

    /**
     * adds a patient to the patientList
     * @param Patient _patient 
     * @return none
     */
    public void addPatient(Patient _patient) {
        patientList.add(_patient);
    }

    /**
     * login ensures that the username and password are correct
     * @param String _username
     * @param String _password
     */
    public HealthcareProvider login(String _username, String _password) {
        if( (this.username == _username) && (this.password == _password) ) {
     	   return this;
        }
        else {
     	   return null;
        }
    }

}