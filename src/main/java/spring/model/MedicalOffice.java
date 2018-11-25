package spring.model;

import java.util.*;

/**
 * 
 */
public class MedicalOffice {

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Address address;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String website;

    /**
     * 
     */
    private List<HealthcareProvider> healthcareProviderList;

    /**
     * 
     */
    private List<Admin> adminList;

    /**
     * 
     */
    private List<Patient> patientList;

    /**
     * 
     */
    private MedicalOfficeSchedule calender;
    /**
     * Default constructor
     */
    public MedicalOffice() {
        this.name = "";
        this.address = null;
        this.phone = "";
        this.website = "";
//        List<healthcareProvider> healthcareProviderList = Collections.emptyList();
        this.adminList = null;
    }
        /**
     * @param _name 
     * @param _address 
     * @param _phone 
     * @param _website 
     * @param _heathcareProviderList 
     * @param _adminList
     */
    public MedicalOffice(String _name, Address _address, String _phone, String _website, List<HealthcareProvider> _heathcareProviderList, List<Admin> _adminList) {
        this.name = _name;
        this.address = _address;
        this.phone = _phone;
        this.website = _website;
        this.healthcareProviderList = _heathcareProviderList;
        this.adminList = _adminList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address _address) {
        this.address = _address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String _phone) {
        this.phone = _phone;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String _website) {
        this.website = _website;
    }

    public List<HealthcareProvider> getHealthcareProviderList() {
        return this.healthcareProviderList;
    }

    public void setHealthcareProviderList(List<HealthcareProvider> _healthcareProviderList) {
        this.healthcareProviderList = _healthcareProviderList;
    }

    public List<Admin> getAdminList() {
        return this.adminList;
    }

    public void setAdminList(List<Admin> _adminList) {
        this.adminList = _adminList;
    }

    public List<Patient> getPatientList() {
        return this.patientList;
    }

    public void setPatientList(List<Patient> _patientList) {
        this.patientList = _patientList;
    }

    public MedicalOfficeSchedule getCalender() {
        return this.calender;
    }

    public void setCalender(MedicalOfficeSchedule _calender) {
        this.calender = _calender;
    }
   /**
    * add healthcare provider to the healthcare provider list
    * @param HealthcareProvider _healthcareProvider
    * @return
    */
   public void addHealthcareProvider(HealthcareProvider _healthcareprovider) {
       this.healthcareProviderList.add(_healthcareprovider);
   }
   /**
    * add admin to the admin list
    * @param Admin _admin
    * @return
    */
   public void addAdmin(Admin _admin) {
       this.adminList.add(_admin);
   }

   /**
    * add patient to the patient list
    * @param Patient _patient
    * @return
    */
   public void addPatient(Patient _patient) {
       this.patientList.add(_patient);
   }

   /**
    * formats the address as a comma seperated string
    * @return address.getStreet() + ", " + address.getCity() + ", " + address.getCounty() + ", " + address.getState() + ", " + address.getZipcode()
    */
   public String showAddress() {
       return(address.getStreet() + ", " + address.getCity() + ", " + address.getCounty() + ", " + address.getState() + ", " + address.getZipcode());
   }

}