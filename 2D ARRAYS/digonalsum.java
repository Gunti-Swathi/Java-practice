public class digonalsum {
    public static void sum(int arr[][]){
        int count=0;

        
        for(int i=0;i<arr.length;i++){
            count=count+arr[i][i];
            if(i!=arr.length-i-1){
                count=count+arr[i][arr.length-1-i];

            }

        }
        System.out.print(count);
        

    }
    public static void main(String args[]){
        // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr[][]={{1,2,3},{5,6,7},{9,10,11}};

        sum(arr);

    }
    
}
