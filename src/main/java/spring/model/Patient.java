package spring.model;

import java.util.*;

/**
 * 
 */
public class Patient extends User {
    /**
     * 
     */
    private int patientNum;
    /**
     * Default constructor
     */
    public Patient() {
        this.patientNum = 0;
    }
    /**
     * @param int _patientNum 
     * @return
     */
    public void setPatientNum(int _patientNum) {
        this.patientNum = _patientNum;
    }
    /**
     * @return
     */
    public int getPatientNum() {
        return this.patientNum;
    }

    /**
     * @param username 
     * @param password 
     * @return
     */
    @Override
    public Patient login(String _username,String _password) {
    	if( (this.getUsername() == _username) && (this.getPassword() == _password) ) {
     	   return this;
        }
        else {
     	   return null;
        }
    }

}