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
    public Activity createActivity() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter activity name: ");
        name = keyboard.nextLine();
        System.out.println("Enter activity description: ");
        description = keyboard.nextLine();
<<<<<<< HEAD
        //new Activity(name,description);
        activities.add(new Activity(name,description));
=======
        Activity newActivity = new Activity(name, description);
        return newActivity;

    }

    /**
     * returns the name and description of the activity
     */
    public String toString()
    {
        return this.name+": "+this.description;
>>>>>>> ba1c8070bb20d31018e187d025f5d4f9df113638
    }

    public void removeActivity(Activity activity){
        activities.remove(activity);
}
}