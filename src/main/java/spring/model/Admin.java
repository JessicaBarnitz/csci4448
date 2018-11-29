package spring.model;

import java.util.*;

/**
 * Admin class that serves as the central unit for the patient
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
public class Admin extends User implements Observer {
	/**
     * A string describing the type of user
     */
	private String user;
	/**
     * A string describing the admin jobTitle
     */
	private String jobTitle;
	/**
     * A string for updated information from the observer
     */
	private String state;
    /**
     * Default constructor
     */
    public Admin() {
    	this.user = "admin";
    	this.state = "";
    }
    /**
     * Overloaded constructor
     * @param _username user provided String username
     * @param _password user provided String password
     * @param _firstName user provided String first name
     * @param _lastName user provided String last name
     * @param _dateOfBirth user provided Date date of birth in form (mm/dd/yyyy)
     * @param _jobTitle user provided String job title
     */
    public Admin(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth, String _jobTitle){
    	this.user = "patient";
    	this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
        this.jobTitle = _jobTitle;
        this.state = "";
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
     * @param _jobTitle user provided String job title
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
       * setter
       * @param _state update the observer state
       */
       public void setState(String _state) {
     	  this.state = _state;
       }
       /**
        * getter
        * @return this.state
        */
        public String getState() {
            return this.state;
        }
      /**
       * login ensures that the username and password are correct
       * 
       * @param _username user provided String username
       * @param _password userprovided String password
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
   /**
    * abstract function from observable interface 
    * it sets the admin state variable to blast the message to 
    * all admin 
    * 
    * @param _update string of the observer invoker patient information
    */
	@Override
	public void update(String _update) {
		System.out.println(_update);
		setState(_update);
		System.out.println(getState());
	}

}