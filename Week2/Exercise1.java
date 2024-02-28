package Week2;

public class Exercise1 {

    public static void main(String[] args){

        int[] myArray = {11,22,33,44,55,66,77,88,99};

        /*
        findΜax(int m[]): υπολογίζει και επιστρέφει τη θέση του στοιχείου του πίνακα που
        έχει τη μεγαλύτερη τιμή
         */
        System.out.println();
        int maxPos = findMax(myArray);
        System.out.println("The position of the maximum value of the array is: " + maxPos);

        /*
        findΑvg(int m[]):υπολογίζει και επιστρέφει τον μέσο όρο των στοιχείων του πίνακα
         */
        System.out.println();
        double avg = findAvg(myArray);
        System.out.println("The average value of the array is: " + avg);

        /*
        display(int m[]): εμφανίζει τα στοιχεία του πίνακα
         */
        System.out.println();
        display(myArray);

        /*
        swap(int m[],int i,int j): ανταλλάσσει το στοιχείο στη θέση i με το στοιχείο στη
        θέση j του πίνακα.
         */
        System.out.println();
        swap(myArray,0,8);
    }

    public static int findMax(int[] array){
        int pos = 0, max = array[0];

        for(int i = 1; i< array.length; i++){
            if(max < array[i]){
                pos = i;
                max  = array[i];
            }
        }
        return pos;
    }

    public static double findAvg(int[] array){
        int sum=0;
        for(int i=0; i< array.length; i++){
            sum += array[i];
        }
        return (double)sum/ (array.length+1);
    }

    public static void display(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " |");
        }
    }

    public static void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

        display(array);

        //Ενας τροπος να κανουμε swap χωρις τη χρηση μεταβλητης ειναι ο εξης:
        System.out.println();
        array[x] = array[x] + array[y];
        array[y] = array[x] - array[y];
        array[x] = array[x] - array[y];

        display(array);

        //Τα δεδομενα εχουν block scope που σημαινει οτι στην πραγματικοτητα τα δεδομενα δεν εχουν αλλαξει θεσεις
     }

}
