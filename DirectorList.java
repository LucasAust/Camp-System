//tested by Deep N Patel
import java.util.ArrayList;

import org.junit.Test;

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

    /**
     * adds a new director
     * @param firstName
     * @param lastName
     * @param username
     * @param email
     * @param password
     */
    public void addDirector(String firstName,String lastName, String username, String email, String password)
    {
        directors.add(new Director(firstName, lastName, username, email, password));
    }
    public ArrayList<Director> getDirectors(){
        return directors;
    }


    @Test
    public void testAddDirector() {
        addDirector("Samantha", "Samuels", "SSamuels", "ssamuels@camp.com", "password");
    }
}
