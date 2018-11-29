package spring.model;

import java.util.*;

import spring.model.Observer;

/**
 * Medical office class that serves as the central unit for the healthcare portal
 * and keeps track of the healthcare providers, admin and patients for the medical
 * office
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
public class MedicalOffice extends Observable{
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
     * static int for assigning a patient id for the medical office
     */
    private static int nextPatientID;
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
    //medical office is the subject
    /**
     * list of observers to be notified of change
     */
    private List<Observer> observersList = new ArrayList<Observer>();
    /**
     * state that changed
     */
    private String state;
    /**
     * getter
     * @return this.state
     */
    public String getState() {
        return this.state;
     }

     public void setState(String _state) {
        this.state = _state;
        notifyAllObservers(_state);
     }

     public void addObserver(Admin observer){
        observersList.add(observer);
        System.out.println("Admin observer added" + observer);
     }

     public void notifyAllObservers(String _state){
        for (Observer observer : observersList) {
           System.out.println("Updating observer " + observer + " with "+ _state);
           observer.update(_state);
        }
     }
    /**
     * Default constructor
     */
    private MedicalOffice() {
        this.name = "";
        this.address = new Address();
        this.phone = "";
        this.website = "";
        nextPatientID = 0;
        healthcareProviderList = new ArrayList<HealthcareProvider>();
        adminList = new ArrayList<Admin>();
        patientList = new ArrayList<Patient>();  
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
        nextPatientID = 0;
        healthcareProviderList = _heathcareProviderList;
        adminList = _adminList;
        patientList = _patientList;
       
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
    /**
     * getter
     * @return this.name
     */
    public String getName() {
        return this.name;
    }
    /**
     * setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getter
     * @return this.address
     */
    public Address getAddress() {
        return this.address;
    }
    /**
     * setter
     * @param _address object
     */
    public void setAddress(Address _address) {
        this.address = _address;
    }
    /**
     * getter
     * @return this.phone
     */
    public String getPhone() {
        return this.phone;
    }
    /**
     * setter
     * @param _phone
     */
    public void setPhone(String _phone) {
        this.phone = _phone;
    }
    /**
     * getter
     * @return this.website
     */
    public String getWebsite() {
        return this.website;
    }
    /**
     * setter
     * @param _website
     */
    public void setWebsite(String _website) {
        this.website = _website;
    }
    /**
     * getter
     * @return _healthcareProviderList
     */
    public static List<HealthcareProvider> getHealthcareProviderList() {
        return healthcareProviderList;
    }
    /**
     * setter
     * @param _healthcareProviderList
     */
    public void setHealthcareProviderList(List<HealthcareProvider> _healthcareProviderList) {
        healthcareProviderList = _healthcareProviderList;
    }
    /**
     * getter
     * @return _adminList
     */
    public static List<Admin> getAdminList() {
        return adminList;
    }
    /**
     * setter
     * @param _adminList
     */
    public void setAdminList(List<Admin> _adminList) {
        adminList = _adminList;
    }
    /**
     * getter
     * @return _patientList
     */
    public static List<Patient> getPatientList() {
        return patientList;
    }
    /**
     * setter
     * @param _patientList
     */
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
   /**
    * formats the list of healthcare providers by first and last name and specialty as a comma separated string
    * @return hcp_string
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
   /**
	 * formats the list of admin by first and last name and job title as a comma separated string
	 * @return admin_string 
	 */
   public static String showAdmin() {
	   ListIterator<Admin> iterator = adminList.listIterator();
	   String a = "";
	   while(iterator.hasNext()) {
		   Admin i = iterator.next();
		   a += i.getFirstName() + " " + i.getLastName() + ", " +  i.getJobTitle() + "\n";
	   }
	   return a;
   }
   /**
	 * formats the list of patients by first and last name and id as a comma separated string
	 * @return patient_string  
	 */
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
   public static Patient findPatient(String _firstName, String _lastName) {
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
   public static Patient findPatient(int _patientID) {
	   ListIterator<Patient> iterator = patientList.listIterator();
	   while(iterator.hasNext()) {
		   Patient patient = iterator.next();
		   System.out.println(patient.getPatientID() + " " + _patientID);
		   if (patient.getPatientID() == _patientID) {
			   return patient;
		   }
	   }
	   return null;
   }
	/**
	 * iterates through the health care providers list to find the provider
	 * @param _lastName healthcare providers last name
	 * @return provider 
	 */
  public static HealthcareProvider findHealthcareProvider(String _lastName) {
	   ListIterator<HealthcareProvider> iterator = healthcareProviderList.listIterator();
	   while(iterator.hasNext()) {
		   HealthcareProvider provider = iterator.next();
		   if (provider.getLastName() == _lastName) {
			   return provider;
		   }
	   }
	   return null;
  }
}