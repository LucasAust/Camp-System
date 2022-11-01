import java.util.ArrayList;

public class Guardian extends RegisteredUser {
    public ArrayList<String> children = new ArrayList<String>();

    /**
     * @param firstName
     * @param lastName
     * @param userName
     * @param email
     * @param password
     * @param children2
     */
    public Guardian(String firstName, String lastName, String userName, String email, String password,
            ArrayList<String> children2) {
        super(firstName, lastName, userName, email, password);
        this.children = children2;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    /**
     * @param child
     */
    public void registerChild(Child child) {

    }

    /**
     * adds a guardian
     * 
     * @param firstName2
     * @param lastName2
     * @param email2
     * @param userName2
     * @param password2
     * @param children
     */
    public static void addGuardian(String firstName2, String lastName2, String email2, String userName2,
            String password2, ArrayList<String> children) {
        GuardianList.getInstance().addGuardian(firstName2, lastName2, userName2, email2, password2, children);
    }

    /**
     * 
     * @param string
     */
    public void addChild(String string) {
        children.add(string);
    }
}
