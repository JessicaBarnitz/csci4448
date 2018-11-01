
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
    private List<HealthcareProvider> HealthcareProviderList;

    /**
     * 
     */
    private List<Admin> AdminList;

    /**
     * 
     */
    private List<Patient> PatientList;

    /**
     * 
     */
    private MedicalOfficeSchedule Calender;
    /**
     * Default constructor
     */
    public MedicalOffice() {
        this.name = "";
        this.address = "";
        this.phone = "";
        this.website = "";
        this.healthcareProviderList = null;
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
    public void MedicalOffice(String _name, Address _address, String _phone, String _website, List<HealthcareProvider> _heathcareProviderList, List<Admin> _adminList) {
        this.name = _name;
        this.address = _address;
        this.phone = _phone;
        this.website = _website;
        this.healthcareProviderList = _heathcareProviderList;
        this.adminList = _adminList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<HealthcareProvider> getHealthcareProviderList() {
        return HealthcareProviderList;
    }

    public void setHealthcareProviderList(List<HealthcareProvider> healthcareProviderList) {
        HealthcareProviderList = healthcareProviderList;
    }

    public List<Admin> getAdminList() {
        return AdminList;
    }

    public void setAdminList(List<Admin> adminList) {
        AdminList = adminList;
    }

    public List<Patient> getPatientList() {
        return PatientList;
    }

    public void setPatientList(List<Patient> patientList) {
        PatientList = patientList;
    }

    public MedicalOfficeSchedule getCalender() {
        return Calender;
    }

    public void setCalender(MedicalOfficeSchedule calender) {
        Calender = calender;
    }
   /**
    * @param HealthcareProvider hcp
    * @return
    */
   public void addHealthcareProvider(HealthcareProvider hcp) {
       // TODO implement here
       return null;
   }
   /**
    * @param a
    * @return
    */
   public void addAdmin(Admin a) {
       // TODO implement here
       return null;
   }

   /**
    * @param Patient p
    * @return
    */
   public void addPatient(void Patient p) {
       // TODO implement here
       return null;
   }

   /**
    * @return
    */
   public Address showAddress() {
       // TODO implement here
       return null;
   }

}