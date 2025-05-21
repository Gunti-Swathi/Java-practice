import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        // int i =2;
        // int counter =0;
        boolean counter = true;
        // if(input==2){
        //     System.out.println("prime");
        // }
        // for(int i=2;i<input;i++){
        for(int i=2;i<Math.sqrt(input);i++){

            if(input%i==0){
              System.out.println("not prime");  
            //   counter=1;
              counter = false;
              break;
            }
        }
        if (counter){
              System.out.println(" prime");  
        }


// while(i<input){
        //     if(input%i==0){
        //       System.out.println("not prime");  
        //       counter++;
        //       break;
        //     }
        //     else{
        //         i =i+1;
        //     }
            
        // }
        // if (counter ==0){
        //       System.out.println(" prime");  

        // }
        // for(int i=2;i<input;i++){
        //     if(input%i==0){
        //         System.out.println("not prime");
        //         break;
        //     }
        //     else{
        //         System.out.println("prime");
        //         break;

        //     }
        

            
        }

    
}