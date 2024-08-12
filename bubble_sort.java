public class bubble_sort{
    public static void calculate(int a[]){
        int temp;
        int swap =0;
        for(int turn =0;turn<a.length-1;turn++){
            for(int j =0;j<a.length-turn-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swap++;

                }
                if(swap ==0){
                    break;
                }
            }
        }
        
    }
    public static void main(String args[]){
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,2,3,4,5};

       calculate(arr);
       for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
}