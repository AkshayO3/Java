import java.util.Scanner;
public class Assign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        double avg=(a+b+c)/3.0;
//        System.out.println("Average of three numbers is "+avg);

        int size = sc.nextInt();
        int area = size*size;
        System.out.println("Area of square is "+area);
    }
}