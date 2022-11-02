import java.util.ArrayList;
import java.util.Random;
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
    public String email;
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

    public Counselor(String firstName, String lastName, String email, emergencyContact emergencyContact,healthInfo healthInfo,ArrayList<Cabin> cabins, String username, String password)
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
            Director director = new Director(null, null, null, null, null);
            director.generateSchedule();
            

    }
    public static void view()
    {
        ArrayList<String> schedule = new ArrayList<String>();
        ArrayList<Activity> activities = new ArrayList<Activity>();
        Activity breakfast = new Activity("breakfast","breakfast with the whole camp");
        activities.add(breakfast);
        Activity fencing = new Activity ("fencing","Learn how to fence from an instructor straight from the netherlands");
        activities.add(fencing);
        Activity swimming = new Activity("Swimming","Open swim time in the lake");
        activities.add(swimming);
        Activity lunch = new Activity("Lunch","Lunch with the whole camp");
        Activity basketball = new Activity("basketball","Learn the fundamentals of basketball with NBA superstar Zion Williamson");
        activities.add(basketball);
        Activity arts = new Activity("Arts and Crafts","Complete art projects with your friends.");
        activities.add(arts);
        Activity science= new Activity("Science","Master basic chemistry with Professor Walter White");
        activities.add(science);
        Activity philosophy = new Activity("Philosophy","Question why we exist");
        activities.add(philosophy);
        Activity archery = new Activity("Archery","Learn how to hit the bullseye every time");
        activities.add(archery);
        Activity baseball = new Activity("Baseball","Learn the fundamentals of baseball with MLB legend Jackie Bradley JR.");
        activities.add(baseball);
        Activity music = new Activity("Music","Learn music theory with Darius Rucker");
        activities.add(music);
        Activity kayak = new Activity("Kayaking","learn how to kayak on our lake");
        activities.add(kayak);
        Activity dinner = new Activity("Dinner","Dinner with the whole camp");
        ArrayList<Activity> mon = new ArrayList<Activity>();
        ArrayList<Activity> tues = new ArrayList<Activity>();
        ArrayList<Activity> wed = new ArrayList<Activity>();
        ArrayList<Activity> thurs = new ArrayList<Activity>();
        ArrayList<Activity> fri = new ArrayList<Activity>();
        Random random = new Random();
        ArrayList<Activity> mAct = activities;
        ArrayList<Activity> tAct = activities;
        ArrayList<Activity> wAct = activities;
        ArrayList<Activity> thAct = activities;
        ArrayList<Activity> fAct = activities;
        
        mon.add(0,breakfast); tues.add(0,breakfast); wed.add(0,breakfast); thurs.add(0,breakfast); fri.add(0,breakfast);
        for(int j=1;j<3;j++)
        {
            int i = random.nextInt(10)+1;
            mon.add(j,mAct.get(i));
            mAct.remove(mAct.get(i));

        }
        for(int j=1;j<3;j++)
        {
            int i = random.nextInt(10)+1;
            tues.add(j,activities.get(i));
            tAct.remove(mAct.get(i));

        }
        for(int j=1;j<3;j++)
        {
            int i = random.nextInt(10)+1;
            wed.add(j,activities.get(i));
            wAct.remove(mAct.get(i));

        }
        for(int j=1;j<3;j++)
        {
            int i = random.nextInt(10)+1;
            thurs.add(j,activities.get(i));
            thAct.remove(mAct.get(i));

        }
        for(int j=1;j<3;j++)
        {
            int i = random.nextInt(10)+1;
            fri.add(j,activities.get(i));
            fAct.remove(mAct.get(i));

        }
        mon.add(3,lunch); tues.add(3,lunch); wed.add(3,lunch); thurs.add(3,lunch); fri.add(3,lunch);
        for(int j=4;j<6;j++)
        {
            int i = random.nextInt(10)+1;
            mon.add(j,activities.get(i));
            mAct.remove(mAct.get(i));
        }
        for(int j=4;j<6;j++)
        {
            int i = random.nextInt(10)+1;
            tues.add(j,activities.get(i));
            tAct.remove(mAct.get(i));
        }
        for(int j=4;j<6;j++)
        {
            int i = random.nextInt(10)+1;
            wed.add(j,activities.get(i));
            wAct.remove(mAct.get(i));
        }
        for(int j=4;j<6;j++)
        {
            int i = random.nextInt(10)+1;
            thurs.add(j,activities.get(i));
            thAct.remove(mAct.get(i));
        }
        for(int j=4;j<6;j++)
        {
            int i = random.nextInt(10)+1;
            fri.add(j,activities.get(i));
            fAct.remove(mAct.get(i));
        }
        mon.add(6,dinner); tues.add(6,dinner); wed.add(6,dinner); thurs.add(6,dinner); fri.add(6,dinner);
    
        
        schedule.add("Monday");
        schedule.add("----------");
        for(int j=0;j<7;j++)
        {
            schedule.add(mon.get(j).toString());
           
        }
        schedule.add(" ");
        schedule.add("Tuesday");
        schedule.add("----------");
        
        for(int j=0;j<7;j++)
        {
            schedule.add(tues.get(j).toString());
            
        }
        schedule.add(" ");
        schedule.add("Wednesday");
        schedule.add("----------");
        
        for(int j=0;j<7;j++)
        {
            schedule.add(wed.get(j).toString());
           
        }
        schedule.add(" ");
        schedule.add("Thursday");
        schedule.add("----------");
        
        for(int j=0;j<7;j++)
        {
            schedule.add(thurs.get(j).toString());
            
        }
        schedule.add(" ");
        schedule.add("Friday");
        schedule.add("----------");
        for(int j=0;j<7;j++)
        {
            schedule.add(fri.get(j).toString());
           
        }
        try {
            DataWriter.writeSchedule(schedule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void view2()
    {
        ArrayList<String> roster = new ArrayList<String>();
        Cabin cabin = new Cabin("11-12", null, 8, null, null, null);
        ArrayList<Child> children = cabin.addCampers(cabin);
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            roster.add("Name: "+child.firstName + " " + child.lastName + " Age: " + child.age);
        }
        try {
            DataWriter.writeRoster(roster);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void view3()
    {
        ArrayList<String> vitals = new ArrayList<String>();
        Cabin cabin = new Cabin("11-12", null, 8, null, null, null);
        ArrayList<Child> children = cabin.addCampers(cabin);
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            vitals.add("Name: "+child.firstName + " " + child.lastName + " Age: " + child.age);
            vitals. add("------------");
            vitals.add("Health Information:");
            ArrayList meds = child.getHealthInfo().getMedications();
            for (int j = 0; j < meds.size(); j++) {
                vitals.add("Medications: "+meds.get(j));
            }
            ArrayList allergies = child.getHealthInfo().getAllergies();
            for (int j = 0; j < allergies.size(); j++) {
                vitals.add("Allergies: "+allergies.get(j));
            }
            vitals.add(" ");
            vitals.add("Insurance Information: ");
            vitals.add("Doctors office: "+child.getHealthInfo().getInsurance());
            vitals.add("Doctors Phone Number: "+child.getHealthInfo().getPolicyNumber());
            vitals.add("Doctor: "+child.getHealthInfo().getDoctor());
            vitals.add("                        ");
            vitals.add("Emergency Contact: ");
            vitals.add("Name: "+child.getEmergencyContact().getName());

            vitals.add("Relationship: "+child.getEmergencyContact().getRelationship());
            vitals.add("Phone Number: "+child.getEmergencyContact().getPhoneNumber());
            vitals.add("                    ");
            vitals.add(" ");
            vitals.add(" ");

        }
        try {
            DataWriter.writeVitals(vitals);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}