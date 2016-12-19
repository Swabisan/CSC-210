package studenthealthservices;

/**
 *
 * @author Michael Swanson
 */
public class StudentHealthServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayNumberofPatients();                                              // Message method that prints out the amount of patient objects that have been created thus far
        EMR [] patientID = initializePatients(5);                               // Creates 5 patient objects **note-todo: generate this in less code **update-done: used an array of objects
        displayNumberofPatients();                                              // Should print out the previous number +5
        patientOne(patientID);                                                  // Calls for each patient method. **note: If built for user interaction, would use one interchangable method
        patientTwo(patientID);
        patientThree(patientID);
        System.out.println((int)'F');
    }

    public static void displayNumberofPatients() {                               // Calls and prints the static int numberOfPatients
        System.out.println("Number of Patients  : " + EMR.getNumberOfPatients());
    }

    public static void patientOne(EMR[] patientID) {                            // Methods patientOne, Two, and Three are all the same, just different values
        patientID[0].setName("Rick");                                           // Sets all data fields, calls and prints the toString method in class EMR with the object as the implicit paramater
        patientID[0].setDateOfBirth("Unknown ~ 80 years old");
        patientID[0].setBodyTemperature(50.996500);
        patientID[0].setHeartRate(30.000000);
        patientID[0].setReasonForVisit("Alcohol poisoning");
        patientID[0].setDiagnosis("Alcoholic");
        patientID[0].setPrescribedMedicine("Liver transplant");

        System.out.println(patientID[0].toString());
    }

    public static void patientTwo(EMR[] patientID) {
        patientID[1].setName("Peter");
        patientID[1].setDateOfBirth("06/22/1955");
        patientID[1].setBodyTemperature(98.600000);
        patientID[1].setHeartRate(89.000000);
        patientID[1].setReasonForVisit("Stroke");
        patientID[1].setDiagnosis("30 McBurgers in one sitting");
        patientID[1].setPrescribedMedicine("Stem Cells");
        System.out.println(patientID[1].toString());
    }

    public static void patientThree(EMR[] patientID) {
        patientID[2].setName("Shrek");
        patientID[2].setDateOfBirth("05/14/1989");
        patientID[2].setBodyTemperature(420.800850);
        patientID[2].setHeartRate(69.690000);
        patientID[2].setReasonForVisit("Green");
        patientID[2].setDiagnosis("Ogre");
        patientID[2].setPrescribedMedicine("Happily Ever After Potion");
        System.out.println(patientID[2].toString());
    }

    private static EMR[] initializePatients(int patientCount) {
        EMR[] patientID = new EMR[5];
        for (int i = 0; i < patientCount; i++) {
            patientID[i] = new EMR();
        }
        return patientID;
    }

}
