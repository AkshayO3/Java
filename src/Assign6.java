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
    public static void pairs(int[] arr){
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                System.out.print("("+arr[i]+","+arr[j]+")\t");
    }
    public static void subArrays(int[] arr){
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length + 1; j++) {
                for (int k = i; k < j; k++)
                    System.out.print(arr[k]);
                System.out.print(",");
            }
            System.out.println();
        }
    }
    public static void maxSumSub(int[] arr){    //Time complexity of n^3 [Brute Force]
        int max = Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length + 1; j++) {
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                if(max<sum)
                    max = sum;
                sum=0;
            }
        }
        System.out.println("Max sum of a subarray is "+max);
    }
    // A better approach would be to create a prefix array that holds teh sum of the elements upto that index.Reduces
    // the order from n^3 to n^2.
    public static void optimisedSumMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            pre[i] = pre[i - 1] + arr[i];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = i == 0 ? pre[j] : pre[j] - pre[i - 1];
                if (max < sum)
                    max = sum;
            }
        }
        System.out.println("Max of the sub-arrays: " + max);
    }
    //If the overall sum,at any point in time becomes negative,it's reinitialized to 0. The order is reduced to n.
    public static void kadaneSumMax(int[] arr){
        int max = Integer.MIN_VALUE,sum=0;
        for (int j : arr) {
            sum += j;
            if (sum < 0)
                sum = 0;
            max = Math.max(sum, max);
        }
        System.out.println("Max of the sub-arrays: "+max);
    }

    public static void trapWater(int[] arr){
        if(arr.length<2) {
            System.out.println("No water trapped.");
            return;
        }
        int water=0;    //total water level
    /* The general approach is to calculate the left and right boundaries first,then iterate through the array.It's
       a fact that calculating bounds inside the only iteration seems more concise,but leads to the time complexity
       of n^2,whereas calculating the boundaries beforehand reduces the time complexity to n.*/
        int[] leftBound = new int[arr.length];
        int[] rightBound = new int[arr.length];
        leftBound[0]=arr[0];rightBound[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
            leftBound[i]=Math.max(leftBound[i-1],arr[i]);
        for(int i=arr.length-2;i>=0;i--)
            rightBound[i]=Math.max(rightBound[i+1],arr[i]);
        for(int i=0;i<arr.length;i++) {
            int height = Math.min(leftBound[i], rightBound[i]);
            water+=Math.max(height-arr[i],0);   //0 if the result turns out negative.
        }
        System.out.println("Total water trapped in the system is: "+water);
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
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("The reversed array is ");
//        for(int j:reverse(arr))
//            System.out.print(j+" ");


// Pairs in an array(non-repetitive)
//        int[] arr={2,4,6,8,10};
//        pairs(arr);


// Printing the sub-arrays of an array
//        int[] arr={2,4,6,8,10};
//        subArrays(arr);


// Printing the maximum sum in all the sub-arrays
        int[] arr={10,4,6,8,10};
////        maxSumSub(arr);
//        kadaneSumMax(arr);
        trapWater(arr);
    }
}
