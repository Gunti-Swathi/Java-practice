public class insertionsort {
    public static void sorts(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=cur;
            
            

            
        
        }
    }
    public static void main(String args[]){
        int arr[]={5,6,2,1,7,8};

        sorts(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        

        }
    }
}
