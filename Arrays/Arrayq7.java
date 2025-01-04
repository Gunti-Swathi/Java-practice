public class Arrayq7{
    public static void main(String args[]){
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr[] = {-1,-2,-3,-4};
        int maxsum = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int cursum =0;
        for(int i =0;i<arr.length;i++){
            cursum = cursum + arr[i];
            if(cursum<0){
                cursum=0;
            
            }
            if(cursum>maxsum){
                maxsum=cursum;
            }
        }
        if(maxsum==0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }


            }
        }
        // System.out.print(maxsum);
        System.out.print(max);



    }
}