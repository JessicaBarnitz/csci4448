package spring.model;

import java.util.*;

public class HealthcareProvider extends User {
	/**
	 * A string describing the type of user
	 */
	private String user;
    /**
     * A list of the healthcare provider's patients
     */
    private List<Patient> patientList;
    /**
     * String describing the healthcare provider's specialty
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
     * @param String _username
     * @param String _password
     * @param String _firstName
     * @param String _lastName
     * @param Date _dateOfBirth
     * @param String _specialty
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
	 * @return this.user
	 */
	 public String getUser() {
	     return this.user;
	 }
	 /**
	  * setter
	  * @param String _specialty
	  */
	  public void setSpecialty(String _specialty) {
		  this.specialty = _specialty;
	  }
   /**
    * getter
    * @return this.specialty
    */
	public String getSpecialty() {
		return this.specialty;
	}
	/**
	 * 	getter
	 *  @return this.patientList
	 */
    public List<Patient> getPatientList() {
        return this.patientList;
    }
	/**
	 * 	setter
	 *  @param List<Patient> patientList
	 */
	public void setPatientList(List<Patient> patientList) {
	    this.patientList = patientList;
	}
	/**
	 * adds a patient to the patientList
	 * @param Patient _patient 
	 */
    public void addPatient(Patient _patient) {
        patientList.add(_patient);
    }
    /**
     * login ensures that the username and password are correct
     * @param String _username
     * @param String _password
     * @return this on success
     * @return null on failure
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