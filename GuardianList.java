import java.util.ArrayList;

public class GuardianList {
    private static GuardianList guardianList;
    public ArrayList<Guardian> guardians;
    
    private GuardianList()
    {
        DataReader dataReader = new DataReader();
        guardians = DataReader.getAllGuardians();
    }

    public static GuardianList getInstance(){
        if(guardianList == null){
            guardianList = new GuardianList();
        }
        return guardianList;
    }
    public void addGuardian(String firstName, String lastName, String username, String email, String password)
    {
        guardians.add(new Guardian(firstName,lastName,username,email,password));
    }
    public ArrayList<Guardian> getGuardians()
    {
        return guardians;
    }
}
