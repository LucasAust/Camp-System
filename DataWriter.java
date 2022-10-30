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
        RegisteredUser guardian = guardians.get(i);
        user.put("firstName",guardian.getFirstName());
        user.put("lastName",guardian.getLastName());
        user.put("username",guardian.getUserName());
        user.put("email",guardian.getEmail());
        user.put("password", guardian.getPassword());
        
        JSONUsers.add(user);
        }
        try
        {
            FileWriter file = new FileWriter("/Users/ljaus/Camp-System/JSON/Guardian.json");
            file.write(JSONUsers.toJSONString());
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
    public static boolean saveAllSessions(ArrayList<Sessions> sessions, ArrayList<Cabin> cabins)
    {
        JSONArray JSONUsers = new JSONArray();
        JSONArray cabinsList = new JSONArray();
        JSONArray schedule = new JSONArray();
        for(int i=0;i<sessions.size();i++)
        {
        JSONObject session = new JSONObject();
        Sessions Session = sessions.get(i);
        session.put("id",Session.getId());
        session.put("theme",Session.getTheme());
        session.put("cost",Session.getCost());
        session.put("cabins",cabinsList);
        for(int j=0;j<6;j++)
        {
            JSONObject cabin = new JSONObject();
            Cabin Cabin = cabins.get(j);
            cabin.put("name",Cabin.getId());
            cabin.put("ageRange",Cabin.getAgeRange());
            cabin.put("schedule",schedule);
            for(int h=0;h<5;h++)
            {
                JSONObject date = new JSONObject();
                date.put("day","day "+(h+1));
                schedule.add(date);
                for(int k =0;k<7;k++)
                {
                Activity activity = (Activity) Cabin.getSchedule().get(h).get(k);
                JSONObject add = new JSONObject();
               JSONObject day = new JSONObject();
              // day.put("day",("day "+(h+1)));
               add.put("name",activity.name);
               add.put("description",activity.description);
               day.put("activity "+(k+1), add);
               schedule.add(day);
              // schedule.add("day"+(h+1));
                }
                
            }
            cabinsList.add(cabin);
        }
    
        

        
        //session.put("password", Session.getPassword());
        
        JSONUsers.add(session);
        }
        try
        {
            FileWriter file = new FileWriter("test.JSON");
            file.write(JSONUsers.toJSONString());
            file.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }
}
