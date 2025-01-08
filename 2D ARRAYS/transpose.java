public class transpose {
    public static int[][] matrix(int arr[][]){
        int array[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                array[j][i]=arr[i][j];
            }
        }

      return array;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result= matrix(arr);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
