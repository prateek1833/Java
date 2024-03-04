public class Q1 {// incomplete
    public static int grid(int board[][], int i, int j) {
        if (i == board.length - 1 && j == board.length - 1) {
            return 1;
        }
        if (i == board.length || j == board.length || board[i ][j] == 0) {
            // count++;
            return 0;
        }
        int count=0;

        if (board[i + 1][j] == 1) {

            count +=grid(board, i + 1, j);
        }
        if (board[i][j + 1] == 1) {
            count +=grid(board, i, j + 1);
        }
        if (board[i - 1][j] == 1) {
            count +=grid(board, i - 1, j);
        }
        if (board[i][j - 1] == 1) {
            count +=grid(board, i, j - 1);
        }
        return count;
    }

    // static int count = 0;

    public static void main(String args[]) {
        int board[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 0 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        System.out.print(grid(board, 0, 0));

    }

}
