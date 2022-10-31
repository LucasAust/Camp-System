import java.util.ArrayList;
import java.util.Scanner;

public class Counselor extends RegisteredUser{

    private Scanner scanner= new Scanner(System.in);

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

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
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
    public String username;
    public String password;

    public Counselor(String firstName, String lastName, emergencyContact emergencyContact,healthInfo healthInfo,ArrayList<Cabin> cabins, String username, String password)
    {
        super(firstName, lastName, username, email, password);
        this.firstName=firstName;
        this.lastName=lastName;
        this.emergencyContact=emergencyContact;
        this.healthInfo=healthInfo;
        this.cabins=cabins;
        this.username=username;
        this.password=password;
    }

    /**
     * adds allergies to counselor info
     * @param allergies
     */
    public void addAllergies(ArrayList<String> allergies) {
        allergies.add(allergy);
    }

    /**
     * adds the emergenct contact to the counselor info
     * @param emergencyContact
     */
    public void addEmergencyContact(emergencyContact emergencyContact) {
        emergencyContact contact = new emergencyContact(emergencyContact.name,emergencyContact.relationship,emergencyContact.phoneNumber);
        emergencyContacts.add(contact);
    }

    /**
     * adds the health info to the counselor info
     * @param healthInfo
     */
    public void addHealthInfo(healthInfo healthInfo)
    {
        addHealthInfo(healthInfo);
    }

    /**
     * gets current cabin roster for the week
     */
    public void getRoster()
    {
        ArrayList<Child> roster = new ArrayList<Child>();
        ArrayList<String> names = new ArrayList<String>();
        for(int i=0;i<roster.size();i++)
        {
            Child child = roster.get(i);
            String name = child.getFirstName()+" "+child.getLastName();
            names.add(name);
        }
    }
    public void getVitalInfo(ArrayList<Child> roster)
    {
        ArrayList<String> vitals = new ArrayList<String>();
        for(int i=0;i<roster.size();i++)
        {
            Child child = roster.get(i);
            vitals.add(child.getFirstName()+" "+child.getLastName());
            vitals.add("Allergies: "+child.getAllergies());
            vitals.add("Emergency Contacts: "+child.getEmergencyContacts());
            vitals.add("Medical Information: "+child.getHealthInfo());
        }
    }
    public void viewSchedule(ArrayList<Schedule> schedule) {
            ArrayList<String> dailySchedule = new ArrayList<String>();
            System.out.println("Enter which week number you would like to view your schedule for.");
            int week = scanner.nextInt();
            Cabin cabin = cabins.get(week-1);
            //ArrayList<String> sched = cabin.getSchedule();
            
            
            
            




    }
}