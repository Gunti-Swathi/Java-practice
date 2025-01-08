public class sortedsearch {
    public static boolean search(int arr[][], int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
                return true;
            }
            else if(key>arr[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=27;
        boolean result =search(arr,key);
        System.out.print(result);

    }
    
}
