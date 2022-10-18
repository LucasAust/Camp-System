import java.util.ArrayList;

public class Sessions {
    
    public String title;
    public double cost;
    public Child user;
    public ArrayList<Cabin> cabins;

    public Sessions(String title, double cost, Child user)
    {

    }
    public boolean isFull()
    {
        return true;
    }
}
