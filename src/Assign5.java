import java.util.Scanner;
public class Assign5 {
    public static float avg(int a,int b,int c){
        return (float) ((a+b+c)/3.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Average is "+avg(a,b,c));
    }
}