package aidrivenresumescreeningsystem;

// Concrete Job Role: Data Scientist
class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}