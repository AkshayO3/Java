import java.util.Scanner;
public class Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the number");
//        int a = sc.nextInt();
//        if(a%2==0)
//            System.out.println("Even");
//        else
//            System.out.println("Odd");

//        System.out.println("Enter the temperature");
//        int temp = sc.nextInt();
//        if(temp>100)
//            System.out.println("You have fever");
//        else
//            System.out.println("You are healthy");

        int w = sc.nextInt();
        switch(w){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}