package spring.model;

import java.util.*;

/**
 * 
 */
public class MedicalOfficeSchedule {

    /**
     * 
     */
    private Calendar schedule;
    /**
     * Default constructor
     */
    public MedicalOfficeSchedule() {
        this.schedule = null;
    }
    /**
     * @return
     */
    public Calendar getSchedule() {
        return this.schedule;
    }
    /**
    * @param _schedule
    * @return
    */
    public void setSchedule(Calendar _schedule) {
        this.schedule = _schedule;
    }

   /**
    * @param _patient
    * @param _datetime
    * @param _reason
    * @return
    */
   public boolean updateSchedule(Patient _patient, Date _datetime, String _reason) {
       // TODO implement here
       return false;
    }

}