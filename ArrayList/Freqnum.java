import java.util.*;
public class Freqnum {
     public static void main(String args[]) {
        int arr[]=new int[1000];
        int max=Integer.MIN_VALUE;
        int key=100;
        int res=0;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,100,200,1,100));
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)==key){
                arr[list.get(i)]++;

            }

        }
        for(int i=1;i<arr.length;i++){
            if(Math.max(max,arr[i])==arr[i]){
                max=arr[i];
                res=i;
            }

        }
       System.out.println(res);
    }

    
}
