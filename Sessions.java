// tested by Max Eisenhardt
import java.util.ArrayList;

/**
 * @param id
 * @param title
 * @param cost
 * @param theme
 * @param campers
 * @param cabins
 */
public class Sessions {

    public String id;
    public String title;
    public double cost;
    public String theme;
    public ArrayList<Child> campers;
    public ArrayList<Cabin> cabins;
    public String dates;

    public String getDates()
    {
        return dates;
    }
    public String getTheme() {
        return theme;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public ArrayList<Child> getCampers() {
        return campers;
    }

    public ArrayList<Cabin> getCabins() {
        return cabins;
    }

    public Sessions(String id, String title, double cost, String theme, String dates, ArrayList<Cabin> cabins) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.theme = theme;
        this.cabins = cabins;
        this.dates=dates;
    }

    /**
     * @return true false if it is full if not return true
     */
    public boolean isFull() {
        if (cabins.size() > 8) {
            return false;
        } else
            return true;
    }

    /**
     * method to add a Session
     * 
     * @param session is added to a Session list array
     */
    public void addSession(Sessions session) {
        SessionList.getInstance().addSession(session);
    }

}
