import java.util.ArrayList;

public class Child extends RegisteredUser{

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

    public Child(String firstName, String lastName, String age, healthInfo healthInfo, emergencyContact emergencyContact)
    {
        super(firstName, lastName, firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.healthInfo = healthInfo;
        this.emergencyContact=emergencyContact;
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
        emergencyContact contact = new emergencyContact(emergencyContact.name,emergencyContact.relationship,emergencyContact.phoneNumber);
        emergencyContacts.add(contact);
    }
    public void addHealthInfo(healthInfo healthInfo)
    {
        addHealthInfo(healthInfo);
    }

    public static Child getChild() {
        return null;
    }
}