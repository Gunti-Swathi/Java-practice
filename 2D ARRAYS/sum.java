public class sum {
    public static int calculate(int arr[][]){
        int row=1;
        int col=0;
        int sum=0;
        while(col<arr[0].length){
            sum=sum+arr[row][col];
            col++;

        }
     return sum;
    }
    public static void main(String args[]) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        int result=calculate(arr);
        System.out.print(result);

        
    }
    
}
