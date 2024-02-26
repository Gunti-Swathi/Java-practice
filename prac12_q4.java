import java.util.*;
public class prac12_q4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int product =1;
        for(int tab =1;tab<=10;tab++){
            product = i*tab;
            System.out.println(i + "X" + tab + "=" + product);

        }
    }

}