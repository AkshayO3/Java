import java.util.Scanner;
public class Assign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        double avg=(a+b+c)/3.0;
//        System.out.println("Average of three numbers is "+avg);

//        int size = sc.nextInt();
//        int area = size*size;
//        System.out.println("Area of square is "+area);

        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pen = sc.nextFloat();
        float total = pencil+eraser+pen;
        System.out.println("Total cost is "+total);
        float totalTax = total + (float) (total*0.18);
        System.out.println("Total cost with tax is "+totalTax);
    }
}
