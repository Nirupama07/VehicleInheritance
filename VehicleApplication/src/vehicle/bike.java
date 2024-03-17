package vehicle;

public class bike extends engine {
    private String handleType;
    
    public bike(String type, int Horsepower, String handleType) {
        super(type, Horsepower);
        this.handleType = handleType;
    }
    
    public String getHandleType() {
        return handleType;
    }
    
    public void setHandleType(String handleType) {
        this.handleType = handleType;
    }
}