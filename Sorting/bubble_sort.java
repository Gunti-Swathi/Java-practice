public class bubble_sort {
    public static void sortedarr(int arrs[]){
        int swap=0;
        for(int i=0;i<arrs.length-1;i++){
            if(arrs[i]>arrs[i+1]){
                swap++;
            }

        }
        if(swap==0){
            System.out.println("Array is already Sorted");
        }
        else{
            System.out.println("Array is not already Sorted");

        }
        
    }
    public static void Sorting(int arr[]){
        
        int temp=0;
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
                
            }
        }

    }
    public static void main(String args[]){
        int arr[]={5,6,2,1,7,8};
        int array[]={1,2,9,6,8};
        sortedarr(array);
        // System.out.print(result);
        // Sorting(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

    }

     
}