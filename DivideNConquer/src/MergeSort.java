/* Steps for merge sort:
    1. Divide the array into two halves
    2. Sort the left half and the right half
    3. Merge the two halves
 */
public class MergeSort {
    public static void printArray(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }

    public static void merge(int[] arr,int si,int mid,int ei){
        int[] temp = new int[ei-si+1];  // +1 for size since index starts from 0 and not 1
        int i =si;  //Iterator for the left part
        int j = mid+1;  //Iterator for the right part
        int k = 0;  //Iterator for the temporary array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }
        while(i<=mid)   temp[k++]=arr[i++];     //Copying the elements off either of the parts if remaining
        while(j<=ei)    temp[k++]=arr[j++];
        for(k=0,i=si;k<temp.length;k++,i++)   //Copying to the original array
            arr[i]=temp[k];
    }
    public static void mergesort(int[] arr,int si,int ei){
        if(si>=ei)
            return;
        int mid = si +(ei-si)/2;    //This formula prevents the addition of large numbers in case of a big array
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        mergesort(arr,0,arr.length-1);
        printArray(arr);
    }
}