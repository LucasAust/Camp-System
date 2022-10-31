import java.util.ArrayList;

public class CounselorList {

    private static CounselorList counselorList;
    public ArrayList<Counselor> counselors;
    public ArrayList<Counselor> newCounselors;

    private CounselorList()
    {
        counselors = DataReader.getAllCounselors();

    }
    public static CounselorList getInstance()
    {
        if(counselorList == null)
        {
            counselorList = new CounselorList();
        }
        return counselorList;
    }

    /**
     * adds a new counselor
     * @param firstName
     * @param lastName
     * @param username
     * @param email
     * @param password
     */
    public void addCounselor(String firstName, String lastName, String username, String email, String password )
    {
        counselors.add(new Counselor(firstName, lastName, null, null, null, null, username));

    }
    public ArrayList<Counselor> getCounselors()
    {
        return counselors;
    }
}
