package Week8;

public class Motorcycle extends Vehicle {

    private boolean sidecar; // (true/false)

    // Default constructor
    public Motorcycle() {
        super("Unknown", "Unknown", 0);
    }

    // Constructor with sidecar parameter
    public Motorcycle(boolean sidecar) {
        super("Unknown", "Unknown", 0);
        this.sidecar = sidecar;
    }

    // Constructor with all parameters
    public Motorcycle(String owner, String plateNumber, int year, boolean sidecar) {
        super(owner, plateNumber, year);
        this.sidecar = sidecar;
    }


    public boolean isSidecar() {
        return sidecar;
    }


    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    protected void drive() {  //Abstract
        System.out.println("Your car driving license is not enough. You need a special\n" +
                "license Dear " + owner);
    }
}
