


public class BackTracing3 {

    public static boolean isSafe(char board[][], int row, int col) {

        // vetical up 
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up 
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void nQuuen(char board[][], int row) {

        if(row==board.length){
            printBoard(board);
            return;
        }

        for(int j = 0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQuuen(board, row+1);
                board[row][j] ='x';
            }
            
        }
    }

    public static void printBoard(char board[][]){
        System.err.println("-------chees board -------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.err.print(board[i][j]+" ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQuuen(board, 0);
    }
    
}
