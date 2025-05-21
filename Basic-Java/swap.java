
import java.util.*;
public class swap{
    public static void swaping(int num1, int num2){
        num1 =num1 + num2;
        num2= num1 - num2;
        num1= num1-num2;
        System.out.println(num1);
        System.out.println(num2);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swaping(a,b);

        
    }

}