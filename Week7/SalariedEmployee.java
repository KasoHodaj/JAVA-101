package Week7;

public class SalariedEmployee extends Employee{
    private int children; // Number of children the employee has
    private int years; // Number of years the employee has been with the company

    public SalariedEmployee(String fullName, int id, String specialization, String address, int children, int years) {
        // Constructor to initialize a SalariedEmployee object with employee details, including number of children and years at the company
        super(fullName, id, specialization, address);
        this.children = children;
        this.years = years;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public float salary(){
        float wage = 0; // Initialize wage
        wage = 700 + 35*children + 70*(years/3f); // Calculate salary: base plus benefits for children and tenure
        return wage; // Return the calculated wage
    }

    public String toString(){
        // Include children, years, and salary in the output string
        return super.toString() + ", children= " + children + ", Years= " + years + ", salary= " + salary();
    }
}
