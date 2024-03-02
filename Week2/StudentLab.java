package Week2;

import java.util.Scanner;

public class StudentLab {

    private Student[] labArray; // Πίνακας τύπου Student
    private int top; // Δείκτης για την πρώτη ελεύθερη θέση του πίνακα
    private int size; // Το αρχικό μέγεθος του πίνακα

    public StudentLab(int size) {  // Αρχικοποίηση του πίνακα
        labArray = new Student[size];
        top = 0;
        this.size = size;
    }

    // Μέθοδος που επιστρέφει το μέγεθος του πίνακα
    public int size() {
        return size;
    }

    // Μέθοδος για να εισάγει έναν φοιτητή στο εργαστήριο
    public void insertStudent(Student student) {
        if (top < labArray.length) {
            labArray[top] = student;
            top++;
        } else {
            System.out.println("Cannot insert more students\nLab Array is full.");
        }
    }

    // Μέθοδος για να ελέγξει πόσοι φοιτητές πέρασαν το μάθημα
    public void passed() {
        int cnt = 0;
        for (int i = 0; i < top; i++) {
            if (labArray[i].computeFinal() >= 5) {
                cnt++;
            }
        }
        System.out.println("The number of students who passed is: " + cnt);
    }

    // Μέθοδος για να υπολογίσει τον μέσο όρο των βαθμών των φοιτητών
    public void avgStudents() {
        double sum = 0;
        for (int i = 0; i < top; i++) {
            sum += labArray[i].computeFinal();
        }
        System.out.println("The average grade of the class is: " + (sum / top));
    }

    // Μέθοδος για να βρει τον φοιτητή με τον υψηλότερο βαθμό
    public int bestStudent() {
        int pos = 0;
        double max = labArray[0].computeFinal();
        for (int i = 1; i < top; i++) {
            double currentMax = labArray[i].computeFinal();
            if (max < currentMax) {
                max = currentMax;
                pos = i;
            }
        }
        return pos;
    }

    // Μέθοδος για να ελέγξει αν ο πίνακας είναι γεμάτος
    public boolean checkArray() {
        return top == labArray.length; // επιστρέφει TRUE αν είναι γεμάτος, FALSE αν δεν είναι
    }

    // Getter μέθοδος για το labArray
    public Student[] getLabArray() {
        return labArray;
    }
}


