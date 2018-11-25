package spring.model;

import java.util.*;

/**
 * 
 */
public class HealthcareProvider extends User {
	
	private String user;
    /**
     * 
     */
    private List<Patient> patientList;
    /**
     * Default constructor
     */
    public HealthcareProvider() {
    	this.user = "healthcare provider";
    	this.patientList = new ArrayList<Patient>();
    }
    /**
     * 
     * @param none
     * @return this.user
     */
     public String getUser() {
         return this.user;
     }
     
    /**
     * 	getter: patientList
     *  @param none
     *  @return this.patientList
     */
    public List<Patient> getPatientList() {
        return this.patientList;
    }
    
    /**
     * 	setter: patientList
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