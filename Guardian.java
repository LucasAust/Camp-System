public class Guardian extends RegisteredUser  {
    public Guardian(String firstName, String lastName, String userName, String email, String password) {
        super(firstName, lastName, userName, email, password);
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
    public static void addGuardian(String firstName2,String lastName2, String email2, String userName2, String password2)
    {
        GuardianList.getInstance().addGuardian(firstName2,lastName2,userName2,email2,password2);
    }
}
