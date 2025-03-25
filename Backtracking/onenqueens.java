public class onenqueens {
    public static boolean issafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
            
        }
        //left diag up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
            
        }
        //right diag up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
            
        }
      return true;  
    }
    public static boolean nQueens(char board[][], int row){
        if(row==board.length){
            // Printboard(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board, row, j)){
                board[row][j]='Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j]='X';

            }
            

        }
        return false;
    }
        
    public static void Printboard(char board [][]){
        System.out.println("--------------------CHESS BOARD------------------");

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        // Printboard(board);
        if(nQueens(board, 0)){
            System.out.println("Solution exist");
            Printboard(board);

        }
        else{
            System.out.println("Solution not exist");

        }

    }
    



}


    

