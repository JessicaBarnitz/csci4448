
import java.util.*;

/**
 * 
 */
public class PatientInformation {

    /**
     * 
     */
    private List<Patient> patientList;
    /**
     * Default constructor
     */
    public PatientInformation() {
        this.patientList = null;
    }
    /**
    * @return
    */
    public List<Patient> getPatientList() {
        return patientList;
    }
   /**
    * @param patientList
    * @return
    */
    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
   /**
    * @param Patient
    * @return
    */
   public void addPatient(void Patient) {
       // TODO implement here
       return null;
   }
   /**
    * @param firstName
    * @param lastName
    * @param dateOfBirth
    * @return
    */
   public Patient searchPatient(String firstName, String lastName, Date dateOfBirth) {
       // TODO implement here
       return null;
   }
   /**
    * @param patientNumber
    * @return
    */
   public Patient searchPatient(int patientNumber) {
       // TODO implement here
       return null;
   }

}