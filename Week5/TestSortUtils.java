package Week5;

import java.util.Scanner;

import static Week5.MyUtils.*;


public class TestSortUtils {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        Foititis[] foitites = {
//                new Foititis("kaso","hodaj",(short)332327,(short)2022),
//                new Foititis("Jon", "Snow", (short)212315, (short)2011),
//                new Foititis("Daenerys", "Targaryen", (short)365756, (short)2011),
//                new Foititis("Tyrion", "Lannister", (short)446543, (short)2011),
//                new Foititis("Arya", "Stark", (short)565756, (short)2011),
//                new Foititis("Sansa", "Stark", (short)667654, (short)2011),
//                new Foititis("Cersei", "Lannister", (short)745465, (short)2011)
//        };
        Foititis[] foitites = {
                new Foititis("kaso","hodaj"),
                new Foititis("Jon", "Snow"),
                new Foititis("Daenerys", "Targaryen"),
                new Foititis("Tyrion", "Lannister"),
                new Foititis("Arya", "Stark"),
                new Foititis("Sansa", "Stark"),
                new Foititis("Cersei", "Lannister")
        };

        for(int i=0; i< foitites.length; i++){
            System.out.println("Enter ID and Entry Year for Student Named: " + foitites[i].getName() + " " + foitites[i].getSurname());
            System.out.print("ID: ");
            foitites[i].setAm(sc.nextShort());
            System.out.print("Enter Entry Year: ");
            foitites[i].setEntryYear(sc.nextShort());
        }

        System.out.println("INSERTION SORT for ID");
        insertSortAM(foitites); // Ascending Order
        for(int i=0; i< foitites.length; i++){
            System.out.println(foitites[i].toString());
        }

        System.out.println("SELECTION SORT for Surname");
        selectSortEponymo(foitites); // Descending Order
        for(int i=0; i< foitites.length; i++){
            System.out.println(foitites[i].toString());
        }

        System.out.println("BUBBLE SORT for Entry Year");
        bubbleSortEE(foitites); // Ascending Order
        for(int i=0; i< foitites.length; i++){
            System.out.println(foitites[i].toString());
        }
    }
}
