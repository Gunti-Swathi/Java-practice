public class lastoccuence {
    public static int last(int arr[],int n,int i){
        if(i==arr.length){
            return -1;
        }
        int r =last(arr,n,i+1);
       
       
        if(r==-1 && arr[i]==n){
            return i;
        }
        return r;
    }

        
    //     if(arr[i]==n){
    //         return i;
    //     }
    //     if(i==0){
    //         return -1;
    //     }
       
        
    //     return last(arr,n,i-1);
        

    // }

    public static void main(String[] args) {
        int arr[] ={8,3,6,9,5,6,7,10};
        // int result = last(arr,8,arr.length-1);
        int result = last(arr,6,0);

        System.out.print(result);
        
    }
    
}

    

