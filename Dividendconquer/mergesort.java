
public class mergesort {
    public static void mergesorting(int arr[], int s, int e){
        // base case
        if(s>=e){
            return;
        }
        // kaam
        int mid = s+(e-s)/2; // can also use (s+e)/2;
        mergesorting(arr,s,mid);
        mergesorting(arr,mid+1,e);
        merge(arr,s,mid,e);

    }
    public static void merge(int arr[], int s, int mid, int e){
        // assume left half indexes (0-3)= 4 elements, right half(4-6)= 3 elements total 7 elements = 6-0+1 = (e-s+1) 
        int temp[]= new int[e-s+1];
        int i=s; // left part iterator
        int j= mid+1;// right part iterator
        int k=0; // to track index in temp array;
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                

            }
            else{
                temp[k]=arr[j];
                j++;
                
            }
            k++;

        }
        // remaining elements in left part if right part reaches end;
        while(i<=mid){
            temp[k++]=arr[i++]; // same as prev but using uniary operator
        }
         // remaining elements in right part if left part reaches end;
        while(j<=e){
            temp[k++]=arr[j++]; // same as prev but using uniary operator
        }
        // now copy temporary array elements to orginal array;
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        printarr(arr);
        mergesorting(arr,0,arr.length-1);
        printarr(arr);


        
    }
   
    
}
