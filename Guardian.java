import java.util.ArrayList;

public class Guardian extends RegisteredUser  {
    public ArrayList<String> children =new ArrayList<String>();
    public Guardian(String firstName, String lastName, String userName, String email, String password, ArrayList<String> children2) {
        super(firstName, lastName, userName, email, password);
        this.children=children2;
    }
    public ArrayList<String> getChildren()
    {
        return children;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getUserName()
    {
       return userName; 
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }
    public void registerChild(Child child) {
        
    }
    public static void addGuardian(String firstName2,String lastName2, String email2, String userName2, String password2,ArrayList<String> children)
    {
        GuardianList.getInstance().addGuardian(firstName2,lastName2,userName2,email2,password2,children);
    }
    public void addChild(String string) {
        children.add(string);
    }
}
