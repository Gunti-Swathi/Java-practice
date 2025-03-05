public class firstoccurence {
    public static int first(int arr[],int n,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        // if(i==arr.length-1){
        //     return -1;
        // }
        
        return first(arr,n,i+1);
        

    }
    public static void main(String[] args) {
        int arr[] ={8,3,6,9,5,6,7,10};
        int result = first(arr,11,0);
        System.out.print(result);
        
    }
    
}
