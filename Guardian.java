public class Guardian extends RegisteredUser  {
    public Guardian(String firstName, String lastName, String userName, String email, String password) {
        super(firstName, lastName, userName, email, password);
    }

    public void registerChild(Child child) {
        
    }
}
