import java.util.*;
public class breakconti{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // take user input continuosly until you recieve input i.e divisible by 10

        // do{
        //     int input = sc.nextInt();
            
        //     if(input%10==0){
        //         break;
        //     }
        //     System.out.println(input);
        //     }
        // while(true);

        //brea stmt example

        // for(int i =1;i<=5;i++){
        //     if(i==3){
        //         break;
        // //     }
        // //     System.out.println("Helloworld");
        // }

        //continue stmt example

        // for(int i =1;i<=5;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //Display all numbers entered by user except multiples of 10
        do{
            int num = sc.nextInt();
            if(num%10 ==0){
                continue;
        
            }
            System.out.println(num);
        }
            while(true);
            
        
    }
}