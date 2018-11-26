package spring.model;

import java.util.*;

/**
 * 
 */
public class MedicalOffice {
	private static MedicalOffice medicalOfficeInstance = null;
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
    private static List<HealthcareProvider> healthcareProviderList;

    /**
     * 
     */
    private static List<Admin> adminList;

    /**
     * 
     */
    private static List<Patient> patientList;

    /**
     * 
     */
    private MedicalOfficeSchedule calender;
//    /**
//     * Default constructor
//     */
//    public MedicalOffice() {
//        this.name = "";
//        this.address = new Address();
//        this.phone = "";
//        this.website = "";
//        healthcareProviderList = new ArrayList<HealthcareProvider>();
//        adminList = new ArrayList<Admin>();
//        patientList = new ArrayList<Patient>();
//    }
        /**
     * @param _name 
     * @param _address 
     * @param _phone 
     * @param _website 
     * @param _heathcareProviderList 
     * @param _adminList
     */
    public MedicalOffice(String _name, Address _address, String _phone, String _website, List<HealthcareProvider> _heathcareProviderList, List<Admin> _adminList, List<Patient> _patientList) {
        this.name = _name;
        this.address = _address;
        this.phone = _phone;
        this.website = _website;
        healthcareProviderList = _heathcareProviderList;
        adminList = _adminList;
        patientList = _patientList;
    }
    public static MedicalOffice getInstance(String _name, Address _address, String _phone, String _website, List<HealthcareProvider> _heathcareProviderList, List<Admin> _adminList, List<Patient> _patientList) {
    	if (medicalOfficeInstance == null) {
    		medicalOfficeInstance = new MedicalOffice(_name, _address, _phone, _website, _heathcareProviderList, _adminList, _patientList);
    	}
    	return medicalOfficeInstance;
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

    public static List<HealthcareProvider> getHealthcareProviderList() {
        return healthcareProviderList;
    }

    public void setHealthcareProviderList(List<HealthcareProvider> _healthcareProviderList) {
        healthcareProviderList = _healthcareProviderList;
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> _adminList) {
        adminList = _adminList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> _patientList) {
        patientList = _patientList;
    }

    public MedicalOfficeSchedule getCalender() {
        return this.calender;
    }

    public void setCalender(MedicalOfficeSchedule _calender) {
        this.calender = _calender;
    }
   /**
    * add healthcare provider to the healthcare provider list
    * @param _healthcareProvider
    * @return
    */
   public static void addHealthcareProvider(HealthcareProvider _healthcareprovider) {
       healthcareProviderList.add(_healthcareprovider);
   }
   /**
    * add admin to the admin list
    * @param _admin
    * @return
    */
   public static void addAdmin(Admin _admin) {
       adminList.add(_admin);
   }

   /**
    * add patient to the patient list
    * @param _patient
    * @return
    */
   public static void addPatient(Patient _patient) {
       patientList.add(_patient);
   }

   /**
    * formats the address as a comma separated string
    * @return address.getStreet() + ", " + address.getCity() + ", " + address.getCounty() + ", " + address.getState() + ", " + address.getZipcode()
    */
   public String showAddress() {
	   return address.showAddress();
  }
//   /**
//    * formats the list of healthcare providers by first and last name and specialty as a comma separated string
//    * @return hcp
//    */
//   public String showHealthcareProviders() {
//	   ListIterator<HealthcareProvider> iterator = healthcareProviderList.listIterator();
//	   String hcp = "";
//	   while(iterator.hasNext()) {
//		   HealthcareProvider i = iterator.next();
//		   hcp += "Dr. " + i.getFirstName() + " " + i.getLastName() + ", " +  i.getSpecialty() + "\n";
//	   }
//	   return hcp;
//   }
   /**
    * formats the list of healthcare providers by first and last name and specialty as a comma separated string
    * @return hcp
    */
   public static String showHealthcareProviders() {
	   ListIterator<HealthcareProvider> iterator = healthcareProviderList.listIterator();
	   String hcp = "";
	   while(iterator.hasNext()) {
		   HealthcareProvider i = iterator.next();
		   hcp += "Dr. " + i.getFirstName() + " " + i.getLastName() + ", " +  i.getSpecialty() + "\n";
	   }
	   return hcp;
   }

}