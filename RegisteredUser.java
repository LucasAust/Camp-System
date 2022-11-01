public class RegisteredUser extends User {
  public String firstName;
  public String lastName;
  public String userName;
  public String email;
  public String password;

  public RegisteredUser(String firstName, String lastName, String userName, String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.email = email;
    this.password = password;

  }

  public void addChild(Child child) {
      
  }

  public void removeChild(Child child) {

  }

  public void editChildInfo(Child child) {

  }
}