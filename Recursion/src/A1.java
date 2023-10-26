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

    public static int stringLength(String str){
        if(str.isEmpty())
            return 0;
        return stringLength(str.substring(1))+1;
    }

    public static int contiguousSub(String str,int i,int j,int n){
        if(n==1)
            return 1;
        if(n<=0)
            return 0;
        int res = contiguousSub(str,i+1,j,n-1)+contiguousSub(str,i,j-1,n-1)-contiguousSub(str,i+1,j-1,n-2);
        if(str.charAt(i)==str.charAt(j))
            res++;
        return res;
    }

    public static void TOH(int n,char a,char b,char c){
        if(n>0) {
            TOH(n - 1, a, c, b);
            System.out.println(a + " to " + c);
            TOH(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,6,9,2,2,2,3,4,2};
        printIndices(arr,2,0);
        numToString(198012,"");
        System.out.println(stringLength("Akshay"));
        String str = "Akshay";
        int n = str.length();
        System.out.println(contiguousSub(str,0,n-1,n));
        TOH(3,'A','B','C');
    }
}