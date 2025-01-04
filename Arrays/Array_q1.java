import java.util.*;
public class Array_q1{

    public static int largest(int arr[]){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]> largest){
                largest = arr[i];
            }

        }
        return largest;
        
    }
    public static void main(String args[]){
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int result = largest(arr);
        System.out.println("Result: "+result);
    }
}