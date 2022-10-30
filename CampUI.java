import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CampUI {
    private Scanner scanner;
    private Facade facade = new Facade(null, null, null, null, null, null);
   public Child editChild;
    private Random rand;
    private static final String FIRST_PROMPT = "1. Guardian Login \n2. Counselor Login \n3. Director Login \n4. Create Account \n5. Logout";

    public CampUI() {
        scanner = new Scanner(System.in);
        facade = this.facade;
        rand = new Random();
    }

    public void run() {
        boolean run = true;
        while(run) 
        {
            System.out.println("-----Welcome to South Carolina Summer Camp-----");
            DataReader.getAllDirectors();
            System.out.println(FIRST_PROMPT);
            int n = scanner.nextInt();
            switch (n) 
            {
                case 1:
                    login(1);
                    userDisplay();
                    break;
                case 2:
                    login(2);
                    counselorDisplay();
                    break;
                case 3:
                    login(3);
                    directorDisplay();
                    break;
                case 4:
                    createUser();
                    System.out.println(" ");
                    System.out.println("Account successfully created. You will now be returned to the home screen to login.");
                    DataWriter.saveAllGuardians(GuardianList.getInstance().getGuardians());
                    run();
                    break;
                case 5:
                    logout();
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

    public void login(int i) {
        System.out.println("What is your username");
        String username = scanner.next();
        System.out.println("What is your password");
        String password = scanner.next();
        facade.login(username, password,i);
    }

    public void logout() {
        System.out.println("-----Logging out and exiting the program-----"
        + "\n-----Thank you for visiting-----");
        facade.logout();
        System.exit(0);
    }

    public void createUser() {
        System.out.println("-----Creating New Account-----");
        System.out.println("What type of account would you like to make \"director\", \"counselor\",or \"guardian\"");
        String accountType = scanner.nextLine();

        System.out.println("What is your first name");
        String firstName = scanner.next();
        scanner.nextLine();
        System.out.println("What is your last name");
        String lastName = scanner.next();
        scanner.nextLine();
        System.out.println("What is your email");
        String email = scanner.next();
        System.out.println("What would you like your username to be");
        String username = scanner.next();
        System.out.println("What would you like your password to be");
        String password = scanner.nextLine();
        scanner.nextLine();
        facade.signup(firstName, lastName, email, username, password,accountType);
    }

    public void userDisplay() {
        System.out.println("-----Welcome Guardian-----");
        System.out.println(" ");
        System.out.println("Would you like to \n1. Register a child \n2. Edit current child information \n3. View Children \n4. Logout");
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
                boolean ret = false;
                while(!exit)
                {
                    Child finChild = new Child(null, null, null, null, null);
                    System.out.println("enter the first and last name of the child you would like to edit.");
                    String editFirstName = scanner.next();
                    System.out.println("Enter the last name of the child you would like to edit");
                    String editLastName = scanner.next();
                    ArrayList<Child> children = DataReader.saveAllChildren();
                    for (int i =0;i<children.size();i++)
                    {
                        Child editChild = children.get(i);
                        if (editChild.firstName.equals(editFirstName) && editChild.lastName.equals(editLastName))
                        {
                            finChild = editChild;
                            ret=true;
                            break;
                        }

                    }
                    
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
                            String newAge = scanner.next();
                            scanner.nextLine();
                            
                            finChild.firstName = fName;
                            finChild.lastName = lName;
                            finChild.age=newAge;
                            break;
                        case 2:
                            System.out.println("What would you like your updated emergency contacts name to be");

                            String newName = scanner.next();
                            System.out.println("What would you like your updated relationship to be");
                            String newRelationship = scanner.next();
                            System.out.println("What would you like your updated phone # to be");
                            String newNum = scanner.next();

                            finChild.emergencyContact.name = newName;
                            finChild.emergencyContact.relationship = newRelationship;
                            finChild.emergencyContact.phoneNumber = newNum;
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
                            String newRestriction = scanner.nextLine();
                            ArrayList<String> newRestrictions = new ArrayList();
                            newRestrictions.add(newRestriction);
                            scanner.nextLine();
                            System.out.println("What are the updated allergies");
                            String newAllergies = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What are the updated medications");
                            String newMedications = scanner.nextLine();
                            scanner.nextLine();

                            finChild.healthInfo.insurance=newInsurance;
                            finChild.healthInfo.policyNumber = newPolicy;
                            finChild.healthInfo.doctor = newDoctor;
                            finChild.healthInfo.dietaryRestrictions= newRestrictions;
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
        System.out.println("Would you like to \n1. Add an activity \n2. Remove an activity \n3. Edit schedule \n4. Create a new Session \n5. View Cabin schedules \n6. Logout");
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
            boolean bre = false;
            ArrayList<ArrayList> week = new ArrayList<ArrayList>();
            ArrayList<Activity> daySchedule = new ArrayList<Activity>();
            ArrayList<Sessions> sessions = new ArrayList<Sessions>();
            ArrayList<Cabin> cabins = new ArrayList<Cabin>();
            while(!bre)
            {
                
                System.out.println("Enter the title of session you would like to add.");
                scanner.nextLine();
                String title = scanner.nextLine();
                System.out.println("Enter the cost of this session");
                double cost = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the theme of this session.");
                String theme = scanner.nextLine();
                scanner.nextLine();
                System.out.println("cabins");
                for(int x = 0;x<6;x++)
                {
                    System.out.println("enter the cabin name");
                    String id = scanner.nextLine();
                    System.out.println("age range");
                    String ageRange = scanner.nextLine();
                    cabins.add(new Cabin(ageRange,null,8,null,id,null));

                }
                facade.addSession(new Sessions(title,title,cost,theme,cabins));
                sessions.add(new Sessions(title,title,cost,theme,cabins));
                System.out.println("Would you like to add another session?");
                String resp = scanner.nextLine();
                scanner.nextLine();
                if (resp.equalsIgnoreCase("no"))
                {
                    bre=true;
                }
            }
            for (int z=0;z<sessions.size();z++)
            {
                Sessions schedSess = sessions.get(z);
                for (int y=0;y<cabins.size();y++)
                {
                    Cabin cabin = cabins.get(y);
                    for (int day=0;day<5;day++)
                    {
                    daySchedule.add(new Activity ("Breakfast","Breakfast with entire camp"));
                    daySchedule.add(new Activity ("activity 1","Activity1 desc"));
                    daySchedule.add(new Activity ("activity 2","Activity2 desc"));
                    daySchedule.add(new Activity ("lunch","Lunch with entire camp"));
                    daySchedule.add(new Activity ("activity 3","Activity3 desc"));
                    daySchedule.add(new Activity ("activity 4","Activity4 desc"));
                    daySchedule.add(new Activity ("dinner", "dinner with entire camp"));
                    week.add(daySchedule);
                    }
                    cabin.schedule = week;

                }
            }   
            DataWriter.saveAllSessions(sessions,cabins);
            break;
            case 5:
            System.out.println("enter the session you would like to access");
            scanner.nextLine();
            String sessionName = scanner.nextLine();
            System.out.println("enter the cabin name that you would like to view");
            String cabinName = scanner.nextLine();
            scanner.nextLine();
            facade.viewSchedule(sessionName,cabinName);
            break;
            case 6:
                logout();
                break;
        }
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        CampUI campUI = new CampUI();
        campUI.run();
    }
}