import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CounselorListTest {
  private CounselorList counselors = CounselorList.getInstance();
  private ArrayList<Counselor> counselorLists = counselors.getCounselors();
  private CounselorList counselor = new CounselorList();

  ArrayList<emergencyContact> emergencyContacts = new ArrayList<emergencyContact>();
  ArrayList<healthInfo> healthCare = new ArrayList<healthInfo>();

  @BeforeEach
  public void testSetup() {
    emergencyContact contact = new emergencyContact("Sarah Adams", "Mother", "372-545-2376");
    emergencyContacts.add(contact);
    healthInfo health = new healthInfo("BlueCross BlueShield", "76373267", "Dr. Kramer", null, null, null);
    healthCare.add(health);
    counselorLists.clear();
    counselorLists.add(new Counselor("Lacy", "Adams", "anemail.com", contact, health, null, "LAdams", "password"));
  }

  @AfterEach
  public void tearDown() {
    CounselorList.getInstance().getCounselors().clear();
    DataReader.getAllCounselors();
  }

  @Test
  public void testvalidCounselor() {
    boolean Lacy = CounselorList.haveCounselor("LAdams");
    assertTrue(Lacy);
  }

  @Test
  public void testwrongusername() {
    boolean Lacywrong = CounselorList.haveCounselor("ladams");
    assertFalse(Lacywrong);
  }

  @Test
  public void testCaseSen() {
    boolean Lacycase = CounselorList.haveCounselor("laDAMS");
    assertFalse(Lacycase);
  }

  @Test
  public void testempty() {
    boolean Lacyempty = CounselorList.haveCounselor("");
    assertFalse(Lacyempty);
  }

  @Test
  public void testnull() {
    boolean Lacynull = CounselorList.haveCounselor(null);
    assertFalse(Lacynull);
  }

  @Test
  public void testAddCounselor() {
    counselorLists.add(new Counselor("deez", "cont", "theemail.com", null, null, null, "Deez", "password"));
    assertEquals("Deez", CounselorList.getCounselors());
  }
}
