
import java.util.*;

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
    private int zipcode;

    /**
     * 
     */
    private String county;

    /**
     * 
     */
    private String state;

    /**
     * Default constructor
     */
    public Address() {
        this.street = "";
        this.zipcode = 0;
        this.county = "";
        this.state = "";
    }
    /**
     * @param _street 
     * @param _zipcode 
     * @param county 
     * @param state
     */
    public void Address(String _street, int _zipcode, String _county, String _state) {
        this.street = _street;
        this.zipcode = _zipcode;
        this.county = _county;
        this.state = _state;
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
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return
     */
    public int getZipcode() {
        return this.zipcode;
    }

    /**
     * @param _zipcode
     * @return
     */
    public void setZipcode(int _zipcode) {
        this.zipcode = _zipcode;
    }

    /**
     * @return
     */
    public String getCounty() {
        return this.country;
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
}