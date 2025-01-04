import java.util.*;
public class Arrayq6{
    public static void main(String args[]){
        int maxsum = Integer.MIN_VALUE;
        int arr[] ={10,20,30,40,50};
        int pref[] = new int[arr.length];
        pref[0] =arr[0];
        int sum =0;
        for(int i=1;i<arr.length;i++){
            
            pref[i]=pref[i-1]+arr[i];
            // System.out.print(pref[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==0) {
                    sum = pref[j];
                }
                else{
                    sum = pref[j]-pref[i-1];
                }
                if(sum > maxsum){
                    maxsum = sum;
                }

            }

        }
        System.out.println("SUM IS" +maxsum);
    }
}