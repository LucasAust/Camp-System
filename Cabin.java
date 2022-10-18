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
    public void addCounselor(Counselor counselor)
    {
        this.counselor=counselor;
    }
    public void addCampers(Child child)
    {
        campers.add(child);
    }
    public Schedule getSchedule()
    {
        return null;
    }

}
