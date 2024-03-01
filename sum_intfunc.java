import java.util.*;
public class sum_intfunc{
    public static int calculate(int a){
        int sum =0;
        while (a!=0){
            int num = a%10;
        sum = sum + num;
        a = a/10;
        }
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calculate(num));
        
    }
}