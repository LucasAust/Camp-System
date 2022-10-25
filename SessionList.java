import java.util.ArrayList;

public class SessionList {
    public ArrayList<Sessions> sessions;

    public ArrayList<Sessions> sessionsList() {
        DataReader dataReader = new DataReader();
        sessions = dataReader.getAllSessions();
    }

}