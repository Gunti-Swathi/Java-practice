import java.util.*;
public class arr_pracq1{
    public static boolean calculate(int a[]){
        boolean bool = false;
        for(int i =0; i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    bool = true;
                }
            }
        }
        return bool;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        System.out.println(calculate(arr));
        
    }

}