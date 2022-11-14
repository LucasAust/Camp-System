import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.lang.model.util.ElementScanner14;

import org.junit.Test;

/**
 * @param user
 * @param schedule
 * @param activity
 * @param session
 * @param cabin
 * @param child
 */
public class Facade {
    private ArrayList<Guardian> guardianList;
    private ArrayList<Counselor> counselorList;
    private ArrayList<Director> directorList;
    private User user;
    private Schedule schedule;
    private Activity activity;
    private Sessions session;
    private Cabin cabin;
    private Child child;
    public static final int MAX_CAMPERS = 8;
    public Sessions viewSession;
    public Cabin viewCabin;

    public Facade(User user, Schedule schedule, Activity activity, Sessions session, Cabin cabin, Child child) {
        guardianList = this.guardianList;
        user = User.getInstance();
        schedule = Schedule.getInstance();
        activity = new Activity(null, null,null);
        // session = new Sessions(session.getID(), null, 0);
        this.cabin = cabin;
        this.child = child;
    }

    /**
     * logging in a registered user
     * @param username
     * @param password
     * @param j signifies type of account
     * @return returns the registered user
     */
    public RegisteredUser login(String username, String password, int j) {
        if (j == 1) {
            guardianList = GuardianList.getInstance().getGuardians();
            System.out.println("Logging you in..." + "\n ");
            boolean ret = false;
            for (int i = 0; i < guardianList.size(); i++) {

                RegisteredUser user = guardianList.get(i);

                if (password.equals(user.password) && username.equals(user.userName)) {
                    ret = true;
                    System.out.println("success");
                    return user;
                } else {
                    continue;
                }
            }
            if (ret == true) {
                System.out.println("success");
            } else {
                System.out.println("unsuccessful. Try again");
                CampUI campUI = new CampUI();
                campUI.login(1);
            }
        }
        if (j == 2) {
            counselorList = CounselorList.getInstance().getCounselors();
            System.out.println("Logging you in...");
            boolean ret = false;
            for (int i = 0; i < counselorList.size(); i++) {

                Counselor counselor = counselorList.get(i);

                if (password.equals(counselor.password) && username.equals(counselor.username)) {
                    ret = true;
                    return counselor;
                } else {
                    continue;
                }
            }
            if (ret == true) {
                System.out.println("success");
            } else {
                System.out.println("unsuccessful. Try again");
                CampUI campUI = new CampUI();
                campUI.login(2);
            }
        }

        if (j == 3) {
            directorList = DirectorList.getInstance().getDirectors();
            System.out.println("Logging you in...");
            boolean ret = false;
            for (int i = 0; i < directorList.size(); i++) {

                Director director = directorList.get(i);

                if (password.equals(director.password) && username.equals(director.userName)) {
                    ret = true;
                    return director;
                } else {
                    continue;
                }

            }
            if (ret == true) {
                System.out.println("success");
            } else {
                System.out.println("unsuccessful. Try again");
                CampUI campUI = new CampUI();
                campUI.login(3);
            }
        }
        return null;

    }

    /**
     * signing up a user based on their account type
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param password
     * @param accountType
     * @param children
     */
    public void signup(String firstName, String lastName, String email, String username, String password,
            String accountType, ArrayList<String> children) {
        // Guardian.addUser(firstName, lastName, username, email, password);
        if (accountType.equalsIgnoreCase("Guardian")) {
            GuardianList.getInstance().addGuardian(firstName, lastName, username, email, password, children);
            DataWriter.saveAllGuardians(GuardianList.getInstance().getGuardians());
        } else if (accountType.equalsIgnoreCase("Director")) {
            DirectorList.getInstance().addDirector(firstName, lastName, username, email, password);
        } else if (accountType.equalsIgnoreCase("Counselor")) {
            CounselorList.getInstance().addCounselor(firstName, lastName, username, email, password);
        }
    }

