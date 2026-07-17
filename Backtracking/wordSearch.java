package DSA.Backtracking;
import java.util.*;
public class wordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                if(dfs(i, j, board, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(int row, int col, char[][]board, String word, int index) {
        if(index == word.length()) {
            return true;
        }
        
        if(row < 0 || row >=board.length || 
            col< 0 || col >= board[0].length
        ){
            return false;
        }

        if(word.charAt(index) != board[row][col]){
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = 
        dfs(row-1, col, board, word, index+1) ||
        dfs(row+1, col, board, word, index+1) ||
        dfs(row, col-1, board, word, index+1) ||
        dfs(row, col+1, board, word, index);

        board[row][col] = temp;

        return found;

    } 


}
