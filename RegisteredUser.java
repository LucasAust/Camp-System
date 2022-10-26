public class RegisteredUser extends User {
  public String firstName;
  public String lastName;
  public String userName;
  public String email;
  public String password;

  public RegisteredUser(String firstName, String lastName, String userName, String email, String password) {
    this.firstName = "craig";
    this.lastName = "johnston";
    this.userName = "bib";
    this.email = "bib@email.sc.edu";
    this.password = "walrus12";

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
}