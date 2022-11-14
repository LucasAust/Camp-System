// tested by Max Eisenhardt
import java.util.ArrayList;

public class SessionList {
    private static SessionList sessionList;
    public ArrayList<Sessions> sessions;

    private SessionList()
    {
        sessions = new ArrayList<Sessions>();

    }
    public static SessionList getInstance()
    {
        if (sessionList == null)
        {
            sessionList = new SessionList();

        }
        return sessionList;
    }
    public void addSession(Sessions session)
    {
        sessions.add(session);
    }
    public ArrayList<Sessions> getSessions()
    {
        return sessions;
    }    
}