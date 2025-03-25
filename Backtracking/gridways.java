public class gridways {
    public static int grid(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            // c++;
            return 1;
        }
        if(i==m || j==n){
            return 0;
        }
        return grid(i, j+1, m, n)+grid(i+1,j,m,n);

    }
    static int count=0;
    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.print(grid(0,0,m,n));
        // int board[][]=new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         board[m][n]= 0;


        //     }
        // }
        
    }
    
}
