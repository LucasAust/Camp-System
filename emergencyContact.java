public class emergencyContact {
    protected String name;
    protected String relationship;
    protected String phoneNumber;

    public String getName() {
        return name;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * creates a new emergency contact
     * @param name
     * @param relationship
     * @param phoneNumber
     */
    public emergencyContact(String name, String relationship, String phoneNumber) {
        this.name = name;
        this.relationship = relationship;
        this.phoneNumber = phoneNumber;
    }
}
