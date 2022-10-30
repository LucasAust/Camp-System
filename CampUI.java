import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CampUI {
    private Scanner scanner;
    private Facade facade;
    private Random rand;
    private static final String FIRST_PROMPT = "1. User Login \n2. Counselor Login \n3. Director Login \n4. Create Account";

    public CampUI() {
        scanner = new Scanner(System.in);
        facade = new Facade(null, null, null, null, null, null);
        rand = new Random();
    }

    public void run() {
        boolean run = true;
        while(run) 
        {
            System.out.println("-----Welcome to South Carolina Summer Camp-----");
            //DataReader.getAllGuardians();
            System.out.println(FIRST_PROMPT);
            int n = scanner.nextInt();
            switch (n) 
            {
                case 1:
                    login();
                    userDisplay();
                    break;
                case 2:
                    login();
                    counselorDisplay();
                    break;
                case 3:
                    login();
                    directorDisplay();
                    break;
                case 4:
                    createUser();
                    System.out.println(" ");
<<<<<<< HEAD
                    System.out.println("Account successfully created. You will now be returned to the home screen to login.");
                    DataWriter.saveAllGuardians(GuardianList.getInstance().getGuardians());
                    run();
=======
                    System.out.println("Now you can login");
                    login();
                    userDisplay();
>>>>>>> 085bd0bc0d0ca32aca8d849c2f73fb035a98eb9f
                    break;
            }
            System.out.println("Would you like to exit the program? Enter 'yes' or 'no'.");
            String ans = scanner.nextLine();
            if(ans.equals("no"))
            {
                run = true;
                run();
            }
            else {
                run = false;
                DataWriter.saveAllGuardians(GuardianList.getInstance().getGuardians());
                System.out.println("Thank you for looking at our camp.");
                System.exit(0);
            }        
        }
    }

    public void login() {
        System.out.println("What is your username");
        String username = scanner.next();
        System.out.println("What is your password");
        String password = scanner.next();
        facade.login(username, password);
    }

    public void logout() {
        System.out.println("-----Logging out and exiting the program-----"
        + "\n-----Thank you for visiting-----");
        facade.logout();
        System.exit(0);
    }

    public void createUser() {
        System.out.println("-----Creating New Account-----");
        System.out.println("What is your first name");
        String firstName = scanner.next();
        scanner.nextLine();
        System.out.println("What is your last name");
        String lastName = scanner.next();
        scanner.nextLine();
        System.out.println("What is your email");
        String email = scanner.nextLine();
        scanner.nextLine();
        System.out.println("What would you like your username to be");
        String username = scanner.nextLine();
        scanner.nextLine();
        System.out.println("What would you like your password to be");
        String password = scanner.nextLine();
        scanner.nextLine();
        facade.signup(firstName, lastName, email, username, password);
    }

    public void userDisplay() {
        System.out.println("-----Welcome Friend-----");
        System.out.println(" ");
        System.out.println("Would you like to \n1. Register a child \n2. Edit current child information \n3. Logout");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("What is your child's first name");
                String firstName = scanner.next();
                scanner.nextLine();
                System.out.println("What is your child's last name");
                String lastName = scanner.next();
                scanner.nextLine();
                System.out.println("What is your childs age");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Which session would you like to register for");
                String sessionID = scanner.next();
                scanner.nextLine();
                System.out.println("What is the name of the emergency contact for the child");
                String name = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the relationship of the emergency contact to the child");
                String relationship = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the phone # of the emergency contact");
                String phoneNumber = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the name your insurance provider");
                String insurance = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is your insurance policy #");
                String policyNumber = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the name of your child's doctor");
                String doctor = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Enter any allergies your child may have. Enter 'none' if they do not have any. If more than one add a space between each, then press enter when done.");
                String allergy = scanner.nextLine();
                ArrayList<String> allergies = new ArrayList<String>();
                allergies.add(allergy);
                scanner.nextLine();
                System.out.println("Enter any medications your child may be on. Enter 'none' if they do not have any. If more than one add a space between each, then press enter when done.");
                String medication = scanner.nextLine();
                ArrayList<String> medications = new ArrayList<String>();
                medications.add(medication);
                scanner.nextLine();
                Child child = new Child(firstName, lastName, medication, null, null);
                facade.registerChild(child);
                break;
            case 2:
                boolean exit = false;
                while(exit)
                {
                    System.out.println("What would you like to change: \n1. Personal \n2. Emergency Contact \n3. Health Information");
                    int edit = scanner.nextInt();
                    switch (edit) {
                        case 1:
                            System.out.println("What would you like your updated first name to be");
                            String fName = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated last name to be");
                            String lName = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated age to be");
                            int newAge = scanner.nextInt();
                            scanner.nextLine();
                            
                            //need to update current
                            break;
                        case 2:
                            System.out.println("What would you like your updated emergency contacts name to be");
                            String newName = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated relationship to be");
                            String newRelationship = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated phone # to be");
                            String newNum = scanner.nextLine();
                            scanner.nextLine();

                            // need to update current
                            break;
                        case 3:
                            System.out.println("What would you like your updated insurance provider to be");
                            String newInsurance = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated policy # to be");
                            String newPolicy = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated doctor to be");
                            String newDoctor = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What are the updated dietary restrictions");
                            String newRestrictions = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What are the updated allergies");
                            String newAllergies = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What are the updated medications");
                            String newMedications = scanner.nextLine();
                            scanner.nextLine();

                            //need to update current
                            break;
                    }
                    System.out.println("Are you done editing child information? Enter 'yes' or 'no'.");
                    String ans = scanner.next();
                    if(ans.equals("yes")) {
                        exit = true;
                    }
                    else {
                        exit = false;
                    }
                }   
                break;
            case 3:
                logout();
                break;
        }
    }

    public void counselorDisplay() {
        System.out.println("-----Welcome Counselor-----");
        System.out.println(" ");
        System.out.println("Would you like to \n1. View Schedule \n2. View Campers \n3. Edit personal information \n4. Logout");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                //schedule
                break;
            case 2:
                //campers
                break;
            case 3:
                //edit info
                break;
            case 4:
                logout();
                break;
        }
    }

    public void directorDisplay() {
        System.out.println("-----Welcome Director-----");
        System.out.println(" ");
        System.out.println("Would you like to \n1. Add an activity \n2. Remove an activity \n3. Edit schedule \n4. Logout");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                //add activity
                System.out.println("What is the name of the activity");
                String Aname = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the description of the activity");
                String Adescription = scanner.nextLine();
                scanner.nextLine();
                Activity Aactivity = new Activity(Aname, Adescription);
                facade.addActivity(Aactivity);
                break;
            case 2: 
                // remove
                System.out.println("What is the name of the activity you would like to remove");
                String Rname = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the description of the activity you would like to remove");
                String Rdescription = scanner.nextLine();
                scanner.nextLine();
                Activity Ractivity = new Activity(Rname, Rdescription);
                facade.removeActivity(Ractivity);
                break;
            case 3:
                //edit schedule
                break;
            case 4:
                logout();
                break;
        }
    }

    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        CampUI campUI = new CampUI();
        campUI.run();
    }
}