import java.util.ArrayList;

public class healthInfo {
    protected String insurance;
    protected String policyNumber;
    protected String doctor;
    protected ArrayList<String> dietaryRestrictions = new ArrayList<String>();
    protected ArrayList<String> allergies = new ArrayList<String>();

    public healthInfo(String insurance, String policyNumber,String doctor,ArrayList<String> dietaryRestrictions, ArrayList<String> allergies) {
        this.insurance = insurance;
        this.policyNumber = policyNumber;
        this.doctor = doctor;
        this.dietaryRestrictions = dietaryRestrictions;
        this.allergies = allergies;
    }
}