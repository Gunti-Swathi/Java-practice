import java.util.*;
public class Create{
    public static boolean search(int matrix[][],int k){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==k){
                    System.out.print("Index found at"+"("+i +","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Index not found"); 
        return false;
    }
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] +" ");
                

            }
            System.out.println("");
        }
        search(matrix, 5);
    }

}