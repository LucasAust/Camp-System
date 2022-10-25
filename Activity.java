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
        return this.description;
    }

    public void createActivity() {
        System.out.println(name + ": " + description);
    }
}
