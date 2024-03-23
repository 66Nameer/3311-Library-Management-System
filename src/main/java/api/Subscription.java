package api;

public class Subscription {
    private String serviceName;
    private boolean isActive;
  

    public Subscription(){}
   
    public Subscription(String serviceName, boolean isActive) {
        this.serviceName = serviceName;
        this.isActive = isActive;
    }


    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return isActive;
    }


    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

 
}
