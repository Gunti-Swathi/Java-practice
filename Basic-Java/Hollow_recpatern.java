public class Hollow_recpatern{
     //with function
     public static void pattern(int tot_row, int tot_col){
            //for each rows
        for(int i =1;i<=tot_row;i++){
            //for each cols 
            for(int j =1;j<=tot_col;j++){
                //check for boundary condition
                if(i==1 || i==tot_row || j==1 || j ==tot_col){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");

                }
                

            }
            System.out.println();
        }
     }
    public static void main(String args[]){
        pattern(4,5);


 
 // without function       
        // for(int i = 1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==4){
        //             System.out.print(" * ");
        //         }
        //         else if(j == 1 || j== 5){
        //             System.out.print(" * ");
        //         }
        //         else{
        //             System.out.print("   ");
        //         }

        //     }
        //     System.out.println("");
        // }
    }
}