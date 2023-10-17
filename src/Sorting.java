import java.util.Arrays;

public class Sorting {

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-1-i;j++)
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j])
                    minPos=j;
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //The while loop finds the correct position to insert
            while(prev>=0 && arr[prev]>curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i : arr) {
            largest = Math.max(largest, i);
            smallest = Math.min(smallest, i);
        }
        int range = largest - smallest + 1;
        int[] C = new int[range];
        for (int k : arr) {
            C[k - smallest]++;
        }
        int j = 0;
        for (int i = 0; i < range; i++) {
            while (C[i] > 0) {
                arr[j] = i + smallest; // Reconstruct the sorted array.
                j++;
                C[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,4,5,7,1};
//        bubbleSort(arr);
//        insertionSort(arr);
//        Arrays.sort(arr,1,5);   //Starting index and ending(non-inclusive) index
        // To get in descending,change datatype to Integer and use Collections.reverseOrder();
        countSort(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
}