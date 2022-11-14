//Written by Lucas Aust
import org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CabinListTest {
    ArrayList<Cabin> cabins;
    @Before
    public void oneTimeSetup()
    {
         cabins = new ArrayList<Cabin>();
         cabins.add(new Cabin("10-11", null, 6, "SessionID", "id", null));
         
    }

    @After
    public void oneTimeTearDown()
    {

    }

    @Test
    public void testAddCabin()
    {
        boolean result =CabinList.getInstance().addCabin("10-11", null, 6, "SessionID", "id", null);
        assertEquals(true,result);
    }
    @Test
    public void testAddCabninNullageRange()
    {
        boolean result =CabinList.getInstance().addCabin(null, null, 6, "SessionID", "id", null);
        assertEquals(false,result);
    }
    @Test
    public void testAddCabninNullCounselor()
    {
        boolean result =CabinList.getInstance().addCabin("10-11", null, 6, "SessionID", "id", null);
        assertEquals(true,result);
    }
    @Test
    public void testAddCabninNegativeMaxCampers()
    {
        boolean result =CabinList.getInstance().addCabin("10-11", null, -6, "SessionID", "id", null);
        assertEquals(false,result);
    }
    @Test
    public void testAddCabin0MaxCampers()
    {
        boolean result =CabinList.getInstance().addCabin("10-11", null, 0, "SessionID", "id", null);
        assertEquals(false,result);
    }
    @Test
    public void testAddCabinNullSessionID()
    {
        boolean result =CabinList.getInstance().addCabin("10-11", null, 6, null, "id", null);
        assertEquals(false,result);
    }
    @Test
    public void testAddCabinNullID()
    {
        boolean result =CabinList.getInstance().addCabin("10-11", null, 6, "SessionID", null, null);
        assertEquals(false,result);
    }
    @Test
    public void testAddCabinNullCounselor()
    {
        boolean result =CabinList.getInstance().addCabin("10-11", null, 6, "SessionID", "id", null);
        assertEquals(true,result);
    }


    
}
