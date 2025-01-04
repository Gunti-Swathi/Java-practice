class Solution {
    public double trimMean(int[] arr) {
        int arr[] = new int []
        len = arr.length
        num_elements = 0.05*arr.length
        int temp=1;

        for(int i =0;i<arr.length;i++){

            if(temp<=num_elements){
                int del[]=findSmallestAndLargest(arr);
                index1=del[0];
                index2=del[1];
                for(int i = 0,i<arr.length;i++){
                    if(del[0]==arr[i]){
                        for(int i = arr[i];i<arr[arr])

                    }
                }


            }
            
        }
        
    }
   public int[] findSmallestAndLargest(int[] arr) {
    // if (arr == null || arr.length == 0) {
    //     throw new IllegalArgumentException("Array must not be null or empty");
    // }

    int small = arr[0];
    int large = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (small > arr[i]) {
            small = arr[i];
        }
        if (large < arr[i]) {
            large = arr[i];
        }
    }

    return new int[] {small, large};
}
   

    }
