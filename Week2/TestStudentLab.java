package Week2;

import java.util.Scanner;

public class TestStudentLab {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the number of your students: ");
        int N = sc.nextInt();

        StudentLab lab = new StudentLab(N);
        for (int i = 0; i < N; i++) {

            System.out.println("Student No" + (i+1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Surname: ");
            String surname = sc.next();

            System.out.print("Absences: ");
            int absences = sc.nextInt();

            System.out.print("Lab Grade:");
            double labGrade = sc.nextDouble();

            System.out.print("Theory Grade: ");
            double theoryGrade = sc.nextDouble();

            Student student = new Student(id, name, surname, absences, labGrade, theoryGrade);
            lab.insertStudent(student); 
        }

        lab.passed();
        lab.avgStudents();
        int bestStudentIndex = lab.bestStudent();
        Student[] labArray = lab.getLabArray();
        System.out.println("The best student is: " + labArray[bestStudentIndex].getName() + " " + labArray[bestStudentIndex].getSurname());
    }
}