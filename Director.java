import java.rmi.Remote;
import java.util.ArrayList;

public class Director extends RegisteredUser {
  public Director(String firstName, String lastName, String userName, String email, String password) {
    super(firstName, lastName, userName, email, password);
  }

  private ArrayList<Activity> activities;

  public void addActivities(Activity activity) {
    activities.add(activity);
  }

  public void Remove(Activity activity) {
    activities.remove(activity);
  }

  public void setCounselorSchedule(Schedule schedule) {

  }

  public void removeChild(Child child) {
  }

  public void assignCabins(Cabin cabin) {

  }

  public void addSession(Sessions session) {

  }
}
