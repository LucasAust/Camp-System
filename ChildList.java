import java.util.ArrayList;

public class ChildList {
  private static ChildList UserList;
  public ArrayList<RegisteredUser> users;
  public ArrayList<RegisteredUser> newUsers = new ArrayList<RegisteredUser>();

  private ChildList() {
    DataReader dataReader = new DataReader();
    users = dataReader.saveAllChildren();
  }

  public static ChildList getInstance() {
    if (UserList == null) {
      UserList = new ChildList();
    }
    return UserList;
  }

  // Add a User
  public void addUser(String firstName, String lastName, String username, String email, String password) {
    users.add(new RegisteredUser(firstName, lastName, username, email, password));
    }

  public ArrayList<RegisteredUser> getUser() {
    return users;
  }

  public void saveUser() {
    //DataWriter.saveAllGuardians(users);
  }
  public void addNewUser(String firstName,String lastName, String username, String email, String password)
  {
    newUsers.add(new RegisteredUser(firstName,lastName,username,email,password));
    users.add(new RegisteredUser(firstName,lastName,username,email,password));
    //DataWriter.saveAllUsers(newUsers);

  }
  public ArrayList<RegisteredUser> getNewUsers()
  {
    return newUsers;
  }

}
