import java.util.ArrayList;

public class Counselor{
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Schedule schedule;
    protected emergencyContact emergencyContact;
    protected healthInfo healthInfo;
    protected String allergy;
    protected ArrayList<String> allergies = new ArrayList<String>();
    protected ArrayList<emergencyContact> emergencyContacts;

    public void viewSchedule(Schedule schedule) {

    }

    public void addAllergies() {
        allergies.add(allergy);
    }

    public void addEmergencyContact(emergencyContact emergencyContact) {
        emergencyContact contact = new emergencyContact(emergencyContact.name,emergencyContact.relationship,emergencyContact.phoneNumber);
        emergencyContacts.add(contact);
    }

    public void viewCabin() {

    }

    public void addHealthInfo(healthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }
}