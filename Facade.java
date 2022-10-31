import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

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
        activity = new Activity(null, null);
        // session = new Sessions(session.getID(), null, 0);
        this.cabin = cabin;
        this.child = child;
    }

    public RegisteredUser login(String username, String password, int j) {
        if (j == 1) {
            guardianList = GuardianList.getInstance().getGuardians();
            System.out.println("Logging you in...");
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

    public void signup(String firstName, String lastName, String email, String username, String password,
            String accountType, ArrayList<String> children) {
        // Guardian.addUser(firstName, lastName, username, email, password);
        if (accountType.equalsIgnoreCase("Guardian")) {
            GuardianList.getInstance().addGuardian(firstName, lastName, username, email, password, children);
        } else if (accountType.equalsIgnoreCase("Director")) {
            DirectorList.getInstance().addDirector(firstName, lastName, username, email, password);
        } else if (accountType.equalsIgnoreCase("Counselor")) {
            CounselorList.getInstance().addCounselor(firstName, lastName, username, email, password);
        }
    }

    public Schedule getWeeklySchedule(Schedule schedule) {
        return null;
    }

    public void logout() {
        user.saveUser();
    }

    public void addActivity(Activity activity) {
        activity = new Activity(null, null);
    }

    public void addSession(Sessions session) {
        SessionList.getInstance().addSession(session);
    }

    public void addCabin(Cabin cabin) {
        cabin = new Cabin(null, null, MAX_CAMPERS, null, null, null);
    }

    public void setCounselorSchedule(Schedule schedule) {

    }

    public void removeChild(Child child) {

    }

    public void editChild(Child child) {

    }

    public void assignCabins(Cabin cabin) {

    }

    public void generateSchedule(Schedule schedule) {

    }

    public void removeActivity(Activity activity) {

    }

    public void viewSchedule(String sessionName, String cabinName) {
        ArrayList<Sessions> sessions = DataReader.getAllSessions2();
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
        ArrayList schedule = viewCabin.getSchedule();
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

    public void viewRoster() {
        Cabin cabin = new Cabin("11-12", null, MAX_CAMPERS, null, null, null);
        ArrayList<Child> children = cabin.addCampers(cabin);
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            System.out.println(child.firstName + " " + child.lastName + " " + child.age);
        }
    }

    public void viewVitals() {
        Cabin cabin = new Cabin("11-12", null, MAX_CAMPERS, null, null, null);
        ArrayList<Child> children = cabin.addCampers(cabin);
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            System.out.println(child.firstName + " " + child.lastName + " age: " + child.age);
            System.out.println("Health information");
            ArrayList meds = child.getHealthInfo().getMedications();
            for (int j = 0; j < meds.size(); j++) {
                System.out.println(meds.get(j));
            }
            ArrayList allergies = child.getHealthInfo().getAllergies();
            for (int j = 0; j < allergies.size(); j++) {
                System.out.println(allergies.get(j));
            }
            System.out.println("Insurance information");
            System.out.println(child.getHealthInfo().getInsurance());
            System.out.println(child.getHealthInfo().getPolicyNumber());
            System.out.println(child.getHealthInfo().getDoctor());
            System.out.println("emergency contact");
            System.out.println(child.getEmergencyContact().getName());
            System.out.println(child.getEmergencyContact().getRelationship());
            System.out.println(child.getEmergencyContact().getPhoneNumber());

        }
    }

    public void printSchedule() {
    }

    public void viewChildren(Guardian registeredUser) {
        String firstName = null;
        String lastName = null;
        ArrayList<String> children = registeredUser.getChildren();
        ArrayList<Child> childs = DataReader.saveAllChildren();
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i));
            int x = children.get(i).indexOf(" ");
            firstName = children.get(i).substring(0, x);
            lastName = children.get(i).substring(x + 1);
            for (int j = 0; j < childs.size(); j++) {
                Child child = childs.get(i);
                if (child.firstName.equals(firstName) && child.lastName.equals(lastName)) {
                    System.out.println(child.session);
                    break;
                }
            }
        }

    }

    public void addChild(String string, Guardian guardian) {

        guardian.addChild(string);
        guardian.children.add(string);
    }

    public void viewSessions() {
        ArrayList<Sessions> sessions = new ArrayList<Sessions>();
        sessions = DataReader.getAllSessions2();
        for (int i = 0; i < sessions.size(); i++) {
            Sessions session = sessions.get(i);
            System.out.println(session.getTitle() + ": " + session.getTheme());
        }

    }

    public void registerChild(Child child) {
        ArrayList<Child> children = DataReader.saveAllChildren();
        children.add(child);
        DataWriter.saveAllChildren(children);
    }

    public void registerChildForSession(String childFirstName, String childLastName, String session2) {
        ArrayList<Child> children = DataReader.saveAllChildren();
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            if (child.firstName.equals(childFirstName) && child.lastName.equals(childLastName)) {
                child.session = session2;
            }
            DataWriter.saveAllChildren(children);
        }
    }
}