import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataWriter {
    //Add method for each type of user
    public static boolean saveAllUsers(ArrayList<RegisteredUser> users)
    {
        JSONArray JSONUsers = new JSONArray();
        for(int i=0;i<users.size();i++)
        {
        JSONObject user = new JSONObject();
        RegisteredUser registeredUser = users.get(i);
        user.put("First Name",registeredUser.getFirstName());
        user.put("Last Name",registeredUser.getLastName());
        user.put("Username",registeredUser.getUserName());
        user.put("Email",registeredUser.getEmail());
        user.put("Password", registeredUser.getPassword());
        
        JSONUsers.add(user);
        }
        try
        {
            FileWriter file = new FileWriter("test.json");
            file.write(JSONUsers.toJSONString());
            file.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }

    public static void writeRoster(ArrayList<String> roster)
    {

    }
    public static void writeVitals(ArrayList<String> vitals)
    {

    }
    public static void writeSchedule(ArrayList<String> schedule)
    {

    }

}
