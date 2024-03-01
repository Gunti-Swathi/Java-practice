import java.util.*;
public class count_prime{
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
        int b = sc.nextInt();
        int count =0;
        for(int i= a+1;i<b;i++){
            // boolean result = check(i);
            // if (result == true){
                if(check(i)){
                count++;
               
            }



    }
     System.out.println(count);
}
}