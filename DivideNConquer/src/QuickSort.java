/*
    It is based on the principle of pivot and partition.
    A random element is selected as pivot and all the elements smaller than pivot are placed on the left side and all
    the elements greater than pivot are placed on the right side.However,in most of the cases,the pivot is selected as
    the last element of the array.

    Steps for quick sort:
        1. Select a pivot element [last]
        2. Partition the array such that all the elements smaller than pivot are placed on the left side and all the
           elements greater than pivot are placed on the right side
        3. Recursively sort the left part and the right part

    Worst case int quick sort is O(n^2) and best case is O(nlog n).The worst case occurs when the pivot is the smallest
    or the largest element of the array.
 */

public class QuickSort {
    public static void printArray(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }

    public static int partition(int[] arr,int si,int ei) {   //Returns the correct index of the pivot in a sorted array
        int pivot = arr[ei];   // Taking the last element as pivot
        int i = si - 1;  //For elements smaller than the pivot
        for (int j=si;j<ei;j++) {
            if (arr[j] <= pivot) {
                i++;    // It'll swap only after increasing
                int temp = arr[j];   //Swap
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void quickSort(int[] arr,int si,int ei){
        if(si>=ei)
            return;
        int pivotIndex = partition(arr,si,ei);
        quickSort(arr,si,pivotIndex-1); // Sorting the left side of the pivot
        quickSort(arr,pivotIndex+1,ei);   // Sorting the right side of the pivot
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        quickSort(arr,0,8);
        printArray(arr);
    }
}