public class occurence {
    public static void find(int arr[], int key, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]== key){
            System.out.print(i+" ");
        }
        find(arr,key,i+1);

    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        find(arr,2,0);
        
    }
    
}
