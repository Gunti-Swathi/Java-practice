import java.util.*;
public class Strong_numfun{
    public static int facto(int a){
        int product = 1;
        while(a>0){
            product = product*a;
            a--;
        }
        return product;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            int result = facto(rem);
            sum = sum +result;
            num =num/10;
        }
           

        if(sum == temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }

}
