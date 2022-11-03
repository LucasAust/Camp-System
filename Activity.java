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

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void removeActivity(Activity activity){
        activities.remove(activity);
}
}