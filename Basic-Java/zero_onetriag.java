public class zero_onetriag{
     //with function
    public static void pattern(int tot_row, int tot_col){

        for(int i =1; i<=tot_row;i++){
            for(int j =1; j<=i;j++){
                int sum = i+j;
                if( sum %2 ==0){
                    System.out.print("1");
            
                }
                else{
                    System.out.print("0");

                }
            }
            System.out.println();
        }
    }
        
    public static void main(String args[]){
        pattern(5,5);
        
    }

}
   


        //1st Method
    //     boolean flag = true;
    //     for(int i =1; i<=tot_row;i++){
    //         for(int j =1; j<=i;j++){
    //             if(flag == true){
    //                 System.out.print(" 1 ");
    //             }
    //             else{
    //              System.out.print(" 0 ");
    //             }
    //             flag=!(flag);
    //         }
            
    //         if(i%2==0){
    //             flag = true;
    //         }
    //         else{
    //             flag = false;

    //         }
    //         System.out.println();
    //     }
    // }
    