import java.util.ArrayList;

public class Cabin {
    public String ageRange;
    public Counselor counselor;
    public int maxCampers;
    public ArrayList<Child> campers = new ArrayList<Child>();
    public ArrayList<Cabin> cabins = new ArrayList<Cabin>();
    public ArrayList<ArrayList> schedule = new ArrayList<ArrayList>();
    public String sessionID;
    public String id;
    public String age;

    public String getAgeRange() {
        return ageRange;
    }
    public Counselor getCounselor() {
        return counselor;
    }
    public int getMaxCampers() {
        return maxCampers;
    }
    public ArrayList<Child> getCampers() {
        return campers;
    }
    public ArrayList<Cabin> getCabins() {
        return cabins;
    }
    public String getSessionID() {
        return sessionID;
    }
    public String getId() {
        return id;
    }
    public String getAge() {
        return age;
    }
    public Cabin(String ageRange, Counselor counselor , int maxCampers, String sessionID, String id, ArrayList<ArrayList> schedule)
    {
        this.ageRange = ageRange;
        this.counselor = counselor;
        this.maxCampers = maxCampers;
        this.sessionID=sessionID;
        this.id=id;
        this.schedule = schedule;

    }

    /**
     * adds a new cabin
     */
    public void addCabin()
    {
        Cabin cabin = new Cabin(ageRange, counselor, maxCampers,sessionID,id,schedule);
        //Counselor 
    }

    /**
     * adds a camper to a cabin
     * @param cabin that the camper is being assigned to
     * @return the campers in the cabin
     */
    public ArrayList<Child> addCampers(Cabin cabin)
    {
        int j=0;
        ArrayList<Child> children = DataReader.saveAllChildren();
        ArrayList<Child> copy = children;
        for( int i=0;i<copy.size();i++)
        {
            Child child = children.get(i);
            if (cabin.getAgeRange().contains(child.getAge())&&j<cabin.maxCampers)
            {
            campers.add(child);
            copy.remove(child);
            j++;
            }
        }
        return campers;
    }

    public ArrayList<ArrayList> getSchedule()
    {
        return schedule;
    }
}
