public class largest {
    public static int large(int matrix[][]){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        return max;

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,25},{6,4,7}};
        int max=large(matrix);
        System.out.print(max);


        
    }
    
}
