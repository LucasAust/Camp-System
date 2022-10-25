import java.util.ArrayList;

public class Cabin {
    public String ageRange;
    public Counselor counselor;
    public int maxCampers;
    public ArrayList<Child> campers = new ArrayList<Child>();
    public ArrayList<Cabin> cabins = new ArrayList<Cabin>();
    public Schedule schedule;
    public String sessionID;
    public String id;
    public String age;

    public Cabin(String ageRange, Counselor counselor , int maxCampers, String sessionID, String id)
    {
        this.ageRange = ageRange;
        this.counselor = counselor;
        this.maxCampers = maxCampers;
        this.sessionID=sessionID;
        this.id=id;
    }
    public void addCounselor()
    {
        Cabin cabin = new Cabin(ageRange, counselor, maxCampers,sessionID,id);
        //Counselor counselor = new Counselor()
        this.counselor=counselor;
    }
    public void addCampers()
    {
        
        campers.add(Child.getChild());
    }
    public Schedule getSchedule()
    {
        return null;
    }
}
