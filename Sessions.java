import java.util.ArrayList;

public class Sessions {

    public String title;
    public double cost;
    public ArrayList<Child> campers;
    public ArrayList<Cabin> cabins;

    public Sessions(String id, String title, double cost, ArrayList<Cabin> cabins)
    {
        this.title = title;
        this.cost = cost;
    }

    public boolean isFull() {
        if (cabins.size() > 8) {
            return false;
        } else
            return true;
    }
}
