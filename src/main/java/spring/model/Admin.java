package spring.model;

import java.util.*;

/**
 * 
 */
public class Admin extends User {

	private String user;
    /**
     * Default constructor
     */
    public Admin() {
    	this.user = "admin";
    }

    /**
    * @return this.user
    */
    public String getUser() {
        return this.user;
    }

    /**
     * @param String _username
     * @param String _password
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