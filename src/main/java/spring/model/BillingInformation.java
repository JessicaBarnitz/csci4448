package spring.model;


import java.util.*;

/**
 * 
 */
public class BillingInformation {

    /**
     *
     */
    private boolean insurance;

    /**
     *
     */
    private String insurancePlan;

    /**
     *
     */
    private String insurancePlanNumber;

    /**
     *
     */
    private Date effectiveDate;

    /**
     *
     */
    private String copay;

    /**
     *
     */
    private Address billingAddress;

    /**
     * Default constructor
     */
    public BillingInformation() {
        this.insurance = false;
        this.insurancePlan="name";
        this.insurancePlanNumber="number";
        this.effectiveDate=null;
        this.copay="amount";
        this.billingAddress=null;
    }

    /**
     * @param _insurance
     * @param _insurancePlan
     * @param _insurancePlanNumber
     * @param _effectiveDate
     * @param _copay
     * @param _billingAddress
     */
    public BillingInformation(boolean _insurance, String _insurancePlan, String _insurancePlanNumber, Date _effectiveDate, String _copay, Address _billingAddress) {
        this.insurance = _insurance;
        this.insurancePlan = _insurancePlan;
        this.insurancePlanNumber = _insurancePlanNumber;
        this.effectiveDate = _effectiveDate;
        this.copay = _copay;
        this.billingAddress =_billingAddress;
    }

    /**
     * @return
     */
    public boolean getInsurance() {
        return this.insurance;
    }
    /**
     * @param _insurance
     * @return
     */
    public void setInsurance(boolean _insurance) {
        this.insurance = _insurance;
    }
    /**
     * @return this.insurancePlan
     */
    public String getInsurancePlan() {
        return this.insurancePlan;
    }

    /**
     * @param _insurancePlan
     * @return
     */
    public void setInsurancePlan(String _insurancePlan) {
        this.insurancePlan = _insurancePlan;
    }

    /**
     * @return this.insurancePlanNumber
     */
    public String getInsurancePlanNumber() {
        return this.insurancePlanNumber;
    }

    /**
     * @param _insurancePlanNumber
     * @return
     */
    public void setInsurancePlanNumber(String _insurancePlanNumber) {
        this.insurancePlanNumber = _insurancePlanNumber;
    }

    /**
     * @return this.effectiveDate
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    /**
     * @param _effectiveDate
     * @return
     */
    public void setEffectiveDate(Date _effectiveDate) {
        this.effectiveDate = _effectiveDate;
    }
    /**
     * @return this.copay
     */
    public String getCopay() {
        return this.copay;
    }
    /**
     * @param _copay
     * @return
     */
    public void setCopay(String _copay) {
        this.copay = _copay;
    }
    /**
     * @return this.billingAddress
     */
    public Address getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * @param _billingAddress
     * @return
     */
    public void setBillingAddress(Address _billingAddress) {
        this.billingAddress = _billingAddress;
    }

    /**
     * @param _street
     * @param _zipcode
     * @param _county
     * @param _state
     * @return
     */
    public void setBillingAddress(String _street, int _zipcode, String _county, String _state) {
        // TODO implement here
    }

    /**
     * @param patientNum
     * @return
     */
    public String showBillingInformation(int patientNum) {
        // TODO implement here
        return "";
    }

}