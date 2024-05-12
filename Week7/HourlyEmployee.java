package Week7;

public class HourlyEmployee extends Employee{
    private int hours; // hours worked


    public HourlyEmployee(String fullName, int id, String specialization, String address, int hours) {
        super(fullName, id, specialization, address); // Call to the superclass (Employee) constructor
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public float salary(){
        // Method to calculate the salary based on hours worked and a base rate with an increase
        float wage = 0;
        wage = 7 * hours;  // Calculate base wage
        wage = (float) (wage * 1.06); // Apply a 6% increase to the base wage
        return wage; // Return calculated wage
    }

    @Override
    public String toString(){
        // Override the toString method to include additional hourly employee details in the string representation
        return super.toString() + ", hours= " + hours + ", salary= " + salary(); // Include hours and salary
    }


}
