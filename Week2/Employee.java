package Week2;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private double wage;
    private int year;
    private double bonus;

    public Employee(){
    }

    public Employee(int id, String name, String surname, double wage, int year, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wage = wage;
        this.year = year;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double salary(){
        return wage + (year*10+bonus);
    }

    public void newSalary(double amount){ //OUR NEW METHOD FOR INCREASING THE SALARY
        wage += amount;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", wage=" + wage +
                ", year=" + year +
                ", bonus=" + bonus ;
    }
}
