import java.util.*;
public class Arrayq2{
public static int search(int arr[], int key){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
    // for(;start<=end;){
        int mid = (start + end)/2;
        if(key == arr[mid]){
            return mid;
        }
        else if(key<arr[mid]){
            end = mid-1;
        }
        else if(key > arr[mid]){
            start = mid+1;
        }

    }
    return -1;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = {10,20,30,40,50};
    int key =70;
    int result= search(arr,key);
    System.out.println(result);


}
}