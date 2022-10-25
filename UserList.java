import java.util.ArrayList;

public class UserList {
  private static UserList UserList;
  private ArrayList<User> users;

  private UserList() {
    users = DataReader.saveAllUsers();
  }

  public static UserList getInstance() {
    if (UserList == null) {
      UserList = new UserList();
    }
    return UserList;
  }

  // Add a User
  public void addUser(String firstName, String lastName, String username, String email, String password) {
    users.add(new RegisteredUser(firstName, lastName, username, email, password));
  }

  public ArrayList<User> getUser() {
    return users;
  }

  public void saveUser() {
    DataWriter.saveAllUsers(users);
  }

}
