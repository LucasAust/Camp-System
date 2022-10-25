import java.util.Scanner;

public class Activity {

    public String name;
    public String description;

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

    public Activity createActivity() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter activity name: ");
        name = keyboard.nextLine();
        System.out.println("Enter activity description: ");
        description = keyboard.nextLine();
        Activity newActivity = new Activity(name, description);
        return newActivity;

    }

}
