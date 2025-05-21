import java.util.*;
public class binomial_coff{
     public static int facto(int a){
        int product = 1;
        while(a>0){
            product = product*a;
            a--;
        }
        return product;

    }
    public static float Calculate(float a, float b, float c){
        float result = a/(b*c);
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int num1 = facto(n);
        int num2 = facto(r);
        int num3 = facto(n-r);
        System.out.println(Calculate(num1,num2,num3));


    }
}