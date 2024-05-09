package Week6;

public class MergeSortExample {

    /**
     * // Merge Sort = αναδρομικά διαιρεί τον πίνακα σε 2 partitions(repeatedly), τα ταξινομεί και τa επανασυνδέει.
     * // πολυπλοκότητα χρόνου εκτέλεσης = O(n Log(n)).
     * // πολυπλοκότητα χώρου = O(n)
     **/

    public static void main(String[] args) {
        int[] myArray = {8, 1, 5, 3, 4, 7, 6, 2,0,9};
        MergeSort(myArray);
        for(int i: myArray)
            System.out.print(i + " ");
    }

    private static void MergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1)
            return; //base case
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //For left array
        int j = 0; //For right array

        for (; i < length; i++) {
            if (i < middle)
                leftArray[i] = arr[i];
            else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        MergeSort(leftArray);
        MergeSort(rightArray);
        Merge(leftArray,rightArray,arr);
    }

    private static void Merge(int[] leftArray, int[] rightArray, int[] arr){
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i=0, l=0, r=0;

        //check the conditions for merging
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                arr[i++] = leftArray[l++];
            }
            else{
                arr[i++] = rightArray[r++];
            }
        }
        while(l < leftSize){
            arr[i++] = leftArray[l++];
        }
        while(r < rightSize){
            arr[i++] = rightArray[r++];
        }
    }

}

