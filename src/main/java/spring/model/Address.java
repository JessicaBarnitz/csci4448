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
     * @return
     */
    public String getAddress() {
        // TODO implement here
        //depends on format/layout on how best to return address
        return "";
    }

    /**
     * @return
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * @param _street
     * @return
     */
    public void setStreet(String _street) {
        this.street = _street;
    }
    
    /**
     * @return
     */
    public String getCity() {
        return this.city;
    }
    
    /**
     * @param _city
     * @return
     */
    public void setCity(String _city) {
        this.city = _city;
    }
    
    /**
     * @return
     */
    public String getCounty() {
        return this.county;
    }
    /**
     * @param _county
     * @return
     */
    public void setCounty(String _county) {
        this.county = _county;
    }

    /**
     * @return
     */
    public String getState() {
        return this.state;
    }

    /**
     * @param _state
     * @return
     */
    public void setState(String _state) {
        this.state = _state;
    }
    
    /**
     * @return
     */
    public String getZipcode() {
        return this.zipcode;
    }

    /**
     * @param _zipcode
     * @return
     */
    public void setZipcode(String _zipcode) {
        this.zipcode = _zipcode;
    }
}