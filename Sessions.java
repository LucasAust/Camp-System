import java.util.ArrayList;

public class Sessions {

    public String id;
    public String title;
    public double cost;
    public String theme;
    public ArrayList<Child> campers;
    public ArrayList<Cabin> cabins;

    public String getTheme()
    {
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

    public Sessions(String id, String title, double cost, String theme, ArrayList<Cabin> cabins) {
        this.id=id;
        this.title = title;
        this.cost = cost;
        this.theme = theme;
        this.cabins = cabins;
    }

    public boolean isFull() {
        if (cabins.size() > 8) {
            return false;
        } else
            return true;
    }
    public void addSession(Sessions session)
    {
        SessionList.getInstance().addSession(session);
    }


}
