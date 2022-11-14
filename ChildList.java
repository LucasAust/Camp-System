import java.util.ArrayList;

public class ChildList {
  private static ChildList UserList;
  public ArrayList<Child> children = new ArrayList<Child>();
  public ArrayList<Child> newChildren = new ArrayList<Child>();
  public ArrayList<String> allergies = new ArrayList<String>();
  public ArrayList<String> medications = new ArrayList<String>();
  public ArrayList<emergencyContact> emergencyContacts;

  private ChildList() {
    DataReader dataReader = new DataReader();
    children = DataReader.getAllChildren();
  }

  public static ChildList getInstance() {
    if (UserList == null) {
      UserList = new ChildList();
    }
    return UserList;
  }

  // Add a User
  public boolean addChild(String firstName, String lastName, String age, ArrayList<String> medications,
      ArrayList<String> healthinfo,
      ArrayList<String> emergancyContacts, ArrayList<String> session) {
    // children.add(new RegisteredUser(firstName, lastName, username, email,
    // password));
  }

  public ArrayList<Child> getChildren() {
    return children;
  }

  /*
   * saves the user
   */
  public void saveUser() {
    // DataWriter.saveAllGuardians(users);
  }

  /**
   * adds a new child to the account
   * 
   * @param firstName
   * @param lastName
   * @param username
   * @param email
   * @param password
   */
  public void addNewChild(String firstName, String lastName, String username, String email, String password) {
    // newChildren.add(new
    // RegisteredUser(firstName,lastName,username,email,password));
    // users.add(new RegisteredUser(firstName,lastName,username,email,password));
    // DataWriter.saveAllUsers(newUsers);

  }

  public ArrayList<Child> getNewUsers() {
    return newChildren;
  }

}
