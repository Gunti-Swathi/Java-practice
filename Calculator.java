import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        // char c =sc.nextLine.charAt(0);
        switch(c){
            case"+": System.out.println(a+b);
            break;
            case"-": System.out.println(a-b);
            break;
            case"*": System.out.println(a*b);
            break;
            case"/": System.out.println(a/b);
            break;
            case"%": System.out.println(a%b);
            break;
            default: System.out.println("Wrong opp");


            



        }
      

    }
}