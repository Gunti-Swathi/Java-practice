import java.util.*;
public class prac11_q4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int day =sc.nextInt();
        switch(day){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wedday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Satday");
            break;
            default: System.out.println("Incorrect please chck");
            
        }
    }
}