package spring.model;

import java.util.*;

/**
 * Medical office class that serves as the central unit for the healthcare portal
 * and keeps track of the healthcare providers, admin and patients for the medical
 * office
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
public class MedicalOffice {
	/**
     * static instance of the medical office (makes use of singleton design pattern)
     */
	private static MedicalOffice medicalOfficeInstance = null;
    /**
     * name of the medical office
     */
    private String name;
    /**
     * address of the medical office (makes use of object composition)
     */
    private Address address;
    /**
     * phone number for the medical office
     */
    private String phone;
    /**
     * website for the medical office
     */
    private String website;
    /**
     * static list of the healthcare providers associated with this medical office
     */
    private static List<HealthcareProvider> healthcareProviderList;
    /**
     * static list of the admin associated with this medical office
     */
    private static List<Admin> adminList;
    /**
     * static list of the patients associated with this medical office
     */
    private static List<Patient> patientList;
    /**
     * static int for assigning a patient id for the medical office
     */
    private static int nextPatientID;
    /**
     * medical office calender
     */
    private MedicalOfficeSchedule calender;
    /**
     * Default constructor
     */
    private MedicalOffice() {
        this.name = "";
        this.address = new Address();
        this.phone = "";
        this.website = "";
        healthcareProviderList = new ArrayList<HealthcareProvider>();
        adminList = new ArrayList<Admin>();
        patientList = new ArrayList<Patient>();
        nextPatientID = 0;
    }
    /**
     * Overloaded constructor
     * 
     * @param _name name of the medical office
     * @param _address address of the medical office
     * @param _phone phone number for the medical office
     * @param _website website for the medical office
     * @param _heathcareProviderList list of the healthcare providers associated with this medical office
     * @param _adminList list of the admin associated with this medical office
     * @param _patientList list of the patients associated with this medical office
     */
    private MedicalOffice(String _name, Address _address, String _phone, String _website, List<HealthcareProvider> _heathcareProviderList, List<Admin> _adminList, List<Patient> _patientList) {
        this.name = _name;
        this.address = _address;
        this.phone = _phone;
        this.website = _website;
        healthcareProviderList = _heathcareProviderList;
        adminList = _adminList;
        patientList = _patientList;
        nextPatientID = 0;
    }
    /**
     * implementation of the singleton design pattern to ensure only one instance of the 
     * medical office is created. If the instance is null the medical office overloaded 
     * constructor is invoked, else it returns the medical office instance 
     * 
     * @param _name name of the medical office
     * @param _address address of the medical office
     * @param _phone phone number for the medical office
     * @param _website website for the medical office
     * @param _heathcareProviderList list of the healthcare providers associated with this medical office
     * @param _adminList list of the admin associated with this medical office
     * @param _patientList list of the patients associated with this medical office
     * 
     * @return medical office object
     */
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

    public static List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> _adminList) {
        adminList = _adminList;
    }

    public static List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> _patientList) {
        patientList = _patientList;
    }
    /**
     * Increment the static patientID variable to ensure unique patient identifiers when instantiating a new patient
     * @return nextPatientID
     */
    public static int getNextPatientID() {
    	System.out.println(nextPatientID);
    	nextPatientID++;
    	return nextPatientID;
    }
    /**
     * Increment the static patientID variable to ensure unique patient identifiers when instantiating a new patient
     * @return nextPatientID
     */
    public static int getCurrentPatientID() {
    	return nextPatientID;
    }
    /**
     * Increment the static patientID variable to ensure unique patient identifiers when instantiating a new patient
     * @return nextPatientID
     */
    public static void setCurrentPatientID(int _pid) {
    	nextPatientID = _pid;
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
   public static String showAdmin() {
	   ListIterator<Admin> iterator = adminList.listIterator();
	   String a = "";
	   while(iterator.hasNext()) {
		   Admin i = iterator.next();
		   a += i.getFirstName() + " " + i.getLastName() + ", " +  i.getJobTitle() + "\n";
	   }
	   return a;
   }
   public static String showPatients() {
	   ListIterator<Patient> iterator = patientList.listIterator();
	   String p = "";
	   while(iterator.hasNext()) {
		   Patient i = iterator.next();
		   p += i.getFirstName() + " " + i.getLastName() + ", patient id: " +  i.getPatientID() + "\n";
	   }
	   return p;
   }
	/**
	 * iterates through the providers patient list to find the patient
	 * @param _firstName patients first name
	 * @param _lastName patients last name
	 * @return patient 
	 */
   public Patient findPatient(String _firstName, String _lastName) {
	   ListIterator<Patient> iterator = patientList.listIterator();
	   while(iterator.hasNext()) {
		   Patient patient = iterator.next();
		   if ( (patient.getFirstName() == _firstName) & (patient.getLastName() == _lastName) ){
			   return patient;
		   }
	   }
	   return null;
   }
	/**
	 * iterates through the providers patient list to find the patient
	 * @param _patientID the patient's id
	 * @return patient 
	 */
   public Patient findPatient(int _patientID) {
	   ListIterator<Patient> iterator = patientList.listIterator();
	   while(iterator.hasNext()) {
		   Patient patient = iterator.next();
		   if (patient.getPatientID() == _patientID) {
			   return patient;
		   }
	   }
	   return null;
   }
}