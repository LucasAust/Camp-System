import javax.lang.model.util.ElementScanner14;

public class Facade
{
    private User user;
    private Schedule schedule;
    private Activity activity;
    private Sessions session;
    private Cabin cabin;
    private Child child;
    public static final int MAX_CAMPERS = 8;

    public Facade(User user, Schedule schedule, Activity activity, Sessions session, Cabin cabin, Child child)
    {
        user = User.getInstance();
        schedule = Schedule.getInstance();
        activity = new Activity(null, null);
        session = new Sessions(null, 0);
        this.cabin = cabin;
        this.child = child;
    }

    public void login(String username, String password)
    {
        System.out.println("Logging you in...");
        for(int i=0;i<user.length;i++)
        {
            User user = user.get(i);

            //.equals or ==
            if(password.equals(user.getPassword) && username.equals(user.getUsername))
            {
                return;
            }
            else
            {
                continue;
            }
        }
    }

    public User signup(String firstName, String lastName, String email, String username, String password)
    {
        return user.addUser(firstName, lastName, email, username, password);
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

    public void addSession(Sessions session)
    {
        
    }

    public void addCabin(Cabin cabin)
    {
        //MAX_CAMPERS
    }

    public void registerChild(String firstName, String lastName, String email, String username, String password, Child child)
    {

    }

    public void removeActivity(Activity activity)
    {

    }

    public void editActivity(Activity activity)
    {

    }

    public void setCounselorSchedule(Schedule schedule)
    {

    }

    public void removeChild(Child child)
    {

    }

    public void assignCabins(Cabin cabin)
    {

    }

    public void generateSchedule(Schedule schedule)
    {
        
    }
}