import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Director extends RegisteredUser{

  Sessions sessions2;
  Cabin cabin;

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

  public String getfirstName() {
    return firstName;
  }

  public String getlastName() {
    return lastName;
  }

  public String getUserName() {
    return userName;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }


public void addActivity(Activity activity){
    activities.add(activity);
}

public void removeActivity(Activity activity){
    activities.remove(activity);
}

public void setSessions(){
    for(int i=1;i<10;i++) {
      System.out.println("Enter theme for Week " + i + ":");
      Scanner sessionTitleScanner = new Scanner(System.in);
      String theme = sessionTitleScanner.nextLine();
      sessions2.title = theme;
    } 
}

public void setCabins(){
  for(int i=0;i<=6;i++) {  
    System.out.println("Set cabin " + i+1 + " age range (enter value in the format '#-#'");
    Scanner ageRangeScanner = new Scanner(System.in);
    String ageRange = ageRangeScanner.nextLine();
    cabin.ageRange = ageRange;
  }
}

public void generateSchedule() {
  Activity activity = new Activity("name", "description");
  //ArrayList<Activity> activities = activity.getList();
    for(int i=1;i<6;i++) {
      System.out.println("-----------Cabin " + i + "-----------");
      for(int j=0;j<=6;j++) {
        if (j==0) {
          activities.add(new Activity("8:00AM - Breakfast", "breakfast"));
          /*
          Schedule breakfast = new Schedule();
          breakfast.breakfastAll(null, null, null);
          System.out.println(breakfast);
          */
        }
        else if (j==3) {
          activities.add(new Activity("12:00PM - Lunch", "lunch"));
          /*
          Schedule lunch = new Schedule();
          lunchs.lunchAll(null, null, null);
          System.out.println(lunch);
          */
        }
        else if (j==6) {
          activities.add(new Activity("6:00PM - Dinner", "dinner"));
          /*
          Schedule dinner = new Schedule();
          dinner.dinnerAll(null, null, null);
          System.out.println(dinner);
          */
        }
        else {
          if(!activities.isEmpty()) {
          int index = (int)(Math.random() * activities.size());
         // int randomActivity = new Random().nextInt(activities.size());
          System.out.println(activities.get(index));
          }
        }
      }
      System.out.println("-----------------------------\n");
    }
}
 
public void removeChild(Child child){
    //child.removeChild(child);
}

public void addSession(Sessions session){
    sessions.add(session);
}
}
