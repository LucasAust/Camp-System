// writtent by Max EIsenhardt

import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SessionListTest {
    @Before
    public  void oneTimeSetup()
    {

    }
   
    @After
    public  void oneTimeTearDown()
    {

    }
    @Test
    public void testAddSession() {
        ArrayList<Cabin> cabins = new ArrayList<Cabin>();
        Sessions session1 = new Sessions("Week 6", "Week 6", 850, "Ninja", "7/28/23 - 8/3/23", cabins);
        assertEquals(cabins, session1);
    }
}
