import java.util.*;

public class NQueens{
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board){
            for(int col= 0 ; col<row.length ; col++){
                row[col] = '.';
            }
        }
        //helping function
        helperFunction(0,board,result,n);
        return result;
    }
    public static void helperFunction(int row, char[][]board,List<List<String>>result, int n ){
        if(row == n){
            // solution added to result
            List<String> temp = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }
        for(int col=0 ; col<board[0].length ; col++){
            if(safe(row,col,board)){
                board[row][col] = 'Q';
                helperFunction(row+1, board, result, n);
                board[row][col] = '.';
            }
        }
    }
    public static boolean safe(int row, int col, char[][]board){
        //column check
        // left diagonal
        //right diagonal
        for(int i=0 ; i<board.length ; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //left diagonal
        for(int i= row-1, j=col-1  ; i>=0 && j>=0 ; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1, j=col+1 ; i>=0 && j<board[0].length ; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        int n = 8;
        
        List<List<String>> result = solveNQueens(n);
        for(List<String>ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");

    }
}