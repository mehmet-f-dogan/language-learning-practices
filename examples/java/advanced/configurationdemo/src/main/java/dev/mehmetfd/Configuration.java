package dev.mehmetfd;

public class Configuration {
    private String requiredVar = null;
    private String defaultVar = null;

    public String getRequiredVar() {
        return requiredVar;
    }

    public String getDefaultVar() {
        return defaultVar;
    }

    public void setDefaultVar(String defaultVar) {
        this.defaultVar = defaultVar;
    }

    public void setRequiredVar(String requiredVar) {
        this.requiredVar = requiredVar;
    }
}
