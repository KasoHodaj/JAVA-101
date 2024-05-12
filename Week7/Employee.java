package Week7;

public class Employee {
    private String fullName;
    private int id;
    private String specialization;
    private String address;

    public Employee(){}

    public Employee(String fullName, int id, String specialization, String address) {
        this.fullName = fullName;
        this.id = id;
        this.specialization = specialization;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Full Name= " + fullName +
                ", ID= " + id + ", Specialization= " + specialization +
                ", Address= " + address;
    }
}
