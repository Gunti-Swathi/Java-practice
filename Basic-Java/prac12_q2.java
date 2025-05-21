// Question2:Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers
import java.util.*;
public class prac12_q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i =1;
        int evensum=0;
        int oddsum=0;
        do{
            int input = sc.nextInt();
            if(input%2==0){
                evensum+=input;
            }
            else{
                oddsum+=input;
            }
            i++;
        }while(i<7);
        System.out.println("Even sum is  "+evensum);
        System.out.println("Odd sum is  "+oddsum);

        

    }
}