import java.util.*;
public class Amicable_func{
    public static int calculate(int a){
        int sum =0;
        for(int i =1; i<a;i++){
            if(a % i == 0){
                sum = sum +i;
                


            }
        }
        
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1 = calculate(a);
        int result2 = calculate(b);
        if(result1 == b && result2 == a){
            System.out.println("Amicable numbers");
        }
        else{
            System.out.println("not Amicable numbers");

        }


    }
}