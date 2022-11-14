import java.util.ArrayList;

public class Schedule {
    // public ArrayList<Activity> schedule;
    public ArrayList<Activity> schedule = new ArrayList<Activity>();

    public void addActivity(Activity activity) {
        schedule.add(activity);
    }

    // public Schedule generateSchedule() {
    // return null;
    // }

    public void breakfastAll(Child child, Counselor counselor, Director director) {
        Activity breakfast = new Activity("breakfast", "Breakfast with the entire camp", "mess hall");
        schedule.add(0, breakfast);
    }

    public void lunchAll(Child child, Counselor counselor, Director director) {
        Activity lunch = new Activity("Lunch", "Lunch with the entire camp", "cafe");
        schedule.add(3, lunch);
    }

    public void dinnerAll(Child child, Counselor counselor, Director director) {
        Activity dinner = new Activity("Dinner", "Dinner with the entire camp.", "diner");
        schedule.add(6, dinner);
    }

    public static Schedule getInstance() {
        return null;
    }

    public static ArrayList<Activity> getActivities() {
        return schedule;
    }
}