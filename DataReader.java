
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Ali Omer
public class DataReader  {

  JSONParser jsonParser = new JSONParser();
  public void saveAllUsers(){
    ArrayList<User> users = new ArrayList<User>();
    try{
      FileReader reader = new FileReader("/Users/ljaus/Camp-System/JSON/Child.json");
      JSONParser parser = new JSONParser();
      JSONArray userList = (JSONArray) new JSONParser().parse(reader);
      for(int i=0;i<userList.size();i++)
      {
        JSONObject user= (JSONObject) userList.get(i);
        
        int id = (int)user.get("id");
        String firstName = (String)user.get("firstName");
        String lastName = (String)user.get("lastName");
        String age = (String)user.get("age");
        String session = (String)user.get("session");
        String dietaryRestrictions = (String)user.get("deitaryRestrictions");
        String allergies = (String)user.get("allergies");
        String medications = (String)user.get("medications");
        JSONObject emergencyContact =(JSONObject)user.get("healthCare");
        String eName = (String)emergencyContact.get("name");
        String eRelationship = (String)emergencyContact.get("relationship");
        String ePhoneNumber = (String)emergencyContact.get("phoneNumber");
        JSONObject healthCare = (JSONObject)user.get("healthcare");
        String hName = (String)healthCare.get("name");
        String hPolicyNumber = (String)healthCare.get("policyNumber");
        String hDoctor =(String)healthCare.get("doctor");

        users.add(new Child(firstName, lastName, age));
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

  public void getAllSchedules(ArrayList<Schedule> schedule){

  }

  public void getAllSessions(ArrayList<Sessions> sessions){
    
  }

}
