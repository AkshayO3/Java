import java.util.*;
public class Strings {
    /* Strings are IMMUTABLE. Interning is a process of storing the strings in a pool of strings.
       Strings are stored in a pool of strings and are referenced to the same object if the value is same.
       A drawback of this is that if a string is mutated, a new object is created and the reference is changed.
         This is why we use StringBuilder,it's mutable and doesn't create a new object when mutated.
     */


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

    public static void caps(String str){
        StringBuilder str1=new StringBuilder(); //StringBuilder object since it has to be modified.
        str1.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++) {
            if (str.charAt(i) == ' ') {
                str1.append(" ").append(Character.toUpperCase(str.charAt(i + 1)));
                i++;
            }
            else
                str1.append(str.charAt(i));
        }
        System.out.println(str1);
    }

    public static String stringCompression(String str){
        String str1 = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            str1 += str.charAt(i);
            if(count>1)
                str1 += count.toString();
        }
        return str1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Akshay"); //StringBuilder is mutable
        sb.append("Bhandari");   //Works only with string builder dataType
        String str = "Akshay";
        String str2 = new String("Akshay"); //Two ways to declare a string
        String str3 = sc.nextLine();    //sc.next() takes only the first word
//        System.out.println(str2.length());  //Returns the length of the string
//        System.out.println(str + " " + str3);   //Concatenation using strings
//        System.out.println(str2.charAt(3)); // Returns the character at that index
//        System.out.println(palindrome(str3));
//        shortestPath(str3);

        /* '==' checks if the strings are values stored in the same object,and doesn't check if the value alone is same
           (in case a string is created with 'new'),so a function equalsTo is used to compare strings. */
//        System.out.println(str==str2+"\n"+str.equals(str2));

        // Substring is a string with limits on two characters where the ending index is not included
//        System.out.println(str3.substring(3,8));

        //compareTo is a function which sorts the strings in the lexicographic order.Also includes ignoreCase
        System.out.println(str.compareToIgnoreCase(str3));  //Returns an integer as difference

        caps(str3);

        System.out.println(stringCompression(str3));

    }
}