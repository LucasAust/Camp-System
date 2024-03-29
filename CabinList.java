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

/**
 * creates a new cabin
 * @param ageRange
 * @param counselor
 * @param maxCampers
 * @param sessionId
 * @param id
 * @param schedule
 */
public boolean addCabin(String ageRange, Counselor counselor, int maxCampers, String sessionId, String id,ArrayList<ArrayList> schedule)
{
    if(cabins.add(new Cabin(ageRange, counselor, maxCampers, sessionId, id,schedule)))
    return true;
    else
    return false;
}
public ArrayList<Cabin>  getCabins()
{
    return cabins;
}
}
