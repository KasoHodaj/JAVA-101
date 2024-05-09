package Week6;

public class QuickSortExample {

    /**
     *      // Quick Sort = μετακινεί τα μικρότερα στοιχεία αριστερά του pivot.
     *      //     αναδρομικά διαιρεί τον πίνακα σε 2 partitions.
     *
     *      // πολυπλοκότητα χρόνου εκτέλεσης = Καλύτερη περίπτωση O(n log(n))
     *      //                                  Μέση περίπτωση  O(n log(n))
     *      //                                  Χειρότερη περίπτωση  O(n^2) εάν είναι ήδη ταξινομημένο
     *      // πολυπλοκότητα χώρου = O(log(n)) λόγω αναδρομής
     **/

    public static void main(String[] args){
        int[] myArray = {9,8,6,3,4,5,1,0,2,7};
        QuickSort(myArray,0,myArray.length-1);
        for(int i: myArray)
            System.out.print(i + " ");
    }

    private static void QuickSort(int[] arr, int start, int end){
        if(start > end)
            return;
        int pivot = partition(arr,start,end);
        QuickSort(arr,start,pivot-1);
        QuickSort(arr,pivot+1,end);
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        for(int j=start; j<end; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    /**
     *  LESS-CODE VERSION
     *
     *
     *  private static void QuickSort(int[] arr, int start, int end){
     *          if(start > end)
     *              return;
     *          int pivot = partition(arr,start,end);
     *          QuickSort(arr,start,pivot-1);
     *          QuickSort(arr,pivot+1,end);
     *  }
     *
     *  private static int partition(int[] arr, int start, int end){
     *          int pivot = arr[end];
     *          int i = start - 1;
     *          for(int j=start; j<end; j++){
     *              if(arr[j] < pivot){
     *                  i++;
     *                  swap(arr,i,j);
     *              }
     *          }
     *          swap(arr,i+1,j)
     *          return i+1;
     *  }
     *
     *  private static void swap(int[] arr, int i, int j){
     *      int temp = arr[i];
     *      arr[i] = arr[j];
     *      arr[j] = temp;
     *  }
     *
     **/
}
