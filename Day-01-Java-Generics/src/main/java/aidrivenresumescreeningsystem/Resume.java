package aidrivenresumescreeningsystem;

// Generic Resume class
class Resume<T extends JobRole> {
    private T jobRole;
    private String resumeContent;

    public Resume(T jobRole, String resumeContent) {
        this.jobRole = jobRole;
        this.resumeContent = resumeContent;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    @Override
    public String toString() {
        return "Resume of " + jobRole.getCandidateName() + " for " + jobRole.getRoleName();
    }
}