// Source code is decompiled from a .class file using FernFlower decompiler.
public class subarray{
    public static void calculate(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                 for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                 System.out.print("   ");
            }
              System.out.println();
        }
    }


    public static void main (String args[]){
        int array[] = {2,4,6,8,10};
        calculate(array);
       
    }
}
 