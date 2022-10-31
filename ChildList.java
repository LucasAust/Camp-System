import java.util.ArrayList;

public class ChildList {
  private static ChildList UserList;
  public ArrayList<Child> children= new ArrayList<Child>();
  public ArrayList<Child> newChildren = new ArrayList<Child>();

  private ChildList() {
    DataReader dataReader = new DataReader();
    children = DataReader.saveAllChildren();
  }

  public static ChildList getInstance() {
    if (UserList == null) {
      UserList = new ChildList();
    }
    return UserList;
  }

  // Add a User
  public void addChild(String firstName, String lastName, String username, String email, String password) {
    //children.add(new RegisteredUser(firstName, lastName, username, email, password));
    }

  public ArrayList<Child> getChildren() {
    return children;
  }

  public void saveUser() {
    //DataWriter.saveAllGuardians(users);
  }
  public void addNewChild(String firstName,String lastName, String username, String email, String password)
  {
    //newChildren.add(new RegisteredUser(firstName,lastName,username,email,password));
    //users.add(new RegisteredUser(firstName,lastName,username,email,password));
    //DataWriter.saveAllUsers(newUsers);

  }
  public ArrayList<Child> getNewUsers()
  {
    return newChildren;
  }

}
