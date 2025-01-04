public class Arrayq5{
    public static void main(String args[]){
        int arr[] = {10,20,30,40};
        int minsum = Integer.MAX_VALUE;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<=arr.length;i++){
            for(int j =i+1;j<=arr.length;j++){
                int sum=0;
                for(int k =i;k<j;k++){
                    System.out.print(arr[k] + " ");
                    sum=sum+arr[k];
                }
                System.out.println("Sum is"+sum);
                if(sum<minsum){
                    minsum = sum;
                }
                if(sum>maxsum){
                    maxsum = sum;
                }
                
            }
            System.out.println("Maxium sum is "+ maxsum);
            System.out.println("Minimum sum is "+ minsum);

            System.out.println();
        }
    }
}