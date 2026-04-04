
import java.util.HashSet;


public class Sudoku{
    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0 ; i<9 ; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r=0 ; r<9 ; r++){
            for(int c=0 ; c<9 ; c++){
                if(board[r][c]=='.'){
                    continue;
                }

                char value = board[r][c];
                int boardIndex = (r/3)*3 + (c/3);

                if(rows[r].contains(value) || cols[c].contains(value) || boxes[boardIndex].contains(value)){
                    return false;
                }
                rows[r].add(value);
                cols[c].add(value);
                boxes[boardIndex].add(value);
            }

        }
        return true;

    }
    public static void main(String[] args) {
        
        char[][] board ={
            {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
            {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
            {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
            {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
            {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
            {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
            {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
            {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
            {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };

        System.out.println("Sudoku is valid or not: " + isValidSudoku(board));
    }
}