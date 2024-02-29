public class Hollow_recpatern{
    public static void main(String args[]){
        for(int i = 1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1 || i==4){
                    System.out.print(" * ");
                }
                else if(j == 1 || j== 4){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }


                // else if(j==1){
                //     System.out.println();
                //     System.out.print("*");
                // }
                // else if(j==5){
                //     System.out.print("*");
                //     System.out.println();

                    

                // }
                // else {
                //     System.out.print(" ");
                // }
            }
            System.out.println("");
        }
    }
}