import java.util.UUID;

public class GenUUID {
    public static void main(String[] args) {
        /*
         * for(int i=0; i<8; i++){
         * System.out.println(UUID.randomUUID());
         * DataReader dataReader = new DataReader();
         * dataReader.saveAllUsers();
         * }
         */
        DataReader dataReader = new DataReader();
       DataReader.getAllSessions2();
        //DataReader.getAllCounselors();
       // DataReader.saveAllUsers();
       //DataReader.getAllGuardians();
        //DataWriter.saveAllUsers(ChildList.getInstance().getNewUsers());

    }
}
