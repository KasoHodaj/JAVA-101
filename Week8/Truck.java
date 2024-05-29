package Week8;

public class Truck extends Vehicle{
    private int numAxis; // Number of axles

    public Truck(){
        super("Unknown","Unknown",0); // Default constructor
    }
    public Truck(int numAxis){
        super("Unknown","Unknown",0); // Constructor with numAxis parameter
        this.numAxis = numAxis;
    }
    public Truck(String owner,String plateNumber, int year, int numAxis){ // Constructor with all parameters
        super(owner, plateNumber, year);
        this.numAxis = numAxis;
    }

    public int getNumAxis() {
        return numAxis;
    }

    public void setNumAxis(int numAxis) {
        this.numAxis = numAxis;
    }


    @Override
    protected void drive(){ // Abstract...
        System.out.println("You must be a professional driver. This is a " + numAxis + " axis truck Mr." + owner);
    }
}
