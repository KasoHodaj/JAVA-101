package Week4;

public class MyUtils  {
    // This method is static because it does not depend on any instance variables of MyUtils class.
    // It performs a function based solely on its input parameters.
    public static int anazitisiMeEpwnymo(String eponimo, Foititis[] myArray) {
        if (eponimo == null || myArray == null || myArray.length == 0) {
            System.out.println("Invalid input.");
            return -1;
        }

        for (int i = 0; i < myArray.length; i++) {
            // If the surname of the current object matches the input surname, return the index
            if (eponimo.equalsIgnoreCase(myArray[i].getSurname()))
                return i;
        }
        // If no match is found, return -1
        return -1;
    }

    public static void sortArray(Foititis[] myArr) {

        for (int i = 0; i < myArr.length; i++) {
            // Inner loop for comparing array elements
            for (int j = 0; j < myArr.length - i - 1; j++) {
                // Compare adjacent elements and swap if the next is smaller than the current
                if (myArr[j].getAm() < myArr[j + 1].getAm()) {
                    // Swapping elements
                    Foititis temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        // Print the sorted array
        // for (int i = 0; i < myArr.length; i++) {
        //    System.out.println(myArr[i].toString());
        //  }
    }

    public static int anazitisiMeArMitrwou(Short id, Foititis[] myArray){

        sortArray(myArray); // Sorted in Descending order

        int left = 0, right = myArray.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;


            Short midId = myArray[mid].getAm();

            // Check if the id is present at mid
            if (id.equals(midId)) {
                return mid;
            }


            // If the id is greater than the mid element's id, ignore the right half
            if (id.compareTo(midId) > 0) {
                right = mid - 1;
            }
            // If the id is smaller than the mid element's id, ignore the left half
            else {
                left = mid + 1;
            }
        }

        // If the id is not found in the array, return -1
        return -1;
    }

    public static int anadromiAnazMeArithMitrwou(Short id, Foititis[] myArray, int left, int right){
        if (left <= right) {
            int mid = left + (right - left) / 2;
            Short midId = myArray[mid].getAm();

            if (id.equals(midId)) {
                return mid; // Found the element at mid index
            } else if (id.compareTo(midId) > 0) {
                // Recur on the right half of the array
                return anadromiAnazMeArithMitrwou(id, myArray, left, mid - 1);
            } else {
                // Anadromi on the left half of the array
                return anadromiAnazMeArithMitrwou(id, myArray, mid + 1, right);
            }
        }
        // If the ID is not found in the array
        return -1;
    }

}
