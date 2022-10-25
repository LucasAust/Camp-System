import java.util.ArrayList;

public class Schedule {
<<<<<<< HEAD
    public ArrayList<Activity> activities = new ArrayList<Activity>();

    public void addActivity(Activity activity) {
        for(int i=0;i<activities.size();i++) {
            activities.add(activity);            
        }
    }    
=======
    public ArrayList<Activity> activities;

    public void addActivity(Activity activity) {

        activities.add(activity);
    }

    // public void removeActivity(Activity activity) {
    // }

    public Schedule generateSchedule() {
        return null;
    }

    public void breakfastAll(Child child, Counselor counselor, Director director) {

    }

    public void lunchAll(Child child, Counselor counselor, Director director) {

    }

    public void dinnerAll(Child child, Counselor counselor, Director director) {

    }
    public static Schedule getInstance() {
        return null;
    }
>>>>>>> f54d9345bfc76348b7f8836d067730023a33a803
}