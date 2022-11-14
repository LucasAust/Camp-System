// writtent by Max EIsenhardt

import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SessionsTest {
    @Before
    public  void oneTimeSetup()
    {

    }
   
    @After
    public  void oneTimeTearDown()
    {

    }
    @Test
    public void testIsFull() {
        Schedule schedule = new Schedule();
        ArrayList<Cabin> cabins = new ArrayList<Cabin>();
        Cabin cabin1 = new Cabin("10-11", null, 8, "15563245", "94582521", schedule);
        cabins.add(cabin1);
        assertEquals(cabins, cabin1);;
      }
    
    @Test
    public void testAddSession() {
        ArrayList<Cabin> cabins = new ArrayList<Cabin>();
        emergencyContact emergencyContact = new emergencyContact("Carla Adams", "Mother", "344-444-2677");
        ArrayList<String> dietaryRestrictions = new ArrayList<String>();
        ArrayList<String> allergies = new ArrayList<String>();
        allergies.add("Peanuts");
        ArrayList<String> medications = new ArrayList<String>();
        medications.add("Insulin");
        healthInfo healthInfo = new healthInfo("Palmetto Pediatrics", "1231273", "Dr. Jean", dietaryRestrictions, allergies, medications);
        Child child = new Child("Alex", "Adams", "11", "alexadams23@gmail.com", healthInfo, emergencyContact, "2");
        Counselor counselor = new Counselor("Barry", "Allen", "theflash@gmail.com", emergencyContact, healthInfo, cabins, "TheFlash", "Speed");
        ArrayList<ArrayList> schedule = new ArrayList<ArrayList>();
        Cabin cabin = new Cabin("Cabin1", null, 8, "48295242", "2586822", schedule);
        Sessions sessions = new Sessions("Week1", "Week1", 600, "Rockstar", "7/1/23 - 7/8/23", cabins);
        assertEquals(sessions, sessions);
    }
}
