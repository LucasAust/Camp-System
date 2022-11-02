import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CampUI {
    private Scanner scanner;
    private Facade facade = new Facade(null, null, null, null, null, null);
    public Child editChild;
    private Random rand;
    public RegisteredUser registeredUser;
    public Guardian guardian;
    private static final String FIRST_PROMPT = "1. Guardian Login \n2. Counselor Login \n3. Director Login \n4. Create Account \n5. Logout";

    /**
     * creates a new user interface
     */
    public CampUI() {
        scanner = new Scanner(System.in);
        facade = this.facade;
        rand = new Random();
    }

    /**
     * starts the program and prompts the user with different choices to log in
     */
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
                    //login guardian
                    guardian=(Guardian) login(1);
                    userDisplay(guardian);
                    break;
                case 2:
                    //login counselor
                    login(2);
                    counselorDisplay();
                    break;
                case 3:
                    //login director
                    login(3);
                    directorDisplay();
                    break;
                case 4:
                    //create new user
                    createUser();
                    System.out.println(" ");
                    System.out.println("Account successfully created. You will now be returned to the home screen to login.");
                    DataWriter.saveAllGuardians(GuardianList.getInstance().getGuardians());
                    run();
                    break;
                case 5:
                    logout();
            }
            /*
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
            }  */      
        }
    }

    /**
     * logs the user into the system
     * @param j the type of account being logged into (guardian, counselor, or director)
     * @return if they were logged in to the program or not based on if the login matched 
     */
    public RegisteredUser login(int j) {
        System.out.println("What is your username");
        String username = scanner.next();
        System.out.println("What is your password");
        String password = scanner.next();
        registeredUser = facade.login(username, password,j);
        return registeredUser;
    }

    /**
     * logs the user out of the system and exits the program
     */
    public void logout() {
        System.out.println("-----Logging out and exiting the program-----"
        + "\n-----Thank you for visiting-----");
        facade.logout();
        System.exit(0);
    }

    /**
     * allows new users to create an account that the system will then store
     */
    public void createUser() {
        System.out.println("-----Creating New Account-----");
        System.out.println("What type of account would you like to make \"director\", \"counselor\",or \"guardian\"");
        String accountType = scanner.next();
        scanner.nextLine();
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
        facade.signup(firstName, lastName, email, username, password,accountType,null);
        
    }

    /**
     * the user menu that comes up when a gaurdian successfully logs in allowing them to view, edit, and register different information
     * @param guardian the specific gaurdian that is logged in with specific data to their name
     */
    public void userDisplay(Guardian guardian) {
        System.out.println("-----Welcome Guardian-----");
        System.out.println(" ");
        //Guardian guardian = (Guardian) registeredUser;
        System.out.println("Would you like to \n1. Add a child to your account \n2. Edit current child information \n3. View Children \n4. Register your child in a session \n5. View available sessions\n6. Logout");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                //add child
                System.out.println("What is your child's first name");
                String firstName = scanner.next();
                scanner.nextLine();
                System.out.println("What is your child's last name");
                String lastName = scanner.next();
                scanner.nextLine();
                System.out.println("What is your childs age");
                String age = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the name of the emergency contact for the child. If entering multiple contacts, separate the information with a slash.");
                String name = scanner.nextLine();
                //scanner.nextLine();
                System.out.println("What is the relationship of the emergency contact to the child ");
                String relationship = scanner.nextLine();
                //scanner.nextLine();
                System.out.println("What is the phone # of the emergency contact");
                String phoneNumber = scanner.nextLine();
               // scanner.nextLine();
                System.out.println("What is the name of your doctors office");
                String insurance = scanner.nextLine();
                //scanner.nextLine();
                System.out.println("What is your doctors office phone #");
                String policyNumber = scanner.nextLine();
               // scanner.nextLine();
                System.out.println("What is the name of your child's doctor");
                String doctor = scanner.nextLine();
             //   scanner.nextLine();
                System.out.println("Enter any allergies your child may have. Enter 'none' if they do not have any. If more than one add a space between each, then press enter when done.");
                String allergy = scanner.nextLine();
                ArrayList<String> allergies = new ArrayList<String>();
                allergies.add(allergy);
                scanner.nextLine();
                System.out.println("Enter any medications your child may be on. Enter 'none' if they do not have any. If more than one add a space between each, then press enter when done.");
                String medication = scanner.nextLine();
                ArrayList<String> medications = new ArrayList<String>();
                medications.add(medication);
                System.out.println("Enter any dietary restrictions your child may have.");
                String dietaryRestriction=scanner.nextLine();
                ArrayList<String>dietaryRestrictions = new ArrayList<String>();
                dietaryRestrictions.add(dietaryRestriction);
                scanner.nextLine();
                emergencyContact emergencyContact = new emergencyContact(name,relationship,phoneNumber);
                healthInfo healthInfo = new healthInfo(insurance,policyNumber,doctor,dietaryRestrictions,allergies,medications);
                Child child = new Child(firstName, lastName,age, medication, healthInfo, emergencyContact,null);
                facade.addChild(firstName+" "+lastName,guardian);
                facade.registerChild(child);
                System.out.println("You have successfully added "+firstName+" "+lastName+" to your account");
                userDisplay(guardian);
                break;
            case 2:
                //edit child info
                boolean exit = false;
                boolean ret = false;
                while(!exit)
                {
                    Child finChild = new Child(null, null, null, null, null,null, null);
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
                            //update personal
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
                            //update emergency contact
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
                            //update medical
                            System.out.println("What would you like your updated doctors office to be");
                            String newInsurance = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated doctor's phone # to be");
                            String newPolicy = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What would you like your updated doctor name to be");
                            String newDoctor = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("What are the updated dietary restrictions");
                            String newRestriction = scanner.nextLine();
                            ArrayList<String> newRestrictions = new ArrayList<String>();
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
                System.out.println(" ");
                userDisplay(guardian);
                break;
            case 3:
                //view children on account
                facade.viewChildren(guardian);
                System.out.println(" ");
                userDisplay(guardian);
                break;
            case 4:
                //register child
                System.out.println("Enter the first name of the child you would like to register");
                String childFirstName = scanner.next();
                scanner.nextLine();
                
                System.out.println("Enter the last name of the child you would like to register");
                String childLastName = scanner.next();
                scanner.nextLine();
                System.out.println("Enter the session that you would like to register your child for");
                String session = scanner.nextLine();
                scanner.nextLine();
                facade.registerChildForSession(childFirstName,childLastName,session);
                System.out.println("You have successfully registered "+childFirstName+" "+childLastName+" for "+session);
                userDisplay(guardian);
                break;
            case 5:
                //view sessions
                facade.viewSessions();
                System.out.println(" ");
                userDisplay(guardian);
                break;
            case 6:
                DataWriter.saveAllGuardians(GuardianList.getInstance().getGuardians());
                System.out.println("Thank you for looking at our camp.");
                logout();
                break;
        }
    }

    /**
     * the menu that is displayed when a counselor successfully logs in allowing them to view and edit different information
     */
    public void counselorDisplay() {
        System.out.println("-----Welcome Counselor-----");
        System.out.println(" ");
        System.out.println("Would you like to \n1. View Roster \n2. View Vital Information \n3. View Schedule \n4. Logout");
        int choice = scanner.nextInt();
        System.out.println(" ");
        switch (choice) {
            case 1:
                //view campers
                facade.viewRoster();
                System.out.println(" ");
                counselorDisplay();
                break;
            case 2:
                //view information
                facade.viewVitals();
                System.out.println(" ");
                counselorDisplay();
                break;
            case 3:
                //view schedule
                System.out.println("Enter the session you would like to view the schedule for");
               // facade.generateSchedule(session,week);
                facade.view();
                System.out.println(" ");
                counselorDisplay();
                break;
            case 4:
                //DataWriter.saveAllCounselors(CounselorList.getInstance().getCounselors());
                System.out.println("Thank you for looking at our camp.");
                logout();
                break;
        }
    }

    /**
     * the menu that is displayed when a director successfully logs in allowing them to make changes to the camp activities, schedules, sessions, and cabins
     */
    public void directorDisplay() {
        System.out.println("-----Welcome Director-----");
        System.out.println(" ");
        System.out.println("Would you like to \n1. Add an activity \n2. Remove an activity \n3. Edit schedule\n4. Set up a new Session \n5. View Cabin schedules \n6. Logout");
        int choice = scanner.nextInt();
        System.out.println(" ");
        switch (choice) {
            case 1:
                //add activity
                for(int i=1;i<5;i++) {
                    Activity createActivity = new Activity("name", "description");
                    createActivity.createActivity(createActivity);
                    createActivity.addActivity(createActivity);
                    /*
                    System.out.println("What is the name of activity " + i);
                    String Aname = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("What is the description of activity " + i);
                    String Adescription = scanner.nextLine();
                    Activity Aactivity = new Activity(Aname, Adescription);
                    facade.addActivity(Aactivity);
                    Activity activities = new Activity(Aname, Adescription);
                    activities.addActivity(Aactivity);
                    System.out.println(" ");
                    */
                }
                directorDisplay();
                break;
            case 2: 
                //remove activity
                System.out.println("What is the name of the activity you would like to remove");
                String Rname = scanner.nextLine();
                System.out.println("What is the description of the activity you would like to remove");
                String Rdescription = scanner.nextLine();
                Activity Ractivity = new Activity(Rname, Rdescription);
                facade.removeActivity(Ractivity);
                System.out.println(" ");
                directorDisplay();
                break;
            case 3:
                //Edit schedule
                directorDisplay();
                break;
            case 4:
                //create new session and generate schedule
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
                    System.out.println("Enter the week this session runs");
                    String dates = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("cabins");
                    for(int x = 1;x<7;x++)
                    {
                        System.out.println("Enter cabin " + x + " name");
                        String id = scanner.nextLine();
                        System.out.println("Age range for cabin " + x);
                        String ageRange = scanner.nextLine();
                        cabins.add(new Cabin(ageRange,null,8,null,id,null));
                    }
                    facade.addSession(new Sessions(title,title,cost,theme,dates,cabins));
                    sessions.add(new Sessions(title,title,cost,theme,dates,cabins));
                    System.out.println("Would you like to add another session?");
                    String resp = scanner.nextLine();
                    if (resp.equalsIgnoreCase("no"))
                    {
                        DataWriter.saveAllUserSessions(sessions);
                        bre=true;
                    }
                }
                //------------------------------------------------------
                //generate schedule
                Director newSchedule = new Director("Sam", "Samuels", "SSamuels", "ssamuels@camp.com", "password");
                newSchedule.generateSchedule();
                //facade.generateSchedule(null);
                //-----------------------------------------------------
                /*
                for (int z=0;z<sessions.size();z++)
                {
                    Sessions schedSess = sessions.get(z);
                    for (int y=0;y<cabins.size();y++)
                    {
                        Cabin cabin = cabins.get(y);
                        for (int day=0;day<5;day++)
                        {
                        daySchedule.add(new Activity ("Breakfast","Breakfast with entire camp"));
                        daySchedule.add(nw Activity ("Activity 1","Activity 1 description"));
                        daySchedule.add(new Activity ("Activity 2","Activity 2 description"));
                        daySchedule.add(new Activity ("Lunch","Lunch with entire camp"));
                        daySchedule.add(new Activity ("Activity 3","Activity 3 description"3));
                        daySchedule.add(new Activity ("Activity 4","Activity 4 description"));
                        daySchedule.add(new Activity ("Dinner", "Dinner with entire camp"));
                        week.add(daySchedule);
                        }
                        cabin.schedule = week;
                    }
                }   
                */
                //DataWriter.saveAllSessions(sessions,cabins);
                System.out.println(" ");
                directorDisplay();
                break;
            case 5:
                //view cabin schedule
                System.out.println("enter the session you would like to access");
                scanner.nextLine();
                String sessionName = scanner.nextLine();
                System.out.println("enter the cabin name that you would like to view");
                String cabinName = scanner.nextLine();
                facade.viewSchedule(sessionName,cabinName);
                System.out.println(" ");
                directorDisplay();
                break;
            case 6:
            //logout
                //DataWriter.saveAllDirectors(DirectorList.getInstance().getDirectors());
                System.out.println("Thank you for looking at our camp.");
                logout();
                break;
        }
    }

    /**
     * main method that runs the entire program
     * @param args
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        CampUI campUI = new CampUI();
        campUI.run();
    }
}