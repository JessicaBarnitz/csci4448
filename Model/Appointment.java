
import java.util.*;

/**
 * 
 */
public class Appointment {

    /**
     * 
     */
    private Date datetime;
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
        this.datetime = "";
        this.reason = "";
        this.healthcareProvider = "";
        this.patient = null;
    }

    /**
     * @param _datetime 
     * @param _reason 
     * @param _healthcareProvider 
     * @param _patient
     */
    public void Appointment(Date _datetime, String _reason, HealthcareProvider _healthcareProvider, Patient _patient) {
        this.datetime = _datetime;
        this.reason = _reason;
        this.healthcareProvider = _healthcareProvider;
        this.patient = _patient;
    }

    /**
     * @return
     */
    public Date getDatetime() {
        return this.datetime;
    }

    /**
     * @param Date _datetime 
     * @return
     */
    public void setDatetime(void Date _datetime) {
        this.datetime = _datetime;
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
    public boolean scheduleAppointment(Patient _patient, Date _datetime, String _reason) {
        // TODO implement here
        return false;
    }

    /**
     * @param Patient _patient 
     * @param Date _datetime 
     * @param String _reason 
     * @return
     */
    public boolean cancelAppointment(Patient _patient, Date _datetime, String _reason) {
        // TODO implement here
        return false;
    }

    /**
     * @param Patient _patient 
     * @param Date_ datetime 
     * @param String _reason 
     * @param HealthcareProvider healthcareProvider 
     * @return
     */
    public void patientAppointment(Patient _patient, Date_ datetime, String _reason, HealthcareProvider healthcareProvider) {
        // TODO implement here
        return null;
    }

}