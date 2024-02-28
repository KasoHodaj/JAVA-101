package Week1;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee(1,"kaso","hodaj",1000,6,100);
        Employee e2 = new Employee(2,"ioanna","tranaka",1000,8,100);

        System.out.println("The employees are: ");
        System.out.println(e1.toString() + ", " + e1.salary());
        System.out.println(e2.toString() + ", " + e2.salary());

        //Ασκηση 1.4

        // 1ος ΤΡΟΠΟΣ
        int[] pointers = FindLowSalary(e1,e2);

        System.out.println();

        // Checking low salary employees and increasing their salary by 100
        for(int i=0; i<2; i++){
            if(pointers[i] == 1){
                if(i == 0) {
                    System.out.println("Increasing salary for Employee " + e1.getName());
                    e1.setWage(e1.getWage() + 100);
                    System.out.println(e1.toString() + ", new salary: " + e1.salary());
                } else {
                    System.out.println("Increasing salary for Employee " + e2.getName());
                    e2.setWage(e2.getWage() + 100);
                    System.out.println(e2.toString() + ", new salary: " + e2.salary());
                }
            }
        }

         /*
    ΕΠΕΙΔΗ Η ΠΡΟΗΓΟΥΜΕΝΗ ΜΕΘΟΔΟΣ ΕΙΝΑΙ ΑΡΚΕΤΑ ΠΟΛΥΠΛΟΚΗ.
    ΓΕΝΙΚΑ ΥΠΑΡΧΟΥΝ ΠΟΛΟΙ ΤΡΟΠΟΙ ΑΛΛΑ ΕΝΑΣ ΑΛΛΟΣ ΕΝΝΑΛΑΚΤΙΚΟΣ ΚΑΙ ΕΞΥΠΝΟΣ ΤΡΟΠΟΣ ΕΙΝΑΙ
    ΝΑ ΔΗΜΙΟΥΡΓΣΟΥΜΕ ΜΙΑ ΝΕΑ ΜΕΘΟΔΟΣ ΣΤΗΝ ΚΛΑΣΗ "EMPLOYEE" ΠΟΥ ΚΑΘΕ ΦΟΡΑ ΑΝΑΖΗΤΑ ΑΝ Ο ΥΠΑΛΛΗΛΟΣ
    ΕΙΝΑΙ ΧΑΜΗΛΟΜΙΣΘΟΣ ΝΑ ΑΥΞΑΝΕΙ ΤΟΝ ΜΙΣΘΟ ΤΟΥ ΚΑΤΑ 100ΕΥΡΩ ΜΕΣΩ ΤΗς ΜΕΘΟΔΟΥ ΣΤΗΝ ΚΛΑΣΗ "EMPLOYEE".
     */

        //2ος ΤΡΟΠΟΣ

        //FIRST, WE CHECK WHO IS UNDERPAID!
        System.out.println();
        CheckForLowSalaryAndIncreaseIt(e1);
        CheckForLowSalaryAndIncreaseIt(e2);

        System.out.println("\nAfter salary adjustments:");
        System.out.println(e1.toString() + ", " + e1.salary());
        System.out.println(e2.toString() + ", " + e2.salary());

    }

//    Στην κλάση TestEmployee προσθέστε την στατική μέθοδο FindLowSalary η οποία δέχεται
//    ως παράμετρο δύο εργαζόμενους και ελέγχει αν κάποιος έχει βασικό μισθό λιγότερο από
//    1200 ευρώ και έτη απασχόλησης περισσότερα ή ίσα του 5. Αν οι παραπάνω συνθήκες
//    ισχύουν για κάποιον εργαζόμενο, η μέθοδος εμφανίζει ένα μήνυμα που πληροφορεί ότι ο
//    συγκεκριμένος εργαζόμενος είναι χαμηλόμισθος. Στη συνέχεια η μέθοδος αυξάνει τον
//    βασικό μισθό του χαμηλόμισθου κατά 100 ευρώ και εμφανίζει τα νέα του στοιχεία,
//    συμπεριλαμβανομένου και του τελικού μισθού του.


    // Method to find low salary employees
    public static int[] FindLowSalary(Employee e1, Employee e2){
//        double wageE1 = e1.getWage();
//        double wageE2 = e2.getWage();
//        int yearE1 = e1.getYear();
//        int yearE2 = e2.getYear();
        double[] wages = {e1.getWage(), e2.getWage()};
        int[] years = {e1.getYear(), e2.getYear()};
        int pointer1 = 0;
        int pointer2 = 0;

        // Check if any employee is underpaid with over 5 years of experience
        for(int i=0; i<wages.length; i++){
            if(wages[i] < 1200 && years[i] >=5){
                if(i == 0) {
                    System.out.println("Employee: " + e1.getName() + " is underpaid");
                    pointer1 = 1;
                }
                else if (i == 1) {
                    System.out.println("Employee: " + e2.getName() + " is underpaid");
                    pointer2 = 1;
                }
            }
        }
        int[] pointers = {pointer1,pointer2};

        return pointers;
    }

    public static void CheckForLowSalaryAndIncreaseIt(Employee employee){
        if (employee.getWage() < 1200 && employee.getYear() >= 5) {
            System.out.println("Employee: " + employee.getName() + " is underpaid");
            //increase the salary
            employee.newSalary(100);
        }

    }







}
