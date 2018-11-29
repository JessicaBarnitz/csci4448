package spring.model;


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
//    private List<HealthcareProvider> healthcareProviders;

    /**
     * 
     */
    private boolean consent;

    /**
     * Default constructor
     */
    public MedicalInformation() {
    	this.allergies = null;
    	this.immunizations = null;
    	this.currentMedications = null;
    	this.mentalStatusExam = "";
    	this.functionalStatusExam = "";
    	this.personalMedicalHistory = null;
    	this.familyMedicalHistory = null;
    	this.consent = false;
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
//     * @param _healthcareProviders 
     * @return
     */
    public MedicalInformation(List<String> _allergies, List<String> _immunizations, List<String> _currentMedications, String _mentalStatusExam, String _functionalStatusExam, List<String> _personalMedicalHistory, List<String> _familyMedicalHistory, boolean _consent) {//, List<HealthcareProvider> _healthcareProviders) {
    	this.allergies = _allergies;
    	this.immunizations = _immunizations;
    	this.currentMedications = _currentMedications;
    	this.mentalStatusExam = _mentalStatusExam;
    	this.functionalStatusExam = _functionalStatusExam;
    	this.personalMedicalHistory = _personalMedicalHistory;
    	this.familyMedicalHistory = _familyMedicalHistory;
    	this.consent = _consent;
    }
    /**
     * getter
     * @return _allergies
     */
    public List<String> getAllergies() {
        return this.allergies;
    }
    /**
     * setter
     * @param _allergies
     */
    public void setAllergies(List<String> _allergies) {
        this.allergies = _allergies;
    }
    /**
     * getter
     * @return immunizations
     */
    public List<String> getImmunizations() {
        return this.immunizations;
    }
    /**
     * setter
     * @param immunizations
     */
    public void setImmunizations(List<String> immunizations) {
        this.immunizations = immunizations;
    }
    /**
     * getter
     * @return currentMedications
     */
    public List<String> getCurrentMedications() {
        return currentMedications;
    }
    /**
     * setter
     * @param currentMedications
     */
    public void setCurrentMedications(List<String> currentMedications) {
        this.currentMedications = currentMedications;
    }
    /**
     * getter
     * @return mentalStatusExam
     */
    public String getMentalStatusExam() {
        return mentalStatusExam;
    }
    /**
     * setter
     * @param mentalStatusExam
     */
    public void setMentalStatusExam(String mentalStatusExam) {
        this.mentalStatusExam = mentalStatusExam;
    }
    /**
     * getter
     * @return functionalStatusExam
     */
    public String getFunctionalStatusExam() {
        return functionalStatusExam;
    }
    /**
     * setter
     * @param functionalStatusExam
     */
    public void setFunctionalStatusExam(String functionalStatusExam) {
        this.functionalStatusExam = functionalStatusExam;
    }
    /**
     * getter
     * @return personalMedicalHistory list
     */
    public List<String> getPersonalMedicalHistory() {
        return personalMedicalHistory;
    }
    /**
     * setter
     * @param personalMedicalHistory list
     */
    public void setPersonalMedicalHistory(List<String> personalMedicalHistory) {
        this.personalMedicalHistory = personalMedicalHistory;
    }
    /**
     * getter
     * @return familyMedicalHistory list
     */
    public List<String> getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }
    /**
     * setter
     * @param familyMedicalHistory list
     */
    public void setFamilyMedicalHistory(List<String> familyMedicalHistory) {
        this.familyMedicalHistory = familyMedicalHistory;
    }

//    public List<HealthcareProvider> getHealthcareProviders() {
//        return healthcareProviders;
//    }
//
//    public void setHealthcareProviders(List<HealthcareProvider> healthcareProviders) {
//        this.healthcareProviders = healthcareProviders;
//    }
    /**
     * getter
     * @return consent
     */
    public boolean getConsent() {
        return consent;
    }
    /**
     * setter
     * @param consent
     */
    public void setConsent(boolean consent) {
        this.consent = consent;
    }
    /**
     * show patient medical information for given patientID
     * @param patientNum
     * @return
     */
    public String showMedicalInformation(int patientNum) {
        // TODO implement here
        return "";
    }

}