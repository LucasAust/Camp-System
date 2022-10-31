import java.util.ArrayList;
public class CabinList {
private static CabinList cabinList;
public ArrayList<Cabin> cabins;

private CabinList()
{
    cabins = new ArrayList<Cabin>();
}
public static CabinList getInstance()
{
if(cabinList == null)
{
    cabinList = new CabinList();
}
return cabinList;
}
public void addCabin(String ageRange, Counselor counselor, int maxCampers, String sessionId, String id,ArrayList<ArrayList> schedule)
{
    cabins.add(new Cabin(ageRange, counselor, maxCampers, sessionId, id,schedule));
}
public ArrayList<Cabin>  getCabins()
{
    return cabins;
}
}
