public class NQueen {
    public static Boolean isSafe(char board[][], int row, int col) {
        // row
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        // left row
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // column
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;

    }
    static int count =0;
    public static void queen(char board[][], int row) {
        if (row == board.length) {
            print(board);
            count ++;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';     
                queen(board, row + 1);
                board[row][i] = 'x';      //backtracking step
            }
        }
    }

    public static void print(char c[][]) {
        System.out.print("------CHESS-------\n");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String arg[]) {
        int n = 5;
        char c[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 'x';
            }
        }
        queen(c, 0);
        System.out.print("\nNo. of ways to place queen = "+count);
    }

}
