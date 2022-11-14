import java.util.ArrayList;

public class GuardianList {
    private static GuardianList guardianList;
    public ArrayList<Guardian> guardians;
    public ArrayList<Guardian> newGuardians= new ArrayList();
    
    private GuardianList()
    {
       // DataReader dataReader = new DataReader();
        guardians = DataReader.getAllGuardians();
    }

    public static GuardianList getInstance(){
        if(guardianList == null){
            guardianList = new GuardianList();
        }
        return guardianList;
    }
    public boolean addGuardian(String firstName, String lastName, String username, String email, String password, ArrayList<String> children)
    {
        
        if(guardians.add(new Guardian(firstName,lastName,username,email,password,children)))
        {
        newGuardians.add(new Guardian(firstName,lastName,username,email,password,children));
        return true;
        }
        else
        return false;
    }
    public ArrayList<Guardian> getGuardians()
    {
        return guardians;
    }
    public ArrayList<Guardian> getNewGuardians()
    {
        return newGuardians;
    }
}
