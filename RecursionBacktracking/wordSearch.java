
public class wordSearch{
    public static boolean exist(char[][] board, String word) {
        for(int r=0 ; r<board.length ; r++){
            for(int c=0 ; c<board[0].length ; c++){
                if(board[r][c]==word.charAt(0)){
                    if(dfs(r,c,0,word, board))return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int r, int c, int k, String word, char[][]board){
        //base case first
        if(k==word.length()){
            return true;
        }

        //invalid case
        if(r<0 || c<0 || r>=board.length || c>=board[0].length) return false;

        if(word.charAt(k)!=board[r][c]) return false;
        char temp = board[r][c];
        board[r][c] = '#'; //visited

        //found - did i found in the right direction
        boolean found = dfs(r+1,c,k+1,word,board) || dfs(r-1, c, k+1, word, board) || dfs(r, c+1, k+1, word, board) || dfs(r,c-1,k+1,word,board);

        //backtrack
        board[r][c] = temp;
        return found;

    }
    public static void main(String args[]){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        System.out.println("Word exists in the dictinoary or not: " + exist(board, word));
    }
}