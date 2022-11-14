//Written by Deep N Patel

import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChildTest {
    @Before
    public  void oneTimeSetup()
    {

    }
   
    @After
    public  void oneTimeTearDown()
    {

    }

    @Test
    public void testAddAllergies() {
        ArrayList<String> allergy = new ArrayList<String>();
        allergy.add("Sneeze");
        assertEquals(allergy, allergy);
    }

    @Test
    public void testAddMedication() {
        ArrayList<String> medication = new ArrayList<String>();
        medication.add("Tylenol");
        assertEquals(medication, medication);
    }

    @Test
    public void testEmergencyContact() {
        emergencyContact contact = new emergencyContact("Paul Bryant","father","123-456-7890");
        assertEquals(contact, contact);
    }

    @Test
    public void testHealthInfo() {
        ArrayList<String> dietaryRestrictions = new ArrayList<String>();
        dietaryRestrictions.add("milk");
        ArrayList<String> allergies = new ArrayList<String>();
        allergies.add("Pollen");
        ArrayList<String> medications = new ArrayList<String>();
        medications.add("Tylenol");
        healthInfo health = new healthInfo("Julie", "Sneeze", "10", dietaryRestrictions, allergies, medications);
        assertEquals(medications, health);
    }

    @Test
    public void testGetChild() {
        assertEquals(getClass(), getClass());
    }
}
