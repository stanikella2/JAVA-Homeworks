public class ExecutiveAssistant {
    // properties
    private String firstName;
    private String lastName;
    private int organizationScore;
    private int punctualityScore;
    
    public ExecutiveAssistant(
            String firstName,
            String lastName,
            int organizationScore,
            int punctualityScore) {
        // set properties
        this.firstName = firstName;
        this.lastName = lastName;
        this.organizationScore = organizationScore;
        this.punctualityScore = punctualityScore;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
    /**
     * Returns the job suitability of this candidate
     */
    public double getJobSuitabilityScore() {
        return 0.8*organizationScore + 0.2*punctualityScore;
    }
}
