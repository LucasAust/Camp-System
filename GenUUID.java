import java.util.UUID;

public class GenUUID {
    public static void main(String[] args){
       /*  for(int i=0; i<8; i++){
            System.out.println(UUID.randomUUID());
            DataReader dataReader = new DataReader();
            dataReader.saveAllUsers();
        }*/
        DataReader dataReader = new DataReader();
            dataReader.getAllSessions();
    }
}
