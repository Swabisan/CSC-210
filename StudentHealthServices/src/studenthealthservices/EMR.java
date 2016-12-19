package studenthealthservices;

public class EMR {

    private String name = "";                                                   // Data fields, all private except numberOfPatients, which is static
    private String dateOfBirth = "";
    private String reasonForVisit = "";
    private double bodyTemperature;
    private double heartRate;
    private String diagnosis = "";
    private String prescribedMedicine = "";
    private int patientNumber;                                                  // This records each objects id number, while numberOfPatients tracks the total number of objects
    static int numberOfPatients = 0;

    public EMR() {                                                              // Default constructer
        setPatientNumber(numberOfPatients + 1);
        numberOfPatients++;
    }

    public EMR(String name, String dateOfBirth) {                               // Short-hand constructer
        setPatientNumber(numberOfPatients + 1);
        numberOfPatients++;
    }
                                                                                // Full constructer
    public EMR(String name, String dateOfBirth, String reasonForVisit, double bodyTemperature, double heartRate, String diagnosis, String prescribedMedicine) {
        setPatientNumber(numberOfPatients + 1);
        numberOfPatients++;
    }

    public boolean redFlags() {                                                 // Returns true if patient vitals are extreme
        return (getHeartRate() < 60 || getHeartRate() > 100) || (getHeartRate() < 97.3 || getHeartRate() > 99.1);
    }

    @Override                                                                   // **note: Idk what this does but netbeans was complaining. **todo: learn inheritance?
    public String toString() {
        return "\n****Patient " + patientNumber + "****\n" + "Name                : " + name + "\nDate of birth       : " + dateOfBirth + "\nReason for visit    : " + reasonForVisit + "\nBody temperature    : " + bodyTemperature + "\nHeart rate          : " + heartRate + "\nDiagnosis           : " + diagnosis + "\nPrescribed Medicine : " + prescribedMedicine;
    }

    public String getName() {                                                   // Getters and Setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        if (this.heartRate >= 0) {                                              // You can be dead (Heart Rate of 0) but you cant be deader than dead
            this.heartRate = heartRate;
        } else {
            System.out.println("Error: Attempt to set invalid Heart Rate.");    // **note: I know it's hardcoded, but you know... just in case.
        }
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public void setPrescribedMedicine(String prescribedMedicine) {
        this.prescribedMedicine = prescribedMedicine;
    }
    
    public int getPatientNumber(){
        return patientNumber;
    }
    
    private void setPatientNumber(int patientNumber){
        this.patientNumber = patientNumber;
    }

    public static int getNumberOfPatients() {                                   // No settter for numberOfPatients
        return numberOfPatients;
    }
}
