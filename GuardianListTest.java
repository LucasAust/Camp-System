//Tested by Lucas Aust
import org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GuardianListTest {

    @Before
    public void oneTimeSetup()
    {

    }
    @After
    public void oneTimeTearDown()
    {
        
    }

    @Test
    public void testAddGuardian()
    {
        boolean result =(GuardianList.getInstance().addGuardian("Chuck","Walters","CWalters","CWalters@email","CWalters",null));
        assertEquals(true,result);
    }
    @Test
    public void testAddGuardianNullFirstName()
    {
        boolean result =(GuardianList.getInstance().addGuardian(null,"Walters","CWalters","CWalters@email","CWalters",null));
        assertEquals(false,result);
    }
    @Test
    public void testAddGuardianNullLastName()
    {
        boolean result =(GuardianList.getInstance().addGuardian("Chuck",null,"CWalters","CWalters@email","CWalters",null));
        assertEquals(false,result);
    }
    @Test
    public void testAddGuardianNullUserName()
    {
        boolean result =(GuardianList.getInstance().addGuardian("Chuck","Walters",null,"CWalters@email","CWalters",null));
        assertEquals(false,result);
    }
    @Test
    public void testAddGuardianNullEmail()
    {
        boolean result =(GuardianList.getInstance().addGuardian("Chuck","Walters","CWalters",null,"CWalters",null));
        assertEquals(false,result);
    }
    @Test
    public void testAddGuardianNullPassword()
    {
        boolean result =(GuardianList.getInstance().addGuardian("Chuck","Walters","CWalters","CWalters@email",null,null));
        assertEquals(false,result);
    }
    
}
