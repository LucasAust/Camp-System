
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Ali Omer
public class DataReader {

  JSONParser jsonParser = new JSONParser();

  public ArrayList<Child> saveAllUsers() {
    ArrayList<Child> users = new ArrayList<Child>();
    try {
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/Child.json");
      JSONParser parser = new JSONParser();
      JSONArray userList = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < userList.size(); i++) {
        JSONObject user = (JSONObject) userList.get(i);

        String id = (String) user.get("id");
        String firstName = (String) user.get("firstName");
        String lastName = (String) user.get("lastName");
        String age = (String) user.get("age");
        String session = (String) user.get("session");
        String dietaryRestriction = (String) user.get("deitaryRestrictions");
        ArrayList<String> dietaryRestrictions = new ArrayList<String>();
        dietaryRestrictions.add(dietaryRestriction);
        String allergy = (String) user.get("allergies");
        // String allergy=allergyL.get(0);
        ArrayList<String> allergies = new ArrayList<String>();
        allergies.add(allergy);
        // ArrayList<String> allergies = null;
        ArrayList<String> medication = (ArrayList<String>) user.get("medications");
        ArrayList<String> medications = new ArrayList<String>();
        medications.addAll(medication);
        JSONObject emergencyContact = (JSONObject) user.get("healthCare");
        String eName = (String) emergencyContact.get("name");
        String eRelationship = (String) emergencyContact.get("relationship");
        String ePhoneNumber = (String) emergencyContact.get("phoneNumber");
        JSONObject healthCare = (JSONObject) user.get("healthCare");
        String hName = (String) healthCare.get("name");
        String hPolicyNumber = (String) healthCare.get("policyNumber");
        String hDoctor = (String) healthCare.get("doctor");

        healthInfo healthInfo = new healthInfo(hName, hPolicyNumber, hDoctor, dietaryRestrictions, allergies,
            medications);
        emergencyContact eContact = new emergencyContact(eName, eRelationship, ePhoneNumber);
        users.add(new Child(firstName, lastName, age, healthInfo, eContact));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return users;
  }

  public void getAllCounselors() {
    ArrayList<Counselor> counselors = new ArrayList<Counselor>();
    try {
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/counselor.json");
      JSONParser parser = new JSONParser();
      JSONArray counselorList = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < counselorList.size(); i++) {
        JSONObject counselor = (JSONObject) counselorList.get(i);

        String id = (String) counselor.get("id");
        String firstName = (String) counselor.get("firstName");
        String lastName = (String) counselor.get("lastName");
        String age = (String) counselor.get("age");
        JSONObject emergencyContact = (JSONObject) counselor.get("emergencyContact");
        String eName = (String) emergencyContact.get("name");
        String relationship = (String) emergencyContact.get("relationship");
        String phoneNumber = (String) emergencyContact.get("phoneNumber");
        JSONObject healthCare = (JSONObject) counselor.get("healthCare");
        String hName = (String) healthCare.get("name");
        String policyNumber = (String) healthCare.get("policyNumber");
        String doctor = (String) healthCare.get("doctor");

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void getAllSessions() {
    ArrayList<Sessions> sessionsList = new ArrayList<Sessions>();
    try {
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/sessions.json");
      JSONParser parser = new JSONParser();
      JSONArray sessions = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < sessions.size(); i++) {
        JSONObject counselor = (JSONObject) sessions.get(i);

        String id = (String) counselor.get("id");
        String title = (String) counselor.get("title");
        Long cost = (Long) counselor.get("cost");
        JSONArray cabins = (JSONArray) counselor.get("cabins");
        System.out.println("hello");

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
