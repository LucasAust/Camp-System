import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

<<<<<<< HEAD
public class Facade {
    private ArrayList<Guardian> guardianList;
=======
public class Facade
{
    private ArrayList<RegisteredUser> userList;
>>>>>>> 085bd0bc0d0ca32aca8d849c2f73fb035a98eb9f
    private User user;
    private Schedule schedule;
    private Activity activity;
    private Sessions session;
    private Cabin cabin;
    private Child child;
    public static final int MAX_CAMPERS = 8;

<<<<<<< HEAD
    public Facade(User user, Schedule schedule, Activity activity, Sessions session, Cabin cabin, Child child) {
        guardianList = DataReader.getAllGuardians();
=======
    public Facade(User user, Schedule schedule, Activity activity, Sessions session, Cabin cabin, Child child)
    {
        userList = DataReader.getAllRegistered();
>>>>>>> 085bd0bc0d0ca32aca8d849c2f73fb035a98eb9f
        user = User.getInstance();
        schedule = Schedule.getInstance();
        activity = new Activity(null, null);
        //session = new Sessions(session.getID(), null, 0);
        this.cabin = cabin;
        this.child = child;
    }

<<<<<<< HEAD
    public void login(String username, String password) {
        guardianList = GuardianList.getInstance().getGuardians();
        System.out.println("Logging you in...");
        boolean ret = false;
        for (int i = 0; i < guardianList.size(); i++) {

            RegisteredUser user = guardianList.get(i);
=======
    public void login(String username, String password)
    {
        userList = DataReader.getAllRegistered();
        System.out.println("Logging you in...");
        boolean ret =false;
        for(int i=0;i<userList.size();i++)
        {
           
            RegisteredUser user = userList.get(i);
>>>>>>> 085bd0bc0d0ca32aca8d849c2f73fb035a98eb9f

            if(password.equals(user.password) && username.equals(user.userName))
            {
                ret=true;
            }
            else
            {
                continue;
            }
            

        }
        if(ret==true)
        {
            System.out.println("success");
        }
        else
        {
        System.out.println("unsuccessful. Try again");
        CampUI campUI = new CampUI();
        campUI.login();
        }
        
    }

<<<<<<< HEAD
    public void signup(String firstName, String lastName, String email, String username, String password) {
        Guardian.addUser(firstName, lastName, email, username, password);
        GuardianList.getInstance().addGuardian(firstName,lastName,email,username,password);
=======
    public RegisteredUser signup(String firstName, String lastName, String email, String username, String password)
    {
        return RegisteredUser.addUser(firstName, lastName, email, username, password);
>>>>>>> 085bd0bc0d0ca32aca8d849c2f73fb035a98eb9f
    }

    public Schedule getWeeklySchedule(Schedule schedule)
    {
        return null;
    }

    public void logout()
    {
        user.saveUser();
    }

    public void addActivity(Activity activity)
    {
        activity = new Activity(null, null);
    }

    public void addSession(Sessions session) {
        session = new Sessions(null, null, MAX_CAMPERS);
    }

    public void addCabin(Cabin cabin) {
        cabin = new Cabin(null, null, MAX_CAMPERS, null, null);
    }

    public void setCounselorSchedule(Schedule schedule)
    {

    }

    public void removeChild(Child child)
    {

    }

    public void editChild(Child child)
    {
        
    }

    public void assignCabins(Cabin cabin) {

    }

    public void generateSchedule(Schedule schedule)
    {
        
    }
}