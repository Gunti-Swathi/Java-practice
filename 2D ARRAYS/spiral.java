public class spiral {
    public static void calc(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            // top line
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            // rightmost line
            for(int j=startrow+1;j<=endrow;j++){
                System.out.print(matrix[j][endcol]+" ");
            }
            // bottom line
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }   
                System.out.print(matrix[endrow][j]+" ");
                

            }
            // left line
            for(int j=endrow-1;j>=startrow+1;j--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[j][startcol]+" ");

            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        
            
        
    }
    public static void main(String args[]){
        // int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int arr[][]={{1,3,5,7,9},{2,4,6,8,10},{11,13,15,17,19},{12,14,16,18,20},{21,23,25,27,29}};
        calc(arr);
    }
    
    
}
