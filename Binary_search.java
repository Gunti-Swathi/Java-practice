public class Binary_search{
    public static int search(int a[], int key){
        int start =0;
        int end= a.length-1;
        
        // while(start<=end){
        for (int i = start; i <= end; ) {
            int mid = (start + end)/2;
            if(a[mid] ==key){
                return mid;
            }
            
            else if(a[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] ={10,20,30,40,50,60,70,80,90,100};
        int key =70;
        System.out.println(search(arr,key));
    }
}