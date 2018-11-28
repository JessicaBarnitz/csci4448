package spring.model;

import java.util.*;

import spring.model.Observer;

/**
 * Patient class that serves as the central unit for the patient
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
public class Patient extends User implements Observer{
	/**
     * A string describing the type of user
     */
	private String user;
	/**
     * The unique patient number
     */
	private int patientID;
	/**
     * A list of this patients appointments
     */
	private List<Appointment> appointments;
	/**
     * patient billing information
     */
	private BillingInformation billingInformation;
	/**
     * patient medical information
     */
	private MedicalInformation medicalInformation;
	/**
     * patient personal information
     */
	private PersonalInformation personalInformation;
	/**
     * Default constructor
     */
    public Patient() {
    	this.user = "patient";
    	this.patientID = MedicalOffice.getCurrentPatientID();
    	MedicalOffice.getNextPatientID();
    	this.appointments = new ArrayList<Appointment>();
    }
    /**
     * Overloaded constructor
     * 
     * @param _username user provided String username
     * @param _password user provided String password
     * @param _firstName user provided String first name
     * @param _lastName user provided String last name
     * @param _dateOfBirth user provided Date date of birth in form (mm/dd/yyyy)
     */
    public Patient(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth){
    	this.user = "patient";
    	this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
        this.patientID = MedicalOffice.getNextPatientID();
        this.appointments = new ArrayList<Appointment>();
    }
    /**
    * getter for the type of user
    * @return this.user
    */
    public String getUser() {
        return this.user;
    }
    /**
    * getter
    * @return this.patientID
    */
    public int getPatientID() {
        return this.patientID;
    }
    /**
    * setter
    * @param _patientID 
    */
    public void setPatientID(int _patientID) {
        this.patientID = _patientID;
    }
    /**
    * setter
    * @param _billingInformation object 
    */
    public void setBillingInformation(BillingInformation _billingInformation) {
        this.billingInformation = _billingInformation;
    }
    /**
     * getter
     * @return this.billingInformation
     */
    public BillingInformation getBillingInformation() {
        return this.billingInformation;
    }
    /**
    * setter
    * @param _medicalInformation object 
    */
    public void setMedicalInformation(MedicalInformation _medicalInformation) {
        this.medicalInformation = _medicalInformation;
    }
    /**
     * getter
     * @return this.medicalInformation
     */
    public MedicalInformation getMedicalInformation() {
        return this.medicalInformation;
    }
    /**
    * setter
    * @param _personalInformation object 
    */
    public void setPersonalInformation(PersonalInformation _personalInformation) {
        this.personalInformation = _personalInformation;
    }
    /**
     * getter
     * @return this.billingInformation
     */
    public PersonalInformation getPersonalInformation() {
        return this.personalInformation;
    }
    /**
     * getter
     * @return _this.appointments
     */
    public List<Appointment> getAppointments() {
        return this.appointments;
    }
    /**
     * add an appointment to the patients appointments 
     * @param _patient
     */
    public void addAppointment(Appointment _appointment) {
        this.appointments.add(_appointment);
    }
    /**
     * returns a string of all the patients upcoming and previous appointments
     * @return concatenated string on the patients upcoming and previous appointments
     */
    public String showAppointments() {
 	   ListIterator<Appointment> iterator = appointments.listIterator();
 	   String appointments = "";
 	   while(iterator.hasNext()) {
 		   Appointment i = iterator.next();
 		   appointments += i.getDate() + ", " + i.getTime() + ", for " +  i.getReason() + " with Dr. " + i.getHealthcareProviderStr() + "\n";
 	   }
 	   return appointments;
    }
    /**
     * cancels an upcoming patients appointment
     * @param _date the date of the appointment
     * @param _time the time of the appointment
     */
    public void cancelAppointment(Date _date, String _time) {
  	   ListIterator<Appointment> iterator = appointments.listIterator();
  	   while(iterator.hasNext()) {
  		   Appointment i = iterator.next();
  		   if ((i.getDate().equals(_date)) && (i.getTime().equals(_time)) ) {
  			   iterator.remove();
  		   }
  	   }
     }
    /**
     * login ensures that the username and password are correct
     * 
     * @param _username user provided String username
     * @param _password userprovided String password
     * @return this on success
     * @return null on failure
     */
   public Patient login(String _username, String _password) {
       if( (this.username == _username) && (this.password == _password) ) {
    	   return this;
       }
       else {
    	   return null;
       }
   }
	@Override
	public void update(String _update) {
		// TODO Auto-generated method stub
		
	}
}