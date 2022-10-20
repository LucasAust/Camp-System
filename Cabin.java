import java.util.ArrayList;

public class Cabin {
    public String ageRange;
    public Counselor counselor;
    public int maxCampers;
    public ArrayList<Child> campers = new ArrayList<Child>();
    public ArrayList<Cabin> cabins = new ArrayList<Cabin>();
    public Schedule schedule;

    public Cabin(String ageRange, Counselor counselor , int maxCampers)
    {
        this.ageRange = ageRange;
        this.counselor = counselor;
        this.maxCampers = maxCampers;
    }
    public void addCounselor()
    {
        Counselor counselor = new Counselor();
        cabins.add(counselor);
    }
    public void addCampers()
    {
        cabins.add(campers);
    }
    public Schedule getSchedule()
    {
        return null;
    }

}
