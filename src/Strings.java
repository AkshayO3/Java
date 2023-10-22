import java.util.*;
public class Strings {
    //Strings are IMMUTABLE.

    public static int palindrome(String str){
        for(int i=0;i<=str.length()/2;i++)
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return 0;
        return 1;
    }

    public static void shortestPath(String str){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the initial positions");
        i = sc.nextInt();
        j = sc.nextInt();
        int x=i,y=j;
        for(int k=0;k<str.length();k++){
            char d = str.charAt(k);
            if(d=='N')
                y++;
            else if (d=='S')
                y--;
            else if(d=='W')
                x--;
            else
                x++;
        }
        double d = Math.sqrt(Math.pow(x-i,2)+Math.pow(y-j,2));
        System.out.println("The shortest distance is "+d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Akshay";
//        String str2 = new String("Akshay"); //Two ways to declare a string
        String str3 = sc.nextLine();    //sc.next() takes only the first word
//        System.out.println(str2.length());  //Returns the length of the string
//        System.out.println(str + " " + str3);   //Concatenation using strings
//        System.out.println(str2.charAt(3)); // Returns the character at that index
//        System.out.println(palindrome(str3));
        shortestPath(str3);

    }
}