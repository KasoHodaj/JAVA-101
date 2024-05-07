package Week5;

public class MyUtils {
    /**

     Ταξινομώ τον πίνακα με βάση τον αριθμό μητρώου των φοιτητών
     και κατά αύξουσα σειρά χρησιμοποιώντας τη μέθοδο ταξινόμησης της εισαγωγής.
     Βήματα της μεθόδου κατά εισαγωγή:

     1. Ξεκινάμε από το δεύτερο στοιχείο της λίστας.
     2. Συγκρίνουμε το νέο στοιχείο με τα προηγούμενα.
     3. Αν είναι μικρότερο, μετακινούμε τα προηγούμενα στοιχεία δεξιά.
     4. Εισάγουμε το νέο στοιχείο στην κατάλληλη θέση.
     5. Συνεχίζουμε τη διαδικασία για κάθε επόμενο στοιχείο της λίστας.

     **/
    public static void insertSortAM(Foititis[] arr) { // insertion sort
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // Store the current Foititis object to be inserted in the correct position
            Foititis temp = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than temp, to one position ahead of their current position
            while (j >= 0 && arr[j].getAm() > temp.getAm()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Insert temp into the correct position
            arr[j + 1] = temp;
        }
    }

    /**
     * Ταξινομώ τον πίνακα με βαση το επώνυμο των φοιτητών κατά φθίνουσα σείρα
     * χρησιμοποιώντας την μέθοδο ταξινόμησης της επιλογής
     * Βήματα της μεθόδου κατά επιλογής:
     *
     * 1. Αρχίζουμε με την πρώτη θέση της λίστας.
     * 2. Βρίσκουμε το ελάχιστο στοιχείο στο υπόλοιπο μέρος της λίστας.
     * 3. Ανταλλάσσουμε το ελάχιστο στοιχείο με το στοιχείο στην τρέχουσα θέση.
     * 4. Συνεχίζουμε τη διαδικασία για κάθε επόμενη θέση στη λίστα.
     *
     */

    public static void selectSortEponymo(Foititis[] arr) {
        int posMin, n = arr.length;
        Foititis min; // Store the smallest Foititis object

        for (int i = 0; i < n - 1; i++) {
            min = arr[i]; // Current element is the smallest
            posMin = i; //  The position of the smallest element

            // Find the smallest element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                // Compare surnames to find the smallest
                if (arr[j].getSurname().compareTo(min.getSurname()) < 0) {  //Αν το Αριστερα ειναι μικροτερο του δεξια ειναι μικροτερο η τιμη θα ειναι αρνητικη αρα μικροτερη του 0
                    min = arr[j]; // Update the smallest Foititis object
                    posMin = j; // Update the position of the smallest element
                }
            }

            // Swap the smallest element with the first unsorted element
            arr[posMin] = arr[i];
            arr[i] = min;
        }
    }

    /**
     *  Ταξινομώ τον πίνακα με βαση το έτος εισαγωγής των φοιτητών κατά αύξουσα σείρα
     *  χρησιμοποιώντας την μέθοδο ταξινόμησης φυσαλίδας (bubble sort):
     *  Βήματα της μεθόδου κατά επιλογής:
     *
     *  1.Ξεκινάμε από την πρώτη θέση της λίστας.
     *  2.Συγκρίνουμε δύο διαδοχικά στοιχεία και αν το προηγούμενο είναι μεγαλύτερο από το επόμενο, τα ανταλλάσσουμε.
     *  3.Συνεχίζουμε τη διαδικασία, συγκρίνοντας και ανταλλάσσοντας τα στοιχεία, μετακινώντας προς την ουρά του πίνακα το μεγαλύτερο από αυτά.
     *  4.Η διαδικασία επαναλαμβάνεται μέχρι να φτάσουμε στο τέλος της λίστας χωρίς να απαιτείται άλλη αλλαγή.
     */

    public static void bubbleSortEE(Foititis[] arr){
        Foititis temp;
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j].getEntryYear() > arr[j+1].getEntryYear()){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
