package Week6;

import java.util.Scanner;

import static Week6.MyUtils.MergeSortSurname;
import static Week6.MyUtils.QuickSortAM;

public class TestSortUtils {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Foititis[] foitites = {
                new Foititis("Kaso", "H0odaj"),
                new Foititis("Jon", "Snow"),
                new Foititis("Daenerys", "Targaryen"),
                new Foititis("Tyrion", "Lannister"),
                new Foititis("Arya", "Stark"),
                new Foititis("Sansa", "Stark"),
                new Foititis("Cersei", "Lannister")
        };

        for (int i = 0; i < foitites.length; i++) {
            System.out.println("Enter ID and Entry Year for Student Named: " + foitites[i].getName() + " " + foitites[i].getSurname());
            System.out.print("ID: ");
            foitites[i].setAm(sc.nextShort());
            System.out.print("Enter Entry Year: ");
            foitites[i].setEntryYear(sc.nextShort());
        }

        System.out.println("\nUnsorted");
        for (int i = 0; i < foitites.length; i++) {
            System.out.println(foitites[i].toString());
        }

        QuickSortAM(foitites, 0, foitites.length - 1);
        System.out.println("\nQuick Sort");
        for (int i = 0; i < foitites.length; i++) {
            System.out.println(foitites[i].toString());
        }

        MergeSortSurname(foitites);
        System.out.println("\nMerge Sort");
        for (int i = 0; i < foitites.length; i++) {
            System.out.println(foitites[i].toString());
        }
    }
}
