import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChildListTest {
  ArrayList<Child> childs;

  @BeforeEach
  public void Setup() {
    childs = new ArrayList<Child>();
    childs.add(new Child("Jack", "luck", "14", null, null, null, null));

  }

  @AfterEach
  public void oneTimeTearDown() {

  }

  @Test
  public void testaddChild() {
    boolean result = ChildList.getInstance().addChild("Jack", "luck", "14", null, null, null, null);
    assertTrue(result);
  }

  @Test
  public void testaddChildnullfirstname() {
    boolean result = ChildList.getInstance().addChild(null, "luck", "14", null, null, null, null);
    assertEquals(false, result);
  }

  @Test
  public void testaddChildnulllastname() {
    boolean result = ChildList.getInstance().addChild("jack", null, "14", null, null, null, null);
    assertEquals(false, result);
  }

  @Test
  public void testaddChildNegativeAge() {
    boolean result = ChildList.getInstance().addChild("Jack", "luck", "-14", null, null, null, null);
    assertEquals(false, result);
  }

  @Test
  public void testaddChildNumberName() {
    boolean result = ChildList.getInstance().addChild("14125251", "luck", "14", null, null, null, null);
    assertEquals(false, result);
  }

  @Test
  public void testaddChildNotNumberAge() {
    boolean result = ChildList.getInstance().addChild("Jack", "luck", "L", null, null, null, null);
    assertEquals(false, result);
  }

  @Test
  public void testaddChildNonArrayemergency() {
    boolean result = ChildList.getInstance().addChild("Jack", "luck", "14", null, null, "jeff", null);
    assertEquals(true, result);
  }
}
