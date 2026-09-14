package Recursion;

import java.util.ArrayList;

public class nQueens {
    
    public static void placeQueen(char[][] board , int row , int n , ArrayList<String> list ){
        if(row == n){
            list.add(new String(board[row]));
            return ;
        }
        for(int col =0;col<n;col++){
            if(isSafe(row, col , board,n)){
                board[row][col]='Q';
                placeQueen(board, row+1,   n, list);

                board[row][col]=',';
            }

        }

        
    }

    public static boolean isSafe(int row, int col, char[][] board, int n){

        for(int i=0;i<n;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row, j =col; i>=n &&j>=n;i++,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        int col =0, row =0;
        ArrayList<String> list = new ArrayList<>();
        placeQueen(board, row  ,n, list);
    }
}
