import java.util.ArrayList;

public class Child {

    public String firstName;
    public String lastName;
    public String age;
    public String allergy;
    public String medication;
    public Sessions Session;
    public emergencyContact emergencyContact;
    public healthInfo healthInfo;
    public ArrayList<String> allergies = new ArrayList<String>();
    public ArrayList<String> medications = new ArrayList<String>();
    public ArrayList<String> emergencyContacts = new ArrayList<String>();

<<<<<<< HEAD
    public Child(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void addAllergies(ArrayList<String> allergies) {

    }

    public void addMedication(ArrayList<String> medications) {

    }

    public void addEmergencyContact(emergencyContact emergencyContact) {

    }

    public void addHealthInfo(healthInfo healthInfo) {

=======
    public Child(String firstName, String lastName, String age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void addAllergies(ArrayList<String> allergies)
    {
        allergies.add(allergy);
    }
    public void addMedication(ArrayList<String> medications)
    {
        medications.add(medication);
    }
    public void addEmergencyContact(emergencyContact emergencyContact)
    {
        emergencyContacts.add(emergencyContact);
    }
    public void addHealthInfo(healthInfo healthInfo)
    {
        addHealthInfo(healthInfo);
>>>>>>> b6cdbfeb49ada802dff7eb2b69f7da681cc0a153
    }
}