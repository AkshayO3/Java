public class BackinArrays{
    public static void change(int[] arr,int i,int val){
        if(i==arr.length) {
            print(arr);
            return;
        }
        arr[i]=val;
        change(arr,i+1,val+1);
        arr[i]-=2;      //BackTracking step
    }
    public static void print(int[] arr){
        for(int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        change(arr,0,1);
        print(arr);
    }
}