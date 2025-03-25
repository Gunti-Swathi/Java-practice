public class Suduko {
    public static boolean issafe(int board[][],int row, int col, int digit){
        //horizontal
        for(int j=0;j<=8;j++){
            if(board[row][j]==digit){
                return false;
            }
        }
        //vertical
        for(int i=0;i<=8;i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        //same grid;
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;
        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printboard(int board[][]){
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean solve(int board[][],int row, int col){
        if(row==9){
            return true;
        }
        int newrow=row;
        int newcol=col+1;
        
        if(col+1==9){
            newrow=row+1;
            newcol=0;

        }
        if(board[row][col]!=0){
            return solve(board,newrow,newcol);
        }

        for(int digit=1;digit<=9;digit++){
            if(issafe(board,row,col,digit)){
                board[row][col]=digit;
                if(solve(board,newrow,newcol)){
                    return true;
                }
                board[row][col]=0;
            


            }
            


        }
        return false;
    }
    public static void main(String[] args) {
        int board[][]={{0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        // printboard(board);
        if(solve(board, 0, 0)){
            System.out.print("solution exist");
            printboard(board);
        }
        else{
            System.out.print("solution not exist");

        }
        
        






        
        
    }
    
}
