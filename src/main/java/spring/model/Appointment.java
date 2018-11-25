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
    public void sethealthcareProvider(HealthcareProvider _healthcareProvider) {
        this.healthcareProvider = _healthcareProvider;
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
     * @param Patient _patient 
     * @param Date _datetime 
     * @param String _reason 
     * @return
     */
    public boolean scheduleAppointment(Patient _patient, Date _date, String _time, String _reason) {
        System.out.println("Schedule appointment");
        return false;
    }

    /**
     * @param Patient _patient 
     * @param Date _datetime 
     * @param String _reason 
     * @return
     */
    public boolean cancelAppointment(Patient _patient, Date _date, String _time) {
    	System.out.println("cancel appointment");
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