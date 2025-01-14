
import java.util.*;
public class inputstring {
    public static void main(String args[]){
        String str="abcd";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        // for 1 word input
        // String name =sc.next();
        // System.out.println(name);
        // for 1 line input
        String sentence = sc.nextLine();
        System.out.println(sentence);
        int length =sentence.length();
        System.out.println(length);


    }
    
}
