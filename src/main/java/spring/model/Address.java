package spring.model;


//import java.util.*;

/**
 * 
 */
public class Address {
    /**
     * 
     */
    private String street;
    /**
     * 
     */
    private String city;

    /**
     * 
     */
    private String county;

    /**
     * 
     */
    private String state;

    /**
     * 
     */
    private String zipcode;

    /**
     * Default constructor
     */
    public Address() {
        this.street = "";
        this.city = "";
        this.county = "";
        this.state = "";
        this.zipcode = "";
    }
    /**
     * Overloaded constructor
     */
    public Address(String _street, String _city, String _county, String _state, String _zipcode) {
        this.street = _street;
        this.city = _city;
        this.county = _county;
        this.state = _state;
        this.zipcode = _zipcode;
    }
    /**
     * @param _street 
     * @param _city  
     * @param _county 
     * @param _state
     * @param _zipcode
     */
    public void setAddress(String _street, String _city, String _county, String _state, String _zipcode) {
        this.street = _street;
        this.city = _city;
        this.county = _county;
        this.state = _state;
        this.zipcode = _zipcode;
    }

    /**
     * getter
     * @return this
     */
    public Address getAddress() {
        return this;
    }

    /**
     * getter
     * @return this.street
     */
    public String getStreet() {
        return this.street;
    }
    /**
     * formats the address as a comma separated string
     * 
     * @return this.street + ", " + this.city + ", " + this.county + ", " + this.state + ", " + this.zipcode
     */
    public String showAddress() {
        return this.street + ", " + this.city + ", " + this.county + ", " + this.state + ", " + this.zipcode;
    }

    /**
     * setter
     * @param _street
     */
    public void setStreet(String _street) {
        this.street = _street;
    }
    
    /**
     * getter
     * @return this.city
     */
    public String getCity() {
        return this.city;
    }
    
    /**
     * setter
     * @param _city
     */
    public void setCity(String _city) {
        this.city = _city;
    }
    
    /**
     * getter
     * @return this.county
     */
    public String getCounty() {
        return this.county;
    }
    /**
     * setter
     * @param _county
     */
    public void setCounty(String _county) {
        this.county = _county;
    }

    /**
     * getter
     * @return this.state
     */
    public String getState() {
        return this.state;
    }

    /**
     * setter
     * @param _state
     */
    public void setState(String _state) {
        this.state = _state;
    }
    
    /**
     * getter
     * @return this.zipcode
     */
    public String getZipcode() {
        return this.zipcode;
    }

    /**
     * setter
     * @param _zipcode
     */
    public void setZipcode(String _zipcode) {
        this.zipcode = _zipcode;
    }
}