import java.util.*;
public class Largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // if(a>b){
        //     if(a>c){
        //         System.out.println("a is largest");
        //     }
        //     else{
        //         System.out.println("c is largest");
        //     }
        // }
        // else{
        //     if(b>c){
        //         System.out.println("b is largest");
    
        //     }
        //     else{
        //         System.out.println("c is largest");
        //     }
        // }
        if(a>=b && a>=c){
            System.out.println("a is largest");
        }
        else if (b>=c){
            System.out.println("b is largest");

        }
        else{
            System.out.println("c is largest");

        }
        // if(a>b){
        //     System.out.println("a is the largest number");
        
        // }
        // else{
        //     System.out.println("b is the largest number");
        // }
        
    }
}