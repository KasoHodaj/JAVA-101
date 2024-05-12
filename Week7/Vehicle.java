package Week7;

public class Vehicle {
    protected String fullName;
    protected String plateNumber;
    protected int Year;
    protected SystimaDieythynsis sysdief; //Σύστημα διεύθυνσης
    protected Mihani engine; // Μηχανή αυτοκινήτου

    // Default Constructor
    public Vehicle(String fullName, String plateNumber, int year) {
        this.fullName = fullName;
        this.plateNumber = plateNumber;
        this.Year = year;
        this.sysdief = new SystimaDieythynsis();
        this.engine = new Mihani(0, 0);
    }

    public Vehicle(String fullName, String plateNumber, int year,int cc, int hp) {
        this.fullName = fullName;
        this.plateNumber = plateNumber;
        this.Year = year;
        this.sysdief = new SystimaDieythynsis();
        this.engine = new Mihani(cc,hp);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    @Override
    public String toString() {
        return "fullName='" + fullName + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", Year=" + Year +
                ", CC=" + engine.getCubic_capacity() + ", HP= " +
                engine.getHorsepower();
    }
}
