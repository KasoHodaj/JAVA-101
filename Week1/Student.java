package Week1;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int absences;
    private double lab_grade;
    private double theo_grade;

    // Default constructor
    public Student(){
    }

    //Constructor with parameters
    public Student(int id, String name, String surname, int absences, double lab_grade, double theo_grade){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.absences = absences;
        this.lab_grade = lab_grade;
        this.theo_grade = theo_grade;
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

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public double getLab_grade() {
        return lab_grade;
    }

    public void setLab_grade(double lab_grade) {
        this.lab_grade = lab_grade;
    }

    public double getTheo_grade() {
        return theo_grade;
    }

    public void setTheo_grade(double theo_grade) {
        this.theo_grade = theo_grade;
    }

    // Method to compute the final grade based on lab and theoretical grades
    public double computeFinal(){
        return (0.3*lab_grade) + (0.7*theo_grade);
    }

    // Override toString() method to provide a string representation of the Student object
    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", absences=" + absences +
                ", lab_grade=" + lab_grade +
                ", theo_grade=" + theo_grade;

    }
}
