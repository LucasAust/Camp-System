import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataWriter {
    //Add method for each type of user
    public static boolean saveAllGuardians(ArrayList<Guardian> guardians)
    {
        JSONArray JSONUsers = new JSONArray();
        for(int i=0;i<guardians.size();i++)
        {
        JSONObject user = new JSONObject();
        RegisteredUser registeredUser = guardians.get(i);
        user.put("First Name",registeredUser.getFirstName());
        user.put("Last Name",registeredUser.getLastName());
        user.put("Username",registeredUser.getUserName());
        user.put("Email",registeredUser.getEmail());
        user.put("Password", registeredUser.getPassword());
        
        JSONUsers.add(user);
        }
        try
        {
            FileWriter file = new FileWriter("/Users/ljaus/Camp-System/JSON/Guardian.json");
            file.append(JSONUsers.toJSONString());
            file.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }

    public static void writeRoster(ArrayList<String> roster) throws IOException
    {
        FileWriter file = new FileWriter("roster.txt");
        for(String str: roster)
        {
            file.write(str + System.lineSeparator());
        }
        file.close();
    }
    public static void writeVitals(ArrayList<String> vitals) throws IOException
    {
        FileWriter file = new FileWriter("vitals.txt");
        for(String str: vitals)
        {
            file.write(str + System.lineSeparator());
        }
        file.close();
    }
    public static void writeSchedule(ArrayList<String> schedule) throws IOException
    {
        FileWriter file = new FileWriter("schedule.txt");
        for(String str: schedule)
        {
            file.write(str + System.lineSeparator());
        }
        file.close();
    }

}
