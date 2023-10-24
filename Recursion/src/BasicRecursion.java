/*
Recursion is a method of solving problems that involves breaking a problem down into smaller and smaller sub-problems
 until you get to a small enough problem that it can be solved trivially. Usually recursion involves a function calling
  itself. While it may not seem like much on the surface, recursion allows us to write elegant solutions to problems
  that may otherwise be very difficult to program.
    Step-1: Identify the base case
    Step-2: Identify the recursive case
    Step-3: Get closer and closer and return when needed.
*/

public class BasicRecursion {
    public static void printDecreasing(int n){
        System.out.print(n+" ");
        if(n==1)    // Base Case
            return;
        printDecreasing(n-1);
    }

    public static void printIncreasing(int n){
        if(n==1)
            return;
        printIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static int sumOfNatural(int n){
        if(n==0)
            return 0;
        return n + sumOfNatural(n-1);
    }

    public static int fibonacciTerm(int n){ //Getting the Nth fibonacci term
        if(n==0)        // The terms start from 0 and not 1.
            return 0;
        if(n==1)
            return 1;
        return fibonacciTerm(n-1)+fibonacciTerm(n-2);
    }

    public static boolean checkSort(int[] n,int i){
        if(i==n.length-1)
            return true;
        if(n[i]>n[i+1])
            return false;
        return checkSort(n,i+1);
    }

    public static int firstOccurence(int[] n,int key,int i){
        if(i==n.length-1)
            return -1;
        if(n[i]==key)
            return i;
        return firstOccurence(n,key,i+1);
    }

    public static int lastOccurence(int[] n,int key,int i){
        if(i==n.length-1)
            return -1;
        int isFound = lastOccurence(n,key,i+1);
        if(isFound == -1 && n[i]==key)
            return i;
        return isFound;
    }

    public static int power(int x,int n){
        if(n==0)
            return 1;
        return x * power(x,n-1);
    }

    public static int powerOptimized(int x,int n){
        // If n is even,it's equal to x^n/2 X x^n/2
        // If n is odd, it's equal to x X x^n/2 X x^n/2
        int halfPowerSq = power(x,n/2) * power(x,n/2);
        if(n%2==0)
            return halfPowerSq;
        else return x * halfPowerSq;
    }

    public static void main(String[] args) {
        printDecreasing(4);
        printIncreasing(4);
        System.out.println(factorial(5));
        System.out.println(sumOfNatural(10));
        System.out.println(fibonacciTerm(22));
        int[] arr = {2,4,3,4,2,3};
        System.out.println(checkSort(arr,0));
        System.out.println(firstOccurence(arr,4,0));
        System.out.println(lastOccurence(arr,2,0));
        System.out.println(power(2,5));
        System.out.println(powerOptimized(2,6));
    }
}
