import java.util.Scanner;
public class Assign4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

// Hollow Rectangle
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(i==0 || i==4 || j==0 || j==4){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }


// Inverted and Rotated half pyramid
//    for(int i=1;i<5;i++){
//        for(int j=4-i;j>0;j--){
//            System.out.print(" ");
//        }
//        for(int j=1;j<=i;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


// Inverted half-pyramid with number patterns
//        for(int i=5;i>0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


// Floyd's triangle
//        int x=0;
//        for(int i=0;i<=5;i++){
//            for(int j=0;j<i;j++){
//                x++;
//                System.out.print(x+"   ");
//            }
//            System.out.println();
//        }


// 0-1 triangle
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2==0) System.out.print("1 ");
//                else System.out.print("0 ");
//            }
//            System.out.println();
//        }


// Butterfly Pattern
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) System.out.print("*");
            for (int j = 6 - 2 * i; j > 0; j--) System.out.print(" ");
            for (int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=4-i;j>0;j--) System.out.print("*");
            for(int j=1;j<=2*i;j++) System.out.print(" ");
            for(int j=4-i;j>0;j--) System.out.print("*");

            System.out.println();
        }


    }
}
