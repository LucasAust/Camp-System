public class RegisteredUser extends User {
  protected String firstName;
  protected String lastName;
  protected String userName;
  protected String email;
  protected String password;

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