import java.util.*;
public class Passorfail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks>=33)?"pass":"Fail";
        System.out.println(result);
    }

}