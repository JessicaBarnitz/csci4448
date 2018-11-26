package spring.model;

import java.util.*;

/**
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
     * @param String _username
     * @param String _password
     * @param String _firstName
     * @param String _lastName
     * @param Date _dateOfBirth
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
    * @param String _username
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
    * @param String _password
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
    * @param String _firstName
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
    * @param String _lastName
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
    * @param Date _dateOfBirth
    */
    public void setDateOfBirth(Date _dateOfBirth) {
        this.dateOfBirth = _dateOfBirth;
    }
   /**
    * @param String _username
    * @param String _password
    */
   public User login(String _username, String _password) {
	   return this;
   }

}