import java.util.*;
public class Largest_numarr{
    public static int search(int arr[]){
        // int largest = arr[0];
        // int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for(int i =0;i<arr.length;i++){
            // if(largest < arr[i]){
            if(smallest > arr[i]){
            
                // largest = arr[i];
                smallest = arr[i];

            }

            
        }
        // return largest;
        return smallest;

    }
    public static void main(String args[]){
        int array[] = {15,85,45,98,1589,68};
        System.out.println(search(array));

    }
}