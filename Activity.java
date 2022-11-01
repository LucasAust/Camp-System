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

    /**
     * creates a new activity and asks for the name and description
     * @return the new activity being created
     */
    /**
     * creates a new activity and asks for the name and description
     * @return the new activity being created
     */
    public Activity createActivity() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter activity name: ");
        name = keyboard.nextLine();
        System.out.println("Enter activity description: ");
        description = keyboard.nextLine();
        //new Activity(name,description);
        activities.add(new Activity(name,description));
    }

    public void removeActivity(Activity activity){
        activities.remove(activity);
}
}