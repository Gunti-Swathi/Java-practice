// Write a program to find the factorialof any number entered by the user
import java.util.*;
public class prac12_q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact=1;
        for(int i = sc.nextInt();i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        
        
    }
}