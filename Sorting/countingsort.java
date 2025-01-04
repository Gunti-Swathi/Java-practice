import java.lang.Math;
public class countingsort {
    public static void sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int temp=0;
        for(int i=0;i<count.length;i++){
            
            while(count[i]>0){
                arr[temp]=i;
                count[i]--;
                temp++;
            }

        }
        

    }
    public static void main(String args[]){
        int arr[]={5,6,2,1,7,8};

        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
