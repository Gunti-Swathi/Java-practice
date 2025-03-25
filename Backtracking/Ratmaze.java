

public class Ratmaze {
    public static boolean isSafe(int board[][], int row, int col, int visited[][]) {
        return (row >= 0 && row < 4 && col >= 0 && col < 4 && board[row][col] == 1 && visited[row][col] == 0);
    }

    public static void printBoard(int visited[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean maze(int board[][], int visited[][], int row, int col, int m, int n) {
        // Base case: If we reached the destination
        if (row == m - 1 && col == n - 1 && board[row][col] == 1) {
            visited[row][col] = 1;
            return true;
        }

        if (isSafe(board, row, col, visited)) {
            visited[row][col] = 1; // Mark as visited

            // Try moving Right
            if (maze(board, visited, row, col + 1, m, n)){
                return true;
            }

            // Try moving Down
            if (maze(board, visited, row + 1, col, m, n)){
                 return true;
            }

            // Try moving Up
            if (maze(board, visited, row - 1, col, m, n)){
                 return true;
            }

            // Try moving Left
            if (maze(board, visited, row, col - 1, m, n)){
                 return true;
            }

            // Backtrack if no path is found
            visited[row][col] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        int m = 4, n = 4;
        int board[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int visited[][] = new int[4][4]; // 0 means not visited, 1 means visited

        System.out.println("Initial visited matrix:");
        printBoard(visited);

        if (maze(board, visited, 0, 0, m, n)) {
            System.out.println("Path found:");
            printBoard(visited);
        } else {
            System.out.println("No path found.");
        }
    }
}
