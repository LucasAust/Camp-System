//Written by Deep P Patel

import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {
    @Before
    public void oneTimeSetup()
    {

    }
    
    @After
    public void oneTimeTearDown
    {

    }

    @Test
    public void testAddActivity(){
    Activity activity = new Activity("Waterpark", "Having fun at the waterpark with your other campers.", "Charlotte Waterpark");
    addActivity(activity);
    }

    @Test
    public void testSignupGuardian(){
        // Guardian.addUser(firstName, lastName, username, email, password);
        if (accountType.equalsIgnoreCase("Guardian")) {
            GuardianList.getInstance().addGuardian("George", "Pickens", "gpickens11", "gpickens11@gmail.com", "steelersnation", child);
        }
    }

    @Test
    public void testSignupCounselor(){
    if (accountType.equalsIgnoreCase("Counselor")) {
        CounselorList.getInstance().addCounselor("kyle", "korver", "kkshooter", "kkshottooclean", "bballforlife");
    }

    @Test
public void testAddSession(){
    ArrayList<Cabin> cabins = new ArrayList<Cabin>();
    emergencyContact emergencyContact = new emergencyContact("Walter White", "Father", "994-232-4685");
    ArrayList<String> dietaryRestrictions = new ArrayList<String>();
    ArrayList<String> allergies = new ArrayList<String>();
    allergies.add("Latex");
    ArrayList<String> medications = new ArrayList<String>();
    medications.add("Epi-Pen");
    healthInfo healthInfo = new healthInfo("CIGNA Group Inc.", "CG48237000747", "Dr. J.R. Smith", dietaryRestrictions, allergies, medications);
    Child child = new Child("John", "Smith", "11", "johnsmith33", healthInfo, emergencyContact, "2");
    Counselor counselor = new Counselor("Jeremy", "Frederickson", "jfred007@yahoo.com", emergencyContact, healthInfo, cabins, "JFred", "ctrlaltdlt123!");
    ArrayList<ArrayList> schedule = new ArrayList<ArrayList>();
    Cabin cabin = new Cabin("7-10", null, 80, "43857963463", "0071283823", schedule);
    Sessions sessions = new Sessions("Ninja", "Ninja", 700.00, "Ninja", "07/1/22-10/8/22", cabins);
    addSession(sessions);
}

@Test
public void testAddCabin(){
    cabin = new Cabin("7-10", counselor, 80, "23492384", "2123584353", schedule);
}

@Test
public void testRemoveActivity(){
    Activity activity = new Activity("Tag", "Running around and chasing others.", "Outside in the yard.");
    removeActivity(activity);
}

@Test
public void testViewSchedule(){

}

@Test
public void testViewRoster(){

}

@Test
public void testViewVitals(){

}

@Test
public void testPrintSchedule(){

}

@Test
public void testViewChildren(){
    ArrayList<Child> childs = new ArrayList<Child>();
    String firstName = "Charlie";
    String lastName = "Brown";
    ArrayList<String> children = registeredUser.getChildren();
    childs = DataReader.getAllChildren();
    for (int i = 0; i < children.size(); i++) {
        System.out.println(children.get(i));

        int x = children.get(i).indexOf(" ");
        firstName = children.get(i).substring(0, x);
        lastName = children.get(i).substring(x + 1);
        for (int j = 0; j < childs.size(); j++) {
            Child child = childs.get(j);
            if (child.getFirstName().equals(firstName) && child.getLastName().equals(lastName)) {
                System.out.println(child.getSession());
                break;
            }
        }
    } 
}

@Test
public void testViewSesssions(){

}

@Test
public void testRegisterChildForSession(){

}
}
