import java.util.ArrayList;

public class Cabin {
    public String ageRange;
    public Counselor counselor;
    public int maxCampers;
    public ArrayList<Child> campers;
    public ArrayList<Cabin> cabins;
    public Schedule schedule;

    public Cabin(String ageRange, Counselor counselor , int maxCampers)
    {
        this.ageRange = ageRange;
        this.counselor = counselor;
        this.maxCampers = maxCampers;
    }
    public void addCounselor()
    {
        cabins.add(counselors);
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
