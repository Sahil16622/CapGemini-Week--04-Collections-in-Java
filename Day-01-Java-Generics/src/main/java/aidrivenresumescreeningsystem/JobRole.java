package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// Abstract class representing different job roles
abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRoleName();
}
