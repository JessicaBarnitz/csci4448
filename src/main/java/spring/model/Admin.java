package spring.model;

import java.util.*;

/**
 * 
 */
public class Admin extends User {
	/**
     * A string describing the type of user
     */
	private String user;
	/**
     * A string describing the admin jobTitle
     */
	private String jobTitle;
    /**
     * Default constructor
     */
    public Admin() {
    	this.user = "admin";
    }
    /**
     * Overloaded constructor
     * @param String _username
     * @param String _password
     * @param String _firstName
     * @param String _lastName
     * @param Date _dateOfBirth
     * @param String _jobTitle
     */
    public Admin(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth, String _jobTitle){
    	this.user = "patient";
    	this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
        this.jobTitle = _jobTitle;
    }
    /**
    * @return this.user
    */
    public String getUser() {
        return this.user;
    }
    /**
     * setter
     * @param String _jobTitle
     */
     public void setJobTitle(String _jobTitle) {
   	  this.jobTitle = _jobTitle;
     }
     /**
      * getter
      * @return this.jobTitle
      */
      public String getJobTitle() {
          return this.jobTitle;
      }
    /**
     * login ensures that the username and password are correct
     * @param String _username
     * @param String _password
     * @return this on success
     * @return null on failure
     */
   public Admin login(String _username, String _password) {
       if( (this.username == _username) && (this.password == _password) ) {
    	   return this;
       }
       else {
    	   return null;
       }
   }

}