//Written by Deep N Patel

import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DirectorTest {
    @Before
    public  void oneTimeSetup()
    {

    }
   
    @After
    public  void oneTimeTearDown()
    {

    }

@Test
public void testAddActivity() {
  Activity activity = new Activity("Kobe", "BBaller32","griffinthings");
  assertEquals(activity, activity);
}

@Test
public void testRemoveActivity() {
  Activity activity = new Activity("Kobe", "BBaller32","griffinthings");
  assertEquals(activity, activity);
}

@Test
public void testRemoveChild() {
  emergencyContact emergencyContact = new emergencyContact("debbie", "mother", "123-465-7890");
  ArrayList<String> dietaryRestrictions = new ArrayList<String>();
  dietaryRestrictions.add("Milk");
  ArrayList<String> allergies = new ArrayList<String>();
  allergies.add("peanuts");
  ArrayList<String> medications = new ArrayList<String>();
  medications.add("Benadryl");
  healthInfo healthInfo = new healthInfo("12390812481", "1231273", "Marcus Waters", dietaryRestrictions, allergies, medications);
  Child child = new Child("John", "Smith", "11", "johnsmith33", healthInfo, emergencyContact, "2");
  assertEquals(healthInfo, healthInfo);
}

@Test
public void testAddSession() {
  ArrayList<Cabin> cabins = new ArrayList<Cabin>();
  emergencyContact emergencyContact = new emergencyContact("debbie", "mother", "123-465-7890");
  ArrayList<String> dietaryRestrictions = new ArrayList<String>();
  ArrayList<String> allergies = new ArrayList<String>();
  allergies.add("peanuts");
  ArrayList<String> medications = new ArrayList<String>();
  medications.add("Benadryl");
  healthInfo healthInfo = new healthInfo("12390812481", "1231273", "Marcus Waters", dietaryRestrictions, allergies, medications);
  Child child = new Child("John", "Smith", "11", "johnsmith33", healthInfo, emergencyContact, "2");
  Counselor counselor = new Counselor("Mark", "Townsend", "mtown@gmail.com", emergencyContact, healthInfo, cabins, "MTown", "Mtown2");
  ArrayList<ArrayList> schedule = new ArrayList<ArrayList>();
  Cabin cabin = new Cabin("Cabin1", null, 80, "2342349123", "9234923", schedule);
  Sessions sessions = new Sessions("Rockstar", "Rockstar", 300.0, "Rockstar", "10/1/22-10/7/22", cabins);
  assertEquals(sessions, sessions);
}
}
