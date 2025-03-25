 //         return false; // If no valid move is found, backtrack
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
