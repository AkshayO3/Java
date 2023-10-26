public class IntermediateRecursion {

    /* Tiling Problem -  Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board
                     using the 2 x 1 tiles.A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically
                      i.e., as 2 x 1 tile.

              Approach: 1. Try forming base cases
                            If n=0, there is only 1 way 'i.e' no tile can be placed.
                            If n=1, there is only 1 way 'i.e' 1 tile can be placed vertically.
                        2. Try to find the recursive relation
                      -->  At every step of the way,we have two choices to place the tiles --> Horizontal/Vertical.
                            If we place a tile vertically, we are left with n-1 tiles to place.
                            If we place a tile horizontally,we must place another tile beside it.Hence, we are left
                            with n-2 tiles to place.
                            So, the total number of ways to place n tiles is equal to the sum of ways to place n-1 tiles
                            and ways to place n-2 tiles.     */
    public static int tilingProblem(int n){
        if(n==0 || n==1)
            return 1;
        return tilingProblem(n-1)+tilingProblem(n-2);
    }

    /* We create a boolean array of length 26 and map each alphabet, if it occurs we set the value to true at that
       index of the array. The index is {char}-'a'.
        If you declare StringBuilder and map inside the function, they will be local to each function call. This means
        that a new StringBuilder and map will be created and initialized in every recursive call, potentially
        leading to additional memory usage and some performance overhead.*/
    public static void removeDuplicates(String str,int i,StringBuilder sb,boolean[] map){
        if(i==str.length()) {
            System.out.println(sb);
            return;
        }
        char c = str.charAt(i);
        if(map[c-'a'])
            removeDuplicates(str,i+1,sb,map);
        else {
            map[c - 'a'] = true;
            removeDuplicates(str, i + 1, sb.append(c), map);
        }
    }

    /* Friends Pairing Problem - Given n friends, each one can remain single or can be paired up with some other friend.
                                Each friend can be paired only once. Find out the total number of ways in which friends
                                can remain single or can be paired up.
                     Approach:
                        1. Try forming base cases
                            n=1:One person can stand by himself so ways =1.
                            n=2:Two persons can either form a pair or stand by themselves,ways=2
                        2.  At each level,everyone has a choice (i)To stand single (ii)To make a pair
                            If one stands single,the problem reduces to arrangement of (n-1) people

                            If one  makes a pair,the problem reduces to arrangement of (n-2) people.
                            But the pair can be made with anyone of the remaining friends,ways=(-1)
                            Total ways to stand in a pair = (n-1)*f(n-2).*/
    public static int friendsPairing(int n){
        if(n==1 || n==2)
            return n;
        return friendsPairing(n-1)+friendsPairing(n-2)*(n-1);
    }

    //Print all binary cases of size n without consecutive 1s.
    public static void printBinaryStrings(int n,String str,int lastPlace){
        if(n==0) {
            System.out.println(str);
            return;
        }
        if(lastPlace==0)
            printBinaryStrings(n-1,str+"1",1);
        printBinaryStrings(n-1,str+"0",0);

    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
        removeDuplicates("akshay",0,new StringBuilder(),new boolean[26]);
        System.out.println(friendsPairing(10));
        printBinaryStrings(3, "",0 );
    }
}