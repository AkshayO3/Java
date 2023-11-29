//public class A1 {
//    public static void printArray(String[] arr) {
//        for (String s : arr)
//            System.out.print(s + "\t");
//    }
//
//    public static void merge(String[] arr, int si, int mid, int ei) {
//        String[] temp = new String[ei - si + 1];
//        int i = si;
//        int j = mid + 1;
//        int k = 0;
//        while (i <= mid && j <= ei) {
//            if (arr[i].compareTo(arr[j]) < 0)
//                temp[k++] = arr[i++];
//            else temp[k++] = arr[j++];
//        }
//        while (i <= mid) temp[k++] = arr[i++];
//        while (j <= ei) temp[k++] = arr[j++];
//        for (k = 0, i = si; k < temp.length; k++, i++) {
//            arr[i] = temp[k];
//        }
//    }
//
//    public static void mergeSort(String[] arr, int si, int ei) {
//        if (si >= ei)
//            return;
//        int mid = si + (ei - si) / 2;
//        mergeSort(arr, si, mid);
//        mergeSort(arr, mid + 1, ei);
//        merge(arr, si, mid, ei);
//    }
//
//    public static void main(String[] args) {
//        String[] arr = {"sun","earth","mars","mercury"};
//        mergeSort(arr, 0, arr.length - 1);
//        printArray(arr);
//    }
//}


//import java.util.Scanner;
//public class A1{
//    public static int[] elements(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array.");
//        int n = sc.nextInt();
//        if(n>(5*104))
//            System.out.println("Length of the array is out of bounds.");
//        else{
//            int[] arr = new int[n];
//            int i=0;
//            while(i<arr.length){
//                System.out.println("Enter the element.");
//                int x = sc.nextInt();
//                if(x>109 || x < -109)
//                    System.out.println("Entry is out of range.Please enter a valid value.");
//                else
//                    arr[i++]=x;
//            }
//            return arr;
//        }
//        return null;
//    }
//    public static void findMajor(){
//        int[] arr = elements();
//        for(int i=0;i<arr.length;i++){
//            int count = 1;
//            for(int j=i+1;j<arr.length;j++)
//                if(arr[i]==arr[j])
//                    count++;
//            if(count>(arr.length/2)) {
//                System.out.println("The majority element is " + arr[i]);
//                return;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        findMajor();
//    }
//}


public class A1 {
    public static int merge(int[] arr,int left,int mid,int right){
        int i=left,j=mid,k=0;
        int invCount = 0;
        int[] temp = new int[(right-left+1)];
        while((i<mid) && (j<=right)){
            if(arr[i] <= arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                invCount+=(mid-i);
                k++;
                j++;
            }
        }
        while(i<mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=right){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(i=left,k=0;i<=right;k++,i++){
            arr[i]=temp[k];
        }
        return invCount;
    }
    public static int mergeSort(int[] arr,int left,int right){
        int invCount = 0;
        if(right > left){
            int mid = (right+left)/2;
            invCount = mergeSort(arr,left,mid);
            invCount += mergeSort(arr,mid+1,right);
            invCount += merge(arr,left,mid+1,right);
        }
        return invCount;
    }
    public static int getInversions(int[] arr){
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        System.out.println("Inversion Count "+getInversions(arr));
    }
}