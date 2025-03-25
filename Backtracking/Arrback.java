public class Arrback {
    public static void changearr(int arr[], int i, int val){
        if(i==arr.length){
            // this bellow stmt prints array before making changes i.e after it hits base case;
        printarr(arr);

            return;
        }
        arr[i]=val;
        // function call
        changearr(arr, i+1, val+1);
        // backtracking step
        arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        printarr(arr);
        changearr(arr, 0, 1);
        printarr(arr);

        
    }
    
}
