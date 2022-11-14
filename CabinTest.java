import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CabinTest {

    @Before
    public void oneTimeSetup()
    {

    }

    @After
    public void oneTimeTearDown()
    {

    }
    @Test
    public void addCampers()
    {
        Cabin cabin = new Cabin("10-11",null,6,"sessionID","ID",null);
        //ArrayList<Child> result = cabin.addCampers(cabin);
        cabin.addCampers(cabin);
    }
    @Test
    public void addCampersNullAgeRange()
    {
        Cabin cabin= new Cabin(null,null,6,"sessionID","ID",null);
        cabin.addCampers(cabin);
    }
}
   

