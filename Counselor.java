import java.util.ArrayList;

public class Counselor{
    public static String getGetAge() {
        return getAge;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Long getAge() {
        return age;
    }
    public Schedule getSchedule() {
        return schedule;
    }
    public ArrayList<Cabin> getCabins() {
        return cabins;
    }
    public emergencyContact getEmergencyContact() {
        return emergencyContact;
    }
    public healthInfo getHealthInfo() {
        return healthInfo;
    }
    public String getAllergy() {
        return allergy;
    }
    public ArrayList<String> getAllergies() {
        return allergies;
    }
    public ArrayList<emergencyContact> getEmergencyContacts() {
        return emergencyContacts;
    }

    public static String getAge;
    protected String firstName;
    protected String lastName;
    protected Long age;
    protected Schedule schedule;
    protected ArrayList<Cabin> cabins;
    protected emergencyContact emergencyContact;
    protected healthInfo healthInfo;
    protected String allergy;
    protected ArrayList<String> allergies = new ArrayList<String>();
    protected ArrayList<emergencyContact> emergencyContacts;

    public Counselor(String firstName, String lastName, Long age2, emergencyContact emergencyContact,healthInfo healthInfo,ArrayList<Cabin> cabins)
    {

    }
    public void viewSchedule(Schedule schedule) {

    }

    public void addAllergies(ArrayList<String> allergies) {
        allergies.add(allergy);
    }

    public void addEmergencyContact(emergencyContact emergencyContact) {
        emergencyContact contact = new emergencyContact(emergencyContact.name,emergencyContact.relationship,emergencyContact.phoneNumber);
        emergencyContacts.add(contact);
    }

    public void viewCabin() {

    }

    public void addHealthInfo(healthInfo healthInfo)
    {
        addHealthInfo(healthInfo);
    }
}