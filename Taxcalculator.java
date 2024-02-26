import java.util.*;
public class Taxcalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    if(income < 500000){
        System.out.println("tax is");
    }
    else if(income >500000  && income < 1000000 ){
        System.out.println("tax is"+ (0.2*income));
    }
    else{
        System.out.println("tax is"+ (0.3*income));
    }

    }
    
}