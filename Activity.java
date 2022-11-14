import java.util.Scanner;
import java.util.ArrayList;

public class Activity {

    public String name;
    public String description;
    public String location;
    public ArrayList<Activity> activities = new ArrayList<Activity>();

    public Activity(String name, String description, String location) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.name;
    }
    public ArrayList<Activity> getActivities()
    {
        return activities;
    }

    public void setActivities(ArrayList activities) {
        this.activities = activities;
    }

    /**
     * creates a new activity and asks for the name and description
     * @return the new activity being created
     */
    /**
     * creates a new activity and asks for the name and description
     * @return the new activity being created
     */
    public void createActivity() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter activity name: ");
        name = keyboard.nextLine();
        System.out.println("Enter activity description: ");
        description = keyboard.nextLine();
        System.out.println("Enter location");
        location = keyboard.nextLine();
        Activity newActivity = new Activity(name, description,location);
        activities.add(newActivity); 
    }

    /**
     * returns the name and description of the activity
     */
    public String toString()
    {
        return this.name+": "+this.description;
    }

    public boolean addActivity(Activity activity) {
        if(activities.add(activity))
        return true;
        else
        return false;
    }

    public boolean removeActivity(Activity activity){
        
        if(activities.remove(activity))
        return true;
        else
        return false;
}
}