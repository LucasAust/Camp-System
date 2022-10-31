import java.util.ArrayList;

public class Schedule {
    public ArrayList<Activity> schedule;

    public void addActivity(Activity activity) {
        schedule.add(activity);
<<<<<<< HEAD
=======
    }


    public Schedule generateSchedule() {
        return null;
>>>>>>> main
    }

    public void breakfastAll(Child child, Counselor counselor, Director director) {
        Activity breakfast = new Activity("breakfast","Breakfast with the entire camp");
        schedule.add(1,breakfast);
    }

    public void lunchAll(Child child, Counselor counselor, Director director) {
        Activity lunch = new Activity("Lunch","Lunch with the entire camp");
        schedule.add(4,lunch);
    }

    public void dinnerAll(Child child, Counselor counselor, Director director) {
        Activity dinner = new Activity("Dinner","Dinner with the entire camp.");
        schedule.add(7,dinner);
    }
    public static Schedule getInstance() {
        return null;
    }

    public ArrayList<Activity> getActivities() {
        return schedule;
    }
}