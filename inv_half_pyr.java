public class inv_half_pyr{
    //with function
    public static void pattern(int tot_row, int tot_col){
        for(int i=tot_row;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // another logic
        // for(int i=1;i<=tot_row;i++){
        //     for(int j=1;j<=tot_row-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    }
    public static void main(String args[]){
        pattern(5,5);
       // Without function
        // for(int i =5;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
    }
}