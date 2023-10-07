import java.util.Scanner;
public class Assign6 {
    public static int binarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key>mid)
                start=mid+1;
            else if(key<mid)
                end=mid-1;
            else
                return key;
        }
        return -1;  // If element is not found in the array
    }
    public static int[] reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


// Linear Search in an array
//        int[] arr={3,65,12,64,99,32,85};
//        System.out.println("Enter the element you want to search.");
//        int n= sc.nextInt();
//        for(int i=0;i<arr.length;i++)
//            if(arr[i]==n)
//                System.out.printf("Element is found in the array at index "+i);


// Max element in an array
//        int[] arr={3,65,112,64,99,32,85};
//        int max=0;
//        for (int j : arr)
//            if (j > max)
//                max = j;
//        System.out.println("The maximum element of an array is "+max);


// Binary Search
        // --> Can only be inserted in a sorted array,we can reduce the size of array by half at every step.
//        int[] arr={0,1,2,3,4,5,6,7,8,9};
//        System.out.println("Enter the element to be searched.");
//        int n = sc.nextInt();
//        if(binarySearch(arr,n)==-1)
//            System.out.println("Element is not found in the array");
//        else
//            System.out.println("Element found in the array at index "+binarySearch(arr,n));


// Reversing an array
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The reversed array is ");
        for(int j:reverse(arr))
            System.out.print(j+" ");
    }
}
