public class dec_bin{
    public static void check(int a){
        
        while(a!=0){
            int num = a%2;
            System.out.print(num +" ");
            a = a/2;
           

        }
    }
    public static void main(String args[]){
        check(10);
        

    }
}