

public class quicksort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }
    public static int partition(int []arr, int s, int e){
        int p=arr[e];
        int t=s-1;
        for(int i=s;i<e;i++){
            if(arr[i]<=p){
                t++;
                int temp = arr[i];
                arr[i]=arr[t];
                arr[t]=temp;
            }

        }
        t++;
        int temp = arr[t];
        arr[t]=arr[e];
        arr[e]=temp;
        return t;
    }
    public static void quicksorting(int []arr, int s, int e){
        
        if(s>=e){
            return;
        }
        int t = partition(arr, s, e);
        quicksorting(arr, s, t-1);
        quicksorting(arr, t+1, e);


    }
   
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        printarr(arr);
        quicksorting(arr,0,arr.length-1);
        printarr(arr);
        
    }
    
}

// public class quicksort {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void quickSort(int arr[], int s, int e) {
//         if (s >= e) {
//             return;
//         }

//         // Partitioning logic
//         int pivot = arr[e];  
//         int t = s - 1;

//         for (int i = s; i < e; i++) {
//             if (arr[i] <= pivot) {
//                 t++;
//                 int temp = arr[i];
//                 arr[i] = arr[t];
//                 arr[t] = temp;
//             }
//         }

//         // Swap pivot to correct position
//         t++;
//         int temp = arr[t];
//         arr[t] = arr[e];
//         arr[e] = temp;

//         // Recursive calls
//         quickSort(arr, s, t - 1);
//         quickSort(arr, t + 1, e);
//     }

//     public static void main(String[] args) {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         System.out.println("Original Array:");
//         printArray(arr);

//         quickSort(arr, 0, arr.length - 1);

//         System.out.println("Sorted Array:");
//         printArray(arr);
//     }
// }

