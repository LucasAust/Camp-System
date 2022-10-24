import java.util.ArrayList;

public class UserList {
  private static UserList UserList;
  private ArrayList<User> users;

  private UserList() {
    users = DataReader.saveAllUsers();
  }

  public static UserList getInstance() {
    return null;
  }

  public boolean addUser(String firstName, String lastName, String username, String email, String password) {
    return true;
  }

  public ArrayList<User> getUser() {
    return users;
  }

  public void saveUser() {
    DataWriter.saveAllUsers(users);
  }

}
