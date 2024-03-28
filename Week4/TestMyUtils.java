package Week4;

import java.util.Scanner;

public class TestMyUtils {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Foititis[] foitites =
                {
                        new Foititis("kaso","hodaj",(short)1,(short)2022),
                        new Foititis("Jon", "Snow", (short)2, (short)2011),
                        new Foititis("Daenerys", "Targaryen", (short)3, (short)2011),
                        new Foititis("Tyrion", "Lannister", (short)4, (short)2011),
                        new Foititis("Arya", "Stark", (short)5, (short)2011),
                        new Foititis("Sansa", "Stark", (short)6, (short)2011),
                        new Foititis("Cersei", "Lannister", (short)7, (short)2011),
                        new Foititis("Jaime", "Lannister", (short)8, (short)2011),
                        new Foititis("Bran", "Stark", (short)9, (short)2011),
                        new Foititis("Khal", "Drogo", (short)10, (short)2011)
                };
        // ΑΠΛΗ ΑΝΑΖΗΤΗΣΗ ΤΟΥ ΦΟΙΤΗΤΗ ΜΕ ΒΑΣΗ ΤΟ ΕΠΩΝΥΜΟ ΤΟΥ
        System.out.print("Give the surname of the student you want to find: ");
        String eponimo = sc.next();
        int result = MyUtils.anazitisiMeEpwnymo(eponimo,foitites);
        if (result != -1) {
            System.out.println("Student found at index: " + result);
        } else {
            System.out.println("Student not found.");
        }

        // ΔΥΑΔΙΚΗ ΑΝΑΖΗΤΗΣΗ ΤΟΥ ΑΡΙΘΜΟΥ ΜΗΤΡΩΟΥ ΤΟΥ ΦΟΙΤΗΤΗ
        System.out.print("Give the ID of the student you want to find: ");
        short id = sc.nextShort();
        int indexID = MyUtils.anazitisiMeArMitrwou(id,foitites);
        if (indexID != -1) {
            System.out.println("Student found at index: " + indexID);
        } else {
            System.out.println("Student not found.");
        }

        // ΑΝΑΔΡΟΜΙΚΗ ΔΥΑΔΙΚΗ ΑΝΑΖΗΤΗΣΗ ΤΟΥ ΑΡΙΘΜΟΥ ΜΗΤΡΩΟΥ ΤΟΥ ΦΟΙΤΗΤΗ
        System.out.print("(Recursion)Give the ID of the second student you want to find: ");
        id = sc.nextShort();
        indexID = MyUtils.anadromiAnazMeArithMitrwou(id, foitites, 0, foitites.length-1);
        if (indexID != -1) {
            System.out.println("Student found at index: " + indexID);
        } else {
            System.out.println("Student not found.");
        }
    }
}
