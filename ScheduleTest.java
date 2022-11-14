import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScheduleTest {
  public ArrayList<Activity> schedule = new ArrayList<Activity>();
  /*
   * @BeforeEach
   * public static void setupScheduletest() {
   * // runs before each test
   * }
   */

  @Test
  public void testaddActivity() {
    ArrayList<String> schedules = new ArrayList<String>();
    schedules.add("Boating");
    assertTrue(schedules.contains("Boating"));
  }

  @Test
  public void testaddActivityifnull() {
    ArrayList<String> schedules = new ArrayList<String>();
    schedules.add(null);
    assertTrue(schedules.contains(null));
  }

  @Test
  public void testaddActivityifempty() {
    ArrayList<String> schedules = new ArrayList<String>();
    schedules.add("");
    assertTrue(schedules.contains(""));
  }

  @Test
  public void testBreakfastforAll() {
    Activity breakfast = new Activity("breakfast", "Breakfast with the entire camp", "mess hall");
    schedule.add(0, breakfast);
    assertTrue(schedule.contains(breakfast));
  }

  @Test
  public void testLunchforAll() {
    Activity lunch = new Activity("Lunch", "Lunch with the entire camp", "cafe");
    schedule.add(lunch);
    assertTrue(schedule.contains(lunch));
  }

  @Test
  public void testDinnerforAll() {
    Activity dinner = new Activity("Dinner", "Dinner with the entire camp.", "diner");
    schedule.add(dinner);
    assertTrue(schedule.contains(dinner));
  }

  private void addActivity(ArrayList<String> schedules) {
  }
}
