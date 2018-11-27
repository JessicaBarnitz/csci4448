package spring.model;

import java.util.*;

/**
 * Healthcare Provider class that serves as the central unit for a healthcare 
 * provider and keeps track of the healthcare providers patients
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
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
     * @param _username user provided String username
     * @param _password user provided String password
     * @param _firstName user provided String first name
     * @param _lastName user provided String last name
     * @param _dateOfBirth user provided Date date of birth in form (mm/dd/yyyy)
     * @param _specialty the healthcare provider's specialty
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
	 * getter for the type of user
	 * @return this.user
	 */
	 public String getUser() {
	     return this.user;
	 }
	 /**
	  * setter
	  * @param  _specialty the healthcare providers medical specialty
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
	 *  @param _patientList a list of the healthcare providers patients
	 */
	public void setPatientList(List<Patient> _patientList) {
	    this.patientList = _patientList;
	}
	/**
	 * adds a patient to the patientList
	 * @param _patient of type patient 
	 */
    public void addPatient(Patient _patient) {
        patientList.add(_patient);
    }
    /**
     * login ensures that the username and password are correct
     * 
     * @param _username user provided String username
     * @param _password userprovided String password
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