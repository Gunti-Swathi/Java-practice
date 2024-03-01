import java.util.*;
public class palindrome_func{
    public static int calculate(int a){
        int rev =0;
        while(a>0){
            int rem = a%10;
            rev = rev*10+rem;
            a = a/10;
            
        }
        return rev;
             
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = calculate(num);
        if (result == num){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("not Palindrome");
            }

        


    }
}