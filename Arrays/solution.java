import java.util.Arrays;

public class solution {
    public int[] plusOne(int[] digits) {
        int arr[]= new int[digits.length];
        int start=0;
        int count=0;
        int end=digits.length;
        for(int i=0;i<end;i++){
            arr[i]=digits[i];
        }
        if(arr[end-1]!=9){
            arr[end-1]=arr[end-1]+1;
        }
        for(int i=0;i<end;i++){
            if(digits[i]==9){
                count++;
            }
        }
            
        if(count==arr.length){
            int array[] = new int[digits.length+1];
            
            array[start]=1;
            for(int i=1;i<end;i++){
                
                
                if(array[i]==9){
                    array[i]=0;
                }
            }
            return array;
        }
            
        else if(arr[end-1]==9){
            for(int i=end-1;i>=0;i--){
                if(arr[i]==9){
                    arr[i]=0;
                }
                if(arr[i]!=9){
                    arr[i]=arr[i]+1;
                    break;
                }
            }
         }
        
           
            
         
        return arr;
    }
}

 public static void main(String args[]) {
        int digits[] = {8, 9, 9, 9};
        int result[] = plusOne(digits); // Call plusOne and store the result
        System.out.println(Arrays.toString(result)); // Print the array
    }
  


