package Week7;

import java.util.Scanner;

public class Main_Inheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Create instances of HourlyEmployee
        HourlyEmployee em1 = new HourlyEmployee("Kaso Hodaj",2022192, "Developer", "kassandrou 89", 160);
        HourlyEmployee em2 = new HourlyEmployee("Ioanna Tran",2022102, "Marketeer", "kassandrou 89", 120);

        // Create instances of SalariedEmployee
        SalariedEmployee s1 = new SalariedEmployee("George Gergiou", 2021167,"Mechanic","aristotelous 19",5,10 );
        SalariedEmployee s2 = new SalariedEmployee("Nikos Gergiou", 202111,"Teacher","filippou 52",1,4 );

        // Create instances of Supervisor
        Supervisor su1 = new Supervisor("Antonis Antoniou", 2024100, "Hotel Manager", "Gaios 0", 0, 3);
        Supervisor su2 = new Supervisor("Fillipos Filippou", 2024099, "Footballer", "Sofokleous 7", 1, 1);

        //Printing the details of all Employees
        System.out.println("Employye: " + em1);
        System.out.println("Employye: " + em2);
        System.out.println("Employye: " + s1);
        System.out.println("Employye: " + s2);
        System.out.println("Employye: " + su1);
        System.out.println("Employye: " + su2);

        /**TIPS**
         * (1). Using a General Type (UpCasting): Employee employee1 = new HourlyEmployee("kaso Hodaj",2022192,"Developer","kassandrou 89", 170);
         * (2). Using a Specific Type (Direct Assignment): HourlyEmployee em1 = new HourlyEmployee("Kaso Hodaj",2022192, "Developer", "kassandrou 89", 160);
         *
         * Pros of Using Employee Type:
         *     i.   Flexibility: Easily switch between different employee types.
         *     ii.  Code Reusability: Use the same code for various employee subclasses.
         *     iii. Future-Proof: Easily integrate new employee types as the system evolves.
         *
         * Pros of Using HourlyEmployee Type:
         *     i.   Specific Access: Directly utilize specific methods and properties of HourlyEmployee.
         *     ii.  Type Safety: Guarantees that the object has all the functionalities of HourlyEmployee.
         *     iii. Clarity: Makes the intended use of the object clear in the code.
        **/



    }
}
