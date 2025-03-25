public class knights {
    // static int c=1;

    public static boolean issafe(int board[][], int i, int j){
        if((i>=0 && i<8)&&(j>=0 && j<8)&&board[i][j]==-1){
            return true;
        }
        return false;
    }
    public static boolean nknights(int board[][], int i, int j, int c){
        if(c==64){
            // printboard(board);
            return true;
        }
        
        if(issafe(board,i+2,j+1)){
            board[i+2][j+1]=c;
            if(nknights(board,i+2,j+1,c+1)){
                return true;
            }
            board[i+2][j+1]=-1;
            // c--;
        }
        if(issafe(board,i+1,j+2)){
            board[i+1][j+2]=c;
            if(nknights(board,i+1,j+2,c+1)){
                return true;
            }
            board[i+1][j+2]=-1;
            // c--;

        }
        if(issafe(board,i-1,j+2)){
            board[i-1][j+2]=c;
            if(nknights(board,i-1,j+2,c+1)){
                return true;
            }
            board[i-1][j+2]=-1;
            // c--;

            
        }
        if(issafe(board,i-2,j+1)){
            board[i-2][j+1]=c;
            if(nknights(board,i-2,j+1,c+1)){
                return true;
            }
            board[i-2][j+1]=-1;
            // c--;

        }
        if(issafe(board,i-2,j-1)){
            board[i-2][j-1]=c;
            if(nknights(board,i-2,j-1,c+1)){
                return true;

            }
            board[i-2][j-1]=-1;
            // c--;

        }
        if(issafe(board,i-1,j-2)){
            board[i-1][j-2]=c;
            if(nknights(board,i-1,j-2,c+1)){
                return true;
            }
            board[i-1][j-2]=-1;
            // c--;

        }
        if(issafe(board,i+1,j-2)){
            board[i+1][j-2]=c;
            if(nknights(board,i+1,j-2,c+1)){
                return true;
            }
            board[i+1][j-2]=-1;
            // c--;

        }
        if(issafe(board,i+2,j-1)){
            board[i+2][j-1]=c;
            if(nknights(board,i+2,j-1,c+1)){
                return true;
            }
            board[i+2][j-1]=-1;
            // c--;

        }
        
        return false;
    }
    public static void printboard(int visited[][]) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int input =8;
       int board[][]=new int[8][8];
       for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=-1;
            }
        }
        board[0][0]=0;
        if(nknights(board,0,0,1)){
            System.out.println("solution exist");
            printboard(board);
            


        }
        else{
            System.out.println("solution not exist");


        }
    }
    
}
// // public class knights {
// //     static int c = 1; // Counter for moves, starts at 1
// //     static int N = 8; // Size of the board

// //     // Check if the current position is safe to move
// //     public static boolean issafe(int board[][], int i, int j) {
// //         // Check if the position is within bounds and unvisited
// //         return (i >= 0 && i < N && j >= 0 && j < N && board[i][j] == -1);
// //     }

// //     // Function to solve the knight's problem using backtracking
// //     public static boolean nknights(int board[][], int i, int j) {
// //         // If all squares are visited, return true
// //         if (c == N * N) {
// //             return true;
// //         }

// //         // Try all 8 possible moves for the knight
// //         if (issafe(board, i + 2, j + 1)) {
// //             board[i + 2][j + 1] = c++;
// //             if (nknights(board, i + 2, j + 1)) {
// //                 return true;
// //             }
// //             board[i + 2][j + 1] = -1;
// //             c--; // Backtrack
// //         }
// //         if (issafe(board, i + 2, j - 1)) {
// //             board[i + 2][j - 1] = c++;
// //             if (nknights(board, i + 2, j - 1)) {
// //                 return true;
// //             }
// //             board[i + 2][j - 1] = -1;
// //             c--; // Backtrack
// //         }
// //         if (issafe(board, i - 2, j + 1)) {
// //             board[i - 2][j + 1] = c++;
// //             if (nknights(board, i - 2, j + 1)) {
// //                 return true;
// //             }
// //             board[i - 2][j + 1] = -1;
// //             c--; // Backtrack
// //         }
// //         if (issafe(board, i - 2, j - 1)) {
// //             board[i - 2][j - 1] = c++;
// //             if (nknights(board, i - 2, j - 1)) {
// //                 return true;
// //             }
// //             board[i - 2][j - 1] = -1;
// //             c--; // Backtrack
// //         }
// //         if (issafe(board, i + 1, j + 2)) {
// //             board[i + 1][j + 2] = c++;
// //             if (nknights(board, i + 1, j + 2)) {
// //                 return true;
// //             }
// //             board[i + 1][j + 2] = -1;
// //             c--; // Backtrack
// //         }
// //         if (issafe(board, i + 1, j - 2)) {
// //             board[i + 1][j - 2] = c++;
// //             if (nknights(board, i + 1, j - 2)) {
// //                 return true;
// //             }
// //             board[i + 1][j - 2] = -1;
// //             c--; // Backtrack
// //         }
// //         if (issafe(board, i - 1, j + 2)) {
// //             board[i - 1][j + 2] = c++;
// //             if (nknights(board, i - 1, j + 2)) {
// //                 return true;
// //             }
// //             board[i - 1][j + 2] = -1;
// //             c--; // Backtrack
// //         }
// //         if (issafe(board, i - 1, j - 2)) {
// //             board[i - 1][j - 2] = c++;
// //             if (nknights(board, i - 1, j - 2)) {
// //                 return true;
// //             }
// //             board[i - 1][j - 2] = -1;
// //             c--; // Backtrack
// //         }

