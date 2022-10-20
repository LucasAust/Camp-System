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
    public void addEmergencyContact(ArrayList<String> emergencyContacts)
    {
        emergencyContact contact = new emergencyContact(emergencyContact.name, emergencyContact.relationship, emergencyContact.phoneNumber);
        for(int i=0;i<3;i++) {
            emergencyContacts.add(contact);
        }
    }
    public void addHealthInfo(healthInfo healthInfo)
    {
        addHealthInfo(healthInfo);
    }
}