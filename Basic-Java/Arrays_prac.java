import java.util.*;
public class Arrays_prac{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //create
        int marks[] = new int[40];
        //input
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        //output
        System.out.println("phy :"+marks[0]);
        System.out.println("che :"+marks[1]);
        System.out.println("mat :"+marks[2]);
        //update
        marks[1] = marks[1]+5;
        System.out.println("che :"+marks[1]);
        //percentage calculation 
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println(percentage);
        //special property
        System.out.println("length: "+marks.length);






    }
}