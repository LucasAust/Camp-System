import java.util.ArrayList;

public class Schedule {
    public ArrayList<Activity> activities = new ArrayList<Activity>();

    public void addActivity(Activity activity) {
        for(int i=0;i<activities.size();i++) {
            activities.add(activity);            
        }
    }    
}