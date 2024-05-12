package Week7;

public class Mihani {
    private int cubic_capacity ;
    private int horsepower;

    public Mihani(int cubic_capacity, int horsepower) {
        this.cubic_capacity = cubic_capacity;
        this.horsepower = horsepower;
    }

    public int getCubic_capacity() {
        return cubic_capacity;
    }

    public void setCubic_capacity(int cubic_capacity) {
        this.cubic_capacity = cubic_capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void leitourgia(){
        System.out.println("Car is On...");
    }
    public void kinisi(){
        System.out.println("Car is Moving...");
    }
    public void svysimo(){
        System.out.println("Car is Off...");
    }
}
