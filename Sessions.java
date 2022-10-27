import java.util.ArrayList;

public class Sessions {

    public String id;
    public String title;
    public double cost;
    public ArrayList<Child> campers;
    public ArrayList<Cabin> cabins;

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

    public Sessions(String id, String title, double cost) {
        this.id=id;
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
