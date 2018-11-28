package spring.model;


import java.util.*;

/**
 * 
 */
public class Appointment {

    /**
     * 
     */
    private Date date;
    /**
     * 
     */
    private String time;
    /**
     * 
     */
    private String reason;
    /**
     * 
     */
    private String healthcareProviderStr;
    /**
     * 
     */
    private HealthcareProvider healthcareProvider;
    /**
     * 
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
     * @param _date
     * @param _time
     * @param _reason 
     * @param _healthcareProvider 
     * @param _patient
     */
    public Appointment(Date _date, String _time, String _reason, HealthcareProvider _healthcareProvider, Patient _patient) {
        this.date = _date;
        this.time = _time;
        this.reason = _reason;
        this.healthcareProvider = _healthcareProvider;
        this.patient = _patient;
    }

    /**
     * @return
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * @param Date _date 
     * @return
     */
    public void setDate(Date _date) {
        this.date = _date;
    }
    /**
     * @return
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @param String _time 
     * @return
     */
    public void setTime(String _time) {
        this.time = _time;
    }

    /**
     * @return
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @param String _reason 
     * @return
     */
    public void setReason(String _reason) {
        this.reason = _reason;
    }

    /**
     * @return
     */
    public HealthcareProvider getHealthcareProvider() {
        return this.healthcareProvider;
    }

    /**
     * @param HealthcareProvider _healthcareProvider 
     * @return
     */
    public void setHealthcareProvider(HealthcareProvider _healthcareProvider) {
        this.healthcareProvider = _healthcareProvider;
    }
    /**
     * @return
     */
    public String getHealthcareProviderStr() {
        return this.healthcareProviderStr;
    }

    /**
     * @param HealthcareProvider _healthcareProvider 
     * @return
     */
    public void setHealthcareProviderStr(String _healthcareProviderStr) {
        this.healthcareProviderStr = _healthcareProviderStr;
    }
    /**
     * @return
     */
    public Patient getPatient() {
        return this.patient;
    }

    /**
     * @param Patient _patient 
     * @return
     */
    public void setPatient(Patient _patient) {
        this.patient = _patient;
    }
    /**
     * Generates a string list of the health care providers with their first and last name 
     * @return a string of healthcare providers associated with the medical office
     */
    public List<String> getAllHealthcareProviders(){
	    List<String> healthcareProviders = new ArrayList<String>();
		ListIterator<HealthcareProvider> iterator = MedicalOffice.getHealthcareProviderList().listIterator();
		while(iterator.hasNext()) {
			HealthcareProvider i = iterator.next();
			healthcareProviders.add("Dr. " + i.getFirstName() + " " + i.getLastName());
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
    /**
     * @param Patient _patient 
     * @param Date _datetime 
     * @param String _reason 
     * @return
     */
    public boolean scheduleAppointment(Patient _patient, Date _date, String _time, String _reason) {
        System.out.println("Schedule appointment from java");
        return false;
    }

    /**
     * @param Patient _patient 
     * @param Date _datetime 
     * @param String _reason 
     * @return
     */
    public boolean cancelAppointment(Patient _patient, Date _date, String _time) {
    	System.out.println("cancel appointment from java");
        return false;
    }

    /**
     * @param Patient _patient 
     * @param Date_ datetime 
     * @param String _reason 
     * @param HealthcareProvider healthcareProvider 
     * @return
     */
    public void patientAppointment(Patient _patient, Date _datetime, String _reason, HealthcareProvider healthcareProvider) {
        // TODO implement here
    }

}