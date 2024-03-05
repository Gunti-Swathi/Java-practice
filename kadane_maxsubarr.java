import java.util.*;
public class kadane_maxsubarr{
   
    public static void calculate(int a[]){
        int curr_sum =0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            curr_sum = curr_sum + a[i];
            if(curr_sum < 0){
                curr_sum =0;
            }
            if(max_sum <curr_sum){
                max_sum = curr_sum;
            }
            // max_sum = Math.max(curr_sum,max_sum);
        }
        System.out.println(max_sum);

    }
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        calculate(arr);

    }
}