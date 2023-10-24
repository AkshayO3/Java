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
    public static void math(int a,int b){
        System.out.println("Max--> "+Math.max(a,b));
        System.out.println("Min--> "+Math.min(a,b));
        System.out.println("Square root--> "+Math.sqrt(b));
        System.out.println("Power--> "+Math.pow(a,b));
        System.out.println("Absolute--> "+Math.abs(a));
    }
    public static int sum(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
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
        math(-3,6);
        System.out.println("Sum of digits of 16784533 is "+sum(16784533));
    }
}