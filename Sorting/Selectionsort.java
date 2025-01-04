public class Selectionsort{

    public static void sort(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;

                }
            }
            temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;

        }
       


        
    }
    public static void main(String args[]){
        int array[]={15,8,9,6,4};
        sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.println();
        }


    }
}