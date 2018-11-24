package spring.model;

import java.util.*;

/**
 * 
 */
public class HealthcareProvider extends User {
	
	private String user = "healthcare provider";
    /**
     * 
     */
    private List<Patient> patientList;
    /**
     * Default constructor
     */
    public HealthcareProvider() {
    }
    /**
     * 
     */

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    /**
    * @return this.user
    */
    public String getUser() {
        return this.user;
    }

    /**
     * @param Patient p 
     * @return
     */
    public void addPatient(Patient p) {
        // TODO implement here
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