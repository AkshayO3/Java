public class Sudoku {
    public static boolean isSafe(int[][] sudoku, int row, int column, int digit) {
        // For same column
        for (int i = 0; i <= 8; i++)
            if (sudoku[i][column] == digit)
                return false;
        // For same row
        for (int j = 0; j <= 8; j++)
            if (sudoku[row][j] == digit)
                return false;
        // For same grid [Calculating the left upper coordinates of each grid] --> Can also be done for a nxn grid.
        int sr = (row / 3) * 3;
        int sc = (column / 3) * 3;
        for (int i = sr; i < sr + 3; i++)
            for (int j = sc; j < sc + 3; j++)
                if (sudoku[i][j] == digit)
                    return false;
        return true;    // If all the conditions are passed,it's finally saved to place the number.
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int column) {
        if (row == 9)    // The end
            return true;
        int nextRow = row, nextColumn = column + 1;
        if (column + 1 == 9) {   // Switching rows
            nextRow = row + 1;
            nextColumn = 0;
        }
        if (sudoku[row][column] != 0)
            return sudokuSolver(sudoku, nextRow, nextColumn);
        for (int digit = 1; digit <= 9; digit++) {      // Testing for each digit
            if (isSafe(sudoku, row, column, digit)) {
                sudoku[row][column] = digit;
                if (sudokuSolver(sudoku, nextRow, nextColumn))
                    return true;
                sudoku[row][column] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int[][] sudoku){
        for (int[] ints : sudoku) {
            for (int j = 0; j < sudoku[0].length; j++)
                System.out.print(ints[j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudokuProblem = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if (sudokuSolver(sudokuProblem, 0, 0)) {
            System.out.println("Solution Exists");
            printSudoku(sudokuProblem);
        } else System.out.println("No solutions exist.");
    }
}
