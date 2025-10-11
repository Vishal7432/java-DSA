public class Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // ✅ Base case
        if (row == 9) {
            return true;
        }

        // move to next cell
        int nextRow = row, nextCol = col + 1;
        if (col == 8) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // if cell already filled, skip
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // try all digits
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;

                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }

                // backtrack
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidSudoku(int sudoku[][]) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int num = sudoku[row][col];
                if (num != 0) {
                    // temporarily remove the number to test validity
                    sudoku[row][col] = 0;
                    if (!isSafe(sudoku, row, col, num)) {
                        return false; // invalid placement
                    }
                    sudoku[row][col] = num; // put it back
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 5, 7, 6, 0, 0, 0, 4, 0 },
                { 0, 0, 0, 0, 0, 5, 1, 3, 0 },
                { 0, 0, 4, 9, 0, 0, 6, 0, 0 },
                { 5, 0, 0, 3, 7, 6, 0, 0, 0 },
                { 0, 8, 0, 0, 0, 0, 0, 7, 0 },
                { 0, 0, 0, 4, 5, 8, 0, 0, 2 },
                { 0, 0, 1, 0, 0, 7, 9, 0, 0 },
                { 0, 2, 9, 5, 0, 0, 0, 0, 0 },
                { 0, 3, 0, 0, 0, 1, 7, 6, 0 }
        };

        if (!isValidSudoku(sudoku)) {
            System.out.println(" Invalid Sudoku input!");
        } else if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println(" Solution exists!");
            printSudoku(sudoku);
        } else {
            System.out.println(" Solution does not exist!");
        }
    }

}
