package spring.model;

import java.util.*;

/**
 * Default User class that subclasses inherit from 
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
public class User {
	/**
     * user provided String username
     */
    protected String username;

    /**
     * user provided String password
     */
    protected String password;

    /**
     * user provided String first name
     */
    protected String firstName;

    /**
     * user provided String last name
     */
    protected String lastName;

    /**
     * user provided Date date of birth in form (mm/dd/yyyy)
     */
    protected Date dateOfBirth;

    /**
     * Default constructor
     */
    public User() {
        this.username = ""; 
        this.password = "";
        this.firstName = "";
        this.lastName = "";
        this.dateOfBirth = null;
    }

    /**
     * Overloaded constructor
     * @param _username user provided String username
     * @param _password user provided String password
     * @param _firstName user provided String first name
     * @param _lastName user provided String last name
     * @param _dateOfBirth user provided Date date of birth in form (mm/dd/yyyy)
     */
    public User(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth){
        this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
    }
    /**
    * getter
    * @return this.username
    */
    public String getUsername() {
        return this.username;
    }
    /**
    * setter
    * @param _username user provided String username
    */
    public void setUsername(String _username) {
        this.username = _username;
    }
    /**
    * getter
    * @return this.password
    */
    public String getPassword() {
        return this.password;
    }
    /**
    * setter
    * @param _password user provided String password
    */
    public void setPassword(String _password) {
        this.password = _password;
    }
    /**
    * getter
    * @return this.firstName
    */
    public String getFirstName() {
        return this.firstName;
    }
    /**
    * setter
    * @param _firstName user provided String first name
    */
    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }
    /**
    * getter
    * @return this.lastName
    */
    public String getLastName() {
        return this.lastName;
    }
    /**
    * setter
    * @param _lastName user provided String last name
    */
    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }
    /**
    * getter
    * @return this.dateOfBirth
    */
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    /**
    * setter
    * @param _dateOfBirth user provided Date date of birth in form (mm/dd/yyyy)
    */
    public void setDateOfBirth(Date _dateOfBirth) {
        this.dateOfBirth = _dateOfBirth;
    }
    
    /**
     * login ensures that the username and password are correct
     * 
     * @param _username user provided String username
     * @param _password userprovided String password
     * @return this 
     */
   public User login(String _username, String _password) {
	   return this;
   }

}