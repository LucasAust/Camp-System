import java.util.ArrayList;

public class DirectorList {
    private static DirectorList directorList;
    public ArrayList<Director> directors;
    public ArrayList<Director> newDirectors;

    private DirectorList()
    {
        directors = DataReader.getAllDirectors();
    }
    public static DirectorList getInstance()
    {
        if(directorList == null)
        {
            directorList = new DirectorList();
        }
        return directorList;
    }
    public void addDirector(String firstName,String lastName, String username, String email, String password)
    {
        directors.add(new Director(firstName, lastName, username, email, password));
    }
    public ArrayList<Director> getDirectors(){
        return directors;
    }

}
