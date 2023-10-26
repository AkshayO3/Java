public class A1 {
    public static void printIndices(int[] arr,int key,int i){
        if(i==arr.length)
            return;
        if(arr[i]==key)
            System.out.print(i+" ");
        printIndices(arr,key,i+1);
    }

    public static String numToWord(int n){
        if(n==1) return "one";
        if(n==2) return "two";
        if(n==3) return "three";
        if(n==4) return "four";
        if(n==5) return "five";
        if(n==6) return "six";
        if(n==7) return "seven";
        if(n==8) return "eight";
        if(n==9) return "nine";
        if(n==0) return "zero";
        return "";
    }
    public static void numToString(int n,String str){
        if(n==0) {
            System.out.println(str);
            return;
        }
        if(n%10!=0 || n<1000)   // Only excluding the last 0 for a 4-digit number
            str=numToWord(n%10)+" "+str;
        numToString(n/10,str);
    }

    public static void main(String[] args) {
        int[] arr={1,6,9,2,2,2,3,4,2};
        printIndices(arr,2,0);
        numToString(198012,"");
    }
}