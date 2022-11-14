//Written by Lucas Aust
import org.junit.jupiter.api.Assertions.*;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ActivityTest {
    @Before
    public  void oneTimeSetup()
    {

    }
   
    @After
    public  void oneTimeTearDown()
    {

    }
    @Test
    public void testToStringValid()
    {
        Activity activity = new Activity("breakfast","Breakfast with the entire camp","mess hall");
        String result = "breakfast: Breakfast with the entire camp";
        assertEquals(result,activity.toString());
        
    }
    @Test
    public void testToStringNull()
    {
        Activity activity = new Activity(null, null, null);
        String result  = "invalid activity";
        assertEquals(result,activity.toString());
    }

    @Test
    public void testToStringNullName()
    {
        Activity activity = new Activity(null,"Breakfast with entire camp","mess hall");
        String result = "invalid activity";
        assertEquals(result,activity.toString());
    }

    @Test
    public void testToStringNullDesc()
    {
        Activity activity = new Activity("Breakfast",null,"mess hall");
        String result = "invalid activity";
        assertEquals(result,activity.toString());
    }

    @Test
    public void testAddActivityValid()
    {
        Activity activity = new Activity("breakfast","Breakfast with the entire camp","mess hall");
        activity.addActivity(activity);
    }
    @Test
    public void testAddActivityNullName()
    {
        Activity activity = new Activity(null,"Breakfast with the entire camp","mess hall");
        boolean result =activity.addActivity(activity);
        assertEquals(false,result);
    }
    @Test
    public void testAddActivityNullDesc()
    {
        Activity activity = new Activity("breakfast",null,"mess hall");
        boolean result =activity.addActivity(activity);
        assertEquals(false,result);
    }
    @Test
    public void testAddActivityNullLoc()
    {
        Activity activity = new Activity("breakfast","Breakfast with the entire camp",null);
        boolean result = activity.addActivity(activity);
        assertEquals(false,result);
    }
    @Test
    public void testRemoveActivityValid()
    {
        
        Activity activity = new Activity("breakfast","Breakfast with the entire camp","mess hall");
        activity.addActivity(activity);
        boolean result = activity.removeActivity(activity);
        assertEquals(true,result);
    }

    @Test
    public void testRemoveActivityNullName()
    {
        Activity activity = new Activity("breakfast","Breakfast with the entire camp","mess hall");
        activity.addActivity(activity);
        Activity activityT = new Activity(null,"Breakfast with the entire camp","mess hall");
        boolean result =activity.removeActivity(activityT);
        assertEquals(false,result);
    }
    @Test
    public void testRemoveActivityNullDesc()
    {
        Activity activity = new Activity("breakfast","Breakfast with the entire camp","mess hall");
        activity.addActivity(activity);
        Activity activityT = new Activity("Breakfast",null,"mess hall");
        boolean result =activity.removeActivity(activityT);
        assertEquals(false,result);
    }
    @Test
    public void testRemoveActivityNullLoc()
    {
        Activity activity = new Activity("breakfast","Breakfast with the entire camp","mess hall");
        activity.addActivity(activity);
        Activity activityT = new Activity("Breakfast","Breakfast with the entire camp",null);
        boolean result = activity.removeActivity(activityT);
        assertEquals(false,result);
    }

    
}
