
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Ali Omer
public class DataReader  {

  JSONParser jsonParser = new JSONParser();
  public ArrayList<User> saveAllUsers(){
    ArrayList<User> users = new ArrayList<User>();
    try{
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/Child.json");
      JSONParser parser = new JSONParser();
      JSONArray userList = (JSONArray) new JSONParser().parse(reader);
      for(int i=0;i<userList.size();i++)
      {
        JSONObject user= (JSONObject) userList.get(i);
        
        String id = (String)user.get("id");
        String firstName = (String)user.get("firstName");
        String lastName = (String)user.get("lastName");
        String age = (String)user.get("age");
        String session = (String)user.get("session");
        String dietaryRestriction = (String)user.get("deitaryRestrictions");
        ArrayList<String> dietaryRestrictions = new ArrayList<String>();
        dietaryRestrictions.add(dietaryRestriction);
        ArrayList<String> allergyL = (ArrayList<String>)user.get("allergies");
        String allergy=allergyL.get(0);
        ArrayList<String> allergies = new ArrayList<String>();
        allergies.add(allergy);
       //ArrayList<String> allergies = null;
        String medication = (String)user.get("medications");
        ArrayList<String> medications = new ArrayList<String>();
        medications.add(medication);
        JSONObject emergencyContact =(JSONObject)user.get("healthCare");
        String eName = (String)emergencyContact.get("name");
        String eRelationship = (String)emergencyContact.get("relationship");
        String ePhoneNumber = (String)emergencyContact.get("phoneNumber");
        JSONObject healthCare = (JSONObject)user.get("healthCare");
        String hName = (String)healthCare.get("name");
        String hPolicyNumber = (String)healthCare.get("policyNumber");
        String hDoctor =(String)healthCare.get("doctor");

        healthInfo healthInfo = new healthInfo(hName, hPolicyNumber, hDoctor, dietaryRestrictions, allergies, medications);
        emergencyContact eContact = new emergencyContact(eName, eRelationship, ePhoneNumber);
        users.add(new Child(firstName, lastName, age,healthInfo,eContact));
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return users;
  }

  public void getAllSchedules(ArrayList<Schedule> schedule){

  }

  public void getAllSessions(ArrayList<Sessions> sessions){
    ArrayList<Sessions> sessionsList = new ArrayList<Sessions>();
    try{
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/sessions.json");
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}
