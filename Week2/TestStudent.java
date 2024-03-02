package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number of your students: ");
        int N = sc.nextInt();

        try{
            // Create an array to hold student objects
            Student[] lab = new Student[N];

            // Loop to insert student details into the array
            for(int i=0; i< lab.length; i++){
                lab[i] = new Student(); // Create a new Student object for each student
                insertStudent(lab, sc, i); // Insert details of the current student
            }

            // Display all students
            System.out.println();
            displayLab(lab);

            // Count the number of students who passed the lesson
            System.out.println();
            passed(lab);

            // Calculate and display the average grade of all students and those who passed the lesson
            System.out.println();
            avgStudents(lab);

            // Find the index of the student with the best grade
            int pos = bestStudent(lab);

            // Display the details of the student with the best grade
            System.out.println();
            System.out.println("The student with the best grade is: " + lab[pos].toString());



            // ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ ΓΙΑ ΤΟ ΤΕΛΙΚΟ ΤΗΣ ΑΣΚΗΣΗ
        /*
        Στη μεθοδο πρεπει να επιστρεψω εναν πινακα αλλα επειδη δεν ξερω ποσοι ειναι οι
        μαθηετες με τον ιδιο βαθμο(και μεγαλυτερο) δημιουργω ενα array που ειναι δυναμικη δομη δεδομενων
        και το μεγεθος της μπορει να αλλαξει. Μετα τοποθετω τα στοιχεια του array σε ενα νεο πινακα για διευκολυνση
        και το επιστρεφω. Τελοσ εμφανιζω ολα τα στοιχεια των μαθητων με το μεγαλυτερο βαθμο.
         */
            // Find all the students with the best grade
            int[] bestStudentNumbers = bestStudents(lab);

            // Display the details of all students with the best grade
            System.out.println("\nBest student(s):");
            for (int index : bestStudentNumbers) {
                System.out.println(lab[index]);
            }
        }catch (Exception e){
            System.out.println("Invalid input data\nTry again");
        }

    }

    // Method to insert details of a student
    public static void insertStudent(Student[] lab, Scanner sc, int pos){

        System.out.println("Student No" + (pos+1));

            System.out.print("ID: ");
            lab[pos].setId(sc.nextInt());

            System.out.print("Name: ");
            lab[pos].setName(sc.next());

            System.out.print("Surname: ");
            lab[pos].setSurname(sc.next());

            System.out.print("Absences: ");
            lab[pos].setAbsences(sc.nextInt());

            System.out.print("Lab Grade:");
            lab[pos].setLab_grade(sc.nextDouble());

            System.out.print("Theory Grade: ");
            lab[pos].setTheo_grade(sc.nextDouble());

    }

    // Method to display all students along with their final grades
    public static void displayLab(Student[] lab){

        for(int i=0; i< lab.length; i++){
            System.out.println("Student No" + (i+1) + ": " + lab[i].toString() + ", FinalGrade= " + lab[i].computeFinal());
        }
    }

    // Method to count the number of students who passed the lesson
    public static void passed(Student[] lab){
        int cnt =0;
        for(int i=0; i< lab.length; i++){
            if(lab[i].computeFinal() >= 5)
                cnt++;
        }
        System.out.println("The number of students who passed the lesson is: " + cnt);
    }

    // Method to calculate and display the average grade of all students and those who passed
    public static void avgStudents(Student[] lab){
        double sum=0, sum1=0;
        int cnt =0;
        for(int i=0; i< lab.length; i++){
            sum += lab[i].computeFinal(); // Ο μεσος ορος για ολους τους μαθητες (κοπηκαν + περασαν)
            if(lab[i].computeFinal() >= 5){ // ο μεσος ορος για τους μαθητες που περασαν το μαθημα
                sum1 = lab[i].computeFinal();
                cnt++;
                }
        }
        System.out.println("The average grade of the lesson is: " + (sum/lab.length ));
        if(cnt != 0)
            System.out.println("The average grade of the students who passed the lesson is: " + (sum/cnt));
    }

    // Method to find the index of the student with the best grade
    public static int bestStudent(Student[] lab){
        int pos=0;
        double maxGrade = lab[0].computeFinal();
        for(int i=1; i< lab.length; i++){
            if(maxGrade < lab[i].computeFinal()){
                pos = i;
                maxGrade = lab[i].computeFinal();
            }
        }
        return pos;
    }

    // Method to find the indices of all students with the best grade
    //This is an alternative method to solve the last question, if we want to include the case where we have more than one student with the highest grade
    public static int[] bestStudents(Student[] lab){
        ArrayList<Integer> positions = new ArrayList<>();
        double maxGrade = lab[0].computeFinal();

        // Find the maximum grade
        for(int i=1; i< lab.length; i++){
            double currentGrade = lab[i].computeFinal();
            if(maxGrade < currentGrade){
                maxGrade = currentGrade; // now the maxGrade holds the highest value
            }
        }

        // Find all students with the maximum grade
        for(int i=0; i< lab.length; i++){
            if(maxGrade == lab[i].computeFinal()){
                positions.add(i);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[positions.size()];
        for(int i=0; i< positions.size(); i++){
            result[i] = positions.get(i);
        }

        return result;
    }
}
