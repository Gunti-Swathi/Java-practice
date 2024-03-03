public class Reverse_arr{
    public static void calculate(int a[]){
        //using reverse array(extra space)
        // int rev[] = new int[5];
        // int start =0;
        // int end =a.length-1;
        // for(int i=end;i>=start;i--){
        //     rev[end-i]=a[i];
        // }
        //   for(int i =0;i<rev.length;i++){
        //     System.out.println(rev[i]);
        // }

        int start =0;
        int end =a.length-1;
        while(start<end){ //can keep start<=end also but swaping when start and end are same results in no change
            a[start] = a[start]+a[end];
            a[end] = a[start]-a[end]    ;
            a[start] =a[start]-a[end];
            start++;
            end--;
        }
       
    }
    public static void main(String args[]){
        int array[] ={10,20,30,40,50};
        calculate(array);
        for(int i =0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        

    }
}