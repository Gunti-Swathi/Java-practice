public class inverted_halfpyr{
    
    public static void pattern(int tot_row,int tot_col){
        for(int i =1;i<=tot_row;i++){
            for(int j=1;j<=tot_row-i;j++){
                System.out.print("   ");}
            for(int j=1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();

            
        }
    
    }

    public static void main(String args[]){
        pattern(4,4);
        //Without function
        // for(int i =1;i<=4;i++){
        //     for(int j=1;j<=4-i;j++){
            
        //     System.out.print(" ");
                
        //     }
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(); }
    }

}