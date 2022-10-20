import java.util.ArrayList;

public class Sessions {
    
    public String title;
    public double cost;
    public ArrayList<Child> campers;
    public ArrayList<Cabin> cabins;

    public Sessions(String title, double cost)
    {
        this.title = title;
        this.cost = cost;
    }
    public boolean isFull()
    {
        return true;
    }
}
