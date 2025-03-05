public class inversioncount {
    public static int div(int arr[], int s, int e){
        if(s>=e){
            return 0;

        }
        int mid=s+(e-s)/2;
        int inv= div(arr,s,mid);
        inv+=div(arr,mid+1,e);
        
        return inv+= merge(arr,s,mid,e);
        
    }
    public static int merge(int arr[], int s, int mid ,int e){
        int temp[]=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        int c=0;
        while(i<=mid && j<=e){

            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
                
            }
            else{
                temp[k++]=arr[j++];
                c+=mid-i+1;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];

        }
        while(j<=e){
            temp[k++]=arr[j++];

        }
        System.arraycopy(temp, 0, arr, s, temp.length);

        
        
        return c;

    }

    public static void main(String[] args) {
        int arr[]={2,4,1,3,5,0,1};
        System.out.println(div(arr,0,arr.length-1));

        
    }
    
}
