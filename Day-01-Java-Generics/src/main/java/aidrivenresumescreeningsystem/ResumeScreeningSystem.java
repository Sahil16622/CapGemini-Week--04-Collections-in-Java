package aidrivenresumescreeningsystem;
import java.util.ArrayList;
import java.util.List;
// AI Resume Screening System
class ResumeScreeningSystem {
    public List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void displayResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println(resume);
        }
    }

    // Generic Method to check if a resume is valid
    public static <T extends JobRole> boolean validateResume(Resume<T> resume) {
        return resume.getResumeContent() != null && !resume.getResumeContent().isEmpty();
    }
}

