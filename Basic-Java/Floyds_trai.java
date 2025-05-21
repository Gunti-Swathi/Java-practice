public class Floyds_trai{
    //with function
    public static void pattern(int tot_row, int tot_col){
        int temp =1;
        for(int i =1; i<= tot_row; i++){
            for(int j =1; j<=i;j++){
                System.out.print(" " +temp+ " " );
                temp++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5,5);
        
        //Without function
        // int k =1;
        // for(int i =1;i<=5;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(k + " ");
        //         k++;
                
                
        //     }
            
                
        //         System.out.println();

        // }
    }
}