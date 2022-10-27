import java.util.ArrayList;

public class healthInfo {
    protected String insurance;
    protected String policyNumber;
    protected String doctor;
    protected ArrayList<String> dietaryRestrictions = new ArrayList<String>();
    protected ArrayList<String> allergies = new ArrayList<String>();
    protected ArrayList<String> medications = new ArrayList<String>();

    public healthInfo(String insurance, String policyNumber,String doctor,ArrayList<String> dietaryRestrictions2, ArrayList<String> allergies2, ArrayList<String> medications) {
        this.insurance = insurance;
        this.policyNumber = policyNumber;
        this.doctor = doctor;
        this.dietaryRestrictions = dietaryRestrictions2;
        this.allergies = allergies2;
        this.medications = medications;
    }
    public String getInsurance()
    {
        return insurance;
    }
    public String policyNumber()
    {
        return policyNumber;
    }
    public String doctor()
    {
        return doctor;
    }
    public ArrayList<String> getMedications()
    {
        return medications;
    }
    public ArrayList<String> getAllergies()
    {
        return allergies;
    }
    public ArrayList<String> getDietaryRestrictions()
    {
        return dietaryRestrictions;
    }
}