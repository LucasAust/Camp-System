import java.util.ArrayList;

public class Sessions {

    public String title;
    public double cost;
    public ArrayList<Child> campers;
    public ArrayList<Cabin> cabins;

<<<<<<< HEAD
    public Sessions(String id, String title, double cost, ArrayList<Cabin> cabins)
    {
=======
    public Sessions(String title, double cost) {
>>>>>>> 6ebdaecad7790a7f8eb3c63e93138b3c1bd31b48
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
