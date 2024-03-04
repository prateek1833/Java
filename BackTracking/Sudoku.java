public class Sudoku {
    public static boolean isSafe(int board[][], int row, int col, int digit) {
        for (int i = 0; i < 9; i++) { // check in row
            if (board[i][col] == digit) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) { // check in coloumn
            if (board[row][i] == digit) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) { // check in same grid
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit)
                    return false;
            }
        }
        return true;

    }

    public static boolean sudoku(int board[][], int row, int col) {
        if (row == 9) {
            return true;
        }

        // recursion
        int nextrow = row, nextcol = col + 1;
        if (col == 8) {
            nextcol = 0;
            nextrow = row + 1;
        }
        if (board[row][col] != 0) {
            return sudoku(board, nextrow, nextcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (sudoku(board, nextrow, nextcol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int c[][]) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if (sudoku(sudoku, 0, 0)) {
            System.out.print("Solution exist\n");
            print(sudoku);
        } else
            System.out.print("Solution exist\n");

    }
}
