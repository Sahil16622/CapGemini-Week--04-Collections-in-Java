package aidrivenresumescreeningsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ResumeScreeningTest {

    @Test
    void testResumeCreation() {
        // Creating resumes for different job roles
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"), "Alice's Resume Content");
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"), "Bob's Resume Content");

        // Checking candidate names
        assertEquals("Alice", seResume.getJobRole().getCandidateName());
        assertEquals("Bob", dsResume.getJobRole().getCandidateName());

        // Checking job roles
        assertEquals("Software Engineer", seResume.getJobRole().getRoleName());
        assertEquals("Data Scientist", dsResume.getJobRole().getRoleName());
    }

    @Test
    void testResumeValidation() {
        // Creating valid and invalid resumes
        Resume<SoftwareEngineer> validResume = new Resume<>(new SoftwareEngineer("Charlie"), "Charlie's Resume Content");
        Resume<ProductManager> invalidResume = new Resume<>(new ProductManager("David"), ""); // Invalid (empty content)

        // Validating resumes
        assertTrue(ResumeScreeningSystem.validateResume(validResume));
        assertFalse(ResumeScreeningSystem.validateResume(invalidResume));
    }

    @Test
    void testResumeScreeningSystem() {
        ResumeScreeningSystem system = new ResumeScreeningSystem();

        // Creating a resume
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Emma"), "Emma's Resume Content");

        // Adding resume to system
        system.addResume(pmResume);

        // Ensuring the resume is added (size should be 1)
        assertEquals(1, system.resumes.size());
    }

    @Test
    void testDisplayResumes() {
        ResumeScreeningSystem system = new ResumeScreeningSystem();
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Frank"), "Frank's Resume Content");
        system.addResume(dsResume);

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        system.displayResumes();

        // Restore normal output
        System.setOut(System.out);

        // Check expected output
        String expectedOutput = "Resume of Frank for Data Scientist\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}

