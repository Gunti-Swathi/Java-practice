import java .util.Arrays;
import java.util.Collections;

public class inbuiltsort{
    public static void sorts(Integer arr[]) {
    // Arrays.sort(arr);
    // for sorting only specific indexes
    // Arrays.sort(arr,0,2);
    // for sorting in reverse order use collections and it should be type of integer object not primitive
    // Arrays.sort(arr,Collections.reverseOrder());
    Arrays.sort(arr,0,2,Collections.reverseOrder());

    


    
    }
    public static void main(String args[]){
        Integer arr[]={1,6,8,4,2};
        sorts(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.println();
        }
    }
}
