
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Ali Omer
public class DataReader {

  JSONParser jsonParser = new JSONParser();
  public static final ArrayList<Guardian> guardianList= new ArrayList<Guardian>();

  public static ArrayList<Child> getAllChildren() {
    ArrayList<Child> children = new ArrayList<Child>();
    try {
      FileReader reader = new FileReader("JSON/Child.json");
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
        String meds = null;
        ArrayList<String> medication = (ArrayList<String>) user.get("medications");
        for(int j=0;j<medication.size();j++)
        {
          meds = medication.get(j);
        }
        ArrayList<String> medications = new ArrayList<String>();
        medications.add(meds);
        JSONObject emergencyContact = (JSONObject) user.get("emergencyContact");
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
        children.add(new Child(firstName, lastName, age, meds, healthInfo, eContact,session));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return children;
  }

  public static ArrayList<Counselor> getAllCounselors() {
    ArrayList<Counselor> counselors = new ArrayList<Counselor>();
    try {
      FileReader reader = new FileReader("JSON/counselor.json");
      JSONParser parser = new JSONParser();
      JSONArray counselorList = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < counselorList.size(); i++) {
        JSONObject counselor = (JSONObject) counselorList.get(i);
        String username = (String) counselor.get("username");
        String password = (String) counselor.get("password");
        String id = (String) counselor.get("id");
        String firstName = (String) counselor.get("firstName");
        String lastName = (String) counselor.get("lastName");
        JSONArray cabins = (JSONArray)counselor.get("cabin");
        ArrayList<Cabin> counselorCabins = new ArrayList<Cabin>();
        for(int j=0;i>cabins.size();j++)
        {
        JSONObject cabin = (JSONObject)cabins.get(i);
        String session = (String)cabin.get("session");
        String cabinId = (String)cabin.get("id");
        Cabin addCabin = new Cabin("10-8", null, 10, session, cabinId,null);
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
        Counselor addCounselor = new Counselor(firstName, null,null, emergencyContact2, healthInfo, counselorCabins,username,password);
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
      FileReader reader = new FileReader("JSON/sessions.json");
      JSONParser parser = new JSONParser();
      JSONArray sessions = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < sessions.size(); i++) {
        JSONObject session = (JSONObject) sessions.get(i);

        String id = (String) session.get("id");
        String title = (String) session.get("title");
        Long cost = (Long) session.get("cost");
        String theme = (String) session.get("theme");
        JSONArray cabins = (JSONArray) session.get("cabins");
        ArrayList<Cabin> sessionCabins = new ArrayList<Cabin>();
        for(int j=0;j<cabins.size()-1;j++)
        {
          JSONObject cabin = (JSONObject)cabins.get(j);
          String cabinID = (String)cabin.get("id");
          String counselorID = (String)cabin.get("counselor");
          ArrayList<String>camperIDs = (ArrayList<String>)cabin.get("campers");
          Cabin addCabin = new Cabin("10-8", null, 10, id, cabinID,null);
          sessionCabins.add(addCabin);
        }
        Sessions addSession = new Sessions(id, title, cost,theme,null,sessionCabins);
        sessionsList.add(addSession);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return sessionsList;
  }

  public static ArrayList<Guardian> getAllGuardians() {
    try {
      FileReader reader = new FileReader("JSON/Guardian.json");
      JSONParser parser = new JSONParser();
      JSONArray guardians = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < guardians.size(); i++) {
        JSONObject guardian = (JSONObject) guardians.get(i);

        String firstName = (String) guardian.get("firstName");
        String lastName = (String) guardian.get("lastName");
        String email = (String) guardian.get("email");
        String password = (String) guardian.get("password");
        String username = (String) guardian.get("username");
        ArrayList<String> children = new ArrayList<String>();
        ArrayList<String> childs = (ArrayList<String>)guardian.get("children");
        for(int j=0;j<childs.size();j++)
        {
        String child=childs.get(j);
        children.add(child);
        }

        Guardian addReg = new Guardian(firstName,lastName,username,email,password,children);
        guardianList.add(addReg);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return guardianList;
  }

  public static ArrayList<Director> getAllDirectors() {
    ArrayList<Director> directorList = new ArrayList<Director>();
    try {
      FileReader reader = new FileReader("JSON/Director.json");
      JSONParser parser = new JSONParser();
      JSONArray directors = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < directors.size(); i++) {
        JSONObject director = (JSONObject) directors.get(i);

        String firstName = (String) director.get("firstName");
        String lastName = (String) director.get("lastName");
        String email = (String) director.get("email");
        String password = (String) director.get("password");
        String username = (String) director.get("username");

        Director addDir = new Director(firstName,lastName,username,email,password);
        directorList.add(addDir);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return directorList;
  }


  public static ArrayList<Sessions> getAllUserSessions() {
    ArrayList<Sessions> sessionsList = new ArrayList<Sessions>();
    try {
      FileReader reader = new FileReader("JSON/UserSession.json");
      JSONParser parser = new JSONParser();
      JSONArray sessions = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < sessions.size(); i++) {
        JSONObject session = (JSONObject) sessions.get(i);

        double cost = (double) session.get("cost");
        String theme = (String) session.get("theme");
        String id = (String) session.get("id");
        String dates = (String) session.get("dates");
        
        sessionsList.add(new Sessions(null,id,cost,theme,dates,null));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return sessionsList;
  }
  
}
