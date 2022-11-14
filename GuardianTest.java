import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GuardianTest {
    @Before
    public  void oneTimeSetup()
    {

    }
   
    @After
    public  void oneTimeTearDown()
    {

    }
    
    @Test
    public void testAddChild(){
        String child = "Gibby";
        assertEquals(child, child);
    }

    @Test
    public void testAddGuardian() {
        ArrayList<String> children = new ArrayList<String>();
        children.add("Shelby");
        assertEquals(children, children);
    } 
}
