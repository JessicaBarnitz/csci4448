
import java.util.*;

/**
 * 
 */
public class MedicalInformation {

    /**
     * 
     */
    private List<String> allergies;

    /**
     * 
     */
    private List<String> immunizations;

    /**
     * 
     */
    private List<String> currentMedications;

    /**
     * 
     */
    private String mentalStatusExam;

    /**
     * 
     */
    private String functionalStatusExam;

    /**
     * 
     */
    private List<String> personalMedicalHistory;

    /**
     * 
     */
    private List<String> familyMedicalHistory;

    /**
     * 
     */
    private List<HealthcareProvider> healthcareProviders;

    /**
     * 
     */
    private boolean consent;

    /**
     * Default constructor
     */
    public MedicalInformation() {
    }


    /**
     * @param _allergies 
     * @param _immunizations 
     * @param _currentMedications 
     * @param _mentalStatusExam 
     * @param _functionalStatusExam 
     * @param _personalMedicalHistory 
     * @param _familyMedicalHistory 
     * @param _consent 
     * @param _healthcareProviders 
     * @return
     */
    public void MedicalInformation(List<String> _allergies, List<String> _immunizations, List<String> _currentMedications, String _mentalStatusExam, String _functionalStatusExam, List<String> _personalMedicalHistory, List<String> _familyMedicalHistory, boolean _consent, List<HealthcareProvider> _healthcareProviders) {
        // TODO implement here
        return null;
    }

    public List<String> getAllergies() {
        return this.allergies;
    }
    /**
     * @param _allergies
     * @return none
     */
    public void setAllergies(List<String> _allergies) {
        this.allergies = _allergies;
    }
    /**
     * @param none
     * @return immunizations
     */
    public List<String> getImmunizations() {
        return this.immunizations;
    }

    public void setImmunizations(List<String> immunizations) {
        this.immunizations = immunizations;
    }

    public List<String> getCurrentMedications() {
        return currentMedications;
    }

    public void setCurrentMedications(List<String> currentMedications) {
        this.currentMedications = currentMedications;
    }

    public String getMentalStatusExam() {
        return mentalStatusExam;
    }

    public void setMentalStatusExam(String mentalStatusExam) {
        this.mentalStatusExam = mentalStatusExam;
    }

    public String getFunctionalStatusExam() {
        return functionalStatusExam;
    }

    public void setFunctionalStatusExam(String functionalStatusExam) {
        this.functionalStatusExam = functionalStatusExam;
    }

    public List<String> getPersonalMedicalHistory() {
        return personalMedicalHistory;
    }

    public void setPersonalMedicalHistory(List<String> personalMedicalHistory) {
        this.personalMedicalHistory = personalMedicalHistory;
    }

    public List<String> getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }

    public void setFamilyMedicalHistory(List<String> familyMedicalHistory) {
        this.familyMedicalHistory = familyMedicalHistory;
    }

    public List<HealthcareProvider> getHealthcareProviders() {
        return healthcareProviders;
    }

    public void setHealthcareProviders(List<HealthcareProvider> healthcareProviders) {
        this.healthcareProviders = healthcareProviders;
    }

    public boolean getConsent() {
        return consent;
    }

    public void setConsent(boolean consent) {
        this.consent = consent;
    }
    /**
     * @param patientNum
     * @return
     */
    public String showMedicalInformation(int patientNum) {
        // TODO implement here
        return "";
    }

}