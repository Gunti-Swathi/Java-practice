public class zero_onetriag{
    public static void main(String args[]){
        boolean flag = true;
        // int flag =1;

        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(flag == true){
                    System.out.print(" 1 ");
                }
                else{
                 System.out.print(" 0 ");
                }
                flag=!(flag);
            }
            
            if(i%2==0){
                flag = true;
            }
            else{
                flag = false;

            }
            System.out.println();
        }
        
    }
}