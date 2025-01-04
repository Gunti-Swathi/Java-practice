import java.util.*;
public class Arrayq3{
    // public void reverse(int arr[]){

    // }
    public static void main(String args[]){
        int array[] = {10,20,30,40,50};
        int temp;
        int start = 0;
        int k=array.length-1;
        for(int i =0;i<array.length/2;i++){
            int p = k-i;
            temp = array[p];
            array[p]=array[i];
            array[i]=temp;
           
        }


        // int temp;
        // while(start<=end){
            
        //     temp = array[start];
        //     array[start]=array[end];
        //     array[end]=temp;
        //     start++;
        //     end--;

        // }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}