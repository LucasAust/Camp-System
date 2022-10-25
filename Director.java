import java.rmi.Remote;
import java.util.ArrayList;

//Ali Omer
public class Director extends RegisteredUser{

private ArrayList<Activity> activities = new ArrayList<Activity>();
private ArrayList<Sessions> sessions = new ArrayList<Sessions>();

  public Director(String firstName, String lastName, String userName, String email, String password) {
    super(firstName, lastName, userName, email, password);
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.email = email;
    this.password = password;
  } 

public void addActivities(Activity activity){
    activities.add(activity);
}

public void Remove(Activity activity){
    activities.remove(activity);
}

public void setCounselorSchedule(Schedule schedule){

}

public void removeChild(Child child){
    child.removeChild(child);
}

public void assignCabins(Cabin cabin){

}

public void addSession(Sessions session){
    sessions.add(session);
}
}
