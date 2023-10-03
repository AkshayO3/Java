import java.util.Scanner;
public class Assign5 {
    public static float avg(int a,int b,int c){
        return (float) ((a+b+c)/3.0);
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void palindrome(int pal){
        int rev=0,n=pal;
        while(n>0){
            int rem=n%10;
            rev = rev*10+rem;
            n/=10;
        }
        if(rev==pal)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Average is "+avg(a,b,c));
        System.out.println(isEven(3));
        palindrome(5765);
    }
}