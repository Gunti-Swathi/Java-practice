import java.util.*;
public class kadane_negarr{
    public static void calculate(int a[]){
        int curr_sum =0;
        int max_sum = Integer.MIN_VALUE;
        // special case for all negative numbers
        int max = Integer.MIN_VALUE;
        int temp =0;
        for(int i =0;i<a.length;i++){
            // for all negatuve numbers
            max = Math.max(max,a[i]);
            //normal case
            curr_sum = curr_sum + a[i];
            if(curr_sum < 0){
                curr_sum =0;
            }
            if(max_sum <curr_sum){
                max_sum = curr_sum;
            }

            if(a[i]> 0){
                temp =1;
            }
        }
        // special case
        if(temp ==0){
            System.out.println(max);

        }
        // normal case
        else{
             System.out.println(max_sum);
        }
       

        
        
    }
    public static void main(String args[]){
        int arr[] = {-8,-2,-3,-4};
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        calculate(arr);
       
    }
       
    
}