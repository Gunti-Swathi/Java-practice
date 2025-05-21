public class Hollow_hour{
    public static void main(String args[]){
        for(int i =1;i<=4;i++){
            for(int j =1;j<i;j++){
                System.out.print(" ");
                
            }
            for(int j=i;j<=4;j++){
                System.out.print("*");
                if(i==1||j==i||j==4){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
               
            }
           
             

            
            
            
            System.out.println();
            
            
            

        }
        

    }
}