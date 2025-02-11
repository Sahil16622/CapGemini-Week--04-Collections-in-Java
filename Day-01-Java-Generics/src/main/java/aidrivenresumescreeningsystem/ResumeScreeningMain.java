package aidrivenresumescreeningsystem;

// Main class to test functionality
public class ResumeScreeningMain {
    public static void main(String[] args) {
        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();

        // Creating resumes for different job roles
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"), "Alice's Resume Content");
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"), "Bob's Resume Content");
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie"), "Charlie's Resume Content");

        // Adding resumes to screening system
        screeningSystem.addResume(seResume);
        screeningSystem.addResume(dsResume);
        screeningSystem.addResume(pmResume);

        // Display resumes
        System.out.println("Resumes in Screening System:");
        screeningSystem.displayResumes();

        // Validate resumes
        System.out.println("\nValidating Resumes:");
        System.out.println("Is Alice's Resume valid? " + ResumeScreeningSystem.validateResume(seResume));
        System.out.println("Is Bob's Resume valid? " + ResumeScreeningSystem.validateResume(dsResume));
    }
}
