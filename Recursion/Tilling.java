public class Tilling {
    public static int tile(int n){ // as 2*n is noard size
        if(n==0 || n==1){
            return 1;
        }
    // vertical choice
        int f1= tile(n-1);
    // horizontal choice
        int f2=tile(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        int result = tile(4);
        System.out.println(result);
    }
    
}
