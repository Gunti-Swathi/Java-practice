import java.util.*;
public class maxsubarr_presum{
    public static void calculate(int a[]){
        int max = Integer.MIN_VALUE;
        
        int sub_arrsum =0;
        int prefix[]= new int[a.length];
        prefix[0] = a[0];
        for(int i =1; i<prefix.length;i++){
            prefix[i] = prefix[i-1]+a[i];
            System.out.print(prefix[i]+" ");
        }
        for(int i=0; i<a.length;i++){
            for(int j =i; j<a.length;j++){
                int start =i;
                int end = j;
                if(start ==0){
                    sub_arrsum =prefix[end];
                }
                else{
                    sub_arrsum = prefix[end] - prefix[start-1];
                }
                // System.out.println(sub_arrsum);
                if(sub_arrsum > max ){
                    max = sub_arrsum;
                }
            }
            
            
            
            

        }
        System.out.println();
        System.out.println("maximum is: "+max);
        

    }
    public static void main(String args[]){
        int arr[] ={1,-2, 6,-1,3};
        calculate(arr);
        
    }
}