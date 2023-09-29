import java.util.Scanner;
public class Assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        int sume=0,sumo=0;
//        int[] set = {1,2,3,4,5,6,7,8,9,10};
//        for (int j : set){
//            if(j%2==0)
//                sume+=j;
//            else
//                sumo+=j;
//        }
//System.out.println("Sum of even numbers is "+sume);
//System.out.println("Sum of odd numbers is "+sumo);


//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        int factorial = 1;
//        for(int i=1;i<=n;i++){
//            factorial*=i;
//        }
//        System.out.println("Factorial of "+n+" is "+factorial);


        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }


    }
}