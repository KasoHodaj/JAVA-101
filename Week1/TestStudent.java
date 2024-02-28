package Week1;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args){

        //Ασκηση 1.1
        Scanner sc = new Scanner(System.in); // Scanner object for user input

        // Creating two student objects with initial data
        Student s1 = new Student(1,"kaso","hodaj",0,8,8);
        Student s2 = new Student(2,"ioanna","tranaka",0,10,9);

        // Printing out the data of the students along with their final grades
        System.out.println("The data of the students: ");
        System.out.println(s1.toString() + ", final grade: " + s1.computeFinal());
        System.out.println(s2.toString() + ", final grade: " + s2.computeFinal());

        //Askhsh 1.2
        Student s3 = new Student(3,"john","snow",5,10,4);

        compareThreeStudentMarks(s1,s2,s3);
        /*
        OR
         */
        compareThreeStudentMarks_ImprovedVersion(s1,s2,s3); //An alternative version for better Readability and efficiency

    }
    public static void compareThreeStudentMarks_ImprovedVersion(Student s1, Student s2 ,Student s3){
        double gradeS1 = s1.computeFinal();
        double gradeS2 = s2.computeFinal();
        double gradeS3 = s3.computeFinal();

        double[] grades = {gradeS1,gradeS2,gradeS3};
        String[] names = {s1.getName(), s2.getName(), s3.getName()};

        //sorting the array in descending order of grades
        for(int i=0; i<grades.length; i++){
            for(int j=0; j<grades.length -i -1; j++){
                if(grades[j] < grades[j+1]){
                    double tempGrades = grades[j];
                    grades[j] = grades[j+1];
                    grades[j+1] = tempGrades;
                    String tempNames = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempNames;
                }
            }
        }

        System.out.println("The order of the students with highest to lowest grade is: ");
        for(int i=0; i<grades.length; i++)
            System.out.println(names[i] + ": " + grades[i]);
    }

    public static void compareThreeStudentMarks(Student s1, Student s2, Student s3){
        System.out.println("The order of the students with highest to lowest grade is: ");
        double gradeS1 = s1.computeFinal(), gradeS2 = s2.computeFinal(), gradeS3 = s3.computeFinal();

        // Compare the grades and print the students in descending order of their grades
        if (gradeS1 > gradeS2) {
            if (gradeS2 > gradeS3) {
                System.out.println(s1.getName() + ", " + gradeS1);
                System.out.println(s2.getName() + ", " + gradeS2);
                System.out.println(s3.getName() + ", " + gradeS3);
            } else {
                System.out.println(s1.getName() + ", " + gradeS1);
                System.out.println(s3.getName() + ", " + gradeS3);
                System.out.println(s2.getName() + ", " + gradeS2);
            }
        } else if (gradeS2 > gradeS1) {
            if (gradeS1 > gradeS3) {
                System.out.println(s2.getName() + ", " + gradeS2);
                System.out.println(s1.getName() + ", " + gradeS1);
                System.out.println(s3.getName() + ", " + gradeS3);
            } else {
                System.out.println(s2.getName() + ", " + gradeS2);
                System.out.println(s3.getName() + ", " + gradeS3);
                System.out.println(s1.getName() + ", " + gradeS1);
            }
        } else if (gradeS3 > gradeS1) {
            if (gradeS1 > gradeS2) {
                System.out.println(s3.getName() + ", " + gradeS3);
                System.out.println(s1.getName() + ", " + gradeS1);
                System.out.println(s2.getName() + ", " + gradeS2);
            } else {
                System.out.println(s3.getName() + ", " + gradeS3);
                System.out.println(s2.getName() + ", " + gradeS2);
                System.out.println(s1.getName() + ", " + gradeS1);
            }
        }
    }




}
