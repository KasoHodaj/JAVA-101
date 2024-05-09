package Week6;
public class MyUtils {

    /**
     * START QUICK SORT ---------------------------------------------
     *
     **/
    public static void QuickSortAM(Foititis[] arr, int start, int end){
        if(start > end)  // If the start index is greater than the end index, the part of the array is  sorted.
            return;
        int pivot = partition(arr,start,end); // Partition the array and get the index of the pivot.
        QuickSortAM(arr,start,pivot-1); // Recursively sort the left part of the array.
        QuickSortAM(arr,pivot+1,end); // Recursively sort the right part of the array.
    }

    public static int partition(Foititis[] arr, int start, int end){
        // The partition method rearranges the elements in the array such that elements less than the pivot come before it, and elements greater come after
        short pivot = arr[end].getAm(); // Choose the last element of the array as the pivot.
        int i = start - 1; // Pointer for the smaller element.
        for(int j=start; j<end; j++){
            if(arr[j].getAm() < pivot){ // ΑΥΞΟΥΣΑ ΣΕΙΡΑ.
                i++;
                // SWAP
                Foititis temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++; //SWAP.
        // ΤΟ ΤΕΛΕΥΤΑΙΟ SWAP ΓΙΑ ΤΟ ΑΝΤΙΚΕΙΜΕΝΟ ΠΟΥ ΠΕΡΙΣΣΕΨΕ.
        Foititis temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    /**
     * END QUICK SORT -----------------------------------------------
     *
     **/

    /**
     *
     * START MERGE SORT ---------------------------------------------
     **/
    public static void MergeSortSurname(Foititis[] arr){
        int length = arr.length;
        if(length <= 1) // If the array is of size 1, its empty.
            return;
        int middle = length / 2; // Find the middle index to divide the array into two partitions.
        Foititis[] leftArray = new Foititis[middle]; // Left half array.
        Foititis[] rightArray = new Foititis[length - middle]; // Right half array.

        int i=0; //For left partition
        int j=0; //For right partition

        // Split the original array into two partitions.
        for(; i<length; i++){
            if(i < middle)
                leftArray[i] = arr[i]; // Fill left array.
            else
                rightArray[j++] = arr[i]; // Fill right array.
        }
        MergeSortSurname(leftArray); // Recursively sort the left partition.
        MergeSortSurname(rightArray); // Recursively sort the right partition.
        Merge(leftArray, rightArray, arr); // Merge the sorted partitions back into the original array.
    }


    public static void Merge(Foititis[] leftArray, Foititis[] rightArray, Foititis[] arr){
        // The Merge method merges two sorted arrays into a single sorted array.
        int leftSize = leftArray.length;  // Number of elements in left array.
        int rightSize = rightArray.length; // Number of elements in right array.
        int i = 0, l = 0, r = 0; // Indices: Main, Left, Right.

        //Checking the conditions for merging.
        // Merge the two sorted arrays into the original array.
        while(l < leftSize && r < rightSize){
            if(leftArray[l].getSurname().compareTo(rightArray[r].getSurname()) < 0)
                arr[i++] = leftArray[l++]; // Place element from left array if it's smaller.
            else
                arr[i++] = rightArray[r++]; // ELSE Place element from right array.
        }

        // Append any remaining elements in the left array to the main array
        while(l < leftSize)
            arr[i++] = leftArray[l++];
        // Append any remaining elements in the right array to the main array
        while(r < rightSize)
            arr[i++] = rightArray[r++];
    }

    /**
     *
     * END MERGE SORT ----------------------------------------------
     **/
}
