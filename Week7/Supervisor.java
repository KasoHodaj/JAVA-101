package Week7;

public class Supervisor extends SalariedEmployee{

    public Supervisor(String fullName, int id, String specialization, String address, int children, int years) {
        super(fullName, id, specialization, address, children, years);
    }

    public float salary(){
        float wage =0;
        wage = (float) (super.salary() + 0.1*super.salary());
        return wage;
    }

    public String toString(){
        return super.toString();
    }
}
