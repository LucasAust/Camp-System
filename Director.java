import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Director extends RegisteredUser{

  Sessions sessions2;
  Cabin cabin;

public ArrayList<Activity> getActivities() {
    return activities;
  }

  public ArrayList<Sessions> getSessions() {
    return sessions;
  }

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
public String getFirstName()
{
  return firstName;
}
public String getLastName()
{
  return lastName;
}
public String getUsername()
{
  return userName;
}
public String getEmail()
{
  return email;
}
public String getPassword()
{
  return password;
}

public void Remove(Activity activity){
    activities.remove(activity);
}

/**
 * set the themes for the seesions
 */
public void setSessions(){
    for(int i=1;i<10;i++) {
      System.out.println("Enter theme for Week " + i + ":");
      Scanner sessionTitleScanner = new Scanner(System.in);
      String theme = sessionTitleScanner.nextLine();
      sessions2.title = theme;
    } 
}

/**
 * set up cabin assignments
 */
public void setCabins(){
  for(int i=1;i<7;i++) {  
    System.out.println("Set cabin " + i + " age range (enter value in the format '#-#'");
    Scanner ageRangeScanner = new Scanner(System.in);
    String ageRange = ageRangeScanner.nextLine();
    cabin.ageRange = ageRange;
  }
}

/**
 * creates the schedule for each day
 */
public void generateSchedule() {
    for(int i=1;i<10;i++) {
      int randomActivity = new Random().nextInt(activities.size());
      System.out.println("-----------------------------");
      System.out.println("            Cabin " + i +"            ");
      for(int j=1;j<8;j++) {
        if (i==1) {
          Schedule breakfast = new Schedule();
          breakfast.breakfastAll(null, null, null);
          System.out.println(breakfast);
        }
        else if (i==4) {
          Schedule lunch = new Schedule();
          lunch.lunchAll(null, null, null);
          System.out.println(lunch);
        }
        else if (i==7) {
          Schedule dinner = new Schedule();
          dinner.dinnerAll(null, null, null);
          System.out.println(dinner);
        }
        else {
        System.out.println(activities.get(randomActivity));
        }
      }
      //System.out.println("-----------------------------");
    }
}
 
public void removeChild(Child child){
    //child.removeChild(child);
}

public void addSession(Sessions session){
    sessions.add(session);
}

}
