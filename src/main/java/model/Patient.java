
import java.util.*;

/**
 * 
 */
public class Patient extends User {
    /**
     * 
     */
    private int patientNum;
    /**
     * Default constructor
     */
    public Patient() {
        this.patientNum = null;
    }
    /**
     * @param int _patientNum 
     * @return
     */
    public void setPatientNum(int _patientNum) {
        this.patientNum = _patientNum;
    }
    /**
     * @return
     */
    public int getPatientNum() {
        return this.patientNum;
    }

    /**
     * @param username 
     * @param password 
     * @return
     */
    public Patient login(void username, void password) {
        // TODO implement here
        return null;
    }

}