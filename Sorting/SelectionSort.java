package Sorting;

// 1. first, we will select the range of unsorted array using loop, that indicates that indicates the starting point of the range. the loop will run from 0 to n-1. the value i=0 means the range is from 0 to n-1
// 2. now, in each iteration, we will select the minimum element from the range of unsorted array using inner loop
// 3. after that, we will swap the minimum element with first element, of selected range.
// 4. finally, after each iteration, we will find that the array is sorted upto first index of the range

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;

        System.out.println("before selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr, n);
    }

    static void selectionSort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("after selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
