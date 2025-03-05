

public class majorityelemnt {
    public static int count(int arr[], int x, int s, int e){
        int c=0;
        for(int i=s;i<e;i++){
            if(arr[i]==x){
                c++;

            }
        }
        return c;
    }
   
    public static int calc(int arr[], int s, int e) {
        if(s==e){
            return arr[s];
        }
        int mid = s+(e-s)/2;
        int left=calc(arr,s,mid);
        int right=calc(arr,mid+1,e);
        if(left==right){
            return left;
        }
        else{
            int leftcount=count(arr,left,s,e);
            int rightcount=count(arr,right,s,e);
            if(leftcount>rightcount){
                return left;
            }
            else{
                return right;
            }

        }

    }
    public static void main(String[] args) {
        // int arr[]={2,2,1,1,1,2,2};
        int arr[]={3,2,1,2,2,7};
        System.out.println(calc(arr,0,arr.length-1));

    }
    
}
