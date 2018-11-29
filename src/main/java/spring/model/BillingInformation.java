package spring.model;


import java.util.*;

/**
 * Billing informations class for object composition 
 * 
 * @author Jessica Barnitz
 * @version 1.0
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
        this.insurancePlan="";
        this.insurancePlanNumber="";
        this.effectiveDate=null;
        this.copay="";
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
     * getter
     * @return this.insurance
     */
    public boolean getInsurance() {
        return this.insurance;
    }
    /**
     * setter
     * @param _insurance
     */
    public void setInsurance(boolean _insurance) {
        this.insurance = _insurance;
    }
    /**
     * getter
     * @return this.insurancePlan
     */
    public String getInsurancePlan() {
        return this.insurancePlan;
    }

    /**
     * setter
     * @param _insurancePlan
     */
    public void setInsurancePlan(String _insurancePlan) {
        this.insurancePlan = _insurancePlan;
    }

    /**
     * getter
     * @return this.insurancePlanNumber
     */
    public String getInsurancePlanNumber() {
        return this.insurancePlanNumber;
    }

    /**
     * setter
     * @param _insurancePlanNumber
     */
    public void setInsurancePlanNumber(String _insurancePlanNumber) {
        this.insurancePlanNumber = _insurancePlanNumber;
    }

    /**
     * getter
     * @return this.effectiveDate
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    /**
     * setter
     * @param _effectiveDate
     */
    public void setEffectiveDate(Date _effectiveDate) {
        this.effectiveDate = _effectiveDate;
    }
    /**
     * getter
     * @return this.copay
     */
    public String getCopay() {
        return this.copay;
    }
    /**
     * setter
     * @param _copay
     */
    public void setCopay(String _copay) {
        this.copay = _copay;
    }
    /**
     * getter
     * @return this.billingAddress
     */
    public Address getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * setter
     * @param _billingAddress
     */
    public void setBillingAddress(Address _billingAddress) {
        this.billingAddress = _billingAddress;
    }

    /**
     * show the billing address as a string
     * @param patientNum
     * @return
     */
    public String showBillingInformation(int patientNum) {
        // TODO implement here
        return "";
    }

}