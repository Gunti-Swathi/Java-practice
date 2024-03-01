public class dec_bin{
    public static int check(int a){
        String temp = "";
        
        while(a!=0){
            int num = a%2;
            temp = temp + num;
            
            a = a/2;
           

        }
       return temp;
    }
    public static void reverse(int a){
        int num =102486;
        int rem =0;
        int rev =0;
        while(num!=0){