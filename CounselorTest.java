// writtent by Max EIsenhardt

import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CounselorTest {
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
        allergy.add("Peanuts");
        assertEquals(allergy, allergy);
    }
    
    @Test
    public void testAddEmergencyConcact() {
        emergencyContact father = new emergencyContact("Lance Armstrong", "Father", "244-753-6753");
        assertEquals(father, father);
    }

    @Test
    public void testAddHealthInfo() {
        ArrayList<String> dietaryRestrictions = new ArrayList<String>();
        dietaryRestrictions.add("Peanuts");
        ArrayList<String> allergies2 = new ArrayList<String>();
        allergies2.add("Peanuts");
        ArrayList<String> medications = new ArrayList<String>();
        medications.add("Insulin");
        healthInfo info = new healthInfo("Palmetto Pediatrics", "Dr. Green", "232-535-2578", dietaryRestrictions, allergies2, medications);
        assertEquals(medications, info);
    }
}
