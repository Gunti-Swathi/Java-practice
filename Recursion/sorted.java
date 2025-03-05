public class sorted {
    public static boolean sort(int arr[], int i){
        int n = arr.length;
       
        if(i==n-1){
            return true;
        }
        
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr,i+1);
         
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,8,5};
        boolean result = sort(arr,0);
        System.out.println(result);
        
    }
    
}
