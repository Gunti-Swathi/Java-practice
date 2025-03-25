public class gridwaystrick {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int x = fact(m-1+n-1);
        int y=fact(m-1)*fact(n-1);
        System.out.print(x/y);
    }
    
}
