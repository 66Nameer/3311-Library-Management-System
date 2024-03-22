package api;

public class Subscription {
    private String serviceName;
    private boolean isActive;
    // Placeholder for additional fields like tokens

    public Subscription(){}
    // Constructor
    public Subscription(String serviceName, boolean isActive) {
        this.serviceName = serviceName;
        this.isActive = isActive;
    }

    // Getters
    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return isActive;
    }

    // Setters
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Placeholder for additional getters and setters for new fields
}
