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
                    System.out.println("Now you can login");
                    login();
                    break;
            }
            System.out.println("Would you like to exit the program? Enter 'yes' or 'no'.");
            String ans = scanner.nextLine();
            if(ans.equals("n"))
            {
                run = true;
                run();
            }
            else {
                run = false;
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
        System.out.println("Would you like to \n1. Register a child \n2. Edit current child information");
        int choice = scanner.nextInt();
        if(choice == 1)
        {

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
           // facade.registerChild();
        }
        else
        {
            boolean exit = false;
            while(exit)
            {
                System.out.println("What would you like to change:");
                //edit name, age, allergies, dotor,insurance, etc
                System.out.println("Are you done editing child information? Enter 'yes' or 'no'.");
                String ans = scanner.next();
                if(ans.equals("yes")) {
                    exit = true;
                }
            }
        }
    }

    public void counselorDisplay() {
        System.out.println("-----Welcome Counselor-----");
    }

    public void directorDisplay() {
        System.out.println("-----Welcome Director-----");
        System.out.println(" ");
        System.out.println("Would you like to \n1. Add an activity \n2. Remove an activity \n3. Edit schedule");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                //add activitivy
                Activity activity = new Activity(null, null);
                activity.createActivity();
                break;
            case 2: 
                // remove
                break;
            case 3:
                //edit schedule
                break;
        }
    }

    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        CampUI campUI = new CampUI();
        campUI.run();
    }
}