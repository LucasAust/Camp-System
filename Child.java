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
    public ArrayList<emergencyContact> emergencyContacts;

<<<<<<< HEAD
    public Child(String firstName, String lastName, String age) {
=======
    public Child(String firstName, String lastName, String age)
    {
        super();
>>>>>>> d4fb2dd6c5ba9100bcc429fef5c54b5658ac4903
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

<<<<<<< HEAD
    public void addAllergies(ArrayList<String> allergies) {
        allergies.add(allergy);
    }

    public void addMedication(ArrayList<String> medications) {
        medications.add(medication);
    }

    public void addEmergencyContact(emergencyContact emergencyContact) {
        emergencyContacts.add(emergencyContact);
    }

    public void addHealthInfo(healthInfo healthInfo) {
=======
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
        emergencyContact contact = new emergencyContact(emergencyContact.name,emergencyContact.relationship,emergencyContact.phoneNumber);
        emergencyContacts.add(contact);
    }
    public void addHealthInfo(healthInfo healthInfo)
    {
>>>>>>> d4fb2dd6c5ba9100bcc429fef5c54b5658ac4903
        addHealthInfo(healthInfo);
    }
}