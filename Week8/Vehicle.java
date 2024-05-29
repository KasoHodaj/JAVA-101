package Week8;

abstract class Vehicle {
    protected String owner;
    protected String plateNumber;
    protected int Year;
    protected SystimaDieythynsis sysdief; //Σύστημα διεύθυνσης
    protected Mihani engine; // Μηχανή αυτοκινήτου

    // Default Constructor
    public Vehicle(String owner, String plateNumber, int year) {
        this.owner = owner;
        this.plateNumber = plateNumber;
        this.Year = year;
        this.sysdief = new SystimaDieythynsis();
        this.engine = new Mihani(0, 0);
    }

    public Vehicle(String owner, String plateNumber, int year, int cc, int hp) {
        this.owner = owner;
        this.plateNumber = plateNumber;
        this.Year = year;
        this.sysdief = new SystimaDieythynsis();
        this.engine = new Mihani(cc,hp);
    }

    public String getFullName() {
        return owner;
    }

    public void setFullName(String fullName) {
        this.owner = fullName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void transferOwnership(String newOwner){
        System.out.println("Ownership is transfered from " + owner + " to " + newOwner);
        owner = newOwner;
    }

    abstract protected void drive();

    @Override
    public String toString() {
        return "Owner='" + owner + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", Year=" + Year +
                ", CC=" + engine.getCubic_capacity() + ", HP= " +
                engine.getHorsepower();
    }
}