// //         return false; // If no valid move is found, backtrack
// //     }

// //     // Function to print the solution
// //     public static void printboard(int visited[][]) {
// //         for (int i = 0; i < N; i++) {
// //             for (int j = 0; j < N; j++) {
// //                 System.out.print(visited[i][j] + " ");
// //             }
// //             System.out.println();
// //         }
// //     }

// //     public static void main(String[] args) {
// //         int board[][] = new int[N][N];

// //         // Initialize the board with -1 (unvisited)
// //         for (int i = 0; i < N; i++) {
// //             for (int j = 0; j < N; j++) {
// //                 board[i][j] = -1;
// //             }
// //         }

// //         // Starting position
// //         board[0][0] = 0;
// //         c = 1; // Start counting moves from 1

// //         // Try to solve the knight's tour
// //         if (nknights(board, 0, 0)) {
// //             System.out.println("Solution exists:");
// //             printboard(board);
// //         } else {
// //             System.out.println("No solution exists.");
// //         }
// //     }
// // }

// // public class knights {
// //     static int c = 1; // Counter for moves, starts at 1
// //     static int N = 8; // Size of the board

// //     // Check if the current position is safe to move
// //     public static boolean isSafe(int board[][], int i, int j) {
// //         // Check if the position is within bounds and unvisited
// //         return (i >= 0 && i < N && j >= 0 && j < N && board[i][j] == -1);
// //     }

// //     // Function to solve the knight's problem using backtracking
// //     public static boolean nKnights(int board[][], int i, int j) {
// //         // If all squares are visited, return true
// //         if (c == N * N) {
// //             return true;
// //         }

// //         // Try all 8 possible moves for the knight
// //         // Define all possible knight moves
// //         int[] rowMove = {2, 2, -2, -2, 1, 1, -1, -1};
// //         int[] colMove = {1, -1, 1, -1, 2, -2, 2, -2};

// //         for (int move = 0; move < 8; move++) {
// //             int newRow = i + rowMove[move];
// //             int newCol = j + colMove[move];

// //             // If the move is safe, make the move
// //             if (isSafe(board, newRow, newCol)) {
// //                 board[newRow][newCol] = c++; // Mark the move
// //                 if (nKnights(board, newRow, newCol)) {
// //                     return true;
// //                 }
// //                 // Backtrack
// //                 board[newRow][newCol] = -1;
// //                 c--;
// //             }
// //         }

// // //         return false; // If no valid move is found, backtrack
// // //     }

// // //     // Function to print the solution
// // //     public static void printBoard(int visited[][]) {
// // //         for (int i = 0; i < N; i++) {
// // //             for (int j = 0; j < N; j++) {
// // //                 System.out.print(visited[i][j] + " ");
// // //             }
// // //             System.out.println();
// // //         }
// // //     }

// // //     public static void main(String[] args) {
// // //         int board[][] = new int[N][N];

// // //         // Initialize the board with -1 (unvisited)
// // //         for (int i = 0; i < N; i++) {
// // //             for (int j = 0; j < N; j++) {
// // //                 board[i][j] = -1;
// // //             }
// // //         }

// // //         // Starting position
// // //         board[0][0] = 0; // Starting the knight at (0, 0)
// // //         c = 1; // Start counting moves from 1

// // //         // Try to solve the knight's tour
// // //         if (nKnights(board, 0, 0)) {
// // //             System.out.println("Solution exists:");
// // //             printBoard(board);
// // //         } else {
// // //             System.out.println("No solution exists.");
// // //         }
// // //     }
// // // }

// public class knights {
//     static int N = 8;  // Size of the chessboard

//     // Function to check if the move is safe
//     public static boolean isSafe(int x, int y, int sol[][]) {
//         return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
//     }

//     // Function to print the board
//     public static void printSolution(int sol[][]) {
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++) {
//                 System.out.print(sol[x][y] + " ");
//             }
//             System.out.println();
//         }
//     }

//     // Function to solve the Knight's Tour problem
//     public static boolean solveKT() {
//         int sol[][] = new int[N][N];

//         // Initialize solution matrix with -1
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++) {
//                 sol[x][y] = -1;
//             }
//         }

//         // Possible moves of a knight
//         int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
//         int yMove[] = {1, 2,  2,  1, -1, -2, -2, -1};

//         // The Knight starts from (0,0)
//         sol[0][0] = 0;

//         if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//             System.out.println("Solution does not exist");
//             return false;
//         } else {
//             printSolution(sol);
//         }
//         return true;
//     }

//     // Recursive function to solve the Knight's Tour problem
//     public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
//         int k, next_x, next_y;
//         if (movei == N * N) {
//             return true; // All squares visited
//         }

//         for (k = 0; k < 8; k++) {
//             next_x = x + xMove[k];
//             next_y = y + yMove[k];

//             if (isSafe(next_x, next_y, sol)) {
//                 sol[next_x][next_y] = movei;

//                 if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
//                     return true;
//                 } else {
//                     sol[next_x][next_y] = -1; // Backtracking
//                 }
//             }
//         }
//         return false;
//     }

//     // Main function
//     public static void main(String args[]) {
//         solveKT();
//     }
// }