    @Test
    public void testSignupGuardian(){
            // Guardian.addUser(firstName, lastName, username, email, password);
            if (accountType.equalsIgnoreCase("Guardian")) {
                GuardianList.getInstance().addGuardian("George", "Pickens", "gpickens11", "gpickens11@gmail.com", "steelersnation", child);
    }

    @Test
    public void testSignupDirector(){
    if (accountType.equalsIgnoreCase("Director")) {
        DirectorList.getInstance().addDirector("Harper", "Smith", "hsmithhsmith", "hsmithhsmith@gmail.com", "dogloverforever234");
    }

    @Test
    public void testSignupCounselor(){
    if (accountType.equalsIgnoreCase("Counselor")) {
        CounselorList.getInstance().addCounselor("kyle", "korver", "kkshooter", "kkshottooclean", "bballforlife");
    }

    /**
     * @param schedule
     * @return
     */
    public Schedule getWeeklySchedule(Schedule schedule) {
        return null;
    }

    /**
     * method to logout and save the user
     */
    public void logout() {
        System.exit(0);

    }

    public void addActivity(Activity activity) {
        activity = new Activity(null, null,null);
        activity.createActivity();
    }

@Test
public void testAddActivity(){
    Activity activity = new Activity("Waterpark", "Having fun at the waterpark with your other campers.", "Charlotte Waterpark");
    addActivity(activity);
}

    /**
     * Adds new session
     * @param session session to be added
     */
    public void addSession(Sessions session) {
        SessionList.getInstance().addSession(session);
    }

@Test
public void testAddSession(){
    ArrayList<Cabin> cabins = new ArrayList<Cabin>();
    emergencyContact emergencyContact = new emergencyContact("Walter White", "Father", "994-232-4685");
    ArrayList<String> dietaryRestrictions = new ArrayList<String>();
    ArrayList<String> allergies = new ArrayList<String>();
    allergies.add("Latex");
    ArrayList<String> medications = new ArrayList<String>();
    medications.add("Epi-Pen");
    healthInfo healthInfo = new healthInfo("CIGNA Group Inc.", "CG48237000747", "Dr. J.R. Smith", dietaryRestrictions, allergies, medications);
    Child child = new Child("John", "Smith", "11", "johnsmith33", healthInfo, emergencyContact, "2");
    Counselor counselor = new Counselor("Jeremy", "Frederickson", "jfred007@yahoo.com", emergencyContact, healthInfo, cabins, "JFred", "ctrlaltdlt123!");
    ArrayList<ArrayList> schedule = new ArrayList<ArrayList>();
    Cabin cabin = new Cabin("7-10", null, 80, "43857963463", "0071283823", schedule);
    Sessions sessions = new Sessions("Ninja", "Ninja", 700.00, "Ninja", "07/1/22-10/8/22", cabins);
    addSession(sessions);
}

/**
 * Adds a new cabin
 * @param cabin to be added
 */
    public void addCabin(Cabin cabin) {
        cabin = new Cabin(null, null, MAX_CAMPERS, null, null, null);
    }

@Test
public void testAddCabin(){
    cabin = new Cabin("7-10", counselor, 80, "23492384", "2123584353", schedule);
}

/**
 * generates schedule
 * @return returns a schedule
 */
    public void generateSchedule(Schedule schedule) {
        Director generateSchedule = new Director("Sam", "Samuels", "SSamuels", "ssamuels@camp.com", "password");
        generateSchedule.generateSchedule();
    }

    //@Test
    //public void testGenerateSchedule(){
    //}

    public void removeActivity(Activity activity) {
        //activity.remove(activity);
    }

    @Test
    public void testRemoveActivity(){
        Activity activity = new Activity("Tag", "Running around and chasing others.", "Outside in the yard.");
        removeActivity(activity);
    }
    
    /**
     * Allows user to view schedule
     * @param sessionName name of session to be viewed
     * @param cabinName name of cabin to be viewed
     */
    public void viewSchedule(String sessionName, String cabinName) {
        ArrayList<Sessions> sessions = DataReader.getAllSessions();
        for (int i = 0; i < sessions.size(); i++) {
            Sessions session = sessions.get(i);
            if (sessionName.equalsIgnoreCase(session.title)) {
                viewSession = session;
            }
        }
        ArrayList<Cabin> cabins = viewSession.getCabins();
        for (int i = 0; i < cabins.size(); i++) {
            Cabin cabin = cabins.get(i);
            if (cabinName.equalsIgnoreCase(cabin.id)) {
                viewCabin = cabin;
            }
        }
        ArrayList<ArrayList> schedule = new ArrayList<ArrayList>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Day " + (i + 1));
            ArrayList<Activity> day = (ArrayList) schedule.get(i);
            for (int j = 0; j < 7; j++) {
                Activity activity = day.get(j);
                System.out.println(activity.name + ": " + activity.description);
            }
            System.out.println();
        }

    }

@Test
public void testViewSchedule(){

}

    public void view()
    {
        Counselor.view();
        
    }

    /**
     * 
     */
    public void viewRoster() {
        Counselor.view2();
    }

    @Test
    public void testViewRoster(){

    }

    /**
     * 
     */
    public void viewVitals() {
        Counselor.view3();
    }

    @Test
    public void testViewVitals(){

    }

    /**
     * 
     */
    public void printSchedule() {
    }

    @Test
    public void testPrintSchedule(){

    }

    /**
     * @param registeredUser
     */
    public void viewChildren(Guardian registeredUser) {
        ArrayList<Child> childs = new ArrayList<Child>();
        String firstName = null;
        String lastName = null;
        ArrayList<String> children = registeredUser.getChildren();
        childs = DataReader.getAllChildren();
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i));
            int x = children.get(i).indexOf(" ");
            firstName = children.get(i).substring(0, x);
            lastName = children.get(i).substring(x + 1);
            for (int j = 0; j < childs.size(); j++) {
                Child child = childs.get(j);
                if (child.getFirstName().equals(firstName) && child.getLastName().equals(lastName)) {
                    System.out.println(child.getSession());
                    break;
                }
            }
        }

    }

    @Test
    public void testViewChildren(){
        ArrayList<Child> childs = new ArrayList<Child>();
        String firstName = "Charlie";
        String lastName = "Brown";
        ArrayList<String> children = registeredUser.getChildren();
        childs = DataReader.getAllChildren();
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i));

            int x = children.get(i).indexOf(" ");
            firstName = children.get(i).substring(0, x);
            lastName = children.get(i).substring(x + 1);
            for (int j = 0; j < childs.size(); j++) {
                Child child = childs.get(j);
                if (child.getFirstName().equals(firstName) && child.getLastName().equals(lastName)) {
                    System.out.println(child.getSession());
                    break;
                }
            }
        } 
    }

    /**
     * @param string
     * @param guardian
     */
    public void addChild(String string, Guardian guardian) {

        guardian.addChild(string);
        DataWriter.saveAllGuardians(GuardianList.getInstance().getGuardians());
    }

    /**
     * 
     */
    public void viewSessions() {
        ArrayList<Sessions> sessions = new ArrayList<Sessions>();
        sessions = DataReader.getAllUserSessions();
        for (int i = 0; i < sessions.size(); i++) {
            Sessions session = sessions.get(i);
            System.out.println(session.getTitle() + ": " + session.getTheme()+" Cost: "+session.cost+" Start date: "+session.dates);
        }

    }

    @Test
    public void testViewSesssions(){

    }

    /**
     * @param child
     */
    public void registerChild(Child child) {
        ArrayList<Child> children = DataReader.getAllChildren();
        children.add(child);
        DataWriter.saveAllChildren(children);
    }

    /**
     * @param childFirstName
     * @param childLastName
     * @param session2
     */
    public void registerChildForSession(String childFirstName, String childLastName, String session2) {
        ArrayList<Child> children = DataReader.getAllChildren();
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            if (child.firstName.equals(childFirstName) && child.lastName.equals(childLastName)) {
                child.session = session2;
            }
            DataWriter.saveAllChildren(children);
        }
    }

    @Test
    public void testRegisterChildForSession(){

    }
}