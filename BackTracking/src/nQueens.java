/* To place 'n' queens on an 'n x n' chessboard such that no two queens attack each other.
    A queen can move horizontally, vertically, or diagonally.
    To place n queens on an n x n chessboard, we need to place one queen per row.
    If there is no place to place a queen in the current row, we backtrack.
    We can use a 2D array to represent the chessboard until we find a valid solution.
    Step-1: Write code for placing one queen per row and all the ways to do it.
    Step-2: Introduce the safety conditions and create a safety function,implement it before entering the queen.
    We then print the number of solutions or all the unique solutions whichever is asked.
 */


import java.util.Arrays;
import java.util.Objects;

public class nQueens {
    public static void printBoard(String[][] board){
        System.out.println("<--------Chess board-------->");
        for (String[] strings : board) {
            for (int j = 0; j < board[0].length; j++)
                System.out.print(strings[j] + " ");
            System.out.println();
        }
    }
    public static boolean isSafe(String [][] board,int row,int column){
        // We will check for all the places from which a queen can attack another queen.
        //   1. Vertically Up
        for(int i=row-1;i>=0;i--)
            if(Objects.equals(board[i][column], "Q"))
                return false;
        //   2. Vertically Down
        for(int i=row+1;i<board.length;i++)
            if(Objects.equals(board[i][column], "Q"))
                return false;
        //   3. Horizontally Left
        for(int j=column-1;j>=0;j--)
            if(Objects.equals(board[row][j], "Q"))
                return false;
        //   4. Horizontally Right
        for(int j=column+1;j<board.length;j++)
            if(Objects.equals(board[row][j], "Q"))
                return false;
        //   5. Diagonally Upper Left
        for(int i = row-1,j=column-1;i>=0 && j>=0;i--,j--)
            if(Objects.equals(board[i][j], "Q"))
                return false;
        //   6. Diagonally Upper Right
        for(int i=row-1,j=column+1;i>=0 && j<board.length;i--,j++)
            if(Objects.equals(board[i][j], "Q"))
                return false;
        //   7. Diagonally Lower Left
        for(int i=row+1,j=column-1;i<board.length && j>=0;i++,j--)
            if(Objects.equals(board[i][j], "Q"))
                return false;
        //   8. Diagonally Lower Right
        for(int i=row+1,j=column+1;i <board.length && j<board.length;i++,j++)
            if(Objects.equals(board[i][j], "Q"))
                return false;
        return true;
    }
    static int sol = 0;
    public static void placeQueens(String[][] board,int row) {
//        if(sol==1)    // If only one solution is asked.
//            return;
        if (row == board.length) {
            sol++;
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = "Q";
                placeQueens(board, row + 1);
                board[row][j] = ".";
            }
        }
    }

    public static void main(String[] args) {
        int n=3;
        String[][] board = new String[n][n];
        for (String[] strings : board) Arrays.fill(strings, ".");
        placeQueens(board,0);
        System.out.println("Total ways to count --> "+sol);
        if(sol==0)
            System.out.println("No possible solutions found.");
    }
}
