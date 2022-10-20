import java.util.ArrayList;

public class UserList {
  private ArrayList<User> users;
  private static UserList UserList;

  private UserList() {
    users = DataReader.getUser();
  }

  public static UserList getInstance() {

  }

  public boolean addUser(String firstName, String lastName, String username, String email, String password) {

  }

  public ArrayList<UserList> getUser() {
    return UserList;
  }

  public void saveUser() {
    DataWriter.saveAllUsers(users);
  }

}
