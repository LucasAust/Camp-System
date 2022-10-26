
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Ali Omer
public class DataReader {

  JSONParser jsonParser = new JSONParser();

  public static ArrayList<User> saveAllUsers() {
    ArrayList<User> users = new ArrayList<User>();
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

  public static ArrayList<Counselor> getAllCounselors() {
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
        Long age = (Long) counselor.get("age");
        JSONArray cabins = (JSONArray)counselor.get("cabin");
        ArrayList<Cabin> counselorCabins = new ArrayList<Cabin>();
        for(int j=0;i>cabins.size();j++)
        {
        JSONObject cabin = (JSONObject)cabins.get(i);
        String session = (String)cabin.get("session");
        String cabinId = (String)cabin.get("id");
        Cabin addCabin = new Cabin("10-8", null, 10, session, cabinId);
        counselorCabins.add(addCabin);
        }
        JSONObject emergencyContact = (JSONObject) counselor.get("emergencyContact");
        String eName = (String) emergencyContact.get("name");
        String relationship = (String) emergencyContact.get("relationship");
        String phoneNumber = (String) emergencyContact.get("phoneNumber");
        emergencyContact emergencyContact2 = new emergencyContact(eName, relationship, phoneNumber);
        JSONObject healthCare = (JSONObject) counselor.get("healthCare");
        String hName = (String) healthCare.get("name");
        String policyNumber = (String) healthCare.get("policyNumber");
        String doctor = (String) healthCare.get("doctor");
        healthInfo healthInfo = new healthInfo(hName, policyNumber, doctor,null,null,null);
        Counselor addCounselor = new Counselor(firstName, null, age, emergencyContact2, healthInfo, counselorList);
        counselors.add(addCounselor);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return counselors;
  }

  public static ArrayList<Sessions> getAllSessions() {
    ArrayList<Sessions> sessionsList = new ArrayList<Sessions>();
    try {
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/sessions.json");
      JSONParser parser = new JSONParser();
      JSONArray sessions = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < sessions.size(); i++) {
        JSONObject session = (JSONObject) sessions.get(i);

        String id = (String) session.get("id");
        String title = (String) session.get("title");
        Long cost = (Long) session.get("cost");
        JSONArray cabins = (JSONArray) session.get("cabins");
        ArrayList<Cabin> sessionCabins = new ArrayList<Cabin>();
        for(int j=0;j<cabins.size()-1;j++)
        {
          JSONObject cabin = (JSONObject)cabins.get(j);
          String cabinID = (String)cabin.get("id");
          String counselorID = (String)cabin.get("counselor");
          ArrayList<String>camperIDs = (ArrayList<String>)cabin.get("campers");
          Cabin addCabin = new Cabin("10-8", null, 10, id, cabinID);
          sessionCabins.add(addCabin);
        }
        Sessions addSession = new Sessions(id,title, i,cabins);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return sessionsList;
  }

  public static ArrayList<RegisteredUser> getAllRegistered() {
    ArrayList<RegisteredUser> RegisteredsList = new ArrayList<RegisteredUser>();
    try {
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/RegisteredUser.json");
      JSONParser parser = new JSONParser();
      JSONArray Registereds = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < Registereds.size(); i++) {
        JSONObject registered = (JSONObject) Registereds.get(i);

        String firstName = (String) registered.get("firstName");
        String lastName = (String) registered.get("lastName");
        String userName = (String) registered.get("userName");
        String email = (String) registered.get("email");
        String password = (String) registered.get("password");

        RegisteredUser addReg = new RegisteredUser(firstName,lastName,userName,email,password);
        RegisteredsList.add(addReg);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return RegisteredsList;
  }

}
