public class Clearrange {
    public static void main(String args[]){
        int x=10;
        int j=4;
        int i=2;
        int a=(~0)<<j+1;
        // int b=~(~0<<i);
        int b=(1<<i)-1;
        int c= a | b;
        System.out.println(x&c);

    }
    
}
