package spring.model;


import java.util.*;

/**
 * 
 */
public class Appointment {
    /**
     * Date of the appointment
     */
    private Date date;
    /**
     * Time of the appointment
     */
    private String time;
    /**
     * Reason for the appointment
     */
    private String reason;
    /**
     * String of the Healthcare provider last name 
     */
    private String healthcareProviderStr;
    /**
     * Healthcare provider object
     */
    private HealthcareProvider healthcareProvider;
    /**
     * Patient object
     */
    private Patient patient;
    /**
     * Default constructor
     */
    public Appointment() {
        this.date = null;
        this.time = "";
        this.reason = "";
        this.healthcareProvider = null;
        this.healthcareProviderStr = "";
        this.patient = null;
    }

    /**
     * @param _date Date of the appointment
     * @param _time Time of the appointment
     * @param _reason Reason for the appointment
     * @param _healthcareProviderStr last name
     * @param _patient patient object
     */
    public Appointment(Date _date, String _time, String _reason, String _healthcareProviderStr, Patient _patient) {
        this.date = _date;
        this.time = _time;
        this.reason = _reason;
        this.healthcareProviderStr = _healthcareProviderStr;
        this.patient = _patient;
    }

    /**
     * getter
     * @return this.date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * setter
     * @param _date of the appointment
     */
    public void setDate(Date _date) {
        this.date = _date;
    }
    /**
     * getter
     * @return this.time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * setter
     * @param _time of the appointment
     */
    public void setTime(String _time) {
        this.time = _time;
    }

    /**
     * getter
     * @return this.reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * setter
     * @param _reason Reason for the appointment
     */
    public void setReason(String _reason) {
        this.reason = _reason;
    }

    /**
     * getter
     * @return this.healthcareProvider
     */
    public HealthcareProvider getHealthcareProvider() {
        return this.healthcareProvider;
    }

    /**
     * setter
     * @param _healthcareProvider HealthcareProvider object
     */
    public void setHealthcareProvider(HealthcareProvider _healthcareProvider) {
        this.healthcareProvider = _healthcareProvider;
    }
    /**
     * getter
     * @return this.healthcareProviderStr
     */
    public String getHealthcareProviderStr() {
        return this.healthcareProviderStr;
    }

    /**
     * setter
     * @param _healthcareProviderStr healthcare provider last name
     */
    public void setHealthcareProviderStr(String _healthcareProviderStr) {
        this.healthcareProviderStr = _healthcareProviderStr;
    }
    /**
     * getter
     * @return this.patient
     */
    public Patient getPatient() {
        return this.patient;
    }

    /**
     * setter
     * @param _patient patient object
     */
    public void setPatient(Patient _patient) {
        this.patient = _patient;
    }
    /**
     * Generates a string list of the health care providers with their last name 
     * @return a string of healthcare providers associated with the medical office
     */
    public List<String> getAllHealthcareProviders(){
	    List<String> healthcareProviders = new ArrayList<String>();
		ListIterator<HealthcareProvider> iterator = MedicalOffice.getHealthcareProviderList().listIterator();
		while(iterator.hasNext()) {
			HealthcareProvider i = iterator.next();
			healthcareProviders.add( i.getLastName());
		}
		return healthcareProviders;
    }
    /**
     * Generates a generic string list of the available appointment times
     * @return a string of healthcare providers associated with the medical office
     */
    public List<String> getAllAppointmentTimes(){
    	List<String> timesList = new ArrayList<String>();
		timesList.add("08:00-09:00");
		timesList.add("09:00-10:00");
		timesList.add("10:00-11:00");
		timesList.add("11:00-12:00");
		timesList.add("  ---  ");
		timesList.add("13:00-14:00");
		timesList.add("14:00-15:00");
		timesList.add("15:00-16:00");
		timesList.add("16:00-17:00");
		return timesList;
    }
}