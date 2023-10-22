import java.util.*;
public class Matrix {

    /* Spiral Matrix- A program that prints the elements of the matrix in a spiral order outwards to inwards. The
                      general approach is to shrink the square/rectangle until everything is printed,*/
    public static void printSpiral(int[][] matrix){
        int startingRow=0;
        int startingCol=0;
        int endingRow=matrix.length-1;
        int endingCol=matrix[0].length-1;    //The number of columns are extracted as shown

        while(startingRow<=endingRow && startingCol<=endingCol){
            for(int j=startingCol;j<=endingCol;j++)                 //top
                System.out.print(matrix[startingRow][j]+" ");
            for(int i=startingRow+1;i<=endingRow;i++)               //left
                System.out.print(matrix[i][endingCol]+" ");
            for(int j=endingCol-1;j>=startingCol;j--) {             //bottom
                if (startingRow == endingRow)   //Condition so that one column doesn't get looped
                    break;
                System.out.print(matrix[endingRow][j] + " ");
            }
            for(int i=endingRow-1;i>=startingCol+1;i--) {            //right
                if (startingCol == endingCol)   //Condition so that the last row doesn't get looped
                    break;
                System.out.print(matrix[i][startingCol] + " ");
            }
            startingCol++;
            startingRow++;
            endingRow--;
            endingCol--;
        }
    }

    public static int diagonalSum(int[][] matrix){
        int sum=0;
        int numRows = matrix.length;
        int numColumns = matrix[0].length;
        for(int i=0;i<numRows;i++)
            for(int j=0;j<numColumns;j++)
                if(i==j || (i+j)==numRows-1)
                    sum+=matrix[i][j];
        return sum;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] matrix = new int[3][3]; //Creating a 3X3 matrix,indexing starts from 0 usually traversed from L->R
//
//        for(int i=0;i<3;i++)            //Input for a matrix
//            for(int j=0;j<3;j++)
//                matrix[i][j]=sc.nextInt();
//
//        for(int i=0;i<3;i++) {          //Output
//            for (int j = 0; j < 3; j++)
//                System.out.print(matrix[i][j]+" ");
//            System.out.println();
//    }
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
        System.out.println("Sum of diagonal elements "+diagonalSum(matrix));
    }
}