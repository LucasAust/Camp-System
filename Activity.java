import java.util.Scanner;
import java.util.ArrayList;

public class Activity {

    public String name;
    public String description;
    private ArrayList<Activity> activities = new ArrayList<Activity>();

    public Activity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.name;
    }
    public ArrayList<Activity> getActivies()
    {
        return activities;
    }

    /**
     * creates a new activity and asks for the name and description
     * @return the new activity being created
     */
    /**
     * creates a new activity and asks for the name and description
     * @return the new activity being created
     */
    public Activity createActivity(Activity activity) {

       
        activities.add(activity);
        return activity;

    }

    /**
     * returns the name and description of the activity
     */
    public String toString()
    {
        return this.name+": "+this.description;
    }

    public void removeActivity(Activity activity){
        activities.remove(activity);
}
}