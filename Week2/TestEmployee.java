package Week2;



import java.util.Scanner;

/*
Εμπλουτίστε την Άσκηση 3 του Εργαστηρίου 1 με τη δημιουργία ενός πίνακα αντικειμένων
με όνομα "staff" στην κλάση TestEmployee. Ο πίνακας "staff" θα περιέχει Ν
αντικείμενα τύπου Employee. Τον αριθμό Ν (πλήθος εργαζομένων) θα τον διαβάζετε κατά
την εκτέλεση του προγράμματος.

Ορίστε επιπλέον στην κλάση TestEmployee, την στατική μέθοδο displayStaff (Employee[]
st) οποία δέχεται ως παράμετρο ένα πίνακα με αντικείμενα Employee και εμφανίζει τα
στοιχεία τους συμπεριλαμβανομένου και του τελικού μισθού.
 */
public class TestEmployee {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number of your employees: ");
        int N = sc.nextInt();
        Employee[] staff = new Employee[N];

        System.out.println("Give the data of your employees");
        for(int i=0; i< staff.length; i++){
            try {
                staff[i] = new Employee(); // Create a new Employee object for each employee !!!SOS!!!
                System.out.println("Employee No" + (i + 1));

                System.out.print("ID: ");
                staff[i].setId(sc.nextInt());

                System.out.print("Name: ");
                staff[i].setName(sc.next());

                System.out.print("Surname: ");
                staff[i].setSurname(sc.next());

                System.out.print("Wage: ");
                staff[i].setWage(sc.nextDouble());

                System.out.print("Years: ");
                staff[i].setYear(sc.nextInt());

                System.out.print("Bonus: ");
                staff[i].setBonus(sc.nextDouble());
            }catch(Exception e){ // Handle invalid input. ΠΡΟΑΙΡΕΤΙΚΟ!
                System.out.println("Invalid input, try again.");
            }
        }

        displayStaff(staff);  // Display staff details
    }

    public static void displayStaff(Employee[] st){ // Method to display staff details
        for(int i=0; i< st.length; i++){
            System.out.println(st[i].toString() + ", salary=" + st[i].salary());
        }
    }

}
