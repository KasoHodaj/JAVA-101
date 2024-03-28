package Week4;


public class Foititis {
    private String name;
    private String surname;
    private short am;
    private short entryYear;


    // Default constructor
    public Foititis(){}

    // Full Constructor
    public Foititis(String name, String surname, short am, short entryYear) {
        this.name = name;
        this.surname = surname;
        this.am = am;
        this.entryYear = entryYear;
    }

    // Getter and setter methods
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

    public short getAm() {
        return am;
    }

    public void setAm(short am) {
        this.am = am;
    }

    public short getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(short entryYear) {
        this.entryYear = entryYear;
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", surname='" + surname  +
                ", am=" + am +
                ", entryYear=" + entryYear ;
    }

}
