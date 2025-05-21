import java.util.*;
public class prime_range{
    public static boolean check(int a){
        // boolean is_prime = true;
        if(a ==2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(a);i++){
            if(a % i== 0){
                return false;
                // is_prime = false;
                // break;
                }
           
        }
        return true;
        
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         for(int i=2;i<=a;i++){
            // boolean result = check(i);
            // if (result == true){
                if(check(i)){
                System.out.println(i);
            }


    }
}
}