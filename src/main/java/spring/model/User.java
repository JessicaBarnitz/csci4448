
import java.util.*;

/**
 * 
 */
public class User {

    private static final User User = null;

	/**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    public Date dateOfBirth;

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
     */
    public User(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth){
        this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
    }

    /**
    * @return this.username
    */
    public String getUsername() {
        return this.username;
    }
    /**
    * @param String _username
    * @return
    */
    public void setUsername(String _username) {
        this.username = _username;
    }
    /**
    * @return this.password
    */
    public String getPassword() {
        return this.password;
    }
    /**
    * @param String _password
    * @return
    */
    public void setPassword(String _password) {
        this.password = _password;
    }
    /**
    * @return this.firstName
    */
    public String getFirstName() {
        return this.firstName;
    }
    /**
    * @param String _firstName
    * @return
    */
    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }
    /**
    * @return this.lastName
    */
    public String getLastName() {
        return this.lastName;
    }
    /**
    * @param String _lastName
    * @return
    */
    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }
    /**
    * @return this.dateOfBirth
    */
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    /**
    * @param Date _dateOfBirth
    * @return
    */
    public void setDateOfBirth(Date _dateOfBirth) {
        this.dateOfBirth = _dateOfBirth;
    }
   /**
    * @param String _username
    * @param String _password
    */
   public User login(String _username, String _password) {
       // TODO implement here
	   return User;
   }

}