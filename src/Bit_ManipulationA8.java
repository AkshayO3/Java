public class Bit_ManipulationA8 {

    // The least significant bit(LSB) of an odd number is 1,while it's 0 for an even number. AND with 1 is the approach
    public static void oddEven(int n){
        if((n&1)==1)
            System.out.println("Odd number");
        else
            System.out.println("Even number");
    }

    // The AND with 1<<i(where i is the number at which the bit is residing) and it returns the bit,
    public static int getBit(int n,int index){
        int bitMask = 1<<index;
        if((n&bitMask) ==0)
            return 0;
        else return 1;
    }

    public static int setBit(int n,int index){  //Makes the bit at index=1.
        int bitMask = 1<<index;
        return n | bitMask;
    }

    public static int clearBit(int n,int index){    //Makes the bit at index=0.
        int bitMask = ~(1<<index);
        return n & bitMask;
    }

    public static int updateBit(int n,int index,int newBit){
        n = clearBit(n,index);
        int bitMask = newBit<<index;
        return n| bitMask;
    }

    public static int clearIBits(int n,int index){  //Clears last i bits and sets them=0.
        int bitMask = (~0<<index);
        return n & bitMask;
    }

    public static int clearRangeBits(int n,int i,int j){
        int bitMask = ((~0)<<(j+1)) | ((1<<i)-1);
        return n &  bitMask;
    }

    // Approach to find if a number is a power of 2. The AND of n with n-1 always gives 0.
    public static void checkPowerOfTwo(int n){
        if((n & (n-1))==0)
            System.out.println("A power of 2");
        else
            System.out.println("Not a power of 2");
    }

    /* To count the number of bits which are 1, we iterate through right shifting the number and conditioning on the
        least significant bit(LSB).     */
    public static int checkSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1)
                count++;
            n>>=1;  // Done after checking the LSB and not before.
        }
        return count;
    }

    // Fast exponentiation -- Exponential calculation time decreased from O(n) --> O(log n)
    public static int fastExp(int num,int exp){
        int ans = 1;
        while(exp>0){
            if((exp&1)!=0)
                ans*=num;
            num*=num;
            exp>>=1;
        }
        return ans;
    }

    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        // AND Operation --> & (Performs & operations and returns the results in decimal)
        System.out.println(5&6);    //Returns 4[100 in Binary]

        // OR Operation --> | (Performs | operations and returns the result in decimal)
        System.out.println(5 | 6);  //Returns 7[0111 in Binary]

        // XOR Operation --> ^ (Performs ^ operations and returns the result in decimal)
        // Result of any x^x is always 0
        System.out.println(5 ^ 6);  //Returns 3[011 in Binary]

        /* Binary One's complement --> ~ Numbers are taken in 8 bits and the calculation is as follows:
           5 is represented as 00000101, and it's complement is 11111010, and it's clear that it's a negative number
           since the most significant bit(left) is 1,to determine tha magnitude,take 1s complement and add 1[process
           is called taking 2s complement],finally 000000110 or -6 in decimal.           */
        System.out.println(~5);

        /* Binary left shift --> a<<b The binary representation of a is shifted to the left by b places,b first digits
           cease to exist and the last b vacant places are filled with 0,then the result if returned in decimal form.
           8[00001000]<<2 -->[00100000] So it returns 32(always the binary representations try 8-bit.     */
        System.out.println(8<<2);

        /* Binary right shift --> a>>b The binary representation of a is shifted to the right by b places,b last digits
           cease to exist and the first b vacant places are filled with 0,then the result if returned in decimal form.
           6[00000110]<<1 -->[00000011] So it returns 3(always the binary representations try 8-bit.    */
        System.out.println(6>>1);

        oddEven(32);
        System.out.println(getBit(8,3));
        System.out.println(setBit(10,2));
        System.out.println(clearBit(10,3));
        System.out.println(clearIBits(7,2));
        System.out.println(clearRangeBits(10,2,4));
        System.out.println(updateBit(7,3,1));
        checkPowerOfTwo(22);
        System.out.println(checkSetBits(35));
        System.out.println(fastExp(3,5));
        swap(2,3);
    }
}