import java.util.ArrayList;

public class CounselorList {

    private static CounselorList counselorList;
    public static ArrayList<Counselor> counselors;
    public ArrayList<Counselor> newCounselors;

    CounselorList() {
        counselors = DataReader.getAllCounselors();

    }

    public static CounselorList getInstance() {
        if (counselorList == null) {
            counselorList = new CounselorList();
        }
        return counselorList;
    }

    public static boolean haveCounselor(String user) {
        for (Counselor counselorList : counselors) {
            if (counselorList.getUsername().equals(user)) {
                return true;
            }
        }
        return false;
    }

    /**
     * adds a new counselor
     * 
     * @param firstName
     * @param lastName
     * @param username
     * @param email
     * @param password
     */
    public void addCounselor(String firstName, String lastName, String username, String email, String password) {
        counselors.add(new Counselor(firstName, lastName, email, null, null, null, null, username));

    }

    public static ArrayList<Counselor> getCounselors() {
        return counselors;
    }
}
