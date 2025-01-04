import java.lang.Math;
public class kadans {
    
    public static void result(int arr[]){
        int cur_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cur_sum=cur_sum+arr[i];
            if(cur_sum<0){
                cur_sum=0;
            }
            max_sum= Math.max(cur_sum, max_sum);

        }
        System.out.println(max_sum);;
    }
    public static void main(String args[]){
        
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        result(arr);

        
    }
    
}
