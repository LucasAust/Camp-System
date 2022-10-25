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
        facade = new Facade();
        rand = new Random();
    }

    public void run() {
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
    }

    public void login() {
        System.out.println("What is your username");
        String username = scanner.nextLine();
        scanner.nextLine();
        System.out.println("What is your password");
        String password = scanner.nextLine();
        scanner.nextLine();
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

        }
        else
        {
            boolean exit = false;
            while(exit)
            {
                System.out.println("What would you like to change:");

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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CampUI campUI = new CampUI();
        campUI.run();
        System.out.println("Would you like to exit the program? Enter 'yes' or 'no'.");
        String ans = scanner.nextLine();
        if(ans.equals("n0"))
        {

        }
        else {
            System.out.println("Thank you for looking at our camp.");
            System.exit(0);
        }
    }
}