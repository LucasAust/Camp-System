import java.util.ArrayList;

public class Child {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getAllergy() {
        return allergy;
    }

    public String getMedication() {
        return medication;
    }

    public String getSession() {
        return session;
    }

    public emergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public healthInfo getHealthInfo() {
        return healthInfo;
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public ArrayList<String> getMedications() {
        return medications;
    }

    public ArrayList<emergencyContact> getEmergencyContacts() {
        return emergencyContacts;
    }

    public String firstName;
    public String lastName;
    public String age;
    public String allergy;
    public String medication;
    public String session;
    public emergencyContact emergencyContact;
    public healthInfo healthInfo;
    public ArrayList<String> allergies = new ArrayList<String>();
    public ArrayList<String> medications = new ArrayList<String>();
    public ArrayList<emergencyContact> emergencyContacts;

    public Child(String firstName, String lastName,String age, String medication2, healthInfo healthInfo, emergencyContact emergencyContact,String session)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.healthInfo = healthInfo;
        this.emergencyContact=emergencyContact;
        this.session=session;
    }

    /**
     * adds allergies to data
     * @param allergies
     */
    public void addAllergies(ArrayList<String> allergies)
    {
        allergies.add(allergy);
    }

    /**
     * adds medications to data
     * @param medications
     */
    public void addMedication(ArrayList<String> medications)
    {
        medications.add(medication);
    }

    /**
     * adds the emergency contact info to the childs data
     * @param emergencyContact
     */
    public void addEmergencyContact(emergencyContact emergencyContact)
    {
        emergencyContact contact = new emergencyContact(emergencyContact.name,emergencyContact.relationship,emergencyContact.phoneNumber);
        emergencyContacts.add(contact);
    }

    /**
     * adds the health info to the childs data
     * @param healthInfo
     */
    public void addHealthInfo(healthInfo healthInfo)
    {
        addHealthInfo(healthInfo);
    }


    public static Child getChild() {
        return null;
    }
}