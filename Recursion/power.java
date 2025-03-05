public class power {
    public static int calc(int a, int b){
        if(b==0){
            return 1;
        }
        return a*calc(a,b-1);
    }
    public static void main(String[] args) {
        int a=2;
        int b=5 ;
        int result = calc(a,b);
        System.out.print(result);
        
    }
    
}
