import java.util.ArrayList;

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

  public void addChild(Child child) {

  }

  public void removeChild(Child child) {

  }

  public void editChildInfo(Child child) {

  }


public static void addUser(String firstName2, String lastName2, String email2, String username2,
		String password2) {
    GuardianList.getInstance().addGuardian(firstName2,lastName2,username2,email2,password2);
    

}
}