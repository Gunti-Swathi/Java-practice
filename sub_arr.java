//Brute force method to find max and min sub arrays
import java.util.*;
public class sub_arr{
    public static void calculate(int a[]){
        int total =0;
        int minsum = Integer.MAX_VALUE;
        int maxsum = Integer.MIN_VALUE;
        int sum =0;
        
        for(int i =0;i<a.length;i++){
            for(int j =i;j<a.length;j++){
                for(int k =i;k<=j;k++){
                    //printing sub arrays
                System.out.print(a[k]);
                //calculating sum of sub arrays
                sum = sum+a[k];
                
                
                }
                
                total++;
                System.out.println();
                System.out.println("SUM IS:"+sum);
                // finding max sum;
                if(sum >maxsum){
                    maxsum =sum;
                }
                //finding min sum;
                if(sum<minsum){
                    minsum=sum;
                }
                
                
                sum =0;

            }
            System.out.println();
            
        }
        // for(int i =0;i<store.length;i++){
        //     System.out.print(store[i]);
        // }
        System.out.println("max"+maxsum);
        System.out.println("min"+minsum);

        System.out.println("count: "+total);
    }
    public static void main(String args[]){
        int arr[] ={1,-2,6,-1,3}; 
        calculate(arr);
    }
}