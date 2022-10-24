import java.util.ArrayList;

public class UserList {
  private ArrayList<User> users;
  private static UserList UserList;

  private UserList() {
   // users = DataReader.saveAllUsers();
  }

  public static UserList getInstance() {
    return null;
  }

  public boolean addUser(String firstName, String lastName, String username, String email, String password) {
return true;
  }

  public ArrayList<UserList> getUser() {
    return null;
  }

  public void saveUser() {
    DataWriter.saveAllUsers(users);
  }

}
