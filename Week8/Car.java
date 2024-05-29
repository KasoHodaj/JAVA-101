package Week8;

public class Car extends Vehicle {
    private int numDoors; // Number of doors

    // Default constructor
    public Car(){
        super("","",0);
    }

    // Constructor with numDoors parameter
    public Car(int numDoors) {
        super("Unknown", "Unknown", 0);
        this.numDoors = numDoors;
    }

    // Constructor with all parameters
    public Car(String owner, String plateNumber, int year, int numDoors) {
        super(owner, plateNumber, year);
        this.numDoors = numDoors;
    }


    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    protected void drive() { // Abstract...
        System.out.println("You need a car driving license Dear " + owner);
    }
}



