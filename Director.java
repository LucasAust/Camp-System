import java.rmi.Remote;
import java.util.ArrayList;

//Ali Omer
public class Director {
  private ArrayList<String> activities;

public void addActivities(Activity activity){
    activities.add(activity);
}

public void Remove(Activity activity){
    activities.remove(activity);
}

public void setCounselorSchedule(Schedule schedule){

}

public void removeChild(Child child){
    
}

public void assignCabins(Cabin cabin){

}

public void addSession(Sessions session){

}
}
