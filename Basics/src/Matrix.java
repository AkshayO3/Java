import java.util.*;
public class Matrix {

    /* Spiral Matrix- A program that prints the elements of the matrix in a spiral order outwards --> inwards. The
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

/* Staircase Searching: This kind of searching is performed in a sorted 2D array,which is sorted both row and column
                        wise. The general approach is to start from the top right corner and traverse the matrix
                        if the element is greater than the target move left,if the element is smaller than the target
                        move down. This is done until the target is found or the matrix is exhausted.
                        Also,the bottom left corner can be used as the starting point.If the element is greater than
                        the target move up,if the element is smaller than the target move right.    */
    public static int stairSearch(int[][] matrix,int key){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int upperRight;
        int i=0,j=columns-1;
        while(i<rows && j>=0){
            upperRight=matrix[i][j];    // The condition cannot be at bottom as it would lead to conflict and try
            if(key>upperRight)          // updating to an index which does not exist.
                i++;
            else if(key<upperRight)
                j--;
            else
                return 1;
        }
        return 0;
    }

    // Transpose of a matrix
    public static void transpose(int[][] matrix){
        int rows=matrix.length;
        int columns = matrix[0].length;
        int[][] tMatrix = new int[columns][rows];
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++)
                tMatrix[j][i]=matrix[i][j];
        for(int i=0;i<columns;i++) {
            for (int j = 0; j < rows; j++)
                System.out.print(tMatrix[i][j] + " ");
            System.out.println();
        }
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
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        printSpiral(matrix);
        System.out.println("Sum of diagonal elements "+diagonalSum(matrix));
        System.out.println(stairSearch(matrix,32));
        transpose(matrix);
    }
}