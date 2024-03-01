public class dec_bin{
    public static int check(int a){
       int binary =0;
       int p =0;
       
        while(a!=0){
            int num = a%2;
            binary = binary + num * (int) Math.pow(10,p);
            
            a = a/2;
            p++;
           

        }
       return binary;
    }
  
    public static void main(String args[]){
        System.out.print(check(11));
        

    }
}