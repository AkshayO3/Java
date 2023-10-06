import java.util.Scanner;
public class Assign6 {
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
        int[] arr={3,65,112,64,99,32,85};
        int max=0;
        for (int j : arr)
            if (j > max)
                max = j;
        System.out.println("The maximum element of an array is "+max);
    }
}
